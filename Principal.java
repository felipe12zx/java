    import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese a: ");
    double a = input.nextDouble();
    System.out.print("Ingrese b: ");
    double b = input.nextDouble();
    System.out.print("Ingrese c: ");
    double c = input.nextDouble();
    double discriminante = Math.pow(b, 2) - 4 * a * c;
    if (discriminante < 0) {
      System.out.println("La ecuacion no tiene soluciones reales");
    } else if (discriminante == 0) {
      double x = -b / (2 * a);
      System.out.println("La solucion unica es x = " + x);
    } else {
                    double x1 = (-b - Math.sqrt(discriminante)) / (2 * a);
      double x2 = (-b + Math.sqrt(discriminante)) / (2 * a);
      System.out.println("Las dos soluciones reales son:");
      
      System.out.println(" discriminante = " + discriminante ) ;
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    }
    input.nextLine();
  }
}
