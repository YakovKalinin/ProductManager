package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private final Product first = new Product(1, "first", 1);
    private final Product second = new Product(2, "second", 1);
    private final Book firstBook = new Book(3, "firstBook", 2, "Firstbookov");
    private final Book secondBook = new Book(4, "secondBook", 2, "Firstbookova");
    private final Smartphone firstSmartphone = new Smartphone(5, "firstSmartphone", 6, "OOO");
    private final Smartphone secondSmartphone = new Smartphone(6, "secondSmartphone", 10, "AAA");

    private final ProductManager manager = new ProductManager(new ProductRepository());

    @BeforeEach
    void setUp(){
        manager.save(first);
        manager.save(second);
        manager.save(firstBook);
        manager.save(secondBook);
        manager.save(firstSmartphone);
        manager.save(secondSmartphone);
    }

    @Test
    void shouldReturnByText() {
        Product[] expected = {first, firstBook, firstSmartphone};
        Product[] actual = manager.searchBy("first");
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldReturnByTextWithout() {
        Product[] expected = {};
        Product[] actual = manager.searchBy("third");
        assertArrayEquals(expected, actual);
    }
}