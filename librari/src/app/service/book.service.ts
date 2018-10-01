import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {


  private baseUrl = 'http://localhost:8080/books/';
  constructor(private http: HttpClient) { }
  getBook(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}` + `${id}`);
  }
 
  createBook(author: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `create/`, author);
  }
 
  updateBook(author: any): Observable<Object> {
  
    
    return this.http.put(`${this.baseUrl}`+`save/`, author);
  }
 
  deleteBook(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}`+`${id}`, { responseType: 'text' });
  }
 
  getAllBooks(): Observable<any> {
    console.log(`${this.baseUrl}`+`/books`);
    return this.http.get(`${this.baseUrl}`);
  }
}
