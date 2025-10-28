public class Problem07{

    public static void repeatCheck(String str, int i, int j) {
        if (i >= str.length()) {
			return;
		}
        if (j >= str.length()) {
            repeatCheck(str, i + 1, i + 2);
            return;
        }

        if (str.charAt(i) == str.charAt(j)) {
            System.out.print(str.charAt(i) + " ");
            repeatCheck(str, i + 1, i + 2);
            return;
        }

        repeatCheck(str, i, j + 1);
    }

    public static void main(String[] args) {
        String str = "hello";
        repeatCheck(str, 0, 1);
    }
}



/*
public class RepeatedChar{
    public static void repeatCheck(String str){
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					System.out.print(str.charAt(i)+" ");
					break;
				}
			}
		}
	
	}

    public static void main(String[] args) {
        String str = "hello";
		repeatCheck(str);
    }
}
*/