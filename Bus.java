package autobus;

public class Bus {
	
	private int linea;
	private int parada;
	private int total_paradas;
	
	private int pasajeros;
	private int max_pasajeros;
	
	private boolean parado;

	public Bus(int linea, int total_paradas, int max_pasajeros) {
		this.linea=linea;
		this.total_paradas=total_paradas;
		this.max_pasajeros=max_pasajeros;
		this.parado=true;
	}
	
	void avanzar() {
		if (parada<total_paradas) {
			parado=false;
			parada++;
			System.out.println("El autobus va a la parada " + parada + ".");
			return;
		}
		System.out.println("El autobus está en la última parada, no puede avanzar.");
	}
	
	void parar() {
		if (parado) {
			System.out.println("El autobus ya está parado.");
			return;
		}
		parado=true;
		System.out.println("El autobus se ha parado.");
	}
	
	void seleccionarParada(int parada) {
		if(parado){
			
			if(parada>0&&parada<=total_paradas){
				this.parada=parada;
				System.out.println("El autobus está parado en la parada " + parada + ".");
				
			}else{
				System.out.println("La parada " + parada + " no existe.");
			}
		}else{
			System.out.println("El autobus aún no está parado, no se puede seleccionar la parada " + parada + ".");
		}
	}
	
	boolean lleno() {
		if (pasajeros<max_pasajeros) {
			return false;
		}
		return true;
	}
	
	void subirPasajero() {
		if(!lleno()){
			
			if(parado){
				pasajeros++;
				System.out.println("Se ha subido un pasajero. Hay " + pasajeros + " pasajero(s).");
				
			}else{
				System.out.println("El autobus está en marcha, no podemos subir un pasajero.");
			}
			
		}else{
			System.out.println("El autobus está lleno, no caben más pasajeros.");
		}
	}
	
	public void bajarPasajero() {
		if(this.pasajeros>0){
			
			if(this.parado){
				this.pasajeros--;
				System.out.println("Se ha bajado un pasajero. Hay " + pasajeros + ".");
				
			}else{
				System.out.println("No se puede bajar ningun pasajero con el autobus en marcha.");
			}
			
		}else{
			System.out.println("No se puede bajar ningun pasajero, porque el autobus está vacio.");
		}
	}
	
	String mostrarEstado() {
		if (parado) {
			return "La línea " + linea + " se encuentra en la parada " + parada + " con " + pasajeros + " pasajeros.";
		}else {
			return "La línea " + linea + " ha salido de la parada " + parada + " y se dirige a la parada " + (parada+1) + " con " + pasajeros + " pasajeros.";
		}
	}

}
