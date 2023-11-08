import java.text.Normalizer;

public class Personne{
	
	private String nom;
	private String prenom;
	private String login;
	
	public Personne(String unNom, String unPrenom){
		
		this.nom = unNom;
		this.prenom = unPrenom;
		this.login = creerLogin();
	}
	
	private String creerLogin(){
		
		char p = this.prenom.charAt(0);
		String res = p+this.nom;
		
		System.out.println(res);
		
		if(getTailleLogin(res)>6) {
			
			res = res.substring(0,6);
			
		}
		
		
		res = Normalizer.normalize(res, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		
		System.out.println(res.toLowerCase());
		
		this.login = res;
		return res.toLowerCase();
		
	}
	
	public String getLogin(){
		
		return this.login;
	
	}
	
	int getTailleLogin(String unLogin) {
		return unLogin.length();
	}
	
	public String toString(){
		
		return ("Nom : " + this.nom + " Prenom : " + this.prenom + " Login : " + this.login);
	
	}
}