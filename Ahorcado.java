public class Ahorcado {

    /****************************************************************************/
    /*                              MANDATORY PART                              */
    /****************************************************************************/

    /*
     * aMinusculas(Collection of characters col) -> Collection of characters
     * PRE: True
     * POST: Returns a copy of the input collection
     * by converting all its characters to lowercase, using the function
     * aMinusculas(character)
     */
    public static char[] aMinusculas(char[] col){
        return null;
    }

    /*
     * quitarAcentos(Collection of characters col) -> Collection of characters
     * PRE: True
     * POST: Returns a copy of the input collection
     * removing accents from characters that have them, using the function
     * quitarAcentos(character)
     */
    public static char[] quitarAcentos(char[] col){
        return null;
    }

    /*
     * esta(Collection of characters col, character c) -> boolean
     * PRE: True
     * POST: Returns true if the character c is inside the input collection
     * USE CASES:
     *      esta([a,e,x,i,o] , u) -> false
     *      esta([a,e,x,i,o] , a) -> true
     *      esta([a,e,x,i,o] , o) -> true
     *      esta([a,e,x,i,o] , x) -> true
     */
    public static boolean esta(char[] col, char c){
        return false;
    }
    /*
     * marcarAciertos(Collection of characters col, Collection of booleans aciertos, character c)
     * PRE: Length(col) = Length(aciertos)
     * POST: Returns a new collection of booleans, marking as true all
     *   the positions where the collection col contains the character c,
     *   leaving the rest of the positions unchanged
     * USE CASES:
     *      marcarAciertos([a,e,x,i,o] , [F,F,F,F,F], u) => [F,F,F,F,F]
     *      marcarAciertos([a,e,x,i,o] , [F,F,F,F,F], a) => [T,F,F,F,F]
     *      marcarAciertos([a,e,x,i,o] , [F,F,F,F,F], o) => [F,F,F,F,T]
     *      marcarAciertos([a,e,x,i,o] , [F,F,F,F,F], x) => [F,F,T,F,F]
     *      marcarAciertos([a,e,x,i,o] , [F,F,T,T,T], u) => [F,F,T,T,T]
     *      marcarAciertos([a,e,x,i,o] , [F,F,T,T,T], a) => [T,F,T,T,T]
     *      marcarAciertos([a,o,o,i,o] , [F,F,F,F,F], o) => [F,T,T,F,T]
     *      marcarAciertos([a,o,o,i,o] , [T,F,F,F,F], o) => [T,T,T,F,T]
     */
    public static boolean[] marcarAciertos(char[] col, boolean[] aciertos, char s){
        return null;
    }

    /*
     * palabraEnmascarada(Collection of characters col, Collection of booleans aciertos) -> String
     * PRE: Length(col) = Length(aciertos)
     * POST: Returns a string composed of the characters contained in col,
     *     where, if the character is a space ' ', it adds a space to the resulting string,
     *     for the rest of the characters, it should be noted that if the position in the aciertos collection is true,
     *     it adds the character from col to the string, but if it is false, it adds an asterisk.
     * USE CASES:
     *      palabraEnmascarada([r,u,e,g,o], [T,F,T,F,T]) -> r*e*o
     *      palabraEnmascarada([a, ,d,o,r,m,i,r], [T,F,F,F,F,F,F,F]) -> a ******
     *      palabraEnmascarada([c,a,r,a,m,b,a], [T,F,T,F,F,T,F]) -> c*r**b*
     *      palabraEnmascarada([c,a,r,a,m,b,a,n,o], [T,T,T,T,F,F,T,T,T]) -> cara**ano
     */
    public static String palabraEnmascarada(char[] col, boolean[] aciertos){
        return null;
    }

    /*
     * haAcertadoTodo(Collection of booleans aciertos) -> boolean
     * PRE: True
     * POST: Returns true if all positions in the collection are true
     */
    public static boolean haAcertadoTodo(boolean[] aciertos){
        return false;
    }

    /****************************************************************************/
    /*                              OPTIONAL PART                              */
    /****************************************************************************/

    /*
     * Function that updates the current word state and asks the user for a new letter
     * TODO: Move to StdDraw
     */
    public static char pintarMenu(char[] palabra, boolean[] aciertos){
        System.out.println("Palabra: " + palabraEnmascarada(palabra, aciertos));
        return pedirLetra();
    }

    /*
     * Function that paints the game state according to the number of errors
     * TODO: Move to StdDraw
     */
    public static void pintarEstado(int nFallos, char[] errores){
        switch(nFallos) {
        case 0:
            System.out.println("  =========   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("==============");
            System.out.println("==============");
            break;
        case 1:
            System.out.println("  =========   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||      O   ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("==============");
            System.out.println("==============");
            break;
        case 2:
            System.out.println("  =========   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||      O   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("==============");
            System.out.println("==============");
            break;
        case 3:
            System.out.println("  =========   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||      O   ");
            System.out.println("  ||     /|   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("==============");
            System.out.println("==============");
            break;
        case 4:
            System.out.println("  =========   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||      O   ");
            System.out.println("  ||     /|\\  ");
            System.out.println("  ||      |   ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("==============");
            System.out.println("==============");
            break;
        case 5:
            System.out.println("  =========   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||      O   ");
            System.out.println("  ||     /|\\  ");
            System.out.println("  ||      |   ");
            System.out.println("  ||     /    ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("==============");
            System.out.println("==============");
            break;
        case 6:
        default:
            System.out.println("  =========   ");
            System.out.println("  ||      |   ");
            System.out.println("  ||      O   ");
            System.out.println("  ||     /|\\  ");
            System.out.println("  ||      |   ");
            System.out.println("  ||     / \\  ");
            System.out.println("  ||          ");
            System.out.println("  ||          ");
            System.out.println("==============");
            System.out.println("==============");
            break;
        }
        System.out.print("ERRORES: ");
        for (int i=0;i<nFallos;i++)
            System.out.print(errores[i]+"   ");
        System.out.println();
    }

    public static void main(String[] args) {
        String[] palabras = {"Helicóptero", "viceconsulado", "vernáculo", "verrugoso", "Iguana", "edificante", "edicto", "autor", "alcalde", "PERÍMETRO"};
        // elegimos una palabra al azar del array
        String palabra = palabras[(int)(Math.random()*(palabras.length-1))];
        // creamos las variables para mantener el estado del juego
        char[] errores = new char[6];
        char[] palabraAAdivinar = aMinusculas(quitarAcentos(descomponer(palabra)));
        boolean[] aciertos = new boolean[palabraAAdivinar.length];
        // inicializamos el array de aciertos a falso
        for (int i=0;i<aciertos.length;i++)
            aciertos[i] = false;
        // marcamos los espacios como verdadero
        aciertos = marcarAciertos(palabraAAdivinar, aciertos, ' ');
        int numeroDeFallos = 0;
        boolean ganado = false;


        System.out.println("Empecemos ....");
        //Mientras no haya ganado ni perdido ...
        while (numeroDeFallos<6 && !ganado){
            // pedimos una letra, la pasamos a minuscula y quitamos los acentos
            char letra = aMinusculas(quitarAcentos(pintarMenu(palabraAAdivinar, aciertos)));
            // si la palabra ya está dicha y era un fallo no la contamos
            if (esta(errores,letra)){
                System.out.println("Letra ya dicha.");
            }
            // si ha acertado, actualizamos el estado
            else if (esta(palabraAAdivinar, letra)){
                System.out.println("Bien hecho! La letra "+letra+" está en la palabra.");
                aciertos = marcarAciertos(palabraAAdivinar, aciertos, letra);
                ganado = haAcertadoTodo(aciertos);
                if (ganado){
                    System.out.println("HAS GANADO!!!, la palabra era ... "+palabra);
                }
            }
            // si es un fallo
            else{
                System.out.println("La letra "+letra+" no se encuentra en la palabra");
                errores[numeroDeFallos] = letra;
                numeroDeFallos++;
                pintarEstado(numeroDeFallos, errores);
                if (numeroDeFallos>=6)
                    System.out.println("Lo siento, pero HAS PERDIDO!!!, la palabra era ... "+palabra);
            }

        }
    }

    /* quitarAcentos(char car) -> char
     * PRE: True
     * POST: Returns the equivalent character of the alphabet without
     * accents or diacritical marks. If the character is not a vowel or does not have accents or diacritical marks,
     * it returns the same character.
     * vowel -> is in {a, e, i, o, u}
     */
    public static char quitarAcentos(char car){
        switch (car) {
        case 'à':case 'á':case 'ä':
            return 'a';
        case 'À':case 'Á':case 'Ä':
            return 'a';
        case 'è':case 'é':case 'ë':
            return 'e';
        case 'È':case 'É':case 'Ë':
            return 'E';
        case 'ì':case 'í':case 'ï':
            return 'i';
        case 'Ì':case 'Í':case 'Ï':
            return 'I';
        case 'ò':case 'ó':case 'ö':
            return 'o';
        case 'Ò':case 'Ó':case 'Ö':
            return 'O';
        case 'ù':case 'ú':case 'ü':
            return 'u';
        case 'Ù':case 'Ú':case 'Ü':
            return 'U';
        default:
            return car;
        }

    }

    /* aMinusculas(character letter) -> character
     * PRE: True
     * POST: Returns the equivalent character of the alphabet in
     * lowercase. If the character is already lowercase,
     * it returns the same character.
     */
    public static char aMinusculas(char letra){
        return (letra+"").toLowerCase().charAt(0);
    }

    /* descomponer(String s) -> Colección de caracteres
     * PRE: Cierto
     * POST: Devuelve la colección de caracteres contenida
     * en la cadena de texto s de entrada
     */
    public static char[] descomponer(String s){
        char[] resultado = new char[s.length()];
        for (int i=0;i<s.length();i++)
            resultado[i] = s.charAt(i);
        return resultado;
    }

    /*
     * Función que pide ak usuario una letra y comprueba que la letra
     * sea un caracter válido
     */
    public static char pedirLetra(){
        System.out.print("Introduzca la letra: ");
        char letra = StdIn.readChar();
        while (letra == '\r' || letra == '\n')
            letra = StdIn.readChar();
        while ( !(letra>='a' && letra <='z') &&
                !(letra>='A' && letra <='Z') &&
                !(letra=='ñ' || letra =='Ñ')  ){
            System.out.println("Letra incorrecta, introduzca la letra: ");
            letra = StdIn.readString().charAt(0);
            while (letra == '\r' || letra == '\n')
                letra = StdIn.readChar();
        }
        return letra;
    }
}
