# Taller Diseño Avanzo de Clases
Taller Progreso 3 - Programación 2 
##### Integrantes 
- Sebastian Ruiz 
- Andres Sigcha

#### Descripcion Actividad
En esta actividad deberemos simular un sistema de entidades de Minecraft aplicando los principios de la programación orientada a objetos. Debemos crear una interfaz que defina el comportamiento general de las entidades, una clase abstracta con atributos y métodos comunes y clases hijas como: 
- Jugador 
- Zombi
- Aldeano

Implementando su propio comportamiento. Con esto aplicaremos conceptos como interfaces, herencia y métodos abstractos para modelar objetos con características y acciones específicas.

#### Interfaz EntidadMinecraft

Primero creamos una interfaz EntidadMinecraft,le pusimos void aparecer, void interactuar y String obtenerTipo, para que los personajes del juego tengan una estructura en común, aunque cada uno haga cosas distintas.
Es una interfaz que define que métodos deben tener las entidades del juego, también nos sirve para organizar y unificar el comportamiento básico de personajes distintos y permite usar el mismo código para manejar muchas clases diferentes siempre y cuando se implemente esta interfaz.

![image](https://github.com/user-attachments/assets/348d4c4e-36a9-404c-bb53-e637a3f2a131)
