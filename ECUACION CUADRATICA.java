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

    double D = Math.pow(b, 2) - 4 * a * c;
    
    if (D < 0) {
      double G=0;
      G=-b/(2*a);
      double I=0;
      I=Math.sqrt(-D)/(2*a);
      System.out.println("la solucion es compleja:");
      System.out.println("X1="+""+G+"+"+I+"j");
      System.out.println("X2="+""+G+"-"+I+"j");
      
    } else if (D== 0) {
    
      double x1 = -b / (2 * a);
      System.out.println(" Raiz unica o iguales x : = " + x1);
      
    } else {
      double x1 = (-b - Math.sqrt(D)) / (2 * a);
      double x2 = (-b + Math.sqrt(D)) / (2 * a);
      System.out.println("Las dos soluciones reales son:");
      
      System.out.println(" discriminante = " + D) ;
      
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    }
    input.nextLine();
  }
}