package Empleado;

public class Empleado {

	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private double tipoIRPF;
	private String casado;
	private int hijo;
	private  static double importeHoraExtra;
	
	public Empleado() {
		
	}
	
	public Empleado(String nif) {
		this.nif=nif;
	}

	public Empleado(String nif, String nombre, double sueldoBase, int horasExtra,double tipoIRPF, String casado, int hijo) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtra = horasExtra;
		this.tipoIRPF=tipoIRPF;
		this.casado = casado;
		this.hijo = hijo;
	}

	
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public String getCasado() {
		return casado;
	}

	public void setCasado(String casado) {
		this.casado = casado;
	}

	public int getHijo() {
		return hijo;
	}

	public void setHijo(int hijo) {
		this.hijo = hijo;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}
	
	

	public double complementoHoraExtra() {
		double aux;
		
		aux=horasExtra*importeHoraExtra;	
		return aux;
	}
	
	public double sueldoBruto() {
		double sBruto;
		
		sBruto=sueldoBase+complementoHoraExtra();
		return sBruto;
	}
	
	public double calcularRetencionIrpf(){
        double tipo = tipoIRPF;
        if(casado == "s" || casado == "S") {
            tipo = tipo - 2; //2 puntos menos si está casado
        }
        tipo = tipo - hijo; //un punto menos por cada hijo                                                 
        if(tipo<0){
            tipo = 0;
        }
        return sueldoBruto() * tipo / 100;
    }

	@Override
	public String toString() {
		return nif+nombre+"\n"+
				"Sueldo base:  "+sueldoBase+"\n"+
				"Hora Extras:  "+horasExtra+"\n"+
				"Tipo IRPF:  "+tipoIRPF+"\n"+
				"Cadado:  "+casado+"\n"+
				"Numero hijo:  "+hijo;
	}
	
	
	
}
