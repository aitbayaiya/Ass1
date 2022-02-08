package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("C:\\Users\\user\\Desktop\\Study\\java\\ass1\\file1.txt"));
        Scanner sc2 = new Scanner(new File("C:\\Users\\user\\Desktop\\Study\\java\\ass1\\file2.txt"));
        Shape coor = new Shape();
        while(sc1.hasNextLine()){
            int x, y;
            x = sc1.nextInt();
            y = sc1.nextInt();
            coor.addPoint(new Point(x, y));
            //a.findDistances();
        }
        coor.findDistances();
        System.out.println("P = " + coor.calculatePerimeter() + "\n MaxSide = " + coor.LongestSide() + "\n Average = " + coor.AverageSide());
    }
}
