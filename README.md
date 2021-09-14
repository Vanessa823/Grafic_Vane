# Mapa de Bits
Creación de un mapa de bits a partir de una imagen cualquiera, a la cual se le invierten los colores


# Importación de librerías

Se importan todas las librerías utilizar en la clase de la ventana

![Captura de pantalla (75)](https://user-images.githubusercontent.com/72058517/133199497-9d24b9dc-276d-442f-9413-beaa38bcc1bb.png)



# Construir la ventana
Agregamos el objeto imagen bits y construimos nuestra ventana
![Captura de pantalla (67)](https://user-images.githubusercontent.com/72058517/133199947-f7bfc415-11ed-40a1-8cf3-e2aaee92bea4.png)

# Botones
Creamos 4 botones para controlar nuesta ventana
En el primer botón se obtiene la imagen del metodo BufferedImage Imagen, la escalamos a las dimensiones del label

En el segundo botón obtenemos la imagen con los colores cambiados, así mismo se escala a las dimensiones del label y se muestra la imagen actual

El boton tres es para salir del programa

y finlmente el cuarto botón es para guardar, en cual se muestran los ficheros se guarda la selección y posteriormente se "escribe" la nueva imagen en el fichero seleccionado y con el nombre asignado. Aunque la finalidad del proyecto era convertir cualquier imagen en mapa de bits (bmp), tambien pueden guardarse imagenes en otros formatos como png, jpg, etc

![Captura de pantalla (76)](https://user-images.githubusercontent.com/72058517/133200191-3fe90ec3-4fd4-45c1-9cf6-9d6b603bf26e.png)

![Captura de pantalla (77)](https://user-images.githubusercontent.com/72058517/133201506-871009a3-6c6f-485c-8590-7d4809814315.png)

# Agregamos los componentes a la ventana
Se crea el metodo main y se agregan los componentes a la ventana
![Captura de pantalla (78)](https://user-images.githubusercontent.com/72058517/133201748-f64467b3-79a7-46a4-afb1-e2362c7968d6.png)

# Imagen Bits
# Cargar Imagen
Creamos un metodo que devuelva la imagen abierta desde el archivo y la variable que será devuelta
Mostramos un FileChooser que muestre archivos con estas extensiones "jpg","gif","bmp". Se guarda la selección y devuelve la variable bmp que es la imagen original.
![Captura de pantalla (81)](https://user-images.githubusercontent.com/72058517/133204495-cf8ff6bd-8c80-4f53-b23b-e77bf1e3b417.png)

# Cambiar colores
Se crea el metodo que retorna la imagen con los colores ya cambiados , se recorre la imagen mediante dos ciclos FOR anidados, almacenamos el color del pixel, y hacemos las modificaciones en la escala Rgb para que todos queden invertidos. Posteriormente cambiamos a formato RGB y devolvemos la imagen con los nuevos valores.

![Captura de pantalla (82)](https://user-images.githubusercontent.com/72058517/133205509-c9abbfa6-1291-41e5-b2ec-90dcddb0c952.png)

# Ejecución
![Captura de pantalla (83)](https://user-images.githubusercontent.com/72058517/133205595-fbbcea08-20ea-4607-8901-0af029fcdaed.png)
![Captura de pantalla (84)](https://user-images.githubusercontent.com/72058517/133205723-23ede2fd-0776-4e03-aa73-6899c72a2bf6.png)
![Captura de pantalla (85)](https://user-images.githubusercontent.com/72058517/133205855-aa4b01ca-5b39-48d2-88f6-e917121b962c.png)
# Cambio de color
![Captura de pantalla (86)](https://user-images.githubusercontent.com/72058517/133205968-614ad047-659b-4033-b7bd-053885d6dfa5.png)
# Guardar
![Captura de pantalla (87)](https://user-images.githubusercontent.com/72058517/133206106-825ba47d-b116-44a4-aea4-04fd3334a682.png)







