package com.company;

public class Rectangle
{
    int height;
    int width;

    public void doubleHeight()
    {
        this.height *= 2;
    }

    public void doubleWidth()
    {
        this.width *= 2;
    }

    public void rotate()
    {
        int temp = this.width;
        this.width = this.height;
        this.height = temp;
    }

    public boolean canContain(Rectangle rectangle)
    {
        boolean canContain = false;

        if(rectangle.width < this.width && rectangle.height < this.height)
        {
            canContain = true;
        }
        rectangle.rotate();
        if (rectangle.width < this.width && rectangle.height < this.height)
        {
            canContain = true;
        }

        return canContain;
    }
}
