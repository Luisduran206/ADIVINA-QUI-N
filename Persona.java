import java.util.Random;
public class Persona {

	private String[] names = {"Nemo", "Gru", "Dory", "Blanca Nieves", "Aladdín", "Mike Wasaousky", "Sullyvan", "Elias", "Ralph El Demoledor", "Manny a la obra"};
	private String name;
	private boolean lenguaVerde;
	private boolean cabelloAfro;
	private boolean alasDeAngel;
	private boolean colaDeBurro;
	
	Random random = new Random();
	int numeroRandom = random.nextInt();
	boolean booleanoRandom1 = random.nextBoolean();
	boolean booleanoRandom2 = random.nextBoolean();
	boolean booleanoRandom3 = random.nextBoolean();
	boolean booleanoRandom4 = random.nextBoolean();
	
	public Persona() {
		this.lenguaVerde = booleanoRandom1;
		this.cabelloAfro = booleanoRandom2;
		this.alasDeAngel = booleanoRandom3;
		this.colaDeBurro = booleanoRandom4;
	}

	public void setNombre(String name) {
		this.name = name;
	}
	
	public String getNombre() {
		return name;
	}
	
	public boolean getLenguaVerde() {
		return lenguaVerde;
	}
	
	public boolean getCabelloAfro() {
		return cabelloAfro;
	}
	
	public boolean getAlasDeAngel() {
		return alasDeAngel;
	}
	
	public boolean getColaDeBurro() {
		return colaDeBurro;
	}

}
