import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] alphabet = {'[',']','{','}','(',')', '<', '>'};
        String userContinue = "Y";

        while (userContinue.equalsIgnoreCase("Y")) {
            System.out.println("Type a sentence to validate. Sample: <{[()]}>");
            String sentence = scanner.nextLine();
            String[] userInput = { sentence };
            boolean checkString = false;

            for (String word : userInput) {
                char[] characters = word.toCharArray();
                for(char ch : characters) {
                    for(int i=0; i<alphabet.length;i++) {
                        if(alphabet[i] == ch) {
                            checkString = true;
                            break;
                        }
                        checkString = false;
                    }
                    if(!checkString) {
                        userContinue = "N";
                        break;
                    }
                }
                if(userContinue.equalsIgnoreCase("Y")) {
                    System.out.println(ValidateWord(word) ? "Valid" : "Invalid");
                } else {
                    System.out.println("Invalid symbol");
                }
            }

            System.out.println("Continue? (Y/N)");
            userContinue = scanner.nextLine().trim();
        }
    }

    public static boolean ValidateWord(String word) {
        System.out.println("-> Validated word: " + word);

        Stack<Character> inputStack = new Stack();

        char[] symbols = word.toCharArray();
        for (Character checkSymbol : symbols) {

            if (checkSymbol == '(' || checkSymbol == '{' || checkSymbol == '[' || checkSymbol == '<') {

                inputStack.push(checkSymbol);
            } else if (checkSymbol == ')' || checkSymbol == ']' || checkSymbol == '}' || checkSymbol == '>') {

                try {

                    char matchSymbol = inputStack.pop();

                    if (checkSymbol == ')' && matchSymbol == '(') {
                        continue;
                    } else if (checkSymbol == '}' && matchSymbol == '{') {
                        continue;
                    } else if (checkSymbol == ']' && matchSymbol == '[') {
                        continue;
                    } else if (checkSymbol == '>' && matchSymbol == '<') {
                        continue;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }
}
