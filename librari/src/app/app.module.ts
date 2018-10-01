import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { AuthorlistComponent } from './component/authorlist/authorlist.component';
import { RouterModule } from '@angular/router';
import { AuthoraddnewComponent } from './component/authoraddnew/authoraddnew.component';
import { FormsModule } from '@angular/forms';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { BooklistComponent } from './component/booklist/booklist.component';

@NgModule({
  declarations: [
    AppComponent,
    AuthorlistComponent,
    AuthoraddnewComponent,
    BooklistComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    Ng2SearchPipeModule
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
