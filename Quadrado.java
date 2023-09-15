public class Quadrado{
    private double lado;

    public  Quadrado (double lado){
        this.lado = lado;
    }

    public double calcularAreaq(){
        return lado * lado;
    }

    public double calcularPerimetroq(){
        return 4 * lado;
    }
}