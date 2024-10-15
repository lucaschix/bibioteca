public class Main {
    public static void main(String[] args) {
        // Creamos biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("Biblioteca municipal");

        // Crear Categoria
        Categoria Manga = new Categoria("Manga", "Coleccion de mangas japoneses (monos chinos)");
        biblioteca.getCategorias().add(Manga);

        // Poner un libro
        Libro libro1 = new Libro("Slam Dunk", "Takehiko Inoue", 1233, 1997, Manga);
        biblioteca.agregarLibro(libro1);

        // Modificar libro
        biblioteca.modificarLibro(libro1, "Las Aventuras de Hanamichi Sakuragi", "Miyamoto Musashi" , 3312);

        // Eliminar libro
        biblioteca.eliminarLibro(libro1);

        // Creamos a un empleado
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("ElectricBoom");
        empleado1.setIdentificacion("3312");
        empleado1.setCargo("Organizador");
        biblioteca.getEmpleados().add(empleado1);

        // Modificar empleado
        empleado1.setNombre("Mehdi Sadaghdar");
        empleado1.setIdentificacion("1233");
        empleado1.setCargo("Portero");

        // Eliminar empleado
        biblioteca.eliminar_empleado(empleado1);


        // Creamos un prestamo
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setFecha_prestamo(1996);
        prestamo1.setFecha_entrega(2026);
        prestamo1.setLibro(libro1);
        prestamo1.setUsuario(new Usuario("Shrek", "22815678722"));

        // Creamos una multa
        Multa multa1 = new Multa(20000, prestamo1, 2000, "No pagada");
        multa1.pagarMulta();

        //Eliminamos la multa una vez pagada
        multa1.eliminar_multa();
    }
}