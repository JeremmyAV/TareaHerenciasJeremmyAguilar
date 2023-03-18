public class Rectangulo extends Figura{

    private double base;
    private double altura;
    private int lados;

    public Rectangulo(double pBase, double pAltura)
    {
        base = pBase;
        altura = pAltura;
        lados = 4;
    }

    public double calcularArea()
    {
        return base * altura;
    }

    public void imprimir()
    {
        System.out.println(base);
        System.out.println(altura);
    }

    public int impLados()
    {
        return lados;
    }

    public int compareTo(Figura porComparar)
    {
        double areaPorComparar = porComparar.calcularArea();
        double miArea = this.calcularArea();
        System.out.println("comparacion de areas:");
        System.out.print(miArea);
        System.out.print(" con ");
        System.out.println(areaPorComparar);
        if(miArea==areaPorComparar){
            System.out.println("Por diferencia de lados...");
            if ( this.impLados() == porComparar.impLados()){
                return 0;
            }
            else if (this.impLados() > porComparar.impLados()){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
        return 1;
        }
        else{
        return -1;
        }
    }
}
