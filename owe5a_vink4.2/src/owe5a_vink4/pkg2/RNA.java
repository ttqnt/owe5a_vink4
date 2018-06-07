package owe5a_vink4.pkg2;

/**
 *
 * @author karin
 */

public class RNA extends Sequentie {
	private static int counterRNA = 0;
	
	//constructor
	RNA(String input){
		setSequentie(input);
	}
	
	public void setSequentie(String r){
		if (r.matches("[AUCG]+")){
			ntSeq = r;
			++counterRNA;
		} else{
			System.out.println("De sequentie bevat onjuiste tekens");
		}
	}
	
	public static int getCount(){
		return counterRNA;
	}



}
