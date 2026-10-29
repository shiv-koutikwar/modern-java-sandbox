package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //String name = IO.readln("Enter your name: ");
        //IO.println("Hello and welcome " + name + "!");

        /*for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }*/
        // This is a test edit to check Git tracking!
//        IO.println("Hello World");
//        User user = new User(1, "Shiv", "sk@gmail.com");
//        User unknown_user = new User();
//
//        IO.println(user.getEmail());
//        unknown_user.setName("Rahul");
//        IO.println((unknown_user.getId()));
//        IO.println(unknown_user.getEmail());
//        IO.println(unknown_user.getName());
//        var hpPavilion = new Product(201, "HPPavilion", 999.99);
//        var amount = 1000;
        var products = List.of(
                new Product(1, "Fan", 2000),
                new Product(2, "Light", 100),
                new Product(3, "switch", 50)
        );
        var cheapProducts = products.stream().
                                        filter(p->p.price()<=100).toList();
        IO.println("Cheap Products:");
        cheapProducts.stream().
                forEach(p->IO.println("Name: " + p.name() + " - Price: " + p.price()));
//        IO.println("Product Id: " + hpPavilion.id());
//        IO.println("Product Id: " + hpPavilion.name());
//        IO.println("Product Id: " + hpPavilion.price());
//
//        IO.println("Complete Record: " + hpPavilion);
    }
}
