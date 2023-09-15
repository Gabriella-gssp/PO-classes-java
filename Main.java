import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação (1 para área, 2 para perímetro):");
        int operacao = scanner.nextInt();

        if (operacao != 1 && operacao != 2) {
            System.out.println("Operação inválida. Encerrando o programa.");
            return;
        }

        System.out.println("Escolha a figura geométrica (1 para círculo, 2 para quadrado, 3 para retângulo, 4 para triângulo):");
        int figura = scanner.nextInt();

        double area = 0;
        double perimetro = 0;

        switch (figura) {
            case 1:
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                Circulo circulo = new Circulo(raio);
                if (operacao == 1) {
                    area = circulo.calcularArea();
                    System.out.println("Área do círculo: " + area);
                } else {
                    perimetro = circulo.calcularPerimetro();
                    System.out.println("Perímetro do círculo: " + perimetro);
                }
                break;

            case 2:
                System.out.println("Digite o lado do quadrado:");
                double ladoQuadrado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(ladoQuadrado);
                if (operacao == 1) {
                    area = quadrado.calcularAreaq();
                    System.out.println("Área do quadrado: " + area);
                } else {
                    perimetro = quadrado.calcularPerimetroq();
                    System.out.println("Perímetro do quadrado: " + perimetro);
                }
                break;

            case 3:
                System.out.println("Digite a base do retângulo:");
                double baseRetangulo = scanner.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double alturaRetangulo = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                if (operacao == 1) {
                    area = retangulo.calcularArear();
                    System.out.println("Área do retângulo: " + area);
                } else {
                    perimetro = retangulo.calcularPerimetror();
                    System.out.println("Perímetro do retângulo: " + perimetro);
                }
                break;

            case 4:
                System.out.println("Digite a base do triângulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double alturaTriangulo = scanner.nextDouble();
                System.out.println("Digite o lado esquerdo do triângulo:");
                double ladoEsqTriangulo = scanner.nextDouble();
                System.out.println("Digite o lado direito do triângulo:");
                double ladoDirTriangulo = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, ladoEsqTriangulo, ladoDirTriangulo);
                if (operacao == 1) {
                    area = triangulo.calcularAreat();
                    System.out.println("Área do triângulo: " + area);
                } else {
                    perimetro = triangulo.calcularPerimetrot();
                    System.out.println("Perímetro do triângulo: " + perimetro);
                }
                break;

            default:
                System.out.println("Figura geométrica inválida. Encerrando o programa.");
        }

        scanner.close();
    }
}
