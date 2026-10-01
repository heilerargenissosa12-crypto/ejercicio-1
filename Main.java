package cookyourlasagna;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 1: Cook Your Lasagna (Basics)");
        System.out.println("==================================================");

        Lasagna lasagna = new Lasagna();

        // 1. Minutos esperados
        int expected = lasagna.expectedMinutesInOven();
        System.out.println("1. Minutos esperados en el horno: " + expected + " min (Esperado: 40)");

        // 2. Minutos restantes
        int remaining = lasagna.remainingMinutesInOven(25);
        System.out.println("2. Minutos restantes tras 25 min: " + remaining + " min (Esperado: 15)");

        // 3. Tiempo de preparación para 3 capas
        int prepTime = lasagna.preparationTimeInMinutes(3);
        System.out.println("3. Tiempo de preparacion para 3 capas: " + prepTime + " min (Esperado: 6)");

        // 4. Tiempo total para 3 capas y 20 min en horno
        int totalTime = lasagna.totalTimeInMinutes(3, 20);
        System.out.println("4. Tiempo total (3 capas, 20 min en horno): " + totalTime + " min (Esperado: 26)");

        // Verificaciones
        boolean ok = (expected == 40) && (remaining == 15) && (prepTime == 6) && (totalTime == 26);
        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
