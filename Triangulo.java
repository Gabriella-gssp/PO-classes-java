public class Triangulo{
    public double base;
    public double altura;
    public double ladoesq;
    public double ladodir;

    public Triangulo (double base, double altura, double ladoesq, double ladodir){
        this.base = base;
        this.altura = altura;
        this.ladoesq = ladoesq;
        this.ladodir = ladodir
    }

    public double calcularAreat(){
        return (base * altura)/2;
    }

    public double calcularPerimetrot(){
        return base + ladodir + ladoesq;
    }
}