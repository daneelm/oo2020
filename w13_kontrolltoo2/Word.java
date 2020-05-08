public class Word implements Letter{
    public int occurrence(String w, char c){
        int counter = 0;
		for(int i = 0; i< w.length(); i++){
			if(w.charAt(i) == c){
                counter++;
            }
		}
		return counter;
    }
}