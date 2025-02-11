package Lista1.Q30;

import Lista1.Q31.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cobra", 2);
        String str = "ola mundo";
        String [] strVet = {"ola", "mundo"};
        Integer [] intVet = {1, 2, 3};

        printGeneric(animal);
        printGeneric(str);
        printArrayGeneric(strVet);
        System.out.println(" ");
        printArrayGeneric(intVet);
    }
    public static <E> void  printGeneric(E myObj) {
        System.out.println(myObj.toString());
    }

    public static <E> void  printArrayGeneric(E [] myArray) {
        for(E element: myArray) {
            System.out.print(element + " ");
        }
    }

}
