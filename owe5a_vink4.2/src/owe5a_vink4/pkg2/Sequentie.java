package owe5a_vink4.pkg2;

/**
 *
 * @author karin
 */

public class Sequentie {
	protected String ntSeq;
	
	public void setSequentie(String input){
	}
	
	public String getSequentie(){
		System.out.println(ntSeq);
		return ntSeq;
	}

	public static void main(String[] args) {
		RNA rna1 = new RNA("AUGAUGG");
		RNA rna2 = new RNA("ATGATGG");
		RNA rna3 = new RNA("AACUUUCGG");
		
		DNA dna1 = new DNA("CTGACCA");
		DNA dna2 = new DNA("AGGCATCCCGA");
		DNA dna3 = new DNA("TTCAGAACGCA");
		DNA dna4 = new DNA("ABCDEFG");
		
		System.out.println(" \nEr zijn " + RNA.getCount() + " RNA objecten met een geldige sequentie.");
		System.out.println("Er zijn " + DNA.getCount() + " DNA objecten met een geldige sequentie\n");
		
		rna1.getSequentie();
		dna3.getSequentie();
		dna4.getSequentie();
		
		rna2.setSequentie("UCGGUACG");
		
		System.out.println(" \nEr zijn " + RNA.getCount() + " RNA objecten met een geldige sequentie.");
		
	}

}

