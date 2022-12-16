package service.serviceimpl;

import model.Book;
import service.BookService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class BookServiceImpl implements BookService {
    List<Book> books1 = new ArrayList<>();

    @Override
    public List<Book> createBooks(List<Book> books) {
        books1.addAll(books);
       return books;
    }

    @Override
    public List<Book> getAllBooks() {
        for (Book b:books1) {
            System.out.println(b);}
        return null;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        for (Book b : books1) {
            if (genre.equalsIgnoreCase(b.getGenre().name())){
                System.out.println(b);
            }

        }
        return null;
    }

    @Override
    public Book removeBookById(Long id) {
        System.out.println("""
                1: Kiteptin aty menen ochuruu
                3: Avtordun aty menen ochuruu""");
        int num = new Scanner(System.in).nextInt();
        switch (num){
            case 1-> {
                String name = new  Scanner(System.in).nextLine();
                for (Book name2:books1) {
                    if (name.equalsIgnoreCase(name2.getName())){
                        books1.remove(name2);
                    }

                }
            }case 2->{
                String name = new  Scanner(System.in).nextLine();
                String name1 = new  Scanner(System.in).nextLine();
                for (Book name2:books1) {
                    if (name.equalsIgnoreCase(name2.getName())){
                        books1.remove(name2);
                    }
            }
        }
    }return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {

        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
       books1.stream().peek(s->sortBooksByPriceInDescendingOrder()).forEach(System.out::println);

        return null;
        }
    }




