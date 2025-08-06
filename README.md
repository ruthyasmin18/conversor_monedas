# 💱 Conversor de Monedas - Challenge Alura Latam

¡Bienvenido/a al **Conversor de Monedas**\! 🎉

Este proyecto fue desarrollado como parte del **Challenge de Alura Latam - Java Orientado a Objetos** y consiste en una aplicación en **Java** para convertir entre diferentes monedas latinoamericanas y el dólar estadounidense, utilizando una interfaz simple por consola.

## 📋 Funcionalidades

Este conversor permite realizar las siguientes conversiones:

1.  Dólar =\> Peso argentino
2.  Peso argentino =\> Dólar
3.  Dólar =\> Real brasileño
4.  Real brasileño =\> Dólar
5.  Dólar =\> Peso colombiano
6.  Peso colombiano =\> Dólar
7.  Salir del programa

> El usuario puede elegir una opción ingresando el número correspondiente en el menú.

## 🌐 API Utilizada

Se utiliza [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real.

### 🔑 Cómo obtener y configurar tu API Key

1.  Ve a [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/).
2.  Regístrate para obtener una cuenta gratuita.
3.  Copia tu clave API (key) que se verá como: `xxxxxxxxxxxxxxxxxxxxxxxx`.
4.  En tu proyecto, abre el archivo **`Conversion.java`** y busca la siguiente línea:
    ```java
    String API_key = "f10d6cee733a84653996c931"; //-> AQUI CAMBIEN POR EL API-KEY QUE GENERASTE
    ```
5.  Reemplaza el valor del `String` por la **API Key** que generaste.

## 🛠 Tecnologías utilizadas

  - **Lenguaje:** Java 17+
  - **IDE sugerido:** IntelliJ IDEA / Eclipse / VS Code
  - **Consumo de API:** `HttpURLConnection` o `HttpClient` de Java
  - **Parseo JSON:** [Gson (by Google)](https://github.com/google/gson)
  - **Entrada de datos:** Consola (Scanner)

## 📦 Dependencias

Si usas **Maven**, agrega:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```


## 🚀 Cómo ejecutar el proyecto

1.  Asegúrate de haber configurado tu **API Key** siguiendo los pasos de la sección anterior.
2.  Ejecuta la **clase principal** del proyecto.
3.  Una vez iniciado, el programa mostrará un menú en la consola.
4.  Selecciona la opción de conversión que desees ingresando el número correspondiente.
