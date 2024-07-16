# conversor_divisas
Desafío de la formación Alura Latam OracleNextEducation enfocado en el consumo de una API.

## 📖 Conversor de Monedas
Este es un primer proyecto enfocado en el consumo y manipulación de una API. El programa permite convertir cantidades de las principales divisas del mundo. Utiliza una API de tipo de cambio para obtener las tasas de conversión actuales.

## 🔨 Funcionamiento
El programa solicita al usuario que elija una opción de conversión entre diferentes monedas. A continuación, se detallan las opciones disponibles:

Corremos nuestro programa en IntelliJ. Se despliegan inmediatamente las principales opciones de divisas por el código guardado en la API:
![Elija Divisa1](images/1.png)

Seleccionamos un número. Enseguida nos pide seleccionar la divisa a la que queremos convertir. Seleccionamos otro número:
![Elija Divisa2](images/2.png)

Ingresamos la cantidad a convertir. El programa acepta número separados por coma o no. El programa hace la converción:
![cantidad](images/3.png)

Como está en un bucle, nos pide si queremos hacer otra conversión. Podemos poner que sí para ahora analizar otros valores. ¿Qué pasa si ingresamos el código de la divisa?:
![Bucle](images/4.png)

El programa no compila e inmediatamente muestra un mensaje de error que nos saca del sistema (debemos tratar esa opción):
![Error](images/6.png)

Tenemos considerado el caso donde el usuario no ingresa un valor numérico válido:
![Validation](images/7.png)



Ingresamos un valor fuera del rango:
![Error2](images/8.png)


						
## ✔️ Requisitos
Java JDK 8 o superior
Clave de API válida para la API de tipo de cambio (reemplazar YOUR-API-KEY en el código)
Instrucciones de Uso
Ejecuta el programa desde tu entorno de desarrollo o terminal.
Sigue las instrucciones en pantalla para seleccionar la conversión deseada.
Se mostrará el resultado de la conversión en la consola.
Dependencias
calcular.buscarMoneda: Clase que utiliza la API de tipo de cambio para buscar las tasas de conversión.
calcular.calcularMoneda: Clase que realiza los cálculos de conversión basados en las tasas obtenidas.
modelo.Moneda: Clase que representa una moneda y su valor en dólares estadounidenses.
Configuración
Reemplaza YOUR-API-KEY en el código por tu clave de API válida para la API de tipo de cambio.

## 👨‍💻 Limitaciones y Consideraciones
El programa puede mostrar errores si la clave de API no es válida o si la API restringe el acceso.
Las tasas de cambio obtenidas de la API pueden no estar actualizadas en tiempo real.

## 🏰 Sobre el Autor
Guz Mexía, mexicano radicado en Francia que busca dar un giro en su carrera profesional aprendiendo sobre tecnología. 

Aplicación muestra en video...
 
