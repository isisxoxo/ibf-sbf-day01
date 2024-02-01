package myapp;

import java.lang.*;
import java.io.Console;
import java.util.*;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.stream.Collectors;


// Compile: javac --source-path myapp -d classes myapp/*
// Run: java -cp classes myapp.HelloWorld
// Run WITH ARGUMENTS: java -cp classes myapp.HelloWorld fred freddie
// Run WITH ARGUMENT: java -cp classes myapp.HelloWorld "fred freddie"
// jar -c -v -f myapp.jar -e myapp.HelloWorld . (Do in classes folder)
// java -cp myapp.jar myapp.HelloWorld (Run the jar file)


public class HelloWorld { //Must be the same as file name (case sensitive)

    public static void main(String[] args) { //An array of strings passed in as args
        System.out.println("HelloWorld");

        Console console = System.console();

        // String name = console.readLine("What is your name? ");

        // if (name.length() > 0) {
        //     System.out.printf("Hello %s. Please to meet you.\n", name);
        //     // System.out.println("Hello " + name + ". Please to meet you.");
        //     // System.out.print("Hello " + name + ". Please to meet you.\n");
        // } else {
        //     System.err.println("You have not input your name.");
        // }

        // String hobby = console.readLine("What is your hobby? ");
        // hobby = hobby.trim().toLowerCase(); //trim() only leading and trailing whitespace removed

        // if (hobby.equals("swimming")) { //Use .equals("x") instead of == for String (case sensitive)
        //     System.out.println("the nearest swimming pool is " + "NUS Guild House Swimming Pool.");
        // } else if (hobby.equals("jogging")) {
        //     System.out.println("Jogging is a good exercise.");
        // } else if (hobby.equals("coding")) {
        //     System.out.println("Coding is not a physical exercise. But coding is good and fun.");
        // } else if (hobby.equals("vaping")) {
        //     System.out.println("Vaping is bad and banned in Singapore.");
        // } else {
        //     System.out.println("I cannot find your hobby.");
        // }

        // switch(hobby) {
        //     case "swimming":
        //         System.out.println("the nearest swimming pool is " + "NUS Guild House Swimming Pool.");
        //         break;
        //     case "jogging":
        //         System.out.println("Jogging is a good exercise.");
        //         break;
        //     case "coding":
        //         System.out.println("Coding is not a physical exercise. But coding is good and fun.");
        //         break;
        //     case "vaping":
        //         System.out.println("Vaping is bad and banned in Singapore.");
        //         break;
        //     default:
        //         System.out.println("I cannot find your hobby."); //Default does not need a break
        // }

        // String input = console.readLine("What is your age? ");
        // Integer age = Integer.parseInt(input); //Parse string as an integer (can only contain numbers)

        // if ((age > 0) && (age <= 2)) {
        //     System.out.println("You are a baby");
        // } else if ((age > 2) && (age <= 4)) {
        //     System.out.println("You are a toddler");
        // } else if ((age > 4) && (age <= 12)) {
        //     System.out.println("You are a child");
        // } else if ((age > 12) && (age <= 18)) {
        //     System.out.println("You are a teenager");
        // } else {
        //     System.out.println("You are an adult");
        // }

        // String phrase = console.readLine("Type a phrase: ");

        // for (int i = 0; i < phrase.length(); i++) {
        //     System.out.println(phrase.substring(0, i));
        //     // System.out.println(phrase.substring(0, i+1));
        // }

        // int position = 0;

        // while (position < phrase.length()) {
        //     System.out.println(phrase.substring(0, position));
        //     // System.out.println(phrase.substring(0, position+1));
        //     position++; //Can also use: position = position + 1
        // }

        // String[] todo = new String[5];

        // for(int i = 0; i < todo.length; i++) {
        //     String task = console.readLine("Enter task %d: ", i+1); //Decimal
        //     todo[i] = task;
        // }

        // for (int i = 0; i < todo.length; i++) {
        //     System.out.println(todo[i]);
        // }

        //Slide 24
        String argumentInput = "No argument";

        if (args.length > 0) {
            argumentInput = args[0];
        }

        System.out.println(argumentInput);


        /* ARRAYLIST */
        // import java.util.List;
        // import java.util.ArrayList;
        // import java.util.Arrays;
        List<String> stringList = new ArrayList<>();
        
        stringList.add("Mysa");
        stringList.add("Tyra");
        stringList.add("Dilan");
        stringList.add("Jason");
        stringList.add("Zac");
        stringList.add("Ash");
        stringList.addAll(Arrays.asList("James","Damien","Halo","Xoxo","Gigi")); //Add a List of Strings at once
        // System.out.println(stringList.size());
        // stringList.clear();

        /* STACK */
        // Stack<String> stackList = new Stack<>();
        // stackList.push("Mysa");
        // stackList.clear();


        // import java.util.Collections;
        // Collections.sort(stringList); //Sorted in sequential ascending order
        // OR
        // import java.util.stream.Collectors;
        List<String> sortedStringList = stringList.stream().sorted().collect(Collectors.toList()); //Create a new string list that is sorted

        // Slide 33 - print out list object data
        // for (String nameData : stringList) {
        for (String nameData : sortedStringList) {
            System.out.println(nameData);
        }

        String inputDataList = "fish,prawn,frog,pork,beef,lamb,chicken,snake";
        Scanner scan = new Scanner(inputDataList).useDelimiter(",");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        String phraseTask = console.readLine("What do you want to do? ");
        Scanner scanPhrase = new Scanner(phraseTask);
        String day = scanPhrase.next();
        String description = scanPhrase.nextLine();
        System.out.println("Day " + day);
        System.out.println("Description: " + description);

        // TRY USING SCANNER WITH MAP AND LIST
    }
}
