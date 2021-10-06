
package pilaabc;
import java.util.Scanner;
public class PilaABC {
    
    public static void main(String[] args) { //Método
       
        Scanner sc=new Scanner(System.in);
        int opt=0, tope=0, a; //Se declaran variables
        System.out.println("Ingrese el tamaño de las pilas");//Se le pide al usuario que ingrese el tamaño de la pila
        a = sc.nextInt();//el tamaño se guarda en la variable a
        int b=a,c=a,c1=0; // para que sean pilas cuadradas deben tener el mismo tamaño por lo que a es igual a b
        int pA[] = new int[a]; //La pila A sera igual al tamaño=a
        int pB[] = new int[b]; //La pila B sera igual al tamaño=a
        int pC[] = new int[c]; //la pila c sera igual a la suma de los valores de a y b por lo que tendra el mismo tamaño=a
        do { //Se abre nuestro menú con un do while 
            System.out.println("\n1-Llenar pila A y pila B"
                    + "\n2-Mostrar pilas A y B"
                    + "\n3-Vaciar pilas A y B"
                    + "\n4-Unir pilas A y B"
                    + "\n5- Mostrar pila C"
                    + "\n6-Salir");
            switch (opt = sc.nextInt()) { //Se abre un switch para cada ejecutar cada opción
                case 1: //Llenar pila A y pila B
                    
                    System.out.println("Se han llenado las pilas");//Mandamos un mensaje al ujsuario de que se han llenado las pilas
                    for (int i = 0; i < a; i++) { //para i igual a cero; siempre y cuando i sea menor al tamaño asignado "a"; i avanzara
                        pA[i] = (int) (Math.random() * 100 + 1);  //La pila A tendra valores random de 1 a 100 
                    } //cierra bucle
                    for (int i = 0; i < b; i++) { //para i igual a cero; siempre y cuando i sea menor al tamaño asignado "b"; i avanzara
                        pB[i] = (int) (Math.random() * 100 + 100 ); //La pila A tendra valores random de 100 al 200
                    } //cierra bucle
                    tope++; //Se empieza a aumentar nuestro tope para que valla a la par que a
                    break; //cierra caso
                case 2: //Molstrar pilas A y B
                    if (tope>0){ //Si tope es mayor a cero quiere decir que hay datos que mostrar de lo contrario no nos mostrara nada ya que no se ha llenado aun los datos
                    System.out.println("pila A"); //Mandamos a imprimir pila A
                    for (int i = a - 1; i >=0; i--) { //Se abre bucle donde i va a ser igual a "a"-1 (osea que si a es igual a 5, i sera igual a 4 ya que se cuenta desde 0)
                                                      //mientras i sea mayor o igual a cero, i reducira de 1 en 1 
                        System.out.println(" " + pA[i]); //se mandara a imprimir la pila A
                    } //cierra bucle for
                    System.out.println("pila B"); //Lo mismo que se hizo con la pila A se hace con la pila B 
                    for (int i = b - 1; i >=0; i--) {
                        System.out.println(" " + pB[i]);
                    }}break;//cierra Bucle for
                    
                 case 3: //Caso Vaciar pilas
                     System.out.println("Las pilas se han vaciado"); //Mandar a imprimir el mensaje de que las pilas ya estan vacias para agrar nuevos valores
                     if(tope>0){ tope=0;}//Si tope es mayor a cero quiere decir que hay datos
                     else {System.out.println("La pila no tiene valores");}
                    break; //cierra caso 3
                    
                 case 4://Caso sumar pilas A y B
                    System.out.println("Se ha hecho la suma de las pilas A y B"); //Se manda a imprimir mensaje de que se han sumado los valores de las pilas
                    for (int i = tope-1; i == 0; i--){ //Se abre bucle donde i va a ser igual a tope menos 1 ya que se cuenta desde el 0; hasta que i igual a 0 se dejaran de contar los valores
                        pC[c1]= pA[i]+ pB[i]; //por lo que la pila C iniciando con in valor 0 ya que c1=0, sera igual a la suma de los valores de la pila A y la pila B en la polsicion i correspondiente
                    } //cierra bucle
                    break;//cierra caso
                    
                case 5://Caso Mostrar pila C
                     System.out.println("Pila C: "); //Se manda a imprimir la pila C
                    for (int i = tope-1; i == 0; i--){ //Se manda a traer de nuevo el ciclo realizado en el caso 4 para poder imprimir la pila C
                        System.out.println(" " + pC[i]); //Se manda a imprimir la suma de la pila A con la pila B
                    } break;//cierra bucle y caso
            }
        } while (opt != 6); //mientras opt no sea diferente de 6 o igual a 6 se seguira ejecutando
    } 
} //JESSICA VIRIDIANA GARCIA SILVA 
