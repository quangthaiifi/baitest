import { Library } from "./library";
import { Authors } from "./authors";
import { Category } from "./category";

export class Books {
    isbn:number;
    bookTitle:string;
    dateOfPublication:Date;
    booksAtLibrarieses:Library[];
    booksByAuthors:Authors[];
    BooksByCategory:Category[];


}
