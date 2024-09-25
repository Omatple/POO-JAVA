  * Ángel Martínez Otero - 2023/2024
  * Simulación de Gestión de Pen Drives y Modelado de Personas y Personajes | Desarrollo de Aplicaciones Web (1ºDAW)

  * Este proyecto tiene dos grandes módulos: Gestión de Pen Drives y Modelado de Personas y Personajes. En la segunda parte, se aborda tanto la creación de personas como personajes, permitiendo diferenciar entre entidades humanas y personajes de ficción o de juegos.

  * 1. Gestión de Pen Drives:
    - El primer módulo simula la administración de pen drives a través de la clase PenDrive, que permite crear y manipular unidades de almacenamiento con distintas capacidades. Las operaciones sobre el pen drive incluyen escribir, borrar y leer datos, todo ello con un manejo robusto de errores a través de excepciones personalizadas como OperationNotSupportedException.

  * 2. Modelado de Personas:
    - El segundo módulo introduce la clase Persona como base, para representar a un ser humano con atributos personales (nombre, DNI, fecha de nacimiento, etc.) y de contacto (dirección, teléfono, email). Este módulo se refactoriza para mejorar la modularidad y reusabilidad a través de clases separadas como DatosPersonales y DatosContacto.

  * 3. Modelado de Personajes:
    - Además del modelo básico de Persona, el proyecto explora el concepto de personajes con la clase Personaje, que incluye atributos adicionales como la energía, el color, y la posición en un espacio bidimensional (2D). Los personajes pueden moverse, chocar, charlar y perder o ganar energía, integrando funcionalidades específicas para un entorno dinámico.
   
  * Este proyecto en Java utiliza principios de programación orientada a objetos, como la herencia y el polimorfismo, para modelar no solo personas, sino también personajes más complejos en un entorno interactivo. Además, se refuerza el uso de excepciones para garantizar que las operaciones sobre estos objetos se realicen de manera segura.
