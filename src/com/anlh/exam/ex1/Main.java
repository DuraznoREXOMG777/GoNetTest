package com.anlh.exam.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String INSERT = "Ingrese el valor %d: ";
    public static final String VALUE_FORMAT = "Valor %d: %s";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del array estático: ");
        int length = sc.nextInt();
        sc.nextLine();
        String[] staticArray = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.print(String.format(INSERT, (i+1)));
            staticArray[i] = sc.nextLine();
        }

        MyDynamicArray dynamicArray = new MyDynamicArray();
        dynamicArray.convertToDynamicArray(staticArray);

        int index;
        do {
            System.out.print("Probar clearIndex, ingrese el index a eliminar: ");
            index = sc.nextInt();
            sc.nextLine();
            --index;
            if(index < 0 || index >= length)
                System.out.println("IndexOutOfBounds, ingrese un índice valido.");
            else{
                dynamicArray.clearIndex(index);
            }
        }while(index < 0 || index >= length);

        System.out.println("Valores del nuevo arreglo dinámico: ");

        int counter = 0;
        ArrayList<String> strings = dynamicArray.obtainArray();
        for (String s : strings) {
            System.out.println(String.format(VALUE_FORMAT, ++counter, s));
        }
    }
}
