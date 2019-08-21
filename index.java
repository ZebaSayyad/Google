public static void main(String[] args) {

		System.out.println(countXX("abcxx")) ;
		//countXX("xxx") → 2
		//countXX("xxxx") → 3

	}
	     static int countXX(String str) {
		  
	   
	    	 
	    	 int count = 0;
	    	 for(int i=0;i<str.length();i++)
	    	 {
	    	      if(str.contains("x")) {
	    	    	  count=count+i;
	    	      }
	    	      }
			return count;
	}

