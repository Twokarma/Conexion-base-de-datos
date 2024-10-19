package hotel_transilvania_persona;

public class Personal extends persona {
	public String puesto;
	public double salario_min;
	public int num_social;
	public Personal(String nombre, String apellido, int ci, int num_celular, String puesto, double salario_min,
			int num_social) {
		super(nombre, apellido, ci, num_celular);
		this.puesto = puesto;
		this.salario_min = salario_min;
		this.num_social = num_social;
	}
	public Personal(String nombre, String apellido, int ci, int num_celular) {
		super(nombre, apellido, ci, num_celular);
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario_min() {
		return salario_min;
	}
	public void setSalario_min(double salario_min) {
		this.salario_min = salario_min;
	}
	public int getNum_social() {
		return num_social;
	}
	public void setNum_social(int num_social) {
		this.num_social = num_social;
	}
	
}
