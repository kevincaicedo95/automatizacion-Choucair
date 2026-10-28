# Automatización Web — Serenity BDD + Screenplay

## Descripción

Proyecto de automatización de pruebas funcionales para aplicaciones web utilizando **Serenity BDD**, el patrón **Screenplay**, **Cucumber** y **Gradle**.

La estructura está orientada a mantener las pruebas legibles, reutilizables y fáciles de mantener, separando las capacidades del actor, las tareas, las interacciones, las preguntas y los escenarios de negocio.

> Ajusta los nombres de paquetes, navegadores y versiones de dependencias según la configuración real del proyecto.

## Tecnologías

- Java
- Serenity BDD
- Screenplay
- Cucumber
- Gradle

## Requisitos previos

Antes de ejecutar las pruebas, instala y configura:

- JDK compatible con las versiones de Java y Serenity utilizadas por el proyecto.
- Gradle Wrapper incluido en el repositorio (`gradlew` / `gradlew.bat`).
- Git, si vas a clonar el repositorio.

Comprueba la instalación de Java desde una terminal:

```bash
java -version
```

En Windows, también puedes comprobar la configuración de Gradle usando el wrapper del proyecto:

```powershell
.\gradlew.bat --version
```

## Estructura del proyecto

La estructura exacta puede variar. Una organización habitual para Serenity BDD con Screenplay y Cucumber es:

```text
.
├── build.gradle
├── settings.gradle
├── serenity.properties
└── src
    ├── java
        └── <com.automatizacion.web>
        │       ├── interactions/
        │       ├── tasks/
        │       ├── questions/
        │       ├── userinterfaces/
        │       ├── utils
    └── test
        ├── java
        │   └── <com.automatizacion.web>
        │       ├── runners/
        │       ├── stepdefinitions/
        └── resources
            └── features/
```

- **runners/**: configura la ejecución de las pruebas.
- **stepdefinitions/**: conecta los pasos de Cucumber con el código Java.
- **tasks/**: representa las tareas que realiza el actor.
- **interactions/**: encapsula interacciones reutilizables con la aplicación.
- **questions/**: consulta el estado de la aplicación para validar resultados.
- **userinterfaces/**: centraliza los localizadores de elementos.
- **features/**: contiene los escenarios escritos en Gherkin.

Conserva únicamente las carpetas que existan en tu proyecto.

## Configuración

Revisa los archivos `build.gradle`, `settings.gradle` y `serenity.properties`.

En `serenity.properties` se suelen configurar opciones como el navegador, la URL base y los parámetros de ejecución. Usa los nombres de propiedades compatibles con la versión de Serenity instalada y evita guardar credenciales en el repositorio.

Si la aplicación requiere una URL o datos específicos, configura esos valores para el ambiente de pruebas correspondiente.

## Ejecutar las pruebas

Desde la raíz del proyecto, ejecuta:

**Windows (PowerShell o CMD):**

```powershell
.\gradlew.bat clean test
```

**Linux o macOS:**

```bash
./gradlew clean test
```

Si el proyecto utiliza etiquetas de Cucumber o filtros de Gradle, aplica el filtro que esté configurado en el runner o en `build.gradle`.

## Reportes

Después de una ejecución correcta, revisa la carpeta `target` o `build`, según la configuración de Serenity y Gradle. Las ubicaciones comunes incluyen:

- `target/site/serenity/`
- `build/reports/`

La ruta exacta depende de las tareas y de la configuración del proyecto. Busca el reporte HTML de Serenity generado por la ejecución.

## Buenas prácticas

- Mantén las tareas de Screenplay enfocadas en una responsabilidad.
- Reutiliza localizadores y preguntas cuando tenga sentido.
- Evita duplicar lógica entre escenarios.
- Usa datos de prueba controlados y ambientes no productivos.
- No incluyas contraseñas, tokens ni información sensible en el repositorio.
- Mantén las versiones de Java, Serenity y Gradle compatibles entre sí.

## Solución de problemas

- **Java incompatible:** verifica `java -version` y la versión requerida por el proyecto.
- **No se encuentran pruebas:** confirma que el runner, las etiquetas y los filtros de Gradle coincidan con las pruebas existentes.
- **El actor no puede navegar:** verifica que el actor tenga configurada la habilidad `BrowseTheWeb` antes de ejecutar interacciones web.
- **No se genera el reporte:** revisa la salida de Gradle y la configuración de Serenity.
