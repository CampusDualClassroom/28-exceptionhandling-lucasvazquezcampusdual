package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        int dividendo = 3;
        int divisor = 0;
        try{
            int resultado = dividendo/divisor;
            System.out.println("pintar resuñtado"+ resultado);
        }catch(ArithmeticException e){
            System.out.println("no puedes dividir por 0");
        }finally {
            System.out.println("Acabo el programa");

        }

    }
}
