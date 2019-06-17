package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.model.MemoryBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    MemoryBookService memoryBookService;

    @RequestMapping("/hello")
    public String hello(){
        return "{hello: World}";
    }

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L,"9788324631766","Thinking in Java",
                "Bruce Eckel","Helion","programming");
    }

    @Autowired
    public BookController(MemoryBookService memoryBookService) {
        this.memoryBookService = memoryBookService;
    }

    @GetMapping("")
    public List<Book> listBook() {
        return memoryBookService.getList();
    }

    @RequestMapping("/{id}")
    public Book getBook(@PathVariable long id) {
        return memoryBookService.getBook(id);
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book book) {
        memoryBookService.addBook(book);
        return book;
    }

    @PutMapping("/{id}")
    public void updBook(@RequestBody Book book, @PathVariable long id) {
        memoryBookService.updBook(book, id);
    }

    @DeleteMapping("/{id}")
    public void delBook(@PathVariable long id) {
        memoryBookService.delBook(id);
    }
}
