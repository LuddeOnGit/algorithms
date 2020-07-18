package org.pg4200.ex01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.pg4200.ex01.TriangleClassification;

public class TriangleClassificationTest {

    @Test
    public void not_a_triangle_below_0_test(){
        int a = 3;
        int b = 4;
        int c = -5;

        assertEquals(TriangleClassification.classify(a,b,c), TriangleClassification.Classification.NOT_A_TRIANGLE);
    }

    @Test
    public void equilateral_triangle_test(){
        int a = 5;
        int b = 5;
        int c = 5;

        assertEquals(TriangleClassification.classify(a,b,c), TriangleClassification.Classification.EQUILATERAL);
    }

    @Test
    public void not_a_triangle_max_test(){
        int a = 3;
        int b = 9;
        int c = 5;

        assertEquals(TriangleClassification.classify(a,b,c), TriangleClassification.Classification.NOT_A_TRIANGLE);
    }

    @Test
    public void isosceles_triangle_test(){
        int a = 3;
        int b = 4;
        int c = 3;

        assertEquals(TriangleClassification.classify(a,b,c), TriangleClassification.Classification.ISOSCELES);
    }

    @Test
    public void scalene_triangle_test(){
        int a = 3;
        int b = 4;
        int c = 5;

        assertEquals(TriangleClassification.classify(a,b,c), TriangleClassification.Classification.SCALENE);
    }
}
