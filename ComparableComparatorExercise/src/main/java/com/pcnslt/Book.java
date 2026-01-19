package com.pcnslt;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    public String title;
    public String author;
    public int numberOfPages;
}
