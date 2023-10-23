package tp42;

public class Employe extends Salarie {
	
	private double Hsupp;
	private double PHsupp ;
	
	Employe (int mat,  String nom,double rec,double Hsupp , double PHsupp){
		super(mat,nom,rec);
		this.Hsupp = Hsupp ;
		this.PHsupp =PHsupp ;
	}
	
	double getHsupp() {
		return this.Hsupp;
	}
	double getPHsupp() {
		return this.PHsupp;
	}
	
	void affiche() {
		System.out.println(this.getClass().getSimpleName()); //this.getClass().getSimpleName()
		super.affiche();
		System.out.println("Hsupp = "+this.Hsupp+" PHsupp = "+this.PHsupp);
	}
	
	double Salaire () {
		return super.Salaire()+this.Hsupp*this.PHsupp ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employe e = new Employe(2,4,555,"dali",2000);
		//e.affiche();
		//System.out.println(e.Salaire());

	}

}
