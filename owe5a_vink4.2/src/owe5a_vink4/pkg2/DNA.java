package owe5a_vink4.pkg2;

/**
 *
 * @author karin
 */

public class DNA extends Sequentie{
	private static int counterDNA = 0;

	//constructor	
	DNA(String input) {
		setSequentie(input);
	}

	public void setSequentie(String d){
		if (d.matches("[ATCG]+")){
			ntSeq = d;
			++counterDNA;
		} else{
			System.out.println("De sequentie bevat onjuiste tekens");
		}
	}
	
	
	public static int getCount(){
		return counterDNA;
	}
	

}