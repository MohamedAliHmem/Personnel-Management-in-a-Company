package tp42;

public class Entreprise {

	public static void main(String[] args) {
		Salarie [] tabSalarie = new Salarie[5];
		tabSalarie[0] = new Employe(12345,"Walid",2002,15,4);
		tabSalarie[1] = new Vendeur(23445,"Yessine",2007,1000,0.1);
		tabSalarie[2] = new Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3] = new Employe(87698,"Aymen ",2003,19,5);
		tabSalarie[4] = new Employe(12345,"Khaled",2008,7,4);
		for (int i=0;i<tabSalarie.length;i++) {
			if(tabSalarie[i] instanceof Employe) {
				tabSalarie[i].affiche();
			}
		}
		
		for (int i=0;i<tabSalarie.length;i++) {
			if(tabSalarie[i] instanceof Vendeur) {
				tabSalarie[i].affiche();
			}
		}
		Salarie s = tabSalarie[0];
		for (int i=1;i<tabSalarie.length;i++) {
			
			if(s.getRecrutement() > tabSalarie[i].getRecrutement()){
				s=tabSalarie[i];
			}
		}
		System.out.println("Nom: "+s.getNom()+" recrute en l'an "+s.getRecrutement());
		
		
		
		Salarie s1 =null;
		for (int i=0;i<tabSalarie.length;i++) {
			if (tabSalarie[i] instanceof Vendeur) {
				if(s1==null) {
					s1 = tabSalarie[i];
				}else if(s1.Salaire()<tabSalarie[i].Salaire()) {
						s1 = tabSalarie[i];
					}
			}
		}
		if(s1!=null) {
			System.out.println("Matricule="+ s1.getMatricule() +"de salaire= "+s1.Salaire()+" Dt");
		}else {
			System.out.println("desole");
		}

	}

}
