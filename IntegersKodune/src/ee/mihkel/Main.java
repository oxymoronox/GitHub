package ee.mihkel;

import java.util.*;

public class Main {
    public static void main(String[] args){      // // juhuslike numbrite tagastus 1-st kuni 20ni
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        double double_random = rand.nextDouble();

        System.out.println((int) (double_random * number + 1));
//    if (number <= 3 ) {
//        System.out.println(+ double_random*3);
//    } else if (number > 3 && number <= 20  ) {
//        System.out.println(+ double_random*20);
//    } else {
//            System.out.println("Kasuta numbrit 1-st 20ni" );
//
//    }
}
}


//    public static void main(String[] args){        // juhuslike numbrite tagastus 1-st kuni 50ni
//        Random rand = new Random();  // random class'i instants
//        int numberKuni = 40;
//         // genereeri juhusliks väärtus 10-50
//
//
//        float float_random = rand.nextFloat();
//
//        System.out.println("Juhuslik numbrite tagastus alates 10-st kuni 50-ni: "+ (float_random * numberKuni + 10));
//    }
//}



//    public static void main(String[] args){      // sisesta number ja jaga 100ga + aga jagamise korral"Nulliga ei saa jagada"+sisestades sõna "Sisesta number, mitte täht!"
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Sisesta number: ");
//
//        try {
//            int esimeneNumber = Integer.valueOf(scanner.nextLine());
//            if (esimeneNumber == 0) {
//                System.out.println("Nulliga jagada ei saa");
//            } else if (esimeneNumber > 0){
//                System.out.println("Vastus on " + esimeneNumber / 100);
//            }
//        }
//        catch (Exception e){
//            System.out.println("Sisesta number, mitte täht! ");
//        }
//    }
//}



//    public static void main(String[] args) {             // true või false - kontroll
//        List integers = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Arva ära number listis: ");
//
//            int num = Integer.valueOf(scanner.nextLine());
//
//            if (num >= 1 && num <= 7 ) {
//                System.out.println("Õige vastus! ");
//            } else {
//                System.out.println("Arva uuesti: ");
//            }
//
//    }
//}



//    public static void main(String[] args) {           // if/ else if / else if / else - anna hinne
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Anna hinne [0-100]");
//
//        int punktid = Integer.valueOf(scanner.nextLine());
//
//        if (punktid < 0) {
//            System.out.println("Error! ");
//        } else if (punktid <= 10) {
//            System.out.println("Hinne: F");
//        } else if (punktid <= 20) {
//            System.out.println("Hinne: E");
//        } else if (punktid <= 40) {
//            System.out.println("Hinne: D");
//        } else if (punktid <= 60) {
//            System.out.println("Hinne: C");
//        } else if (punktid <= 80) {
//            System.out.println("Hinne: B");
//        } else if (punktid <= 100) {
//            System.out.println("Hinne: A");
//        } else   {
//            System.out.println("Võimas!");
//        }
//    }
//}

