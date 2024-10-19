package hotel_transilvania;

public class Reserva extends habitacion{
	public int numero_reserva;
	public int noches;
	public Reserva(int num_habitacion, boolean disponibilidad, int camas, int piso, int numero_reserva, int noches) {
		super(num_habitacion, disponibilidad, camas, piso);
		this.numero_reserva = numero_reserva;
		this.noches = noches;
	}
	public int getNumero_reserva() {
		return numero_reserva;
	}
	public void setNumero_reserva(int numero_reserva) {
		this.numero_reserva = numero_reserva;
	}
	public int getNoches() {
		return noches;
	}
	public void setNoches(int noches) {
		this.noches = noches;
	}
	
	// clase interna, registro entrada
	class check_in{
		public String fecha_checkin;
		public String hora_checkin;
		public check_in(String fecha_checkin, String hora_checkin) {
			super();
			this.fecha_checkin = fecha_checkin;
			this.hora_checkin = hora_checkin;
		}
		
	
	}
	// clase interna, registro salida
	class check_out{
		public String fecha_checkout;
		public String hora_checkout;
		public check_out(String fecha_checkout, String hora_checkout) {
			super();
			this.fecha_checkout = fecha_checkout;
			this.hora_checkout = hora_checkout;
		}
		
	}
}
