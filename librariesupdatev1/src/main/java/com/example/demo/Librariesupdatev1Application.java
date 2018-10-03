package com.example.demo;

import static org.mockito.Mockito.never;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Books;
import com.example.demo.entity.BooksHasLibraries;
import com.example.demo.entity.BooksHasLibrariesId;
import com.example.demo.entity.Categories;
import com.example.demo.entity.Libraries;
import com.example.demo.service.BooksHasLibrariesService;
import com.example.demo.service.BooksService;
import com.example.demo.service.CategoriesService;
import com.example.demo.service.LibrariesService;

@SpringBootApplication
public class Librariesupdatev1Application  implements CommandLineRunner{

	@Autowired
	BooksService booksService;
	@Autowired
	CategoriesService categoriesService;

	@Autowired
	LibrariesService librariesService;
	
	@Autowired 
	BooksHasLibrariesService booksHasLibrariesService;
	
	public static void main(String[] args) {
		SpringApplication.run(Librariesupdatev1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Books books = new Books();
//		Categories categories = new Categories();
//		categories.setCategoryName("Sach giao khoa");
//		Set<Categories> categories2 = new HashSet<Categories>();
//		categories2.add(categories);
//		categoriesService.create(categories);
//		books.setBookTitle("Toan");
//		books.setCategorieses(categories2);
//		booksService.create(books);
//		Libraries libraries  = new Libraries();
		Libraries libraries = new Libraries();
		libraries.setLibraryId(8);
		libraries.setLibraryName("test");
		librariesService.create(libraries);
		
		
		
		
		Set<Libraries> libraries2 = new HashSet<Libraries>();
		libraries2.add(libraries);
		BooksHasLibraries booksHasLibraries = new BooksHasLibraries();
		BooksHasLibrariesId id = new BooksHasLibrariesId();
		id.setBooksIsbn(1);
		id.setLibrariesLibraryId(2);
		booksHasLibraries.setQuatityInStock("8");
		
		booksHasLibraries.setId(id);
		
	
		booksHasLibrariesService.create(booksHasLibraries);
		
		
	
		
	}
}
