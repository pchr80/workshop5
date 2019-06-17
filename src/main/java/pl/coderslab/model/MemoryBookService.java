package pl.coderslab.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class MemoryBookService {
    private List<Book> list;
    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }
    public List<Book> getList() {return list;}
    public void setList(List<Book> list) {this.list = list;}
    public Book getBook(long id) {
        for(Book b: list) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public void updBook(Book book, long id) {
        int matchIdx;
        if (book.getId() != id) {
            return;
        }
        Optional<Book> match = list.stream().filter(c -> c.getId() == book.getId()).findFirst();
        if (match.isPresent()) {
            matchIdx = list.indexOf(match.get());
            list.set(matchIdx, book);
        }
    }

    public void delBook(long id) {
        Predicate<Book> book = b -> b.getId() == id;
        list.removeIf(book);
    }

}