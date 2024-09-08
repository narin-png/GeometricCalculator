package oddevenchecker;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task {
    public static void main(String[] args) {

Scanner figure=new Scanner(System.in);
        System.out.println("choose one of figures:rectangle/triagle/circle?");
        String n=figure.next();
Scanner rectangleside1=new Scanner(System.in);
        System.out.println("add the first side of rectangle:");
        int rectside1=rectangleside1.nextInt();
Scanner rectangleside2=new Scanner(System.in);
        System.out.println("add the second side of rectangle:");
        int rectside2=rectangleside2.nextInt();
Scanner triangleside1=new Scanner(System.in);
        System.out.println("add the first side of triangle:");
        int triside1=triangleside1.nextInt();
        Scanner triangleside2=new Scanner(System.in);
        System.out.println("add the second side of triangle:");
        int triside2=triangleside2.nextInt();
        Scanner triangleside3=new Scanner(System.in);
        System.out.println("add the third side of triangle:");
        int triside3=triangleside3.nextInt();
        int c=triside1+triside2+triside3;
Scanner circle=new Scanner(System.in);
        System.out.println("add the radius of circle:");
        int circle1=circle.nextInt();
        int π=3;
int resultperimeter=n.equals("rectangle")?(rectside1+rectside2)*2:n.equals("triangle")?c:n.equals("circle")?2*π*circle1:0;
        System.out.println("perimeter:"+resultperimeter);
double resultarea=n.equals("rectangle")?rectside1*rectside2:n.equals("triangle")?sqrt(c*(c-triside1)*(c-triside2)*(c-triside3)):n.equals("circle")?π*Math.pow(circle1,2):0.0;
        System.out.println("area:"+resultarea);
    }
}
