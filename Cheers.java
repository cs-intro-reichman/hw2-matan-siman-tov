// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String temp = args[0];
                String word= "";
                for (int i = 0; i < temp.length(); i++) {
                        char c = temp.charAt(i);
                        if (c >= 'a' && c <= 'z'){
                                c = (char) (c - 32);                              
                        }
                        word = word + c;
                }
                int n = Integer.parseInt(args[1]);
                System.out.println(word);
                int length = word.length();
                String check = "AEFHILMNORSX";
                for (int i = 0; i < length; i++) {
                        String pre;
                        char c = word.charAt(i);
                        if (check.indexOf(c)>= 0) {
                                pre = "an";      
                        }
                        else {
                                pre = "a ";
                        }
                        System.out.println("Give me " + pre + " " + c + ": " + c + "!");
                }
              System.out.println("What does that spell?");
              for (int i = 0; i < n; i++) {
                        System.out.println(word + "!!!");
              }


        
        }
}
