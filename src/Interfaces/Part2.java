package Interfaces;

public class Part2 {
    public static void main(String[] args) {
        Part2 m=new Part2();
        m.circleDraw(); // tight coupling
        m.squareDraw();

        Shape sp=new Circle(); // loose coupling
        sp.draw();
        Shape sp2 =new Square();
        System.out.println(sp2);


    }

    void circleDraw(){
        System.out.println(" draw circle ");
    }
    void squareDraw(){
        System.out.println(" Square circle ");
    }

}
interface Shape{
    void draw();
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Darwing circle");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Square drawing");
    }
}

