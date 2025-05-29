package Triangle;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class TriangleClassifierTest {
    @Test
    void findTriangle() {
        String expected = "Tam giác đều";
        String result = TriangleClassifier.findTriangle(2,2,2);
        assertEquals(expected,result);
    }
    @Test
    void findTriangle2() {
        String expected ="Tam giác cân";
        String result = TriangleClassifier.findTriangle(2,2,3);
        assertEquals(expected,result);
    }
    @Test
    void findTriangle3() {
        String expected = "Tam giác thường";
        String result = TriangleClassifier.findTriangle(3,4,5);
        assertEquals(expected,result);
    }
    @Test
    void findTriangle4() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.findTriangle(8,2,3);
        assertEquals(expected,result);
    }
    @Test
    void findTriangle5() {
        String expected ="Không phải là tam giác";
        String result = TriangleClassifier.findTriangle(-1,2,1);
        assertEquals(expected,result);
    }
    @Test
    void findTriangle6() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.findTriangle(0,1,1);
        assertEquals(expected,result);
    }
}
