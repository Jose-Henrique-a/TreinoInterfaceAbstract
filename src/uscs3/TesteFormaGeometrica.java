package uscs3;

public class TesteFormaGeometrica {
    public static void main(String[] args) {
        System.out.println("____________________________________________");
        AreaCalculavel c1 = new Circulo(5);
        System.out.println("Area do circulo = "+ c1.calculaArea());
        System.out.println("Comprimento do circulo = "+ c1.calculaComprimento());

        System.out.println("____________________________________________");
       AreaCalculavel r1 = new Retangulo(3.0, 5.0);
       System.out.println("Area do retangulo = "+r1.calculaArea());
        System.out.println("Comprimneto do retangulo = "+ r1.calculaComprimento());

        System.out.println("____________________________________________");
       AreaCalculavel q1 = new Quadrado(3);
       System.out.println("Area do retangulo = "+q1.calculaArea());
        System.out.println("Comprimneto do retangulo = "+ q1.calculaComprimento());
    }
}
