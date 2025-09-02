import java.io.StringReader;
import java.text.StringCharacterIterator;

public class Trie {
    static class Node {
        Node[] children;
        boolean eow; // End of word

        public Node() {
            children = new Node[26]; // a - z
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }

    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) { // O(L)
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            if (i == word.length() - 1) {
                curr.eow = true;
            }
        }
    }

    public static boolean search(String key) { // O(L) ; L=key .length
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    // public static void main(String[] args) {
    // String words[] = {"the", "a", "there", "their", "any"};
    // for(int i=0; i<words.length; i++){
    // insert(words[i]);
    // }

    // System.out.println(search("their")); //True
    // System.out.println(search("thor")); //false
    // System.out.println(search("an")); //false

    // }

    // Question :- Word break problem

    // public static boolean wordBreak(String key){
    // if (key.length()==0) {
    // return true;
    // }
    // for(int i= 1; i<=key.length();i++){
    // String firstPart = key.substring(0, i);
    // String secPart = key.substring(i);
    // if (search(firstPart) && wordBreak(secPart)){
    // return true;
    // }
    // }
    // return false;
    // }
    // public static void main(String[] args) {
    // String words[] = { "i", "like", "sam", "samsung", "moblie"};
    // String key = "ilikesamsung" ;
    // for (int i=0; i<words.length; i++) {
    // insert(words[i]);
    // }
    // System.out.println(wordBreak(key));
    // }

    // Question start with problem
    // public static boolean startsWith(String prefix){
    // Node curr = root;

    // for(int i=0; i<prefix.length(); i++ ){
    // int idx = prefix.charAt(i) -'a';

    // if (curr.children[idx]==null) {
    // return false;
    // }
    // curr =curr.children[idx];
    // }
    // return true;
    // }
    // public static void main(String[] args) {
    // String words[] = { "apple", "app", "mango", "man", "woman"};
    // String prefix = "app";

    // for(int i=0; i<words.length; i++){
    // insert(words[i]);
    // }
    // System.out.println(startsWith(prefix));
    // }

    // Question :- Count Unique Subdtirng

    // public static int CountNode(Node root){
    // if (root== null) {
    // return 0;
    // }
    // int count = 0;
    // for(int i=0; i<26 ;i++) {
    // if (root.children[i] != null) {
    // count+= CountNode(root.children[i]);
    // }
    // }
    // return count+1;
    // }

    // public static void main(String[] args) {
    // String str = "ababa";

    // for (int i = 0; i < str.length(); i++) {
    // String suffix = str.substring(i);
    // insert(suffix);
    // System.out.println(suffix);

    // }
    // System.err.println(CountNode(root));
    // }
    public static String ans = "";

    public static void LongestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                LongestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    // Question :- Longest word with all prefixes
    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "ap", "appl", "apply", "apple" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        LongestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }

}
