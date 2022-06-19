package Ejercicio9;

public class CallPersona {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdade(20);
        cliente.setNombre("Juan");
        cliente.setTelefono("123456789");
        cliente.setCredito(1000);

        Trabajador trabajador = new Trabajador();
        trabajador.setEdade(30);
        trabajador.setNombre("Pedro");
        trabajador.setTelefono("987654321");
        trabajador.setSalario(1000);

        System.out.println("Edad: " + cliente.getEdade());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        System.out.println("========================");

        System.out.println("Edad: " + trabajador.getEdade());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());


    }
}
