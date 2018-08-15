### Day 1
- src/ console.main
1. System.out.println
2. int, double, Math.pow
3. <, >, <=, >=, ||, &&
4. Ternary: `double e = d >=0 ? 5 : 0;`
5. for, while
- Compiling a file. We created the console directory to see how to compile a .java file. to compile. We copied code from src/console/main and created console/Class1.java. To compile this code we use the command line and the java compiler (javac) `javac console/Class1.java`. This created the Class1.class file.
- src/ console.Class1
1. `package console;` this is almost like the Ruby `require` but the opposite way around.
2. *Shortcut:* `psvm` + `tab` button. This will generate `public static void main(String[] args)`
3. *Shortcut:* `fori` + `tab` button. This will generate `for (int i = 0; i < ; i++)`
4. Arrays: when declaring an array you must declare how long the array is, e.g 25: `int[] primes = new int[25];`
5. foreach loops: `for(int prime : primes)` this is a for loop, that iterates through an int[] called primes. The variable for each loop is called prime.
- src/ transport.Car
1. Instance variables: declared at top of class
2. Getters and Setters. It is good practice to use getters and setters to change instance variable to protect them from external influence. These can be auto generated via `code, generate, Getters and Setters` in IntelliJ based on the instance variables.
- src/ transport.Main
1. When using libraries and external classes like Random. You can use IntelliJ to do the work for you, use the red lightbulb(`alt + enter`) and choose `import class`.
- src/ twitter.Message
1. Constructors are the Ruby equivalent of an Init. If a class has no constructor method, the Java compiler will generate a blank constructor. In Message the constructor looks like: `public Message() {}`
2. Overloaded Constructors and many different constructors except with different arguments passed, either in quantity like in Message (0, 2 or 3 args), or different object types.
3. Constructors can defer to another constructor using `this` just like in Message: `this(username, text, Category.FRIDAY);`
- src/ twitter.Category
1. enum's: these values act quite like constants.
2. There are some inbuilt Java enums. E.g.`DayOfWeek`.
- src/ twitter.Tweets + twitter.SMS
1. These inherit from Message by adding `extends`. E.g.`public class Tweet extends Message`.
2. With IntelliJ you can auto import classes from the super class by going to `Refactor, Pull Members Up`.
3. Also to override a method from the super class `code, generate, Overide`.
4. Inside an overridden class you can still refer back to the super method. e.g. `return "Tweet: " + super.getText();`
- src/ console.StaticMethods
1. When using a class that has not yet created like Maths: `int i = Maths`. IntelliJ will create the file and class for you. Do `alt, enter` + `Generate class`.
