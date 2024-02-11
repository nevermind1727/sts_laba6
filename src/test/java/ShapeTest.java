import graphics.DrawingStyle;
import graphics.ShapeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ShapeTest {
    @Test
    void ShapeByNumberTest(){
        ShapeFactory shape1 = new ShapeFactory(ShapeType.STAR_FIVE_POINTS, DrawingStyle.RED_COLOR);
        Assertions.assertEquals(Color.RED,shape1.paint);
        ShapeFactory shape2 = new ShapeFactory(ShapeType.STAR_THREE_POINTS, DrawingStyle.GRADIENT_PAINT);
        Assertions.assertEquals(GradientPaint.class, shape2.paint.getClass());
    }
}
