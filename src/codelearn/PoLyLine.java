package codelearn;

import java.util.ArrayList;
import java.util.List;

public class PoLyLine {
    private List<Point> points;

    public PoLyLine(){
        this.points = new ArrayList<Point>();
    }
    public PoLyLine(List<Point> points){
        this.points = new ArrayList<Point>();
        for(int i = 0; i<points.size(); i++){
            this.points.add(points.get(i));
        }
    }
    public void appendPoint(Point point){
        this.points.add(point);
    }
    public void appendPoint(int x, int y){
        Point point = new Point(x, y);
        this.points.add(point);
    }
    public double getLength(){
        double length = 0;
        for(int i = 0; i<points.size() -1;i++){
            double distance =  Math.sqrt(Math.pow(points.get(i).getX()-points.get(i+1).getX(),2)+ Math.pow(points.get(i).getY()-points.get(i+1).getY(),2));
            length += distance;
        }

        return length;
    }
    
}
