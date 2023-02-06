package week1.day1;

public class ForLoopCondition {
       
	    public static void main(String[] args) {
			 
	    	System.out.println("1");
	    	System.out.println("2");
	    	System.out.println("3");
	    	System.out.println("4");
	    	System.out.println("5");
	    	System.out.println("6");
	    	System.out.println("***************");
	    	System.out.println("1");
	    	System.out.println("1");
	    	System.out.println("1");
	    	System.out.println("1");
	    	System.out.println("1");
	    	System.out.println("1");
	    	System.out.println("****************");
	    	
	    	//forLoop   
	    	
	    	
	    	for (int i = 0; i <= 12; i++) {
	    		//i++ = i+1
	    		//i=9 Condition 9<=12 print i=9 (true) i++ --> i=10
	    		//i=10  10<=12 (true) print i=10  i++ --> i=11
				//i=11  11<=12 (true) print i=11  i++ --> i=12
	    		//i=12  12<=12 (true) print i=9  i++ --> i=13
	    		//i=13  13<=12 (false) print i=13  out of the for Loop
	    	
	    
	    		
	    		System.out.println(i);
			}
		}
}
