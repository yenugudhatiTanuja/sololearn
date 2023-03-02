package sololearn;

public class DistPro {
		public static void printDistinctCharacters(char[] arr){

	        for(int i=0;i<arr.length;i++){
	            boolean isDistinct = false;
	            for(int j=0;j<i;j++){
	                if(arr[i] == arr[j]){
	                    isDistinct = true;
	                    break;
	                }
	            }
	            if(!isDistinct){
	                System.out.print(arr[i]+" ");
	            }
	        }
	    }

	    public static void main(String a[]){

	        char[] chars = {'a','c','c','d','e','e','f'};
	        DistPro.printDistinctCharacters(chars);
	}

}
