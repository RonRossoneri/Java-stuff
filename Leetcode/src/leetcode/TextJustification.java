package leetcode;
import java.util.*;

public class TextJustification {
	public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        //int i = 0;
        int wordLen = 0;
        int wordnum = 0;
        ArrayList<String> tmp = new ArrayList<>();
        //StringBuilder tmp = new StringBuilder();
        
        for(int i = 0; i < words.length; i++){
            if(wordLen + words[i].length() + 1 > maxWidth){
              int n = maxWidth - wordLen; // num of space
              System.out.println("n is " + n);
              int space = 0;
              int extraspace = 0;
              
              if(wordnum - 1 > 0){
                  space = n/(wordnum - 1); // here is the hard part
                  extraspace = n%(wordnum - 1);  //how to figure out how many space is added behind each word
              }
              System.out.println(space);
              System.out.println(extraspace);
              
              StringBuilder line = new StringBuilder();
              for(int j = 0; j < wordnum; j++){
                  line.append(tmp.get(j));
                  if(j < wordnum-1) {
                      for(int k = 0; k < space; k++){
                          line.append(" ");
                          if(extraspace > 0){
                              line.append(" ");
                          }
                          extraspace--;
                      }
                  }
              }
                  //how to get the right index??
              
              for(int j = line.length(); j < maxWidth; j++){
                    line.append(" ");
              }
              System.out.println(line.toString());
              res.add(line.toString());
              tmp.clear();
              wordnum = 0;
              wordLen = 0;
            }
            tmp.add(words[i]);
            wordLen += (words[i].length() + 1); // include the space
            //tmp.add(" ");
            wordnum += 1;
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : tmp){
            sb.append(s);
            if(sb.length() < maxWidth - 1){
                sb.append(" ");
            }
        }
        for(int i = sb.length(); i< maxWidth; i++){
            sb.append(" ");
        }
        
        res.add(sb.toString());
        return res;
    }
	public static void main(String[] args){
		String[] arr = {"a","b","c","d","e"};
		fullJustify(arr, 3);
	}
}
