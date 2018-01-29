package com.company;

public class Main {

    private String MemberVariable = "I am a member variable, I have a class level scope.";
    private int memberInt = 10;
    private int count = 0;


    public static void main(String[] args) {

        Main main = new Main();
        //    main.aMethod();
        // main.anotherMethod();
        // main.methodForLoopVariables();
        main.membervslocalvariables();


    }

    private void aMethod() {

        String localVariable = "I am a local variable, I can only be used in the method.";
        System.out.println("Inside first method");

        System.out.println(MemberVariable);
        System.out.println(localVariable);
    }

    private void anotherMethod() {

        System.out.println("Inside second method");

        // System.out.println(localvariable)
        System.out.println();
    }

    private void methodForLoopVariables() {

        String localVariable = "Just another member variable outside our do while loop";

        boolean runDoLoop = true;

        do {
            String loopvariable = "I am a loop variable inside our do while loop.";
            System.out.println("inside our do while loop: ");
            System.out.println(localVariable);
            runDoLoop = false;
        } while (runDoLoop);
        System.out.println("Inside our third method, just outside do while loop");
        System.out.println(localVariable);
        System.out.println();

    }

    private void membervslocalvariables() {

        int localInt = 7;
        localInt *= 2;
        memberInt *= 2;

        if (count <= 2) {
            System.out.println("memberInt *= 2 = " + memberInt);
            System.out.println("localInt *= 2 = " + localInt);
            count++;
            membervslocalvariables();
        }

    }

}
