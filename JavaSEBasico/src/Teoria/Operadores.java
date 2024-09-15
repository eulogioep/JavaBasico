package Teoria;

public class Operadores {
    public static void main(String[] args) {
        // Ejemplos de operadores en Java

        // 1. Operadores Aritméticos
        System.out.println("--- Operadores Aritméticos ---");
        System.out.println("Suma: 5 + 3 = " + (5 + 3));
        System.out.println("Resta: 10 - 4 = " + (10 - 4));
        System.out.println("Multiplicación: 6 * 2 = " + (6 * 2));
        System.out.println("División: 15 / 3 = " + (15 / 3));
        System.out.println("Módulo: 17 % 5 = " + (17 % 5));
        System.out.println("Incremento: int a = 5; a++; a = " + (new Object() { int run() { int a = 5; a++; return a; }}.run()));
        System.out.println("Decremento: int b = 8; b--; b = " + (new Object() { int run() { int b = 8; b--; return b; }}.run()));

        // 2. Operadores de Asignación
        System.out.println("\n--- Operadores de Asignación ---");
        int x = 10;
        System.out.println("Asignación simple: x = 10; " + x);
        x += 5;
        System.out.println("Suma y asignación: x += 5; " + x);
        x *= 2;
        System.out.println("Multiplicación y asignación: x *= 2; " + x);

        // 3. Operadores de Comparación
        System.out.println("\n--- Operadores de Comparación ---");
        System.out.println("Igualdad: 5 == 5 es " + (5 == 5));
        System.out.println("Desigualdad: 5 != 6 es " + (5 != 6));
        System.out.println("Mayor que: 7 > 5 es " + (7 > 5));
        System.out.println("Menor o igual que: 10 <= 10 es " + (10 <= 10));

        // 4. Operadores Lógicos
        System.out.println("\n--- Operadores Lógicos ---");
        System.out.println("AND lógico: true && false es " + (true && false));
        System.out.println("OR lógico: true || false es " + (true || false));
        System.out.println("NOT lógico: !true es " + (!true));

        // 5. Operadores de Tipo
        System.out.println("\n--- Operadores de Tipo ---");
        System.out.println("instanceof: \"\" instanceof String es " + ("" instanceof String));

        // 6. Operadores de Bits
        System.out.println("\n--- Operadores de Bits ---");
        System.out.println("AND a nivel de bits: 5 & 3 = " + (5 & 3));
        System.out.println("OR a nivel de bits: 5 | 3 = " + (5 | 3));
        System.out.println("XOR a nivel de bits: 5 ^ 3 = " + (5 ^ 3));
        System.out.println("Desplazamiento a la izquierda: 5 << 1 = " + (5 << 1));


    }
}
