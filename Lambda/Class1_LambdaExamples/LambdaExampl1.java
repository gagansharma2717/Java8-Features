package Lambda.Class1_LambdaExamples;

interface Drawable{

    void draw();
}

class DrawImpl implements Drawable
{
    @Override
    public void draw(){
        System.out.println("Drawing.....");
    }
}
public class LambdaExampl1 {

    public static void main(String[] args) {
        /*
            Legacy Flow
            DrawImpl obj = new DrawImpl();
            obj.draw();
        */


        /*Anonymous Implementation
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing with anonymous implementation");
            }
        };

        drawable.draw();*/

        Drawable drawable = () -> System.out.println("Drawing with Lamda");
        drawable.draw();
    }

}
