import { Component, OnInit } from '@angular/core';
import { Authors } from '../../model/authors';
import { AuthorService } from '../../service/author.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-authoraddnew',
  templateUrl: './authoraddnew.component.html',
  styleUrls: ['./authoraddnew.component.css']
})
export class AuthoraddnewComponent implements OnInit {

  constructor(private authorService : AuthorService, private router:ActivatedRoute,private route:Router) { }
  author : Authors = new Authors();
  submited = false;
  
  ngOnInit() {
    this.author.authorId =  parseInt(this.router.snapshot.paramMap.get('id'));
   // this.timKiemMonHocComponent.searchMonHoc();
    this.searchMonHoc();

  }
  newMonHoc(): void {
    this.submited = false;
    this.author = new Authors();
  }
  save() {
    this.authorService.createAuthor(this.author)
      .subscribe(data => console.log(data), error => console.log(error));
    this.author = new Authors();
  }
  update(){
    console.log(this.author);
    
    this.authorService.updateAuthor(this.author)
    .subscribe(data=>console.log(data),error=>console.log(error));
    this.author = new Authors();
  }
  onSubmit() {
    this.submited = true;
    if(isNaN(this.author.authorId)){
    this.author.authorId=0;
    this.save();
    }else
    {this.update();}
    this.route.navigate(['authors']);
  }
  private searchMonHoc() {
    this.authorService.getAuthor(this.author.authorId)
      .subscribe(monHoc => this.author = monHoc);
      console.log(this.author);
      
  }
}
