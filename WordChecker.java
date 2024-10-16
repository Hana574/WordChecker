import java.util.ArrayList;
public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        boolean wordChain = true;
        for(int i = 1; i < wordList.size(); i++)
        {
        String after = wordList.get(i);
        String before = wordList.get(i - 1);
        if(after.indexOf(before) < 0) return false;
        }
        return wordChain;
        /* to be implemented in part (a) */ }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
    public ArrayList<String> createList(String target) {
        /* to be implemented in part (b) */ 
        ArrayList<String> wordle = new ArrayList<String>();
        for(int i = 0; i < wordList.size(); i++)
        {
            String word = wordList.get(i);
            if(word.indexOf(target) == 0) 
            {
                String str = wordList.get(i).substring(target.length());
                wordle.add(str);
            }
        }
        return wordle;
    }
    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }
    public WordChecker()
    {
        wordList = new ArrayList<String>();
    }
}