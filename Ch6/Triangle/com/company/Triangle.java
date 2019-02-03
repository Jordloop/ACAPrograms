package com.company;

public class Triangle
{
    int sideA;
    int sideB;
    int sideC;

    public int getPerimeter()
    {
        int perimeter = this.sideA + this.sideB + this.sideB;
        return perimeter;
    }

    public boolean isEquilateral()
    {
        boolean isEquilateral = (this.sideA == this.sideB && this.sideB == this.sideC);
        return isEquilateral;
    }

    public boolean isIsosceles()
    {
        boolean isIsosceles = ((this.sideA == this.sideB && this.sideC != sideA) ||
                               (this.sideA == this.sideC && this.sideB != sideA) ||
                               (this.sideC == this.sideB && this.sideC != sideA));
        return isIsosceles;
    }

    public boolean isScalene()
    {
        boolean isScalene = (this.sideA != this.sideB && this.sideA != this.sideC && this.sideB != this.sideC);
        return isScalene;
    }

}
            // CAN'T FIND FORMULA TO CORRECTLY CALCULATE THE ANGLES OF A TRIANGLE
            // OTHERWISE LOGIC FOR METHODS BELOW IS SOUND

//    public boolean isRightAngle()
//    {
//        double angleA = Math.acos((this.sideB * this.sideB + this.sideC * this.sideC - this.sideA * this.sideA) / (2* sideB * sideC)) * (180 / 3.14);
//        double angleB = Math.acos((this.sideA * this.sideA + this.sideC * this.sideC - this.sideB * this.sideB) / (2* sideA * sideC)) * (180 / 3.14);
//        double angleC = (180 - angleA - angleB);
//        System.out.println(angleA);
//        System.out.println(angleB);
//        System.out.println(angleC);
//        boolean isRightAngle = false;
//        if (angleA == 90 || angleB == 90 || angleC == 90)
//        {
//            isRightAngle = true;
//        }
//
//        return isRightAngle;
//    }
//
//    public boolean isAcuteAngle()
//    {
//        int angleA = ((this.sideB * this.sideB) + (this.sideC * this.sideC) - (this.sideA * this.sideA)) / 2*(sideB + sideC);
//        int angleB = ((this.sideA * this.sideA) + (this.sideC * this.sideC) - (this.sideB * this.sideB)) / 2*(sideA + sideC);
//        int angleC = ((this.sideB * this.sideB) + (this.sideA * this.sideA) - (this.sideC * this.sideC)) / 2*(sideB + sideA);
//
//        boolean isAcuteAngle = false;
//        if (angleA < 90 && angleB < 90 && angleC < 90)
//        {
//            isAcuteAngle = true;
//        }
//
//        return isAcuteAngle;
//    }
//
//    public boolean isObtuseAngle()
//    {
//        int angleA = ((this.sideB * this.sideB) + (this.sideC * this.sideC) - (this.sideA * this.sideA)) / 2*(sideB + sideC);
//        int angleB = ((this.sideA * this.sideA) + (this.sideC * this.sideC) - (this.sideB * this.sideB)) / 2*(sideA + sideC);
//        int angleC = ((this.sideB * this.sideB) + (this.sideA * this.sideA) - (this.sideC * this.sideC)) / 2*(sideB + sideA);
//
//        boolean isObtuseAngle = false;
//        if (angleA > 90 || angleB > 90 || angleC > 90)
//        {
//            isObtuseAngle = true;
//        }
//
//        return isObtuseAngle;
//    }


