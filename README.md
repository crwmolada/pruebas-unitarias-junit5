# Proyecto de Pruebas Unitarias para el Servicio de Exámenes

Este proyecto contiene pruebas unitarias para el servicio de exámenes de una aplicación de gestión de exámenes. Se utiliza **JUnit 5** como marco de pruebas para asegurar que las funcionalidades del servicio `ExamenServiceIMPL` funcionen correctamente.

## Descripción de las Pruebas

### Pruebas Incluidas

1. **Búsqueda de Examen por Nombre**:
   - Verifica que el método `findExamenPerName` del servicio retorne un objeto `Examen` no nulo al buscar un examen por su nombre. 
   - Asegura que el examen encontrado tenga el ID y nombre esperados.

2. **Guardado de Examen en el Repositorio**:
   - Prueba que el método `saveExamen` del servicio guarda correctamente un nuevo examen en el repositorio.
   - Asegura que el examen se puede recuperar por su ID después de ser guardado y que tiene el nombre correcto.

### Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado.
- **JUnit 5**: Para la creación de pruebas unitarias.
- **Mockito**: Para la creación de objetos simulados (mocks) en las pruebas.
- **Maven**: Herramienta de gestión de proyectos para manejar las dependencias y la construcción del proyecto.

### Ejecución de Pruebas

Para ejecutar las pruebas, asegúrate de tener JUnit 5 configurado en tu entorno de desarrollo. Puedes ejecutar las pruebas directamente desde tu IDE o mediante la línea de comandos usando Maven o Gradle.

## Notas

- Este proyecto es un examen académico para evaluar conceptos de programación orientada a objetos y pruebas unitarias.
- No recomendado para producción; es una implementación educativa.
- Basado en una estructura simplificada, puede no seguir todas las mejores prácticas.
- Diseñado para aprendizaje y práctica.
