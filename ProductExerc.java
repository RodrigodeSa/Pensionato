package entitiesExerc;

public class ProductExerc {
	
	private String name;
	private String email;
	private int quarto;
	private int aluguel;
	
	public ProductExerc() {
		
	}
	
	public ProductExerc(String name, String email, int quarto, int aluguel) {
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	    this.aluguel = aluguel;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public int getAluguel() {
		return aluguel;
	}
	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}
	
	
}
