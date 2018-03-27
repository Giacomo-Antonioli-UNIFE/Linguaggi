import java.util.LinkedList;
import java.util.List;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public abstract class Squadra {

		protected int Partevinte, Partiteperse,Codice;
		protected String Nome,Sport;
		protected List<Giocatore> Membri = new LinkedList<Giocatore>();
	


	public Squadra(int Partitevinte,int Partiteperse,int Codice,String Nome,String Sport)
	{
		this.Partevinte=Partitevinte;
		this.Partiteperse=Partiteperse;
		this.Codice=Codice;
		this.Nome=Nome;
		this.Sport=Sport;
	}
	/**
	 * @return the membri
	 */
	public List<Giocatore> getMembri() {
		return Membri;
	}

	/**
	 * @param membri the membri to set
	 */
	public void setMembri(Giocatore Elemento) {
		Membri.add(Elemento);
	}

	/**
	 * @return the partevinte
	 */
	public int getPartevinte() {
		return Partevinte;
	}

	/**
	 * @param partevinte the partevinte to set
	 */
	public void setPartevinte(int partevinte) {
		Partevinte = partevinte;
	}

	/**
	 * @return the partiteperse
	 */
	public int getPartiteperse() {
		return Partiteperse;
	}

	/**
	 * @param partiteperse the partiteperse to set
	 */
	public void setPartiteperse(int partiteperse) {
		Partiteperse = partiteperse;
	}

	/**
	 * @return the codice
	 */
	public int getCodice() {
		return Codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(int codice) {
		Codice = codice;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the sport
	 */
	public String getSport() {
		return Sport;
	}

	/**
	 * @param sport the sport to set
	 */
	public void setSport(String sport) {
		Sport = sport;
	}
	
	
}
