
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void TestTriangle() {
        assertEquals("The triangle is: EQUILATERAL", new Triangle(new double[] {2, 2, 2}, false).getType());

        Point x = new Point(1, 1);
        assertEquals(0, (int)x.distance(x));

        Point a = new Point(0, 1);
        Point b = new Point(0, 0);
        Point c = new Point(1, 0);
        assertEquals("The triangle is: ISOCELES AND RIGHT", new Triangle(a, b, c).getType());

        a = new Point(0, 20);
        b = new Point(-5, -6);
        c = new Point(3, 8);
        assertEquals("The triangle is: SCALENE", new Triangle(a, b, c).getType());

        assertEquals("The triangle is: SCALENE AND RIGHT", new Triangle(new double[] {3, 4, 5}, true).getType());

        assertEquals(0, (int)new Triangle(new double[] {1, 1, 1}, true).getArea());
    }

}
