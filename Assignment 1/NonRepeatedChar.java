public class NonRepeatedChar{
    public static void nonRepeatCheck(String str){
		for(int i=0; i<str.length(); i++){
			boolean isRepeated = false;
			for(int j=0; j<str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					isRepeated = true;
					break;
				}
			}
			if(!isRepeated){
				System.out.println(str.charAt(i));
				return;
			}
		}
		System.out.print("null");
	
	}

    public static void main(String[] args) {
        String str = "aabb";
		nonRepeatCheck(str);
    }
}
