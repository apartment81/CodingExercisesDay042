package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        BracesChecker bracesChecker = new BracesChecker();

        System.out.println(bracesChecker.isValid("(){}"));
        System.out.println(bracesChecker.isValid("([{}])"));
        System.out.println(bracesChecker.isValid("[({})](]"));
        System.out.println(bracesChecker.isValid("(){}[]"));

    }
}
