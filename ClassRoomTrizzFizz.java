package week1.day1;

public class ClassRoomTrizzFizz {

	public static void main(String[] args) {
		
		    int number = 20;
		    
		    if (number % 3 == 0 && number % 5 == 0) {
		    	System.out.println("TRIZZ-FIZZ");
		    }else if (number % 5 == 0) {
		    	System.out.println("FIZZ");
		    }else if (number % 3 == 0){
		    	System.out.println("TRIZZ");
		    }else
		    	System.out.println("Neither Divisible by 3 nor 5");
		    
	
	}

}
