import { Component, OnInit } from '@angular/core';
import { Books } from '../../model/books';
import { Observable } from 'rxjs';
import { BookService } from '../../service/book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-booklist',
  templateUrl: './booklist.component.html',
  styleUrls: ['./booklist.component.css']
})
export class BooklistComponent implements OnInit {

  constructor(private  bookService:BookService,private router:Router ) { }

  ngOnInit() {
    this.reloadData();
  }
  books : Observable<Books[]>;
  book:any;
  numRow:number =0;
    
  deleteBook(id:number) {
    if(confirm("You wand delete this author "  )==true)
    {
        this.bookService.deleteBook(id)
          .subscribe(
            data => {
              console.log(data);
              this.reloadData();
            },
            error => console.log(error));
    }
  }
  
  reloadData() {
   this.books = this.bookService.getAllBooks();
  }
  editBook(id:number){
  
    this.router.navigate(['/bookeidt',id])
  }
  addnew
  formcreate(){
    this.router.navigate(["bookaddnew"]);
  }

}
