package autobus;

public class PruebaBus {

	public static void main(String[] args) {

		Bus b=new Bus(32, 20, 50);
		
		System.out.println(b.mostrarEstado());
		b.seleccionarParada(45);
		b.seleccionarParada(1);
		b.avanzar();
		b.subirPasajero();
		System.out.println(b.mostrarEstado());
		b.parar();
		b.subirPasajero();
		for (int i=1; i<=50; i++) {
			b.subirPasajero();
		}
		b.avanzar();
		System.out.println(b.mostrarEstado());
		b.bajarPasajero();
		b.parar();
		b.bajarPasajero();
		System.out.println(b.mostrarEstado());
		for (int i=1; i<=50; i++) {
			b.bajarPasajero();
		}
		b.seleccionarParada(20);
		System.out.println(b.mostrarEstado());
		b.avanzar();
	}

}
