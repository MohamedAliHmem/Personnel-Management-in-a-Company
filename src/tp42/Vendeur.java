package tp42;

public class Vendeur extends Salarie{
	private double Vente ;
	private double Pourcentage ;
	
	Vendeur (int mat,  String nom,double rec,double v , double p){
		super(mat,nom,rec);
		this.Pourcentage = p;
		this.Vente = v ;
	}
	
	double getVente() {
		return this.Vente;
	}
	double getPourcentage() {
		return this.Pourcentage;
	}
	void setVente(double v) {
		this.Vente = v ;
	}
	void setPourcentage(double p) {
		this.Pourcentage = p ;
	}
	
	void affiche() {
		System.out.println(this.getClass().getSimpleName());
		super.affiche();
		System.out.println("Vente = "+this.Vente+" Pourcentage = "+this.Pourcentage);
	}
	
	double Salaire() {
		return super.Salaire()+this.Vente*this.Pourcentage ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vendeur v = new Vendeur(4,8,44,"dali",2000);
		//System.out.println(v.Salaire()); 
	}

}
