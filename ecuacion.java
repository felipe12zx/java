import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaApplication1 {




    public static void main(String[] args) throws IOException {
     
        double a2,b2, d,x1 = 0,x2;
     
       System.out.println("Introduzaca primer coheficiente a:");
       System.out.println("Introduzaca primer coheficiente b:");
       System.out.println("Introduzaca primer coheficiente c:");
     
        BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));
     
       String a=Entrada.readLine();
        a2=Double.parseDouble(a);
     
        String b=Entrada.readLine();
        b2 = Double.parseDouble(b);
     
        String c=Entrada.readLine();
        double c2 = Double.parseDouble(c);
     
     
       
      // calculamos el determinante
 d=((b2*b2)-4*a2*c2);
 if(d<0)
 System.out.println("No existen soluciones reales");

 else
 // queda confirmar que a sea distinto de 0.
// si a=0 nos encontramos una división por cero.

 x1=(-b2+Math.sqrt(d))/(2*a2);
  x2=(-b2 - Math.sqrt(d))/(2* a2);

    System.out.println(  "Solución: "+ x1);
 System.out.println("Solución: " + x2);


    }
   }