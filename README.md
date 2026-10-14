# Sistema de Gestión de Biblioteca (Java + JavaFX)

Versión con interfaz gráfica de escritorio de un sistema de biblioteca, hecha como práctica de Programación Orientada a Objetos. Muestra los libros en una tabla y permite registrar préstamos y devoluciones desde la ventana.

La versión por consola está en: https://github.com/borsattofede-2004/sistema-biblioteca-java


## Conceptos aplicados

- **Herencia**: `Socio` y `Bibliotecario` heredan de `Persona`.
- **Agregación**: `Biblioteca` contiene colecciones de `Libro` y `Socio`.
- **Asociación**: `Prestamo` vincula un `Socio` con un `Libro`, con fecha de préstamo y devolución.
- **Encapsulamiento y constructores**: atributos privados con getters y setters.
- **Colecciones**: `ArrayList` y recorridos con `for-each`.
- **Interfaz gráfica**: JavaFX con FXML, separando la vista (`biblioteca-view.fxml`) de la lógica (`BibliotecaController`).

## Clases del proyecto

| Clase / archivo | Descripción |
|---|---|
| `Persona` | Clase base con nombre y DNI. |
| `Socio` | Hereda de `Persona`. Quien pide libros prestados. |
| `Bibliotecario` | Hereda de `Persona`. Personal de la biblioteca. |
| `Libro` | Título, autor, ISBN y disponibilidad. |
| `Prestamo` | Vincula un `Socio` con un `Libro`. |
| `Biblioteca` | Administra libros, socios y préstamos. |
| `BibliotecaApp` | Arranca la aplicación y carga la vista. |
| `BibliotecaController` | Maneja la tabla, los campos de texto y los botones. |
| `biblioteca-view.fxml` | Diseño de la pantalla. |

## Funcionalidades

- Ver los libros en una tabla con su disponibilidad
- Prestar un libro indicando ISBN, socio y fecha
- Devolver un libro indicando ISBN y fecha

## Cómo ejecutarlo

Requisitos: JDK 21 y Maven (o IntelliJ IDEA).

1. Clonar el repositorio.
2. Abrirlo en IntelliJ IDEA y esperar a que Maven descargue las dependencias.
3. Ejecutar con Maven, desde la terminal del proyecto:

```
mvn clean javafx:run
```

También se puede ejecutar desde el panel de Maven de IntelliJ: Plugins > javafx > `javafx:run`.

## Contexto

Proyecto de práctica personal, basado en los conceptos de POO y UML del libro *Fundamentos de Programación* de Luis Joyanes Aguilar.
