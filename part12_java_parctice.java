public class part12_java_parctice {
    public static void main(String[] args) {

        // problem 1
        String name = " Gupta Pandit ";
        name = name.toLowerCase();
        System.out.println(name);

        // problem 2
        String text = "To My         dear bandhu";
        text = text.replace(" ", "_");
        System.out.println(text);

        // problem 3
        String letter = "Dear <|name1|>, thanks a lot man!";
        letter = letter.replace("<|name1|>", "gupta");
        System.out.println(letter);

        // problem 4
        String teststring = "This string contains Double and   triple space ";
        System.out.println(teststring.indexOf(" "));
        System.out.println(teststring.indexOf("  "));

        // problem 5
        String test2 = "Dear User,\n\tThis java is little bit tought language.\nHere we go!";
        System.out.println(test2);

    }
}
