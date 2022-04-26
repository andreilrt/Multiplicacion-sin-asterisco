package multiplicacion.sin.asterisco;

/**
 *
 * @author lsras
 */
import java.util.Scanner;
public class MultiplicacionSinAsterisco {
    Scanner cin = new Scanner(System.in);
    
    
    
    
    public int IngresarDatos(String anuncio){
        int a=0;
        System.out.print("Ingrese el "+anuncio+" numero: ");
        a = cin.nextInt();
        return a;
    }

    public int Operacion(int a, int b){
        int c=0;
        c=a;
        while(c/b!=a){
            c+=a;
        }
        return c;
    }

public void Resultado(int c){
    System.out.println("El resultado de tu operacion es: "+c+"\n");
}

public void Proceso(){
    int a=0;
    int b=0;
    int c=0;
    System.out.println("Bienvenido al programa para multiplicar sin *\n");
    boolean Control=true;
    while(Control){
        a=IngresarDatos("primer");
        b=IngresarDatos("segundo");
        c=Operacion(a,b);
	Resultado(c);
        
    }
}
    public static void main(String[] args) {
        MultiplicacionSinAsterisco Objeto = new MultiplicacionSinAsterisco();
        Objeto.Proceso();
    }
    
}
























