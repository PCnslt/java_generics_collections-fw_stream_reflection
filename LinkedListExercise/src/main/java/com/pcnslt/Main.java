package com.pcnslt;

import javax.xml.stream.events.Characters;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<Character> l1 = new LinkedList<>();
        char[] s1 = "Racecar".toLowerCase(Locale.ROOT).toCharArray();
        for(char c: s1){
            l1.add(c);
        }


        System.out.println(isPalindrome(l1));



    }

    public static boolean isPalindrome(LinkedList<Character> lists){



        LinkedList<Character> reversed = lists.reversed();

        return lists.equals(reversed);
    }
}