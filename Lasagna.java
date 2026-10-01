package cookyourlasagna;

/**
 * Ejercicio 1: Cook Your Lasagna
 * Concepto: Basics (Sintaxis básica y métodos en Java)
 *
 * En este ejercicio aprenderás a definir métodos, retornar valores,
 * recibir parámetros y llamar métodos dentro de la misma clase.
 */
public class Lasagna {

    // Constante con el tiempo esperado en el horno (40 minutos)
    private static final int EXPECTED_MINUTES = 40;
    // Tiempo de preparación por capa en minutos (2 minutos por capa)
    private static final int MINUTES_PER_LAYER = 2;

    /**
     * Devuelve cuántos minutos debe estar la lasaña en el horno en total.
     * @return 40 minutos
     */
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES;
    }

    /**
     * Calcula los minutos que le faltan a la lasaña en el horno según el tiempo actual transcurrido.
     * @param actualMinutesInOven minutos que ya lleva la lasaña en el horno
     * @return minutos restantes
     */
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    /**
     * Calcula el tiempo total de preparación según el número de capas añadidas.
     * @param numberOfLayers número de capas de la lasaña
     * @return tiempo de preparación en minutos (2 minutos por capa)
     */
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * MINUTES_PER_LAYER;
    }

    /**
     * Calcula el tiempo total invertido (preparación de capas + tiempo que lleva horneándose).
     * @param numberOfLayers número de capas
     * @param actualMinutesInOven minutos en el horno
     * @return tiempo total de trabajo en minutos
     */
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
}
