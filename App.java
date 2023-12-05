
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.management.ObjectName;
import javax.print.DocFlavor.STRING;
import javax.sound.sampled.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ProgressBarUI;
import javax.swing.text.JTextComponent.KeyBinding;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
// import java.util.NoSuchElementException;
import java.io.Serializable;
import java.time.Year;

public class App {
    public static void main(String[] args)
            throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException,
            FileNotFoundException, ClassNotFoundException {

        // String name = JOptionPane.showInputDialog("Enter your name.");
        // System.out.println(name);
        // JOptionPane.showMessageDialog(null, "Hello "+name);

        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // System.out.println(age);
        // JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        // JOptionPane.showConfirmDialog(null, "Your name "+name+ " and age "+age+" has
        // been verified \n now you cna proceed further");

        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your
        // height (in cm only)"));
        // System.out.println(height);
        // JOptionPane.showMessageDialog(null, "your are "+height+" cm tall" );

        /* Math class */

        double x = 3.25;
        double y = -10;
        // to find lower value
        double z = Math.min(x, y);
        System.out.println(z);
        // to find higher vlue
        double z1 = Math.max(x, y);
        System.out.println(z1);

        double z2 = Math.abs(y);
        System.out.println(z2);

        double z3 = Math.sqrt(y);
        System.out.println(z3);

        double z4 = Math.round(x);
        System.out.println(z4);

        double z5 = Math.ceil(x);
        System.out.println(z5);

        double z6 = Math.floor(x);
        System.out.println(z6);

        /* Finding the HYPOTENUSE of the given sides */

        // double x1;
        // double y1;
        // double z0;
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter side x1 :");
        // x1 = scanner.nextDouble();

        // System.out.println("Enter side y2 :");
        // y1 = scanner.nextDouble();

        // z0 = Math.sqrt((x1*x1)+(y1*y1));
        // System.out.println("The hypotenuse of the triangle is : "+z0);
        // scanner.close();

        /*   */

        // Random random = new Random();

        // int x2 = random.nextInt(6)+1;
        // System.out.println(x2);

        // double yy = random.nextDouble();
        // System.out.println(yy);

        // boolean b = random.nextBoolean();
        // System.out.println(b);

        /* if, else if, else. statement in java */

        int age = 65;
        if (age == 18) {
            System.out.println("You are an adult");
        } else if (age >= 60) {
            System.out.println("You are belong to an older generation, take care of your health.");
        } else {
            System.out.println("You are a minor right now");
        }

        /* Switch statement in java */

        String day = "Saturday";
        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("OOPS! ther is no match here for your value.");
                break;
        }

        /* logical operators &&, !, || using in java */

        // && (AND) logical operators example

        int temp = 25;
        if (temp > 30) {
            System.out.println("It's hot outside.");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is a lovely day.");
        } else {
            System.out.println("It's a normal day.");
        }

        // || (OR) logical operators example

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("You are playing a game. Press q and Q to quit.");
        // String response = scanner.next();

        // if (response.equals("q")||response.equals("Q")) {
        // System.out.println("You want to quit the game.");
        // }else{
        // System.out.println("YOu are still want to play the game.");
        // };
        // // ! (NOT) logical operators

        // if (!response.equals("q") || !response.equals("Q")) {
        // System.out.println("YOu are still want to play the game.");
        // }else{
        // System.out.println("You want to quit the game.");
        // };

        /* while loop in java */

        // Scanner scanner = new Scanner(System.in);
        // String name = "";
        // while (name.isBlank()) {
        // System.out.println("Enter your name: ");
        // name = scanner.nextLine();
        // }System.out.println("Hello " + name);

        /* while loop in java */

        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("Hello " + name);

        /* foor loop in java */

        for (int i = 0; i < 999; i++) {
            System.out.println(i);
        }
        System.out.println("You reach the limit of the loop and you sucessfully executed the code(for loop)");

        /* nested loops in java */

        Scanner scanne = new Scanner(System.in);
        int rows;
        int coloumns;
        String symbol = "";
        System.out.println("Enter no of rows: ");
        rows = scanne.nextInt();
        System.out.println("Enter no of columns: ");
        coloumns = scanne.nextInt();
        System.out.println("Enter symbol you want to use: ");
        symbol = scanne.next();
        for (int i = 1; i < rows; i++) {
            System.out.println();
            for (int j = 1; j < coloumns; j++) {
                System.out.print(symbol);
            }

        }

        /* arrays in java */
        // one way to write down arrays
        String[] cars = { "Tata", "Bmw", "audi", "mercedes" };
        cars[0] = "mustang";
        System.out.println(cars[3]);

        // the other way to write down arrys first declare the amount of elements in
        // array then we could assign the value of that array
        String[] car = new String[3];
        car[0] = "Tata";
        car[1] = "tesla";
        car[2] = "mustang";
        System.out.println(car[0]);

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

        /* 2D arrays in java */

        // one way for doing this
        String[][] carr = new String[3][3];
        carr[0][0] = "Tata";
        carr[0][1] = "mustang";
        carr[0][2] = "bmw";
        carr[1][0] = "tesla";
        carr[1][1] = "camaro";
        carr[1][2] = "carvette";
        carr[2][0] = "lambo";
        carr[2][1] = "ferrari";
        carr[2][2] = "audi";
        for (int i = 0; i < carr.length; i++) {
            System.out.println();
            for (int j = 0; j < carr[i].length; j++) {
                System.out.println(carr[i][j] + " :--This is a 2D arrays list");
            }
        }

        // the other way of doing this
        String[][] carr1 = { { "Tata", "bmw", "mustang" }, { "tesla", "camaro", "corvette" },
                { "lambo", "ferrari", "audi" } };
        for (int i = 0; i < carr1.length; i++) {
            System.out.println();
            for (int j = 0; j < carr1[1].length; j++) {
                System.out.println(carr1[i][j] + " :::---This is a second way of doing 2D arrays ");
            }
        }

        /* String class using in java */

        String name1 = "Johny";
        boolean result = name1.equals("Johny");
        System.out.println(result);

        boolean result1 = name1.equalsIgnoreCase("johny");
        System.out.println(result1);

        int result2 = name1.length();
        System.out.println(result2);

        char result3 = name1.charAt(2);
        System.out.println(result3);

        int result4 = name1.indexOf("n");
        System.out.println(result4);

        boolean result6 = name1.isEmpty();
        System.out.println(result6);

        String result7 = name1.toUpperCase();
        System.out.println(result7);

        String result8 = name1.toLowerCase();
        System.out.println(result8);

        String result9 = name1.replaceAll("Johny", "johnny");
        System.out.println(result9);

        String result10 = name1.trim();
        System.out.println(result10);

        /* wrapper classes in java */

        // primitive data types or reference data types

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Johny";
        if (a == true) {
            System.out.println("This is true");
        }

        if (b == '@') {
            System.out.println("This is a character and also true");
        }

        if (c == 123) {
            System.out.println("This is integer and it's also true");
        }

        if (e == "Johny") {
            System.out.println("This is a string and it's also true --");
        }

        /* Arraylist in java */

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("sandwich");
        food.add("momo");
        food.add("cutlet");

        food.set(0, "sushi");
        food.remove(2);
        food.removeAll(food);
        food.clear();
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        /* 2D ArrayList in java */
        // 2D ArrayList inside a ArrayList

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("sandwich");

        ArrayList<String> productList = new ArrayList();
        productList.add("tomato");
        productList.add("onion");
        productList.add("potato");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("coke");
        drinksList.add("pepsi");
        drinksList.add("soda");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);

        System.out.println(bakeryList.get(0));
        System.out.println(productList.get(2));
        System.out.println(drinksList.get(1));
        System.out.println(groceryList);
        System.out.println(groceryList.get(1));
        System.out.println(groceryList.get(0).get(0));

        /* for each loop in java */

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("rat");
        animals.add("snake");
        animals.add("parrot");
        animals.add("crow");

        // String[] animals = {"parrot","crow","horse","rat","snake","frog",};
        for (String i : animals) {
            System.out.println(i);
        }

        /* methods in java */
        String name0 = "hello bro, I'm here";
        int age1 = 20;
        hello(name0, age1);

        int x1 = 2009999;
        int y1 = 4999999;
        // int z0 = add(x1, y1);
        System.out.println(add(x1, y1));

        /* overloaed methods in java */

        int x2 = add(1, 2);
        System.out.println(x2);
        double x3 = add(1, 2, 3);
        System.out.println(x3);
        int x4 = add(1, 2, 3, 4);
        System.out.println(x4);
        int x5 = add(1, 2, 3, 4, 5);
        System.out.println(x5);

        double x6 = add(1.235, 2.6455);
        System.out.println(x6);
        double x7 = add(1, 2, 3);
        System.out.println(x7);
        double x8 = add(1, 2, 3, 4);
        System.out.println(x8);
        double x9 = add(1, 2, 3, 4, 5);
        System.out.println(x9);

        /* printf method in java */

        boolean myBoolean = true;
        char myChar = '@';
        int myInt = 55;
        double myDouble = 65465.216;
        String myString = "This is my string";

        System.out.printf("This is a format string %020f \n", myDouble);
        System.out.printf("This is a format string %,f \n", myDouble);
        System.out.printf("This is a format string %.2f \n", myDouble);
        System.out.printf("This is a format string %c \n", myChar);
        System.out.printf("This is a format string %b \n", myBoolean);
        System.out.printf("This is a format string %d \n", myInt);
        System.out.printf("This is a format string %10s \n", myString);

        /* final keyword in java */

        final double PI = 3.14159;
        System.out.println(PI);

        /* oops(object oriented programming system) in java */
        // object is an instance which contains attributes and methods for example:---
        // phone,desk,computer,pen,coffee cup.

        // Car myCar = new Car();
        // Car myCar1 = new Car();
        // System.out.println(myCar.model);
        // myCar.drive();
        // myCar.break();

        // /* Constructors in java */

        // Human human = new Human("Rick", 20, 60);
        // Human human2 = new Human("Johny", 30, 80);
        // System.out.println("This is a constructor example for oops");
        // System.out.println(human.age);
        // System.out.println(human2.namme);
        // human.eat();
        // human2.drink();
        // human.drink();
        // human2.eat();

        // /* variable scope (local and global variable) in java */

        // // local:-- declared inside a method visible only to that mehtod
        // // global:-- declared outside a mehod,but within a class visible to all parts
        // of
        // // a class

        // // local variable
        // DiceRoller diceRoller = new DiceRoller();
        // // global variable
        // DiceRollerr diceRollerr = new DiceRollerr();

        /* overloaded constructors in java */
        // overloaded constructor:-- multiple constructors within class wirh the same
        // name,but have different parameters :-- name+paremeters = signautre

        Pizza myPizza = new Pizza("thick crust", "tomato", "mozerrela", "pepperoni");
        System.out.println(myPizza.bread);
        System.out.println(myPizza.cheese);
        System.out.println(myPizza.sauce);
        System.out.println(myPizza.topping);
        myPizza.make();
        myPizza.stop();
        System.out.println("Here are the ingridents of your Pizza.");
        System.out.println(myPizza.bread);
        System.out.println(myPizza.cheese);
        System.out.println(myPizza.sauce);
        System.out.println(myPizza.topping);

        /* toString() method in java */
        // toString() method :-- special method that all objects inherit,that returns a
        // String that "textually represents" an object can be used both implicitly and
        // explicitly

        Carr jeep = new Carr();
        System.out.println(jeep.toString());
        System.out.println(jeep.make);
        System.out.println(jeep.model);
        System.out.println(jeep.color);
        System.out.println(jeep.year);
        System.out.println(jeep);

        /* array of objects in java */
        // data type(int,String,boolean,)[] variable name = new data types[values serial
        // number];
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        // Food[]refrigerator = new Food[3];
        Food food1 = new Food("Pizza from macD");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        // second way of writing an arrys of objects
        Food[] refrigerator = { food1, food2, food3 };
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

        // one way of writing an arrays of object
        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        // System.out.println(refrigerator[0].name);
        // System.out.println(refrigerator[1].name);
        // System.out.println(refrigerator[2].name);

        /* object passing in java */

        Garage garage = new Garage();

        Thar thar = new Thar("mahindra thar");
        Thar thar1 = new Thar("Lamborgini");

        garage.park(thar);
        garage.park(thar1);

        Bicycle bicycle = new Bicycle();

        Bstand bstand = new Bstand("Atlas");
        Bstand bstand2 = new Bstand("Gucci");
        bicycle.stand(bstand);
        bicycle.stand(bstand2);

        /* Static keyword in java */

        // Static = modifier, A single copy of a variable/method is created and shared,
        // The class "owns" the static member

        // object + instancename = new instancename(assign a name);

        Friend friend = new Friend("Spongebob");
        Friend friend1 = new Friend("Patrick");
        Friend friend2 = new Friend("Squidbird");

        System.out.println(Friend.numberofffriends);
        Friend.displayFriends();

        /* Inheritence in java */
        // Inheritence:-- the process where one class aquires,the attributes and methods
        // of another.

        Car car1 = new Car();
        motorBicycle Bike = new motorBicycle();

        car1.go();
        Bike.stop();
        System.out.println(car1.speed);
        System.out.println(Bike.speed);
        System.out.println(car1.doors);
        System.out.println(Bike.paddels);
        car1.engine();
        Bike.engine();
        System.out.println(car1.engine);
        System.out.println(Bike.engine);

        /* method overriding in java */
        // method overriding:-- Declaring a method in sub class,which is already present
        // in sub class.done so that a child class can give its own implementation.

        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.speak();
        System.out.println(dog.speak);
        animal.speak();
        System.out.println(animal.speak);

        // important /* Super keyword in java */
        // Super keyword:-- refers to the superclass (parent) of an object very similar
        // to the "thid" keyword

        Hero hero1 = new Hero("Luckyman", 32, "Lucky");
        Hero hero2 = new Hero("Hanuman", 0000, "Invincible");

        System.out.println(hero2.toString());

        // System.out.println(hero1.name);
        // System.out.println(hero1.age1);
        // System.out.println(hero1.power);

        /* Abstraction in java */
        // Abstract:-- abstract classes cannot be instantiated,but they can have a
        // subclass abstract method are declared withou an implementation

        // Vehicles vehicles = new Vehicles();
        Caar caar = new Caar();
        caar.go();

        // LeftTopic/* Access modifiers in java */

        /* Encapsulation in java */
        // Encapsulation :-- attributes of a class will be hidden or private, can be
        // accessed only through methods (getters & setters) You should make attributes
        // private if you don't have a reason to make them public/private

        Caarr caarr = new Caarr("Mahindra", "Thar", "Black", 2023);
        System.out.println(caarr.getMake());
        System.out.println(caarr.getModel());
        System.out.println(caarr.getColor());
        System.out.println(caarr.getYear());

        // caarr.make = "Tata";
        // caarr.model = "E-model";
        // caarr.color = "Blue";
        // caarr.year = 2021;
        caarr.setMake("Tata");
        caarr.setModel("E-vehicle");
        caarr.setColor("Blue");
        caarr.setYear(2021);

        System.out.println(caarr.getMake());
        System.out.println(caarr.getModel());
        System.out.println(caarr.getColor());
        System.out.println(caarr.getYear());

        /* copy objects in java */
        Cars cars1 = new Cars("Mahindra", "Thar", "Black", 2023);
        // Cars cars2 = new Cars("Tesla", "e-model", "Blue", 2021);
        Cars cars3 = new Cars("Ford", "Mustang", "Red", 2020);

        // cars2.copy(cars1);
        // cars1.copy(cars3);
        Cars cars2 = new Cars(cars1);

        System.out.println(cars1);
        System.out.println(cars2);
        System.out.println(cars3);
        System.out.println();
        System.out.println(cars1.getMake());
        System.out.println(cars1.getModel());
        System.out.println(cars1.getYear());
        System.out.println();
        System.out.println(cars2.getMake());
        System.out.println(cars2.getModel());
        System.out.println(cars2.getYear());
        System.out.println();
        System.out.println(cars3.getMake());
        System.out.println(cars3.getModel());
        System.out.println(cars3.getYear());

        /* Interface in java */

        // interface :-- a interface that can be applied to a class.similar to
        // inheritance, but specifies what a class has/ must do. classes can apply more
        // than one interface,inheritance is limited to 1 super clsss.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        /* polymorphism in java */
        // polymorphism :- greek word for poly-"many", morph-"form"
        // the ability of an object to identify as more than one type

        Cars1 cars100 = new Cars1();
        Bicycles bicycles = new Bicycles();
        Boat boat = new Boat();
        Vehiclerace vehiclle = new Vehiclerace();
        vehiclle.go();

        Vehiclerace[] racers = { cars100, bicycles, boat };

        // cars100.go();
        // bicycles.go();
        // boat.go();
        for (Vehiclerace xx : racers) {
            xx.go();
        }

        /* dynamic poymorphism in java */
        // polymorphism :-- many shapes/forms
        // dynamic :-- after compilation (during runtime)
        // ex:- a corvette is a :- corvette, and a car, and a vehicle, and an object

        Scanner scanner1 = new Scanner(System.in);
        Animals animals1;
        System.out.println("What animal do you want?");
        System.out.println("(1=Dog) or(2=Cat)");
        int choice = scanner1.nextInt();

        if (choice == 1) {
            animals1 = new Dogs();
            animals1.speak();
        }
        if (choice == 2) {
            animals1 = new Cat();
            animals1.speak();
        } else {
            Animals animals2 = new Animals();
            animals2.speak();
        }

        /* exception handling in java */
        // exception :-- an event that occurs during the execution of a program that,
        // disrupts the normal flow of instructions

        Scanner scanner2 = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int xx1 = scanner2.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int yy2 = scanner2.nextInt();

            int zz2 = xx1 / yy2;
            System.out.println("result " + zz2);

        } catch (ArithmeticException e1) {
            // TODO: handle exception
            System.out.println("You can't divide by zero(0)!    IDIOT:) ");
        }
        // catch (InputMismatchException e1) {
        // // TODO: handle exception
        // System.out.println("PLEASE ENTER A NUMBER ONLY AND CORRECTLY '**OMFG**'");
        // }
        catch (Exception e1) {
            System.out.println("SOMETHING WENT WRONG '**OMFG**'");
        } finally {
            scanner2.close();
            // System.out.println("This will always print.");
        }

        /* File class */
        // file :-- an abstract representation of file and directory pathnames
        // File file = new File("D:\\visual studio code\\vs code for java\\my first java
        // project\\src\\secret_text.txt");
        File file1 = new File("secret_text.txt");

        if (file1.exists()) {
            System.out.println("This file exist :O!");
            System.out.println(file1.getPath());
            System.out.println(file1.getAbsolutePath());
            System.out.println(file1.isFile());
            file1.delete();
        } else {
            System.out.println("This file doesn't exist :(");
        }

        /* File Writer(write in a file) in java */

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nSky is blue\nI'm rockin' everywhere.");
            writer.append("\n                   (A poem by Johny)");
            writer.close();
        } catch (Exception e1) {
            // TODO: handle exception
            System.out.println("Go back, Look again the code.");
        }

        /* FileReader(read a file) in java */
        // FileReader:-- Read the contents of a file as a stream of characters. one by
        // one read() returns an int value which contains the byte value when int
        // returns -1, there is no more data to be read.

        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.println((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception e1) {
            // TODO: handle exception

        }

        // /* audio in java */
        // Scanner scanner3 = new Scanner(System.in);
        // File file = new File("D:\\visual studio code\\Thunder.wav");
        // AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        // Clip clip = AudioSystem.getClip();
        // clip.open(audioStream);
        // String response = "";
        // // clip.start();
        // while (!response.equals("Q")) {
        // System.out.println("P = Play, S = Stop, R = Reset, Q = Quit ");
        // System.out.println("Enter your choice: ");
        // Thread.sleep(10000);
        // response = scanner3.next();
        // response = response.toUpperCase();

        // switch (response) {
        // case "P":
        // clip.start();
        // break;
        // case "S":
        // clip.stop();
        // break;
        // case "R":
        // clip.setMicrosecondPosition(0);
        // break;
        // case "Q":
        // clip.close();
        // break;

        // default:
        // System.out.println("Not a valid comand.");
        // break;
        // }

        // }

        /* GUI in java */
        // jframe = a GUI window to add components to

        // // first way of creating frame
        // JFrame frame = new JFrame();// it creates a frame
        // frame.setTitle("JFrame title goes here");// sets the title of the frame
        // frame.setSize(420, 420); // sets the x-dimension and the y-dimension of frame
        // frame.setVisible(true); // make frame visible
        // // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of
        // // application
        // // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//still running in
        // the
        // // background when you click on exit button
        // // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//when you
        // click
        // // on exit button of application that doesn't work
        // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// when you click on
        // the exit button then it disposes
        // // all the tasks from the JFrame window
        // frame.setResizable(false);// it will prevent user to resize the frame

        // ImageIcon icon = new ImageIcon("D:/visual studio code/avata insta.jpg");//
        // create an image icon
        // frame.setIconImage(icon.getImage()); // change icon of frame

        // frame.getContentPane().setBackground(Color.MAGENTA);// change color of frame
        // frame.getContentPane().setBackground(new Color(125, 50, 150));// change
        // background to new color or custom color
        // // of frame

        // The second way of creating frame with the help of the constructor
        // See from the LINE NO :-- 1695
        // and then see here below
        // myframe myframe = new myframe();
        new myframe();

        /* labels in java */
        // JLabel :-- a GUI display, area for a string of text, an image, or both.
        ImageIcon icon = new ImageIcon("D:\\visual studio code\\Capture.PNG");// here you put your File name(ICON and
                                                                              // PICTURE) link so that the GUI knows

        Border border = BorderFactory.createLineBorder(Color.green, 10); // set the color and thickness of the border //
                                                                         // what file to show in the form window
        JLabel label = new JLabel();// create a label
        label.setText("Bro, do you even code ? ");// set text for a label
        label.setIcon(icon);// it allows users to put her own icon in the frame window
        label.setHorizontalTextPosition(JLabel.CENTER);// set text left, Center and Right of that image icon
        label.setVerticalTextPosition(JLabel.BOTTOM);// set text Top, Center and Bottom of that image icon
        // label.setForeground(new Color(125, 50, 150));// it sets the color of the
        // text.
        label.setForeground(Color.WHITE);// it sets the color of the text.
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));// it set the font Style, Size and appearance of the text.
        label.setIconTextGap(20);// set the gap bwtween the text and the icon image
        label.setBackground(Color.black);// it changes the background color of the text
        label.setOpaque(true);// it allows to display the background color of the text label
        label.setBorder(border);// display the border
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0, 0, 250, 250);

        JFrame frame = new JFrame();// it creates a frame with help of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// it is a default operation when you stop operation then
                                                             // it closes the GUI

        // frame.setSize(435, 350);// set the size of the frame
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);// set change the background color of the frame
        // frame.setResizable(false);// it won't allows users to resize the size of the
        // frame.
        frame.setVisible(true);// it allows that a content of the form is visible or not.
        frame.add(label);// add label data to the frame so that it can show the contents in the GUI
                         // window
        // frame.setLayout(null);
        frame.pack();

        /* Panels in java */
        // JPanel:-- a GUI component that functions as a container to hold other
        // components
        ImageIcon icon1 = new ImageIcon("D:\\visual studio code\\avata insta.jpg");

        JLabel label1 = new JLabel();
        label1.setText("Hi, My name is windows and i'm a multipurpose machine and thanks for using me.");
        label1.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label1.setForeground(Color.GREEN);
        label1.setBackground(Color.BLACK);
        label1.setAlignmentY(250);
        label1.setAlignmentX(250);
        label1.setIcon(icon1);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.BOTTOM);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 250, 250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(250, 0, 250, 250);
        JPanel bluepane1 = new JPanel();
        bluepane1.setBackground(Color.BLUE);
        bluepane1.setBounds(0, 250, 500, 250);
        bluepane1.setLayout(new BorderLayout());

        JFrame frame1 = new JFrame();
        frame1.setTitle("This frame is for panels example");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setSize(750, 750);
        frame1.setVisible(true);
        frame1.add(redpanel);
        frame1.add(greenpanel);
        frame1.add(bluepane1);
        frame1.setVisible(true);
        frame1.add(label1);

        /* buttons in java */
        // Button:-- a button that performs an action when a user is clicked on it.

        new MyFrame1();

        /* border layout in java */
        // layout manager :-- defines the natural layout for components within a
        // conatiner

        // 3 common managers

        // BorderLayout :-- a border layout places components in five areas :
        // EAST,WEST,NORTH,SOUTH,CENTER
        // All extra space is placed in the CENTER area

        JFrame frame0 = new JFrame();
        frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame0.setSize(500, 500);
        frame0.setLayout(new BorderLayout(40, 20));
        frame0.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        // These are sUBPANELS for center panels

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(new Color(10, 150, 10));
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.ORANGE);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.WEST);
        panel5.add(panel10, BorderLayout.CENTER);

        frame0.add(panel1, BorderLayout.NORTH);
        frame0.add(panel2, BorderLayout.SOUTH);
        frame0.add(panel3, BorderLayout.WEST);
        frame0.add(panel4, BorderLayout.EAST);
        frame0.add(panel5, BorderLayout.CENTER);

        /* Flow Layout in java */
        // LayoutManager :-- it defines the natural layout for components within a
        // container

        // FlowLayout :-- places components in a row, sized at their preferred size.
        // if the horizontal space in the conatiner is too small,
        // the FlowLayout class uses the next available row.

        JFrame frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        frame2.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        // JButton button1 = new JButton("1");//first way of creating button
        // secound way of creating button
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        panel.add(new JButton("11"));
        panel.add(new JButton("12"));

        frame2.add(panel);
        // frame2.add(button1);
        frame2.setVisible(true);

        /* Grid Layout in java */
        // Layout Manager:-- defines the natural layout for components within a
        // container
        // GridLayout:-- places components in a grid of cells.
        // Each components takes all the available space within it's cells,
        // and each cell is the same size.

        JFrame frame3 = new JFrame();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(500, 500);
        frame3.setLayout(new GridLayout(9, 1, 2, 2));

        // JButton button = new JButton("1");//one way of creating buttons
        frame3.add(new JButton("1"));
        frame3.add(new JButton("2"));
        frame3.add(new JButton("3"));
        frame3.add(new JButton("4"));
        frame3.add(new JButton("5"));
        frame3.add(new JButton("6"));
        frame3.add(new JButton("7"));
        frame3.add(new JButton("8"));
        frame3.add(new JButton("9"));
        frame3.add(new JButton("10"));
        frame3.add(new JButton("11"));
        frame3.add(new JButton("12"));

        frame3.setVisible(true);

        /* Layered Pane in java */
        // LayerdPane :-- Swing container that provides a third dimension for
        // positioning components ex. depth, Z-index

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.RED);
        label2.setBounds(50, 50, 250, 250);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(100, 100, 250, 250);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(Color.MAGENTA);
        label4.setBounds(150, 150, 250, 250);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        /*
         * // one way of doing this is add full layer name
         * layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
         * layeredPane.add(label3, JLayeredPane.DEFAULT_LAYER);
         * layeredPane.add(label4, JLayeredPane.DRAG_LAYER);
         */

        // the other way of doing this is add layer number insted of full name
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(6));
        layeredPane.add(label4, Integer.valueOf(0));

        JFrame frame4 = new JFrame("JLayeredPane");
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setSize(new Dimension(500, 500));
        frame4.setLayout(null);
        frame4.setVisible(true);
        frame4.add(layeredPane);

        /* Open a new GUI window in java */
        LaunchPage launchPage = new LaunchPage();

        /* JOptionPane in java */
        // JOptionPane :-- pop up a standard dialog box that prompts users for a value
        // or informs them of something.

        // JOptionPane.showMessageDialog(null, "There is some useless info", "title",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is more useless info :D","title",
        // JOptionPane.);
        // JOptionPane.showMessageDialog(null, "really?", "title",
        // JOptionPane.QUESTION_MESSAGE);
        // while (true) {
        // JOptionPane.showMessageDialog(null, "You're computer has a VIRUS!!!!",
        // "title", JOptionPane.PLAIN_MESSAGE);
        // }

        // JOptionPane.showMessageDialog(null, "Call tech support now or ELSE!!!!",
        // "title", JOptionPane.PLAIN_MESSAGE);
        // int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?",
        // "This is my title", JOptionPane.PLAIN_MESSAGE);
        // String name = JOptionPane.showInputDialog("What is your name?");

        // MAIN CONTENT:----
        // while (true) {
        // JOptionPane.showMessageDialog(null, "This is just for the demo of JOptionn
        // dialouge box", "PLAIN_MESSAGE",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showConfirmDialog(null, "This is just for the demo of JOptionn
        // dialouge box", "PLAIN_MESSAGE",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is just for the demo of JOptionn
        // dialouge box",
        // "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showConfirmDialog(null, "This is just for the demo of JOptionn
        // dialouge box",
        // "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is just for the demo of JOptionn
        // dialouge box",
        // "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showConfirmDialog(null, "This is just for the demo of JOptionn
        // dialouge box",
        // "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is just for the demo of JOptionn
        // dialouge box", "WARNING_MESSAGE",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is just for the demo of JOptionn
        // dialouge box", "ERROR_MESSAGE",
        // JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showConfirmDialog(null, "This is just for the demo of JOptionn
        // dialouge box", "WARNING_MESSAGE",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showConfirmDialog(null, "This is just for the demo of JOptionn
        // dialouge box", "ERROR_MESSAGE",
        // JOptionPane.ERROR_MESSAGE);
        // String name = JOptionPane.showInputDialog("Hey, what is your name?");
        // System.out.println(name);
        String[] response = { "Car", "Bike", "Money" };
        ImageIcon icon2 = new ImageIcon("D:\\visual studio code\\avata insta.jpg");
        int optionMessage = JOptionPane.showOptionDialog(null, "Choose one option.", "Lottery",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon2, response, 0);
        System.out.println(optionMessage);
        // }

        /* textfield in java */
        // JTextField:-- a GUI textfield component that can be used to add, set, or get
        // text

        // myFrame frame5 = new myFrame();

        /* checkboxs in java */
        // JCheckBox :-- a GUI compononent that can be selected or deselected.

        // new MyFrame2();

        /* Radio button in java */
        // JRadioButton:-- one or more buttons in a grouping in which only 1 may be
        // selected per grooup

        // new myFrame3();

        /* combobox in java */
        // JComboBox:-- a component that combines a button or other editable field and a
        // drop down list
        // new myFrame4();

        /* Slider in java */
        // JSlider :-- GUI component that lets user enter a value by using an adjustable
        // sliding knob on a track

        /* Progress bar in java */
        // ProgressBarUI :-- visual aid to let the user know that an Operation is
        // processing

        // ProgressBarDemo demo = new ProgressBarDemo();

        /* menu bar in java */
        JFrame MyFrame5 = new JFrame();
        new MyFrame5();

        /* select a file in java */
        // JFileChooser:-- a GUI mechanism that let's a user choose a file(useful for
        // opening or saving a files)
        JFrame MyFrame6 = new JFrame();
        new MyFrame6();

        /* color chooser in java */
        // JColorChooser :-- a GUI mechanism that let's a user choose a color

        JFrame MyFrame7 = new JFrame();
        new MyFrame7();

        /* key listener in java */
        // keyTyped :-- Invoke when a key is typed. Uses keychar, char output
        // keyPressed :-- Invoke when a physical key is pressed down. Uses keyCode, int
        // output
        // keyReleased :-- called whenever a button is released

        JFrame MyFrame8 = new JFrame();
        new MyFrame8();

        /* Mouse listener in java */
        JFrame MyFrame9 = new JFrame();
        new MyFrame9();

        /* Drag and Drop in java */

        JFrame Myframe10 = new JFrame();
        new Myframe10();
        new Dragpanel();

        // /* key bindings in java */
        // // KeyBinding :-- bind an action to a keystroke
        // // don't require you to click a component to give it focus
        // // all Swing components use key Bindings
        // // increased flexibility compared to key Listeners
        // // can assign key strokes to individual Swing components
        // // more difficult to utilize and set up :(

        // Game game = new Game();

        /* 2D Graphics in java */
        JFrame MyFrame11 = new JFrame("2D Graphics");
        new MyFrame11();

        // /* 2D Animation */
        // JFrame MyFrame12 = new JFrame("2D Animation");
        // new MyFrame12();

        /* /* All Generic methods :-- */

        /* Generics in java */
        // Generics :--enables types (classes and interfaces) to be parameters when
        // defining:
        // classes, interfaces and methods
        // a benefit is to eliminate the need to create multiple versions
        // of methods or classes for various data types.
        // Use 1 version for all reference data types

        Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "B", "Y", "E" };

        // displayArray(intArray);
        // displayArray(doubleArray);
        // displayArray(charArray);
        // displayArray(stringArray);

        System.out.println(getFirst(intArray));// it only gives first int vlaue of that intarray
        System.out.println(getFirst(doubleArray));// it only gives first double value of that doublearray
        System.out.println(getFirst(charArray));// it only gives first char value of that cahrarray
        System.out.println(getFirst(stringArray));// it only gives first string value of that stringarray

        /* Generic Classes in java */

        // MyIntegerClass myInt1 = new MyIntegerClass(1);
        // MyDoubleClass myDouble1 = new MyDoubleClass(1.34);
        // MyCharacterClass myChar1 = new MyCharacterClass('!');
        // MyStringClass myString1 = new MyStringClass("Hello");

        // for Generic method only
        // Generic classes :-- they are used when we need to see all array of list at
        // once so we use this method
        // we use this few line of code insted of calling one by one , we just use this
        // simple and clear few line of code to call an array to see all at once

        MyGenericClass<Integer> myInt1 = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble1 = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar1 = new MyGenericClass<>('!');
        MyGenericClass<String> myString1 = new MyGenericClass<>("Hello");

        ArrayList<Integer> myFriends = new ArrayList<>(1);

        System.out.println(myInt1.getValue());
        System.out.println(myDouble1.getValue());
        System.out.println(myChar1.getValue());
        System.out.println(myString1.getValue());

        /* Two Generic parameters in java */
        MyGenericClass1<Integer, String> myclass1 = new MyGenericClass1(1, "Hey");

        // hashmap same like MyGenericClass
        HashMap<Integer, String> int1 = new HashMap<>(1);// it uses when we need to store user info like username &
                                                         // password

        System.out.println(myclass1.xgetValue());
        System.out.println(myclass1.ygetValue());

        /* Bounded types in java */
        // Bounded types:-- you can create the objects of a generic class to have data
        // of specific derived types ex:- Number

        /* serialization in java */
        // serialization:-- The process of converting an object into a byte stream.
        // Persists(saves the state) the object after program exits
        // this byte stream can be saved as a file or sent over a network.
        // can be sent to a different machine
        // Byte stream can be saved as a file (.ser) which is platform indepentent
        // (Think of this as if you're saving a file with the object's information)

        // Deserialization:-- The reverse process of converting a byte stream into an
        // object.
        // (Think of this as if you're loading a saved file.)

        // serialVersionUID:-- serialVersionUID is a unique ID that fuctions like a
        // version #
        // verifies that the sender and receiver of a serialized object,
        // have loaded classes for that object that match
        // Ensures oject will be compatible between machines
        // Number must match. otherwise this will cause a InvalidClassException
        // A SerialVersiionUID will be calculated based on class properties, and
        // A serializable class can declare its own SerialVersionUID explicitly

        // Steps to Serialize:--
        // 1. Your object class should implement serializable interface
        // 2. add import java.io.Serializable;
        // 3. FileOutputStream out = new FileOutputStream(file path)
        // 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        // 5. out.writeobject(objectName)
        // 6. out.close(); fileOut.close();
        /*
         * User user = new User();
         * 
         * user.username = "Bro";
         * user.password = "I <3 pizza";
         * 
         * user.sayHello();
         * FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
         * ObjectOutputStream out = new ObjectOutputStream(fileOut);
         * out.writeObject(user);
         * out.close();
         * fileOut.close();
         * 
         * System.out.println("Object info saved :)");
         */

        // Deserializer :--:
        // Steps to Deserialize:--
        // 1. Declare your object(don't instantiate)
        // 2. Your class should implement Serializable interface
        // 3. add import java.io.Serializable;
        // 4. FileInputStream filrIn = new FileInputStream(file path);
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6. ObjectNam = (class) in.readObject();
        // 7. in.close(); fileIn.close();

        User user = new User();

        user.username = "Bro My bro";
        user.password = "I <3 pizza and I love sandwich also";

        user.sayHello();
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved :)");

        FileInputStream fileIn = new FileInputStream("D:\\visual studio code\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
        System.out.println("Object file username.ser is dcoded successfully :)");

        // // advanced stuff:--
        // // transient values SerialVersionUID
        // // important notes :-- children classes of a parent class that implements
        // // Serializable will do so as well
        // // static fields are not serialized(they bleong to the class, not as
        // individual
        // // object)
        // // the class's definition ("class file") itself is not recorded, cast it as
        // the
        // // object type
        // // fields declared as "transient" aren't serialized, they're ignored
        // // SerialVersionUID is a unique Version ID

        // // SerialVersionUID:--
        // long SerialVersionUID =
        // ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        // System.out.println(SerialVersionUID);

        // /* Timer task in java */
        // // Timer :-- A facility for threads to schedule tasks for future execution in
        // a
        // // backgrund thread
        // // TimerTask :-- A task that can be scheduled for one- time or repeated
        // // execution by a timer
        // Timer timer = new Timer();
        // TimerTask task = new TimerTask() {

        // int counter = 10;

        // @Override
        // public void run() {

        // // TODO Auto-generated method stub
        // // throw new UnsupportedOperationException("Unimplemented method 'run'");
        // System.out.println("Task is Completed :)");
        // if (counter > 0) {
        // System.out.println(counter + " seconds");
        // counter--;
        // } else {
        // System.out.println("Happy new year");
        // timer.cancel();
        // }
        // }
        // };
        // Calendar date = Calendar.getInstance();
        // date.set(Calendar.YEAR, 2023);
        // date.set(Calendar.MONTH, Calendar.DECEMBER);
        // date.set(Calendar.DAY_OF_MONTH, 31);
        // date.set(Calendar.HOUR_OF_DAY, 23);
        // date.set(Calendar.WEEK_OF_MONTH, 0);
        // date.set(Calendar.MINUTE, 59);
        // date.set(Calendar.SECOND, 50);
        // date.set(Calendar.MILLISECOND, 0);

        // // Timer.schedule(task, 100);
        // timer.schedule(task, date.getTime());
        // timer.scheduleAtFixedRate(task, 10, 3);
        // timer.scheduleAtFixedRate(task, date.getTime(), 3);

        /* Threads in java */
        // thread :-- A thread of execution in a program(kind of like a virtual CPU)
        // The JVM allows an application to have multiple threads running concurrently
        // Each threads can execute parts of your code in parallel with the main thread
        // Each thread has a priority
        // Thread with higher priority are executed in preference compared to threads
        // with the lower priority

        // The java Virtual Machine continue to execute threads until either of the
        // following occurs
        // 1. The exit method of class Runtime has been called
        // 2. All user threads have died

        // When a JVM starts up, there is a thread which calls the main method This
        // thread is called "main"

        // Daemon thread is a low priority thread that runs in background to perform
        // tasks such as garbage collection
        // JVM terminates itself when all user threads (non-daemon threads) finish

        Thread.currentThread().setName("Threads");
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getClass());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getStackTrace());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().isAlive());

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Your program is currently sleeping");

        MyThread thread2 = new MyThread();
        thread2.setName("Thread2");
        thread2.setPriority(1);
        thread2.setDaemon(true);
        thread2.start();
        // thread2.run();//when you write run then it shows false status but thread
        // acutally running
        // so you must write start() to show staus true and correctly running
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());
        System.out.println(thread2.isDaemon());

        /* multithreading in java */
        // multithreading :-- Process of executing multiple threads simultaneously
        // Helps maximum utilization of CPU
        // Threads are Independent,they don't affect the execution of other threads.
        // An execution in one thread will not interrupt other threads.
        // useful for serving multiple clients, multiplayer games, or other mutually
        // independent tasks

        // Either create a subclass of Thread
        MyThread1 thread1 = new MyThread1();
        // or
        // Implement Runnable interface and pass instance as an argument to thread
        // constructor
        MyRunnable runnable = new MyRunnable();// people tends to use Runnable interface more

        Thread thread3 = new Thread(runnable);
        thread1.setDaemon(true);
        thread3.setDaemon(true);
        thread1.run();
        thread3.run();
        thread1.start();
        // thread1.join(3000);//it stops other threads that are running and once thread1
        // is
        // finished then it running other programs
        thread3.start();

        /* compile/ run java program in command prompt */
        // 1. Make sure you have a JDK installed (we did this earlier)
        // 2. (optional) use a text editor and save a file as .java
        // 3. Open Command Prompt (windows) or Terminal (Mac) on your computer
        // 4. set path (Where jdk is located)
        // 5. javaC.HelloWorld.java(to compoile)
        // 6. java.HelloWorld(to run a .class file, it's portable)

    }

    // //generic in java one way of doing this
    // public static void displayArray(Integer[] array) {
    // for (Integer x : array) {
    // System.out.print(x + "");
    // }
    // System.out.println();
    // }

    // public static void displayArray(Double[] array) {
    // for (Double x : array) {
    // System.out.print(x + "");
    // }
    // System.out.println();
    // }

    // public static void displayArray(Character[] array) {
    // for (Character x : array) {
    // System.out.print(x + "");
    // }
    // System.out.println();
    // }

    // public static void displayArray(String[] array) {
    // for (String x : array) {
    // System.out.print(x + "");
    // }
    // System.out.println();
    // }

    // other way of doing this with the help of Generic is
    public static <Thing> void displayArray(Thing[] array) {
        for (Thing x : array) {
            System.out.print(x + "");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }

    static int add(int a1, int b1) {
        System.out.println("This is overloaded methods we are using right now in java method no.1");
        return a1 + b1;
    }

    static double add(double a1, double b1, double c1) {
        System.out.println("This is overloaded method we are using right now in java method no.2");
        return a1 * b1 / c1;
    }

    static int add(int a1, int b1, int c1, int d1) {
        System.out.println("This is overloaded method we are using right now in java mehtod no.3");
        return a1 + b1 * c1 * d1;
    }

    static int add(int a1, int b1, int c1, int d1, int e1) {
        System.out.println("This is overloaded method we are using right now in java mehtod no.4");
        return a1 + b1 * c1 / d1 % e1;
    }

    static double add(double a1, double b1) {
        System.out.println("This is overloaded methods we are using right now in java method no.5");
        return a1 + b1;
    }

    static double add(double a1, double b1, double c1, double d1) {
        System.out.println("This is overloaded method we are using right now in java mehtod no.6");
        return a1 + b1 * c1 * d1;
    }

    static double add(double a1, double b1, double c1, double d1, double e1) {
        System.out.println("This is overloaded method we are using right now in java mehtod no.7");
        return a1 + b1 * c1 / d1 % e1;
    }
    // static int add(int x1, int y1) {
    // int z0 = x1+y1;
    // System.out.println(z0);

    // return x1 + y1;
    // // return 0;

    // }

    static void hello(String name, int age1) {
        System.out.println("Hello \n\n" + name);
        System.out.println("You are " + age1 + " years old");
    }
};

// public class Car {
// String make = "audi";
// String model = "alphax";
// int year = 2022;
// String color = "blue";
// double price = 90000.00;
// void drive(){
// System.out.println("yo boy, you drive an audi car.");
// }
// void break1(){
// System.out.println("You applied the break of this brand new audi car");
// }
// }

// public class Human {
// String namme;
// int age;
// double weight;

// Human(String namme, int age, double weight) {
// this.namme = namme;
// this.age = age;
// this.weight = weight;
// }

// void eat() {
// System.out.println("This person's " + this.namme + " is eating");
// }

// void drink() {
// System.out.println("This person's " + this.namme + " is drinking");
// }
// }

// // one way of writing the variable scope
// public class DiceRoller {
// DiceRoller() {
// Random random = new Random();
// int number = 0;
// roll(random, number);
// }

// void roll(Random random, int number) {
// number = random.nextInt(6) + 1;
// System.out.println(number);
// }
// }

// // second way of writing the variable scope through the global mehtod (make
// // values global)
// public class DiceRollerr {
// Random random = new Random();
// int number;

// DiceRollerr() {
// roll(random, number);
// }

// void roll(Random random, int number) {
// number = random.nextInt(6) + 1;
// System.out.println(number);
// }

// }

// overloaded constructors
class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    void make() {
        System.out.println("let's start to make your own unique pizza");
    }

    void stop() {
        System.out.println("Stop unless you burn that pizza");
    }
}

class Carr {
    String make = "Ford";
    String model = "Mustang";
    String color = "Blue";
    int year = 2022;

    public String toString() {
        String muString = make + "\n" + model + "\n" + color + "\n" + year;
        return muString;
        // other way of writing this
        // return make + "\n"+model+"\n"+color+"\n"+year;
    }
}

/* arrays of object */
class Food {
    String name;

    Food(String name) {
        this.name = name;
    }
}

/* object passing */
class Garage {
    void park(Thar thar) {
        System.out.println("The " + thar.name + " is parked inside the garage");
    }
}

class Bicycle {
    void stand(Bstand bstand) {
        System.out.println("your " + bstand.name1 + " is on stnad ");
    }
}

class Bstand {
    String name1;

    Bstand(String name1) {
        this.name1 = name1;
    }
}

class Thar {
    String name;

    Thar(String name) {
        this.name = name;
    }
}

// static keyword
class Friend {
    String name;
    static int numberofffriends;

    Friend(String name) {
        this.name = name;
        numberofffriends++;
    }

    static void displayFriends() {
        System.out.println("You hava " + numberofffriends + " friends in your list");
    }
}

// inheritence
class Vehicle {
    double speed;
    String engine;
    // double engine;

    void engine() {
        System.out.println(
                "Both car and bike have engines and the main difference is car has a big and powerful engine but bike has a engine also but low power as compare to the car");
    }

    void go() {
        System.out.println("This vehicle is moving");
    }

    void stop() {
        System.out.println("Stop that vehivle");
    }
}

class Car extends Vehicle {
    int wheels = 4;
    int doors = 4;
}

class motorBicycle extends Vehicle {
    int wheels = 2;
    int paddels = 2;
}

// method overriding
class Animal {
    String speak;

    void speak() {
        System.out.println("All of these animal can speak but in there own language");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog goes *bark*");
    }
}

// Super keyword
class person {
    String name;
    double age1;

    person(String name, double age1) {
        this.name = name;
        this.age1 = age1;

    }

    public String toString() {
        return this.name + "\n" + this.age1 + "\n";
    }
}

class Hero extends person {
    String power;

    Hero(String name, double age1, String power) {
        super(name, age1);
        this.power = power;

    }

    public String toString() {
        // return this.name+"\n"+this.age1+"\n"+ this.power ;
        return super.toString() + this.power;
    }
}

// Abstraction
abstract class Vehicles {

    abstract void go();
}

class Caar extends Vehicles {
    @Override
    void go() {
        System.out.println("The driver is driving the car.");
    }
}

// encapsulation
class Caarr {
    private String make;
    private String model;
    private String color;
    private int year;

    Caarr(String make, String model, String color, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);

        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// copy objects
class Cars {
    private String make;
    private String model;
    private String color;
    private int year;

    Cars(String make, String model, String color, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);

        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;

    }

    Cars(Cars x) {
        this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Cars x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setColor(x.getColor());
        this.setYear(x.getYear());
    }
}

// interface
class Rabbit implements Pray {
    @Override
    public void flee() {
        System.out.println("The Rabbit is fleeing.");
    }
}

class Hawk implements Preditor {
    @Override
    public void hunt() {
        System.out.println("The Hawk is hunting.");
    }
}

class Fish implements Pray, Preditor {
    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish.");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting smaller fish.");
    }
}

interface Pray {
    void flee();
}

interface Preditor {
    void hunt();
}

// polymorphism
class Vehiclerace {
    public void go() {
        System.out.println("This is for loop for all methods");
    }
}

class Cars1 extends Vehiclerace {
    @Override
    public void go() {
        System.out.println("The Car begains moving.");
    }
}

class Bicycles extends Vehiclerace {
    @Override
    public void go() {
        System.out.println("This Bicycle begains to move.");
    }
}

class Boat extends Vehiclerace {
    @Override
    public void go() {
        System.out.println("This Boat begains to moving.");
    }
}

// dynamic polymorphism
class Animals {
    public void speak() {
        System.out.println("Both animals are enjoying");
    }
}

class Dogs extends Animals {
    @Override
    public void speak() {
        System.out.println("Dog goes '**bark**'");
    }
}

class Cat extends Animals {
    @Override
    public void speak() {
        System.out.println("Cat goes '**meow**'");
    }
}

// frame in GUI
class myframe extends JFrame {
    myframe() {

        this.setTitle("JFrame title goes here");// sets the title of the frame
        this.setSize(420, 420); // sets the x-dimension and the y-dimension of frame
        this.setVisible(true); // make frame visible
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of
        // application
        // this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//still running in the
        // background when you click on exit button
        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//when you click
        // on exit button of application that doesn't work
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// when you click on the exit button then it disposes
                                                               // all the tasks from the JFrame window
        this.setResizable(false);// it will prevent user to resize the frame

        ImageIcon icon = new ImageIcon("D:/visual studio code/avata insta.jpg");// create an image icon
        this.setIconImage(icon.getImage()); // change icon of frame

        this.getContentPane().setBackground(new Color(125, 50, 150));// change background to new color or custom color
        this.getContentPane().setBackground(Color.MAGENTA);// change color of frame
                                                           // of frame

    }
}

// buttons
class MyFrame1 extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame1() {
        ImageIcon icon = new ImageIcon("D:\\visual studio code\\card.JPG");
        ImageIcon icon1 = new ImageIcon("D:\\visual studio code\\airbag.jpg");
        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(550, 100, 950, 950);
        label.setVisible(true);

        button = new JButton();
        button.setBounds(0, 0, 600, 500);
        button.addActionListener(this);
        button.setText("CARD");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setForeground(Color.GREEN);
        button.setBackground(Color.BLACK);
        button.setFont(new Font("Comic Sans", Font.BOLD, 30));
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);// if you put this button here in this section then
        // it permanently disable this
        // button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            System.out.println("HURRAH! You clicked on your FORTUNE      :)");
            button.setEnabled(false);// if you put this button here then it only clickable once
        }
    }
}

// open a new GUI window
class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage() {

        myButton.setBounds(100, 150, 200, 50);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            frame.dispose();// if you add this line of code then it opens only 1 GUI window otherwise if you
                            // don't add this then it open as many windows as you click on that button
            NewWindow newWindow = new NewWindow();
        }
    }
}

class NewWindow {
    JFrame frame = new JFrame("GUI window ");
    JLabel label = new JLabel("Hello, my dear friend.");

    NewWindow() {

        label.setBounds(0, 0, 200, 50);
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

// // textfield in java
// class myFrame extends JFrame implements ActionListener {
// JButton button;
// JTextField textField;

// myFrame() {
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(new FlowLayout());

// JButton button = new JButton("Submit");
// button.addActionListener(this);

// JTextField textField = new JTextField();
// textField.setPreferredSize(new Dimension(250, 250));

// this.add(textField);
// this.add(button);
// this.pack();
// this.setVisible(true);

// }

// @Override
// public void actionPerformed(ActionEvent e) {
// if (e.getSource() == button) {
// System.out.println("Welcome" + "textField.getText()");
// }
// }

// }

// // checkboxes
// class MyFrame2 extends JFrame implements ActionListener {

// JButton button;
// JCheckBox checkbox;
// ImageIcon xIcon;
// ImageIcon checkIcon;

// MyFrame2() {
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(new FlowLayout());

// xIcon = new ImageIcon("D:\\visual studio code\\avata insta.jpg");
// checkIcon = new ImageIcon("D:\\visual studio code\\Hospital-building.jpg");

// JButton button = new JButton();
// button.setText("Submit");
// button.addActionListener(this);

// JCheckBox checkbox = new JCheckBox();
// checkbox.setText("I'm not a robot.");
// checkbox.setFocusable(true);
// checkbox.setFont(new Font("Mv Boli", Font.PLAIN, 20));
// checkbox.setIcon(xIcon);
// checkbox.setSelectedIcon(checkIcon);

// this.add(button);
// this.add(checkbox);
// this.pack();
// this.setVisible(true);
// }

// @Override
// public void actionPerformed(ActionEvent e) {
// if (e.getSource() == button) {
// System.out.println(checkbox.isSelected());
// }
// }

// }

// // Radio button
// class myFrame3 extends JFrame implements ActionListener {

// JRadioButton pizzaButton;
// JRadioButton hambrgurButton;
// JRadioButton hotdogButton;
// ImageIcon pizzaImageIcon;
// ImageIcon hambrguriImageIcon;
// ImageIcon hotdogImageIcon;

// myFrame3() {
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(new FlowLayout());

// ButtonGroup group = new ButtonGroup();
// group.add(pizzaButton);
// group.add(hambrgurButton);
// group.add(hotdogButton);

// ImageIcon pizzaImageIcon = new ImageIcon("D:\\visual studio code\\avata
// insta.jpg");
// ImageIcon hambrgurImageIcon = new ImageIcon("D:\\visual studio
// code\\Capture.PNG");
// ImageIcon hotdogImageIcon = new ImageIcon("D:\\visual studio
// code\\Hospital-building.jpg");

// JRadioButton pizzaButton = new JRadioButton("PIZZA");
// JRadioButton hambrgurButton = new JRadioButton("HAMBRGUR");
// JRadioButton hotdogButton = new JRadioButton("HOTDOG");
// pizzaButton.addActionListener(this);
// hambrgurButton.addActionListener(this);
// hotdogButton.addActionListener(this);

// pizzaButton.setIcon(pizzaImageIcon);
// hambrgurButton.setIcon(hambrgurImageIcon);
// hotdogButton.setIcon(hotdogImageIcon);

// this.add(pizzaButton);
// this.add(hambrgurButton);
// this.add(hotdogButton);
// this.pack();
// this.setVisible(true);
// }

// @Override
// public void actionPerformed(ActionEvent e) {
// if (e.getSource() == e) {
// System.out.println("You ordered PIZZA :)");
// } else if (e.getSource() == e) {
// System.out.println("You ordered a hambrgur");
// } else if (e.getSource() == e) {
// System.out.println("You ordered a hotdog");
// }
// }
// }

// // combobox
// class myFrame4 extends JFrame implements ActionListener {

// JComboBox comboBox;

// myFrame4() {
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(new FlowLayout());

// String[] animals = { "Dog", "Cat", "Mouse" };
// JComboBox comboBox = new JComboBox<>(animals);
// comboBox.addActionListener(this);

// // comboBox.setEditable(true);
// // System.out.println(comboBox.getItemCount());
// // comboBox.addItem("horse");
// // comboBox.insertItemAt("Lion", 1);
// // comboBox.setSelectedIndex(0);
// // comboBox.removeItem("Cat");
// comboBox.removeItemAt(2);
// // comboBox.removeAllitems();

// this.add(comboBox);
// this.pack();
// this.setVisible(true);
// }

// @Override
// public void actionPerformed(ActionEvent e) {
// if (e.getSource() == comboBox) {
// // System.out.println("This is your selected items" +
// // comboBox.getSelectedItem());
// System.out.println("This is your selected items" +
// comboBox.getSelectedIndex());
// }
// }
// }

// // Slider
// class Sliderdemo implements ChangeListener {
// Sliderdemo sliderdemo = new Sliderdemo();

// JFrame frame;
// JLabel label;
// JPanel panel;
// JSlider slider;

// Sliderdemo () {

// frame = new JFrame("Sliderdemo");
// label = new JLabel();
// panel = new JPanel();
// slider = new JSlider(0,100,50);

// panel.add(slider);
// panel.add(label);

// slider.setPreferredSize(new Dimension(400, 400));

// slider.setPaintTicks(true);
// slider.setMinorTickSpacing(10);

// slider.setPaintTrack(true);
// slider.setMajorTickSpacing(25);

// slider.setPaintLabels(true);
// slider.setFont(new Font("Mv Boli", Font.PLAIN, 20));

// slider.setOrientation(SwingConstants.VERTICAL);
// // slider.setOrientation(SwingConstants.HORIZONTAL);

// label.setText("Temperature(°C) = "+ slider.getValue());
// label.setFont(new Font("Mv Boli", Font.PLAIN, 30));

// slider.addChangeListener(this);

// frame.add(panel);
// frame.setSize(500, 500);
// frame.setVisible(true);

// }

// @Override
// public void stateChanged (ChangeEvent e){
// label.setText("Temperature(°C) = "+ slider.getValue());
// }
// }

// // Progress bar
// class ProgressBarDemo {
// JFrame frame = new JFrame();
// JProgressBar bar = new JProgressBar();

// ProgressBarDemo() {

// bar.setValue(0);
// bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
// bar.setBounds(0, 0, 500, 50);
// bar.setFont(new Font("Mv Boli", Font.BOLD, 30));
// bar.setForeground(Color.RED);
// bar.setLayout(null);
// bar.setStringPainted(true);

// frame.add(bar);
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setSize(600, 400);
// frame.setLayout(null);
// frame.setVisible(true);

// fill();
// }

// public void fill() {
// int counter = 0;

// while (counter <= 1000) {
// bar.setValue(counter);
// try {
// Thread.sleep(100);
// } catch (InterruptedException e) {
// // TODO: handle exception
// e.printStackTrace();
// }
// counter += 1;
// }
// bar.setString("Done :)");
// }
// }

// menu bar
class MyFrame5 extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu filemMenu;
    JMenu editMenu;
    JMenu helJMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame5() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        ImageIcon loadIcon = new ImageIcon("D:\\visual studio code\\avata insta.jpg");
        ImageIcon saveIcon = new ImageIcon("D:\\visual studio code\\Capture.PNG");
        ImageIcon exitIcon = new ImageIcon("D:\\visual studio code\\Hospital-building.jpg");

        JMenuBar menuBar = new JMenuBar();
        JMenu filemMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        filemMenu.setMnemonic(KeyEvent.VK_F);// Alt+F for load
        editMenu.setMnemonic(KeyEvent.VK_E);// Alt+E for load
        helpMenu.setMnemonic(KeyEvent.VK_H);// Alt+H for load

        loadItem.setMnemonic(KeyEvent.VK_L);// L for load
        saveItem.setMnemonic(KeyEvent.VK_S);// S for load
        exitItem.setMnemonic(KeyEvent.VK_E);// E for load

        filemMenu.add(loadItem);
        filemMenu.add(saveItem);
        filemMenu.add(exitItem);

        menuBar.add(filemMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("You clicked on the file menu");
        }
        if (e.getSource() == saveItem) {
            System.out.println("You clicked on the edit menu");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}

// select a file in java
class MyFrame6 extends JFrame implements ActionListener {

    JButton button;

    MyFrame6() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Select Files");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Omega"));

            // int response = fileChooser.showOpenDialog(null);//select files to open
            int response = fileChooser.showSaveDialog(null);// select files to save

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}

// Color chooser in java
class MyFrame7 extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame7() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Pick a color");
        button.addActionListener(this);

        JLabel label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some text");
        label.setFont(new Font("Mv Boli", Font.BOLD, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);
            label.setForeground(color);
            label.setBackground(color);
        }
    }
}

// key listener
class MyFrame8 extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame8() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        ImageIcon icon = new ImageIcon("D:\\visual studio code\\Capture.PNG");

        JLabel label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
        // label.setBackground(Color.RED);
        // label.setOpaque(true);

        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("You released a key char" + e.getKeyChar());
        System.out.println("You released a key code" + e.getKeyCode());
    }

}

// Mouse listener in java
class MyFrame9 extends JFrame implements MouseListener {

    JLabel label;

    MyFrame9() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        // this.pack();
        // this.setLocationRelativeTo(null);

        JLabel label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse");
        label.setBorder(BorderFactory.createEtchedBorder());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("YOu presses the mouse");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered in the component");
        label.setForeground(Color.orange);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited from the component");
        label.setForeground(Color.MAGENTA);
    }
}

// Drag and Drop in java
class Myframe10 extends JFrame {

    Dragpanel dragpanel = new Dragpanel();

    Myframe10() {
        this.add(dragpanel);
        this.setTitle("Drag and Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

class Dragpanel extends JPanel {

    ImageIcon image = new ImageIcon("D:\\visual studio code\\avata insta.jpg");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    Dragpanel() {
        Point imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();

            imageCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY()));
            prevPt = currentPt;
            repaint();
        }
    }
}

// // key bindings in java
// class Game {
// JFrame frame;
// JLabel label;

// Action upAction;
// Action downAction;
// Action leftAction;
// Action rightAction;

// Game() {
// JFrame frame = new JFrame("KeyBinding Demo");
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setSize(500, 500);
// frame.setLayout(null);

// JLabel label = new JLabel();
// label.setBackground(Color.RED);
// label.setBounds(100, 100, 100, 100);
// label.setOpaque(true);

// UpAction upAction = new UpAction();
// DownAction downAction = new DownAction();
// LeftAction leftAction = new LeftAction();
// RightAction rightAction = new RightAction();

// label.getInputMap().put(KeyStroke.getKeyStroke("w"), "upAction");
// label.getActionMap().put("upAction", upAction);

// label.getInputMap().put(KeyStroke.getKeyStroke("s"), "downAction");
// label.getActionMap().put("downAction", downAction);

// label.getInputMap().put(KeyStroke.getKeyStroke("a"), "leftAction");
// label.getActionMap().put("leftAction", leftAction);

// label.getInputMap().put(KeyStroke.getKeyStroke("d"), rightAction);
// label.getActionMap().put("rightAction", rightAction);

// frame.add(label);
// frame.setVisible(true);

// }

// }

// class UpAction extends AbstractAction {

// @Override
// public void actionPerformed(ActionEvent e) {
// label.setLocation(label.getX(), label.getY() - 10);
// }

// }

// class DownAction extends AbstractAction {

// @Override
// public void actionPerformed(ActionEvent e) {
// label.setLocation(label.getX() - 10, label.getY());

// }

// }

// class LeftAction extends AbstractAction {

// @Override
// public void actionPerformed(ActionEvent e) {
// label.setLocation(label.getX(), label.getY() + 10);

// }

// }

// class RightAction extends AbstractAction {

// @Override
// public void actionPerformed(ActionEvent e) {
// label.setLocation(label.getX() + 10, label.getY());

// }

// }

// 2D Graphics in java
class MyFrame11 extends JFrame {

    MyPanel panel;

    MyFrame11() {

        MyPanel panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

class MyPanel extends JPanel {
    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        // Rectangle
        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.BLUE);
        g2D.drawRect(50, 50, 400, 400);
        g2D.draw3DRect(50, 50, 400, 400, true);
        g2D.fill3DRect(100, 100, 300, 300, true);
        // Line
        g2D.drawLine(0, 0, 500, 500);
        // Triangle(POLYGON)
        int[] xpoints = { 150, 250, 350 };
        int[] ypoints = { 300, 150, 300 };
        g2D.setColor(Color.DARK_GRAY);
        g2D.fillPolygon(xpoints, ypoints, 3);
        g2D.drawPolygon(xpoints, ypoints, 3);
        // Circle and Arc
        g2D.setPaint(Color.orange);
        // g2D.drawOval(200, 200, 100, 100);
        // g2D.fillOval(200, 200, 100, 100);
        // g2D.drawArc(185, 220, 130, 100, 180, 180);
        g2D.drawArc(200, 200, 100, 100, 0, 180);
        g2D.fillArc(200, 200, 100, 100, 0, 180);
        g2D.setPaint(Color.magenta);
        g2D.drawArc(200, 200, 100, 100, 180, 180);
        g2D.fillArc(200, 200, 100, 100, 180, 180);
        // String
        g2D.setPaint(Color.cyan);
        g2D.setFont(new Font("MV Boli", Font.PLAIN, 50));
        g2D.drawString("Illumunati :] ", 200, 350);
    }
}

// // 2D Animation
// class MyFrame12 extends JFrame {
// MyPanel panel12;

// MyFrame12() {
// MyPanel panel12 = new MyPanel();
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.add(panel12);
// this.pack();
// this.setLocationRelativeTo(null);
// this.setVisible(true);
// }
// }

// class MyPanel1 extends JPanel implements ActionListener {
// final int Panel_Width = 500;
// final int Panel_Height = 500;
// Image enemy;
// Image backgroundImage;
// Timer timer;
// int xVelocity = 1;
// int yVelocity = 1;
// int x = 0;
// int y = 0;

// MyPanel1() {
// this.setPreferredSize(new Dimension(Panel_Width, Panel_Height));
// this.setBackground(Color.BLACK);
// enemy = new ImageIcon("D:\\visual studio code\\avata insta.jpg").getImage();
// backgroundImage = new ImageIcon("D:\\visual studio
// code\\Capture.PNG").getImage();
// timer = new javax.swing.Timer(10, null);
// ((Object) timer).Start();
// }

// public void paint(Graphics g) {
// super.paint(g);// paints the background of the frame

// Graphics2D g2D = (Graphics2D) g;
// g2D.drawImage(backgroundImage, 0, 0, null);
// g2D.drawImage(enemy, x, y, null);

// }

// public void actionPerformed(ActionEvent e) {
// if (x >= Panel_Width - enemy.getWidth(null) || x < 0) {
// xVelocity = xVelocity * -1;
// }
// if (y >= Panel_Height - enemy.getHeight(null)) {
// yVelocity = yVelocity * -1;
// }
// x += xVelocity;
// y += yVelocity;

// repaint();
// }
// }

/* All Generic class :-- */

// generics class in java
class MyIntegerClass {
    Integer x;

    MyIntegerClass(Integer x) {
        this.x = x;
    }

    public Integer getValue() {
        return x;
    }
}

class MyDoubleClass {
    Double x;

    MyDoubleClass(Double x) {
        this.x = x;
    }

    public Double getValue() {
        return x;
    }
}

class MyCharacterClass {
    Character x;

    MyCharacterClass(Character x) {
        this.x = x;
    }

    public Character getValue() {
        return x;
    }
}

class MyStringClass {
    String x;

    MyStringClass(String x) {
        this.x = x;
    }

    public String getValue() {
        return x;
    }
}

// generic classes short methods to do this
class MyGenericClass<Thing> {
    Thing x;

    MyGenericClass(Thing x) {
        this.x = x;
    }

    public Thing getValue() {
        System.out.println();
        return x;
    }
}

// two generic classes in java
class MyGenericClass1<Thing1 extends Number, Thing2> {
    Thing1 x;
    Thing2 y;

    MyGenericClass1(Thing1 x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing1 xgetValue() {
        return x;
    }

    public Thing2 ygetValue() {
        return y;
    }
}

/*
 * // serialization in java
 * class User implements Serializable {
 * String username;
 * String password;
 * public void sayHello(){
 * System.out.println("Hello "+ username);
 * }
 * }
 */
// Deserializer :--
class User implements Serializable {
    public static final long SerialVersionUID = 1;
    String username;
    transient String password;
    // transient String password; //if we uses transient word then it not display
    // value that we assign in that data types it shows null in terminal

    public void sayHello() {
        System.out.println("Hello " + username);
    }
}

// Threads in java
class MyThread extends Thread {
    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("This daemon thread is running");
        } else {
            System.out.println("This thread is running");
        }
    }
}

// multithreading in java
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread 01 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        // System.out.println(1 / 0);
        System.out.println("Thread #1 is finished ;)");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 02 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished ;)");
    }
}
