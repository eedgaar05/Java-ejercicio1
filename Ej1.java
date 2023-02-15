package JavaClase.Ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ej1 {
    //Ejercicio a
    static void a(){
        int cont = 0;//variable usada como contador
        List<Integer> nums = new ArrayList<>();//ArrayList para almacenar numeros introducidos por el usuario

        //Bucle para pedir un numero una cantidad de 5 veces
        while(cont < 5){

            Scanner keyboard = new Scanner(System.in);//Variable Scanner para poder introducir los numeros
            System.out.println("Escribe un numero: ");
            int num = keyboard.nextInt();//Variable que almacena el numero integer introducido por el usuario
            nums.add(num);//Añadimos el numero introducido a la lista de numeros
            cont+=1;//Alteracion de la variable contandor para sumar 1 a su valor

        }
        System.out.println(nums);
    }

    //Ejercicio b
    static void b(){
        int cont = 0;//Variable usada como contador
        List<Integer> nums = new ArrayList<>();//ArrayList para almacenar numeros introducidos por el usuario

        //Bucle para pedir un numero una cantidad de 5 veces
        while(cont < 5){

            Scanner keyboard = new Scanner(System.in);//Variable Scanner para poder introducir los numeros
            System.out.println("Escribe un numero: ");
            int num = keyboard.nextInt();//Variable que almacena el numero integer introducido por el usuario
            nums.add(num);//Añadimos el numero introducido a la lista de numeros
            cont+=1;//Alteracion de la variable contandor para sumar 1 a su valor
        }
        Collections.sort(nums);//Mediante la libreria Collections usamos la funcion sort para ordenar la lista creciente
        System.out.println(nums);
        Collections.reverse(nums);//Mediante la libreria Collections usamos la funcion reverse para ordenar la lista al reves cuando anteriormente ya la habiamos ordenadolo cual provoca que sea decreciente
        System.out.println(nums);
    }

    //Ejercicio c
    static void c(){
        int cont = 0;//Variable usada como contador
        List<Float> positiveNums = new ArrayList<>();//ArrayList para almacenar numeros positivos introducidos por el usuario
        List<Float> negativeNums = new ArrayList<>();//ArrayList para almacenar numeros negativos introducidos por el usuario
        List<Integer> zeros = new ArrayList<>();//ArrayList para almacenar los zeros
        
        //Bucle para pedir un numero una cantidad de 5 veces
        while(cont < 5){

            Scanner keyboard = new Scanner(System.in);//Variable Scanner para poder introducir los numeros
            System.out.println("Escribe un numero: ");
            Float num = keyboard.nextFloat();//Variable que almacena el numero float introducido por el usuario

            //Condicional 1 para detectar numeros positivos y almacenarlos en el ArrayList de numeros positivos 
            if(num >= 1){
                positiveNums.add(num);
            }

            //Condicional 2 para detectar numeros negativos y almacenarlos en el ArrayList de numeros negativos
            if(num <= -1){
                negativeNums.add(num);
            }

            //Condicional 3 para detectar los zeros y almacenarlos en el ArrayList de zeros
            if(num == 0){
                int numero = num.intValue();
                zeros.add(numero);
            }
            cont+=1;
        }
        
        int totalPositive = 0;//Variable integer de 0 para posteriormente almacenar la suma de todos los numeros positivos
        float avgPositive = 0;//Variable float de 0 para posteriormente almacenar la media de todos los numeros positivos

        //Bucle for para recorrer la lista de numeros positivos
        for(int i = 0; i < positiveNums.size(); i++){  
            
            totalPositive += positiveNums.get(i);//Usamos la variable totalPositive y le sumamos el valor asignado a la posicion i
            avgPositive = totalPositive / positiveNums.size();//Usamos la variable avgPositive y le asignamos el valor de totalPositive dividido entre la longitud de la lista
            
        
        }
        
        int totalNegative = 0;//Variable integer de 0 para posteriormente almacenar la suma de todos los numeros negativos
        float avgNegative = 0;//Variable float de 0 para posteriormente almacenar la media de todos los numeros negativos

        //Bucle for para recorrer la lista de numeros negativos
        for(int i = 0; i < negativeNums.size(); i++){  
            
            totalNegative += negativeNums.get(i);//Usamos la variable totalNegative y le sumamos el valor asignado a la posicion i
            avgNegative = totalNegative / negativeNums.size();//Usamos la variable avgNegative y le asignamos el valor de totalNegative dividido entre la longitud de la lista
            
        
        }

        int contadorZeros = 0;//Variable integer que la usaremos como contador para saber cuantos zeros hay en la lista de zeros
        
        //Bucle for para recorrer la lista de zeros
        for(int i = 0; i < zeros.size(); i++){
            
            int val = zeros.get(i);//Variable para obtener el valor de la posicion i

            //Condicional para validar si el numero es zero
            if(val == 0){
                contadorZeros +=1;//A la variable contador se le suma 1 por cada vez que la variable validadora zero
            }
            
        }
        System.out.println("La media de los positivos es: " + avgPositive);
        System.out.println("La media de lo negativos es: " + avgNegative);
        System.out.println("La cantidad de zeros es: " + contadorZeros);
    }

    //Ejercicio d
    static void d(){
        List<Character> letras = new ArrayList<>();//Lista tipo Character de letras
        Scanner keyboard = new Scanner(System.in);//Scanner
        System.out.println("Escribe algo: ");
        String texto = keyboard.nextLine();//Variable para almacenar el texto introducido por el usuario

        //Bucle for para recorrer el length de la variable anterior
        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);//Variable que almacena cada valor de i dentro del texto
            letras.add(letra);//Añadimos la variable anterior a la lista de letras
            
        }
        System.out.println(letras.size());
    }

    //Ejercicio e
    static void e(){
        Scanner keyboard = new Scanner(System.in);//Scanner para que el usuario introduzca un texto
        System.out.println("Escribe algo: ");
        String texto = keyboard.nextLine();//Variable que almacena el texto introducido por el usuario
        String reverse = "";//Variable que almacenará la frase al reves

        //Bucle for para recorrer de manera reversa el texto introducido por el usuario
        for (int i = texto.length() - 1; i >= 0; i--){
            char letra = texto.charAt(i);//Variable que almacena cada valor de i dentro del texto
            String letter = Character.toString(letra);//Variable para cambiar el tipo de dato de "Character" a "String"
            reverse = reverse.concat(letter);//Variable que concatena cada letra del texto inverso
        }
        System.out.println(reverse);
    }

    //Ejercicio f
    static void f(){
        String fraseSinEspacios = "";//String que posteriormente usaremos para almacenar la frase introducida por el usuario sin espacios
        Scanner keyboard = new Scanner(System.in);//Scanner para que el usuario introduzca una frase
        System.out.println("Escribe una frase: ");
        String frase = keyboard.nextLine();//String que almacena la frase introducido el usuario

        //Bucle for para recorrer la frase que ha introducido el usuario
        for(int i = 0; i< frase.length(); i++){
            char letra = frase.charAt(i);//Variable que almacena el valor de i dentro de la frase
            String letter = Character.toString(letra);//Variable para cambiar el tipo de dato de "Character" a "String"
            //Condicional el cual cuando i no sea igual a un espacio en blanco realizara la accion
            if(!letter.equals(" ")){
                fraseSinEspacios = fraseSinEspacios.concat(letter);//Variable que almacena la concatenacion de i dentro de la variable "fraseSinEspacios"
            }
        }
        System.out.println(fraseSinEspacios);
    }

    //Ejercicio g
    static void g(){
        Scanner keyboard = new Scanner(System.in);//Scanner para pedir una frase al usuario
        System.out.println("Escribe una frase: ");
        String frase1 = keyboard.nextLine();//String que almacena la frase introducida por el usuario
        System.out.println("Escribe otras frase: ");
        String frase2 = keyboard.nextLine();//String que almacena una segunda frase que le pedimos al usuario

        String fraseUnida = frase1.concat(" ");//String que almacena la primera frase cocatenada con un espacio
        fraseUnida = fraseUnida.concat(frase2);//Alteramos la variable String anterior concatenandola con la segunda frase
        System.out.println(fraseUnida);
    }

    //Ejercicio h
    static void h(){
        List<String> vocales = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"); //Lista que almacena las vocales
        String fraseFinal = ""; //String que usaremos posteriormente para almacenar el resultado final de la frase
        Scanner keyboard = new Scanner(System.in); //Scanner para pedir una frase al usuario
        System.out.println("Escribe una frase: ");
        String frase = keyboard.nextLine();//String que almacena la frase que ha escrito el usuario
        System.out.println("Escribe una vocal");
        String vocal = keyboard.nextLine();//String que almacena la vocal que queremos alterar posteriormente

        //Condicional para verificar si la vocal introducida anteriormente esta dentro de la lista de vocales
        if(!vocales.contains(vocal)){
            System.out.println("Escribe una VOCAL");//Impresion por pantalla de que introduzca nuevamente una vocal
            vocal = keyboard.nextLine();//Alteramos la variable vocal para que almacene la nueva letra introducida por el usuario
        }

        //Bucle para recorrer la longitud de la variable frase
        for(int i = 0; i<frase.length(); i++){
            char letra = frase.charAt(i); //Variable character que almacena el valor del indice i en el bucle
            String validador = Character.toString(letra);//Variable que altera la veriable anterior para convertirla en String

            //Condicional para verificar si la variable anterior es una vocal
            if(validador.equals(vocal)){
                String letraFinal = validador.toUpperCase();//String que almacena la conversion de la vocal en mayuscula
                fraseFinal = fraseFinal.concat(letraFinal);//Concatena a la variable fraseFinal la variable anterior
            }

            //Condicional para verificar si la variable anterior no es una vocal
            if(!validador.equals(vocal)){
                fraseFinal = fraseFinal.concat(validador);//Concatena la variable validador a la frase final
            }
        }
        System.out.println(fraseFinal);
    }
    
    //Ejercicio i
    static void i(){
        Scanner keyboard = new Scanner(System.in);//Scanner para que el usuario introduzca la cadena de texto
        System.out.println("Escribe una frase");
        String cadena = keyboard.nextLine();//String que almacena la cadena introducida anteriormente

        //Bucle para recorrer la longitud de la variable anterior
        for(int i =0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i) + " = " + cadena.codePointAt(i));;//Imprimimos por pantalla cada posicion de i y la concatenamos con un = y con codePointAt que nos indica el codigo ASCII del valor de i
        }
    }

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Elige que ejercicio quieres ejecutar: ");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Ejercicio 5");
            System.out.println("Ejercicio 6");
            System.out.println("Ejercicio 7");
            System.out.println("Ejercicio 8");
            System.out.println("Ejercicio 9");
            System.out.println("Escribe 0 para salir");
            int eleccion = keyboard.nextInt();
            switch(eleccion){
                case 1:
                    a();
                
                case 2:
                    b();
                
                case 3:
                    c();
                
                case 4:
                    d();

                case 5:
                    e();
                
                case 6:
                    f();

                case 7:
                    g();

                case 8:
                    h();

                case 9:
                    i();
                
                case 0:
                    break;
            }
        } 
    }
}
