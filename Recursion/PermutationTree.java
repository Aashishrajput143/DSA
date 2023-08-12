public class PermutationTree {
    static void printperm(String input, String output) {
        if (input.length() == 0) {
            System.out.print(output+",");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char single = input.charAt(i);
            String remaining = input.substring(0, i) + input.substring(i + 1);
            printperm(remaining, output + single);
        }
    }

    public static void main(String[] args) {
        printperm("abc", "");
    }
}
