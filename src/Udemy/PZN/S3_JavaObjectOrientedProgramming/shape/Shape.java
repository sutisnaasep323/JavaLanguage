package Udemy.PZN.S3_JavaObjectOrientedProgramming.shape;

public class Shape {

    int getCorner(){
        return 0;
    }

}

class Rectangle extends Shape {

    int getCorner(){
        return 7;
    }

    int getParengCorner(){
        return super.getCorner();
    }

}
