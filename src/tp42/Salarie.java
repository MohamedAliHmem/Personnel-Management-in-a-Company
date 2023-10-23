package tp42;

public class Salarie {
	private int Matricule ;
	private String Nom ;
	private double Recrutement ;
	
	Salarie(int mat , String nom , double rec){
		this.Matricule = mat ;
		this.Nom = nom ;
		this.Recrutement = rec ;
	}
	
	int getMatricule() {
		return this.Matricule;
	}
	
	String getNom() {
		return this.Nom ;
	}
	
	double getRecrutement() {
		return this.Recrutement ;
	}
	
	void setMatricule (int mat) {
		this.Matricule = mat ;
	}
	
	void setNom(String nom) {
		this.Nom = nom ;
	}
	
	void setRecrutement(double rec) {
		this.Recrutement = rec ;
	}
	

	void affiche() {
		System.out.println(" [Matricule=" + Matricule + ", Nom=" + Nom + ", Recrutement=" + Recrutement + "]");
	}
	
	double Salaire () {
		if (this.Recrutement <2005) {
			return 400 ;
		}else {
			return 280 ;
		}
	}

public static void main (String [] args) {
	//System.out.println(Salaire(2000));
	Salarie s = new Salarie(444,"hello",2003);
	s.affiche();
}
}
