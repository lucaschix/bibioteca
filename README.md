Enunciado del Modelado UML - Gestión de Biblioteca
En este ejercicio, se debe crear un modelo UML en Visual Paradigm para representar un
sistema de gestión de una biblioteca. El modelado debe incluir al menos las siguientes
clases y sus relaciones:
Clases
1. Libro
○ Atributos: título, autor, ISBN, año de publicación.
2. Biblioteca
○ Atributos: nombre, dirección.
3. Usuario
○ Atributos: nombre, identificación.
4. Préstamo
○ Atributos: fecha de préstamo, fecha de devolución.
5. Categoría
○ Atributos: nombre, descripción.
6. Empleado
○ Atributos: nombre, identificación, cargo.
7. Multa
○ Atributos: monto, fecha de generación, estado (pagada/no pagada).
Relaciones
1. Un Libro puede estar en varias Bibliotecas, y una Biblioteca puede tener varios
Libros.
2. Un Usuario puede realizar varios Préstamos, pero un Préstamo está asociado a un
solo Usuario.
3. Un Préstamo depende de la existencia de un Libro en la Biblioteca para poder
realizarse.
4. Cada Libro pertenece a una Categoría, y una Categoría puede contener varios
Libros.
5. Una Biblioteca emplea a varios Empleados, y cada Empleado trabaja en una sola
Biblioteca.
6. Un Usuario puede generar varias Multas, y cada Multa está asociada a un solo
Préstamo.
Funcionalidades
Además de modelar las clases y relaciones indicadas, el sistema de gestión de la biblioteca
debe implementar las siguientes funcionalidades:
1. Gestión de Libros: La biblioteca debe poder agregar, modificar y eliminar Libros en
su inventario.
2. Préstamos de Libros: El sistema debe permitir a los Usuarios realizar Préstamos
de Libros. Cada Préstamo debe estar vinculado a un Libro disponible en la
Biblioteca.
3. Gestión de Multas: El sistema debe generar Multas cuando un Usuario no
devuelve un Libro a tiempo. Las Multas deben ser gestionadas, permitiendo ser
pagadas o eliminadas una vez resueltas.
4. Gestión de Empleados: La Biblioteca debe poder administrar su personal,
permitiendo agregar, modificar y eliminar Empleados.
5. Categorías de Libros: Los Libros deben estar organizados por Categorías, y la
biblioteca debe gestionar la creación, edición y eliminación de estas Categorías.
Reglas
● Se deben utilizar las relaciones entre las clases (dependencia, asociación,
agregación o composición) según el contexto de la relación.
● Se debe etiquetar las relaciones indicando las multiplicidades correspondientes (por
ejemplo, 1..*, 0..1)
