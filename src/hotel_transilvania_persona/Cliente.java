package hotel_transilvania_persona;

public class Cliente extends persona{
	public String correo;
	public int num_cliente; //valores de ci y celular
	public Cliente(String nombre, String apellido, int ci, int num_celular, String correo, String historial,int num_cliente) {
		super(nombre, apellido, ci, num_celular);
		this.correo = correo;
		
		this.num_cliente = num_cliente;
	}
	
	public Cliente(String nombre, String apellido, int ci, int num_celular) {
		super(nombre, apellido, ci, num_celular);
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNum_cliente() {
		return num_cliente;
	}
	public void setNum_cliente(int num_cliente) {
		this.num_cliente = num_cliente;
	}
	
	public void historial_cliente() {
		
	}

}
