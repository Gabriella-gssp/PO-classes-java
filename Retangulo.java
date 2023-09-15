public class Retangulo{
    public double base;
    public double altura;

    public Retangulo (double base, double altura){
        this.base = base;
        this.altura = altura
    }

    public double calcularArear(){
        return base * altura;
    }

    public double calcularPerimetror(){
        return (2 * base) + (2 * altura);
    }

    

}