import java.util.ArrayList;
public class Main
{
public static void main(String[] args)
    {
        WordChecker w = new WordChecker();
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        WordChecker x = new WordChecker(words);
        System.out.print(x.isWordChain());
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("to");
        letters.add("too");
        letters.add("stool");
        letters.add("tools");
        WordChecker y = new WordChecker(letters);
        System.out.print(y.isWordChain());
        ArrayList<String> list = new ArrayList<String>();
        list.add("catch");
        list.add("bobcat");
        list.add("catchacat");
        list.add("cat");
        list.add("at");
        WordChecker z = new WordChecker(list);
        System.out.print(z.createList("cat"));
        System.out.print(z.createList("catch"));
        System.out.print(z.createList("dog"));
    }
}
