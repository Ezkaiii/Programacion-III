/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itson.palindromo.business;

/**
 *
 * @author Ezkai
 */
public class Palindromo {
    /**
     * 
     * String phrase - Servirá para reemplazar espacios y signos para el estudio del palindromo.
     * @return Retorna la frase 
     */
    public boolean esPalindromo (String phrase){
        try{
        String cleanPhrase = phrase.replace(" ", "").replace("!", "").replace("¡", "").replace(",", "").replace(".", "").replace("¿", "").replace("?", "").toLowerCase();
        
        /**
         * Hace que la frase se lea en reversa
         */
        String reversedPhrase = "";
        
    for (int p = 0; p < cleanPhrase.length(); p++) {
        reversedPhrase = cleanPhrase.charAt(p) + reversedPhrase;
    }
    return cleanPhrase.equals(reversedPhrase);
        }catch(Exception ex){
            System.err.println("Ha sucedido un error: " + ex.getMessage());
            return false;
    }
}
    /**
     * Suma dos números enteros.
     * @param a El primer valor a sumar.
     * @param b El segundo valor a sumar.
     * @return La suma de los dos valores.
     */
    public int sumar(int a, int b){
        try{
            return a+b;
    }catch(Exception ex){
            System.err.println("Ocurrio un error inesperado: " + ex.getMessage());
            return 0;
    }
}
}