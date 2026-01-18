package com.pcnslt;
import com.pcnslt.NumberUtils;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(NumberUtils.min("John","Cena"));

        String[] strArr = {"James","Andy", "Zulu"};

        Exercise ex = new Exercise();
        int count = ex.countOfGreater(strArr,"Candy");
        System.out.println(count);
    }



}

