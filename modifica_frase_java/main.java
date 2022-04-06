public class Main
{
    public static void main(String[] args) {
        
        prueba("Hola Mundo");
    }
    // funcion que modifica una frase, dejando la primera letra de cada palabra en minuscula y el resto en mayuscula
    public static void prueba(String frase){
        String [] prueba = frase.split(" ");
        String cadena = "";
        
        for( int i = 0; i < prueba.length; i++){
            cadena+= prueba[i].substring(0,1).toLowerCase();
            cadena+= prueba[i].substring(1).toUpperCase();
            cadena+= " ";
        }
        
        //salida: frase modificada
        System.out.println(cadena);
    }
}
