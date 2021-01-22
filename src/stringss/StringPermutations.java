package stringss;
public class StringPermutations
{
    public static void main(String args[]) 
    { 
        permutation("abcd");
    } 
    
    public static void permutation(String input)
    { 
        permutation("", input);
    
    } 
    private static void permutation(String perm, String word)
    {
        
        if (word.isEmpty()) { 
            
            System.err.println("word:"+perm + word); }
            
        else { 
            
            for (int i = 0; i < word.length(); i++) 
            
            { 
            	permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
            System.out.println(word.charAt(i));
            System.err.println(word.substring(0, i) + word.substring(i + 1, word.length()));
            
            } 
            
        } 
        
    } }

