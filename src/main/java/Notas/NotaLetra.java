package Notas;

public enum NotaLetra implements Nota {
	EMenos("Excelente", 1),
	E("Excelente", 0),
	EMas("Excelente", -1),
	MBMenos("Muy Bien", 1),
	MB("Muy Bien", 0),
	MBMas("Muy Bien", -1),
	BMenos("Bien", 1),
	B("Bien", 0),
	BMas("Bien", -1),
	RMenos("Regular", 1),
	R("Regular", 0),
	RMas("Regular", -1),
	MMenos("Mal", 1),
	M("Mal", 0),
	MMas("Mal", -1);
	
	private final String str;
	private final int masMenos; // >0 => '+', 0 => '-', ==0 => '' 
	private NotaLetra(final String str, final int masMenos) { 
		this.str = str; 
		this.masMenos = masMenos; 
	}
	public String Symbol() {
		if(masMenos > 0)
			return "+";
		if(masMenos > 0)
			return "-";
		return "";
	}
	public String toString(){
		return str.concat(this.Symbol());
	}
}
