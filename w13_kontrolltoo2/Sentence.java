import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sentence implements Letter{
    String b;
    public Sentence(String ub){
        b=ub;
    }
     /*List<Word> words = new LinkedList<>();

    public Sentence(String a){
        String[] wordList = a.split(" ");
        for (String word : wordList) {
            words.add(new Word(word));
        }
    }*/

    public int occurrence(String w, char c){return 0;};

    public int count(){

        String[] words = b.split(" ");
        
        int count=words.length;
		return count;
    }


    /*public String[] count2(){
        String splitOn = " ";
        String[] word = b.split(splitOn);
        for(String wordc : word) {
            words.add(wordc);
        } 


		return words;
    }*/



    public String toString(){
        return b;
    }
}