package org.lang;

public class StateDetails {
	private void southIndia() {
		
		System.out.println("southIndia : Tamil");
	}
	private void northIndia() {
		System.out.println("northIndia : Hindi");

	}
	public static void main(String[] args) {
		StateDetails sd = new StateDetails();
		sd.southIndia();
		sd.northIndia();
		LanguageInfo li = new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
	}
}
