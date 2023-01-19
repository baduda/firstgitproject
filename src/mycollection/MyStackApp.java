package mycollection;

public class MyStackApp {
    public static void main(String[] args) {
        String s = "Если есть необходимость создать на базе класса";
        String[] words = s.split(" ");

        MyStack<String> stack = new MyStack<>();

        for (String word : words) {
            stack.push(word);
        }

        while (stack.getSize() > 0) {
            String word = stack.pop();
            System.out.print(word + " ");
        }
    }
}
