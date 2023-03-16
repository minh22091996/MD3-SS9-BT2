package rekkei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void triangle() {
        String result = TriangleClassifier.triangle(2,2,2);
        String expected = "tam giac deu";
        assertEquals(expected,result);
    }

    @Test
    void triangle1() {
        String result = TriangleClassifier.triangle(2,5,1);
        String expected = "tam giac thuong";
        assertEquals(expected,result);
    }
    @Test
    void triangle2() {
        String result = TriangleClassifier.triangle(-1,2,2);
        String expected = "khong phai tam giac";
        assertEquals(expected,result);
    }
}