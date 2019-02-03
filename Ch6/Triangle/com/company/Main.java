package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.sideA = 4;
        triangle.sideB = 4;
        triangle.sideC = 4;
        System.out.println(printTriangleSummary(triangle));

        Triangle triangle2 = new Triangle();
        triangle2.sideA = 10;
        triangle2.sideB = 8;
        triangle2.sideC = 5;
        System.out.println(printTriangleSummary(triangle2));

        Triangle triangle3 = new Triangle();
        triangle3.sideA = 5;
        triangle3.sideB = 8;
        triangle3.sideC = 5;
        System.out.println(

                printTriangleSummary(triangle3)

        );


    }

    private static String printTriangleSummary(Triangle triangle)
    {
        int perimeter = triangle.getPerimeter();
        int sideA = triangle.sideA;
        int sideB = triangle.sideB;
        int sideC = triangle.sideC;
        boolean isEquilateral = triangle.isEquilateral();
        boolean isIsosceles = triangle.isIsosceles();
        boolean isScalene = triangle.isScalene();
//        boolean isRightAngle = triangle.isRightAngle();
//        boolean isAcuteAngle = triangle.isAcuteAngle();
//        boolean isObtuseAngle = triangle.isObtuseAngle();


        String summary = "The length of the three sides is: " + sideA +  ", " + sideB + ", and " + sideC + ".\n" +
                "The perimeter of the triangle is: " + perimeter + ".\n" +
                "It is " + isEquilateral + " that is an equilateral triangle.\n" +
                "It is " + isIsosceles + " that is an isosceles triangle.\n" +
                "It is " + isScalene + " that is a scalene triangle.\n" +
//                "It is " + isRightAngle + " that is right.\n" +
//                "It is " + isAcuteAngle + " that is acute.\n" +
//                "It is " + isObtuseAngle + " that is obtuse.\n";

        return summary;
    }
}
