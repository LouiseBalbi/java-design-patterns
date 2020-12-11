package fr.diginamic.composite;

public class TestComposite {
	
	public static void main(String[] args) {
		
		Service dsin = new Service("dsin");
		Service bigData = new Service("bigData");
		Service javaDev = new Service("javaDev");
		
		Employe directeur = new Employe("Raspey", "Cécile", 10000);
		Employe architecte = new Employe("Bechkar", "Bilel", 8000);
		dsin.getList().add(directeur);
		dsin.getList().add(architecte);
		dsin.getList().add(bigData);
		dsin.getList().add(javaDev);
		
		Employe chefDeService = new Employe("Rammey", "JB", 7500);
		Employe concepteur = new Employe("Doe", "Jane", 3500);
		bigData.getList().add(chefDeService);
		bigData.getList().add(concepteur);
				
		Employe chefDeServiceJava = new Employe("Guineau", "Kevin", 7500);
		Employe leadDev = new Employe("Martin", "Paul", 3500);
		javaDev.getList().add(chefDeServiceJava);
		javaDev.getList().add(leadDev);
		
		System.out.println(dsin.toString());
		System.out.println(dsin.calculerSalaire());
	
	}
	



}
