/*
 * B10433006_張舒婷
 */
package ShapeTest;
/**
 *
 * @author zhangshuting
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape3D shape1 = new Sphere(2);
        Shape3D shape2 = new Cube(8);
        System.out.println(shape1);
        System.out.println("============================");
        System.out.println(shape2);
    }
}
