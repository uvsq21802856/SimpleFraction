
public class Fraction {

	int nominateur;
	int denominateur;
	public Fraction (int nominateur,int denominateur)
	{
		this.nominateur=nominateur;
		this.denominateur=denominateur;
	}
	
	public void toString(int nominateur,int denominateur)
	{
		System.out.println("lafraction est " + this.nominateur + "/" + this.denominateur);
	}
}