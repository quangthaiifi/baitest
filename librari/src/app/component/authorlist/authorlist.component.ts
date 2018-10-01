import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Authors } from '../../model/authors';
import { AuthorService } from '../../service/author.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-authorlist',
  templateUrl: './authorlist.component.html',
  styleUrls: ['./authorlist.component.css']
})
export class AuthorlistComponent implements OnInit {
  constructor( private authorService : AuthorService,private router:Router) { }
  //term:String;
  ngOnInit() {
    this.reloadData();
    
  }
  authors : Observable<Authors[]>;
  author:any;
  numRow:number =0;
    
  deleteAuthor(id:number) {
    if(confirm("You wand delete this author "  )==true)
    {
        this.authorService.deleteAuthor(id)
          .subscribe(
            data => {
              console.log(data);
              this.reloadData();
            },
            error => console.log(error));
    }
  }
  
  reloadData() {
   this.authors = this.authorService.getAllAuthors();
  }
  editAuthor(id:number){
  
    this.router.navigate(['/authoreidt',id])
  }
  addnew
  formcreate(){
    this.router.navigate(["authoraddnew"]);
  }

}