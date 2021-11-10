/**
 * 
 */
package modele;

/**
 * @author Gilles Cédric
 * @since 10/11/2021
 * @see https://moodle3.esaip.org/mod/resource/view.php?id=36274
 *
 */
public class Quartier {
	public static final String[] TYPE_QUARTIER = {"RELIGIEUX","MILITAIRE","NOBLE","COMERCANT","MERVEILLE"};
	private String nom;
	private String type;
	private int coutConstruction;
	private String caracteristiques;
	
	public Quartier(String nom, String type, int coutConstruction, String caracteristiques) {
		super();
		this.setNom(nom);
		this.setType(type);
		this.setCoutConstruction(coutConstruction);
		this.setCaracteristiques(caracteristiques);
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		for (int i = 0; i < TYPE_QUARTIER.length; i++) {
			if(TYPE_QUARTIER[i].equals(type))
				this.type = type;
		}
		this.type = "";
	}
	
	public int getCoutConstruction() {
		return coutConstruction;
	}
	
	public void setCoutConstruction(int coutConstruction) {
		if(coutConstruction >= 1 && coutConstruction <= 6)
			this.coutConstruction = coutConstruction;
		else
			this.coutConstruction = 0;
	}

	public String getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	
}
