package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*String name = IO.readln("Enter your name: ");
        IO.println("Hello and welcome " + name + "!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }*/
        User user = new User(1, "Shiv", "sk@gmail.com");
        User unknown_user = new User();

        IO.println(user.getEmail());
        unknown_user.setName("Rahul");
        IO.println((unknown_user.getId()));
        IO.println(unknown_user.getEmail());
        IO.println(unknown_user.getName());
    }
}
