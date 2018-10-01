import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Authors } from '../model/authors';

@Injectable({
  providedIn: 'root'
})
export class AuthorService {
  private baseUrl = 'http://localhost:8080/authors/';
  constructor(private http: HttpClient) { }
  getAuthor(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}` + `${id}`);
  }
 
  createAuthor(author: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `create/`, author);
  }
 
  updateAuthor(author: any): Observable<Object> {
    console.log("Đang sửa môn hoc");
    
    return this.http.put(`${this.baseUrl}`+`save/`, author);
  }
 
  deleteAuthor(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}`+`${id}`, { responseType: 'text' });
  }
 
  getAllAuthors(): Observable<any> {
    console.log(`${this.baseUrl}`+`/authors`);
    return this.http.get(`${this.baseUrl}`);
  }
}