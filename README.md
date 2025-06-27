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

#### Clase EntidadBase
Es una clase abstracta que implementa la interfaz **EntidadMinecraft**. Lo que hace es definir una entidad con nombre y salud. 
Esta clase nos sirve para que otras clases hereden de ella que son **jugador**, **zombie** y **aldeano**. Se usa un contructor para asignar el nombre y la salud. Implementando los metodos:
- aparecer (que imprime un mensaje cuando aparece la entidad)
- obtenerTipo (que devuelve el tipo de entidad).

Tambien tiene un metodo **abstracto** llamado **interacturar** que cada subclase debera definir.

![Imagen de WhatsApp 2025-06-27 a las 16 45 37_1afdab04](https://github.com/user-attachments/assets/1f166358-d64a-4111-884f-21dc26b143fc)

#### Clase Jugador 

Es una clase que hereda de la clase abstracta **EntidadBase**. Lo que hace es representar a un jugador con un nombre, salud y un inventario con objetos. Esta clase redefine el método interactuar, donde el jugador salta y saluda, y también el método obtenerTipo para devolver “Jugador”.

Se usa un constructor para asignar el nombre, la salud y crear un inventario inicial con objetos como espada, pico y comida. Tambien tenemos un método **mostrarInventario** que imprime los objetos que tiene el jugador.

Esta clase nos sirve para crear jugadores específicos con características y comportamientos propios dentro del sistema de entidades.

![Imagen de WhatsApp 2025-06-27 a las 16 46 06_03b9b5ad](https://github.com/user-attachments/assets/0dc9ff23-4486-44b7-bb7b-bc59c7241360)

#### Clase Zombie
Es una clase que Hereda de la clase abstracta **EntidadBase**, representando a un zombie con nombre, salud, nivel de agresividad y definir que es hostil por defecto, aqui tambien redefine el metodo **interactuar** para que el zombie ataque. 
Sobreescribe **obtenerTipo** para devolver ""Zombi" y incluye un metodo para saber si es hostil. 

Esta clase nos sirve para crear zombis con comportamiento agresivo y propio dentro del sistema de entidades. 

![Imagen de WhatsApp 2025-06-27 a las 16 46 50_a15ebba2](https://github.com/user-attachments/assets/777d20c8-eff8-4141-af9b-c5531f1366b3)

