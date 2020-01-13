package edu.jcourse.lesson12;

public class CircleAreaServiceImpl implements CircleAreaService {
    @Override
    public float calcCircleArea(float radius) {

        float circleArea = Pi * radius * radius;
        return circleArea;
    }

    public float calcRectangleArea(float sideA, float sideB) {
        float rectangleArea = sideA * sideB;
        return rectangleArea;
    }
}
