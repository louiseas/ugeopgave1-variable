void main () {

    //VariableBasics
    //Opgave 1

    double apple = 25.50;
    double pear = 15.00;
    double banana = 30.00;
    double subTotal = (apple + pear + banana);
    double taxRate = 25.5;

    double totalPrice = subTotal + (subTotal * taxRate) / 100;

    System.out.println(subTotal);
    System.out.println(totalPrice);

    //opgave 2

    double food = 450.0;
    double drinks = 120.0;
    double tips = 50.0;
    double numberOfPeople = 4;

    double billTotal = (food + drinks + tips);

    double billSplit = (billTotal / 4);

    System.out.println(billSplit);


    //opgave 3

    double originalPrice = 300.0;
    double discountRate = 20.0;
    double priceAfterDiscount = originalPrice - (originalPrice * discountRate) / 100;
    double taxRate2 = 25.0;
    double finalPrice = priceAfterDiscount + (priceAfterDiscount * taxRate2) / 100;
    System.out.println(originalPrice);
    System.out.println(priceAfterDiscount);
    System.out.println(finalPrice);


    //opgave 4

    int numberOfGuests = 15;
    int numberOfCupcakes = 40;
    int cupcakesPerPerson = 40 / 15;
    int leftover = numberOfCupcakes % numberOfGuests;

    System.out.println("Each guest gets" + cupcakesPerPerson + "cupcakes");
    System.out.println(leftover + "cupcakes leftover");


    //opgave 5

    StringBuilder sb = new StringBuilder();

    String name = "Anna";
    int age = 25;
    sb.append("Hello,");
    sb.append(name);
    sb.append("!");
    sb.append("you are");
    sb.append(age);
    sb.append("years old");
    System.out.println(sb.toString());

    //opgave 6

    int score = 100;
    System.out.println(score);
    int plusScore = score += 50;
    System.out.println(+plusScore);
    int plusMoreScore = plusScore += 25;
    System.out.println(plusMoreScore);


    //opgave 7

    int health = 100;
    int newHealth = health -= 15;
    System.out.println(newHealth);
    int finalHealth = newHealth -= 20;
    System.out.println(finalHealth);


    //opgave 8

    double price = 50.0;
    System.out.println(price);
    double doublePrice = price *= 2;
    System.out.println(doublePrice);

    //opgave 9

    int number = 10;
    System.out.println(number);
    number++;
    System.out.println(number);
    number--;
    System.out.println(number);

    //opgave 10

    int numberTen = 10;
    System.out.println(numberTen);
    numberTen += 5;
    System.out.println(numberTen);
    numberTen -= 3;
    System.out.println(numberTen);
    numberTen++;
    System.out.println(numberTen);
    numberTen--;
    System.out.println(numberTen);

    //opgave 11

    String productname = "Laptop";
    double pricePerThing = 7999.99;
    boolean leftovers = true;
    int stock = 15;
    double discountPercent = 15.00;
    String categori = "electronics";

    //opgave 12

    String studentName = "Anna";
    int testPoints = 85;
    int submissionPoints = 92;
    double averageGrade = 88.5;
    boolean passed = true;

    //opgave 13

    String guestName = "Peter Hansen";
    int roomNumber = 204;
    int numberOfNights = 3;
    double oneNightPrice = 899.00;
    boolean BreakfastIncluded = true;
    double totalPriceForGuest = 2697.00;


    //opgave 14

    int stepsToday = 8547;
    int wantedSteps = 10000;
    double kmTotal = 6.2;
    int cKalBurnt = 420;
    boolean goalReached = false;


    //opgave 15

    String bookTitle;
    String authorName;
    int bookISBNNumber;
    int bookPages;
    boolean bookAvailability;
    String currentBorrower;
    String deliveryDate;
    int lateFeeAmount;
    boolean isBookBestseller;
    double bookRating;


    //Rekflektionsspørgsmål:
    //1 - Forskellen mellem int division og double division er at int er hele tal og double er mindst én værdi en double der skal divideres.
    //2 - Man bruger paranteser i calculations for at være tydelig
    //3 - Man bruger modulo % til at beregne restværdi
    //4 - For at kombinere strings og numbers, skal man bruge stringBuilder. f.eks:
    //int age = 25;
    //String message = "Age: " + age;  // "Age: 25"

    //5 - "5" + 3 vs 5 + 3?
    // i det første eksempel vil 5 tallet stå som "tekst" så er der vil stå "53"
    // i det andet eksempel vil den lægge de to tal sammen, så der står "8"

    int test = 5+3;
    System.out.println(test);
    String testTo = "5"+3;
    System.out.println(testTo);

    //6 - hvorfor += i stedet for =...+ ?
    // fordi det er mere effektivt og tidsbesparende + ser pænere ud

    //7 - man tvinger en double på en int variable, ved at sætte (double) på efter =
    //int a = 7;
    //int b = 2;
    //double result = (double) a / b;  // 3.5 (cast til double)
}