package com.greenjava.bookdetailsservice.controller;

import com.greenjava.bookdetailsservice.client.BookPriceProxy;
import com.greenjava.bookdetailsservice.model.Book;
import com.netflix.client.http.CaseInsensitiveMultiMap;
import com.netflix.client.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
public class BookDetailsController {

    @Autowired
    private BookPriceProxy bookPriceProxy;

    @GetMapping("book-details/{name}/{quantity}")
    public Book getBookDetails(@PathVariable("name") String name,
                               @PathVariable("quantity")
                                       int quantity) {

        Book bookPrice = bookPriceProxy.book(name);

        bookPrice.setPrice(bookPrice.getPrice() * quantity);
        return bookPrice;
    }

}
