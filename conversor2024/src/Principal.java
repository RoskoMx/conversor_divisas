import java.util.Scanner;

public class Principal {
    private static final String[] MONEDAS = {"USD", "EUR", "MXN", "BRL", "ARS", "COP", "VEF", "CAD"};

    public static void main(String[] args) {
        Scanner entradadelteclado = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione la divisa de origen:");
            imprimeOpcionesMonedas();
            int indiceFuente = entradadelteclado.nextInt() - 1;
            if (!indiceValido(indiceFuente)) {
                System.out.println("Índice no válido. Por favor, intente de nuevo.");
                continue;
            }

            System.out.println("Seleccione la divisa de destino:");
            imprimeOpcionesMonedas();
            int indiceObjetivo = entradadelteclado.nextInt() - 1;
            if (!indiceValido(indiceObjetivo)) {
                System.out.println("Índice no válido. Por favor, intente de nuevo.");
                continue;
            }

            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = entradadelteclado.nextDouble();

            String monedaFuente = MONEDAS[indiceFuente];
            String monedaObjetivo = MONEDAS[indiceObjetivo];

            // Aquí se llamaría al método que realiza la conversión usando la API
            System.out.println("Usted desea convertir: " + cantidad + " " + monedaFuente +"\na: "+monedaObjetivo);

            try {
                double tazaCambio = ExchangeRateApiClient.getExchangeRate(monedaFuente, monedaObjetivo);
                double cantidadConvertida = cantidad * tazaCambio;
                System.out.println(cantidad + " " + monedaFuente + " es igual a " + cantidadConvertida + " " + monedaObjetivo);
            } catch (Exception e) {
                System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            }

            System.out.println("¿Desea realizar otra conversión? (s/n):");
            String otravez = entradadelteclado.next();
            if (!otravez.equalsIgnoreCase("s")) {
                break;
            }
        }
        entradadelteclado.close();
    }

    private static void imprimeOpcionesMonedas() {
        for (int i = 0; i < MONEDAS.length; i++) {
            System.out.println((i + 1) + ". " + MONEDAS[i]);
        }
    }

    private static boolean indiceValido(int index) {
        return index >= 0 && index < MONEDAS.length;
    }
}
