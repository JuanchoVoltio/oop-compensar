/**
 * No comments
 */
public class Main {
    public static void main(String[] args) {

//        int iteraciones = 0;
//        int cantidadNumerosImpares = 0;
//
////        for(int i = 0; i<20; i += 1){
////            if(i % 2 != 0){
////                System.out.println(i);
////                cantidadNumerosImpares += 1;
////            }
////            iteraciones += 1;
////        }
//
////        for(int i = 1; i<20; i += 1){
////            if(i % 2 != 0){
////                System.out.println(i);
////                cantidadNumerosImpares += 1;
////            }
////            iteraciones += 1;
////        }
//
//        for(int i = 1; i<20; i += 2){
//            System.out.println(i);
//            cantidadNumerosImpares += 1;
//            iteraciones += 1;
//        }
//
//        System.out.println("Cantidad de números impares encontrados: " + cantidadNumerosImpares);
//        System.out.println("Cantidad de iteraciones: " + iteraciones);
//
//        System.out.println("-- END --");
        int pMordido = 60;

        for(int i = 0; i < 10; i++) {
            System.out.print("Ronda " + i + ": ");
            if ((Math.random() * 100) < pMordido) {
                System.out.println("Fue mordido");
            } else {
                System.out.println("No fue mordido");
            }
        }
    }
}