package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> coor;
    private List<Double> x;
    Shape(){
        x = new ArrayList<>();
        coor = new ArrayList<>();
    }
    public void addPoint(Point a){
        coor.add(a);
    }
    public void findDistances(){
        //listDistances.clear();
        Point last = coor.get(coor.size() - 1);
        for(Point a : coor){
            x.add(a.distance(last));
            last = a;
        }
    }
    public double calculatePerimeter(){
        double result = 0;
        for(double a : x){
            result += a;
        }
        return result;
    }


    public List<Point> getPoints() {
        return coor;
    }
    public double LongestSide(){
        double Max = 0;
        for(double a : x){
            Max = Math.max(a, Max);
        }
        return Max;
    }
    public double AverageSide(){
        double result = calculatePerimeter();
        return result / coor.size();
    }

}
