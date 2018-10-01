import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorlistComponent } from './component/authorlist/authorlist.component';
import { AuthoraddnewComponent } from './component/authoraddnew/authoraddnew.component';
import { BooklistComponent } from './component/booklist/booklist.component';

const routers: Routes= [
  {path:'',component:AuthorlistComponent},
  {path:'authoraddnew',component:AuthoraddnewComponent},
  {path:'authoreidt/:id',component:AuthoraddnewComponent},
  {path:'authors',redirectTo:'',pathMatch:'full'},
  {path:'books',component:BooklistComponent}
]
@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routers) ],
},
   

)
export class AppRoutingModule {}
