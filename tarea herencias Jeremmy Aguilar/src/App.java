public class App {
    public static void main(String[] args) throws Exception {
        

        Rectangulo rect1 = new Rectangulo(3.0, 2.0);
        Rectangulo rect2 = new Rectangulo(3.0, 2.0);
        
        System.out.println( rect2.compareTo(rect1));


        Triangulo tri1 = new Triangulo(6.0, 2.0);
        
        System.out.println( tri1.compareTo(rect1));

        
        Circulo cir1 = new Circulo(4);

        System.out.println(cir1.compareTo(rect2));
        
    }
}
