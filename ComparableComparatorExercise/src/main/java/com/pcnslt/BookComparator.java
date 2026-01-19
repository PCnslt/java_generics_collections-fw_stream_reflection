package com.pcnslt;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.title.compareTo(o2.title)<0){return -1;}
        else if(o1.title.compareTo(o2.title)>0){return 1;}
        else{
            if(o1.author.compareTo(o2.author)<0){return -1;}
            else if(o1.author.compareTo(o2.author)>0){return 1;}
            else{
                if(Integer.compare(o1.numberOfPages,o2.numberOfPages)<0){return -1;}
                else if(Integer.compare(o1.numberOfPages,o2.numberOfPages)>0){return 1;}
                else{return 0;}
            }
        }
    }

    @Override
    public Comparator<Book> reversed() {
        return Comparator.super.reversed();
    }

}
