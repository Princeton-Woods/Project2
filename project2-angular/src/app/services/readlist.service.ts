
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IReadlist } from '../models/readlist.model';

@Injectable({
    providedIn: 'root'
})
export class ReadlistService {
    private BASEURL = "http://localhost:8080/"
    private ENDPOINTS = {
        READLIST: "readlist"
    }

    // this should be obtained from login component/a data.service.ts file
    private userId = "/1" // placeholder
    constructor(private http: HttpClient) { }

    getReadlist(): Observable<IReadlist[]> {
        return this.http.get<IReadlist[]>(this.BASEURL + this.ENDPOINTS.READLIST)
    }

    getReadlistById(): Observable<IReadlist[]> {
        return this.http.get<IReadlist[]>(this.BASEURL + this.ENDPOINTS.READLIST + this.userId)
    }

    createReadlist(data: IReadlist): Observable<IReadlist> {
        return this.http.post<IReadlist>(this.BASEURL + this.ENDPOINTS.READLIST, data)
    }

    deleteReadlistEntry(id: number) { //Observable<IReadlist>
        return this.http.delete(this.BASEURL + this.ENDPOINTS.READLIST + "/" + id)
            // .subscribe(() => console.log("Deleted?"))
    }
}