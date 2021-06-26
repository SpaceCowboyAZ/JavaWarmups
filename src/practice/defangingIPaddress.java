package practice;

public class defangingIPaddress {

	
		  public String defangIPaddr(String address) {
		        String temp = address.replace(".", "[.]");
		return temp;
		    }

	}


