public class Circulo extends Figura{

    private double radio;
    private int lados;


    public Circulo(double rad)
    {
        radio = rad;
        lados = 0;
    }

    public double calcularArea()
    {
        return (radio*radio)*3.141592;
    }

    public void imprimir()
    {
        System.out.println(radio);
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
