# QAInnovationLab Web

Automation Team / For education purpose

Pruebas de Regresión de una Tienda en Línea.

La automatización se va a utilizar para encontrar defectos en la página principal de la tienda. Pudiendo identificar si la página está down, o si es que el servicio de autentificación no está funcionando. También permitirá validar la conexión con la BD para listar los productos correctamente. Esta automatización va a correr todos los días a las 5am, luego de ello, el automatizador ingresará a ver el reporte de la ejecución en PDF para conocer el resultado de la prueba. Según el resultado observado, el automatizador se comunicará con los encargados del mantenimiento de la tienda para que solucionen lo más temprano posible.

Por ello, se debe tener varios examples:

Con un usuario y contraseña válidos. Aquí se espera que la automatización termine correctamente.
Con un usuario y clave inválidos. Aquí se espera que la automatización falle al no llegar a la pantalla principal.
Con una categoría inexistente. Por Ejemplo "Autos". Aquí se espera que la automatización falle, y no continúe.

URL: https://qalab.bensg.com/store

Se le brinda, la redacción en gherkin a utilizar:

Feature: Product - Store

Escenario: Validación del precio de un producto

Dado estoy en la página de la tienda
Y me logueo con mi usuario "XXX" y clave "YYY"
Cuando navego a la categoria "Clothes" y subcategoria "Men"
Y agrego 2 unidades del primer producto al carrito
Entonces valido en el popup la confirmación del producto agregado
Y valido en el popup que el monto total sea calculado correctamente
Cuando finalizo la compra
Entonces valido el titulo de la pagina del carrito
Y vuelvo a validar el calculo de precios en el carrito

Puntaje:

Iniciar Sesión (6 puntos)
Validar la Autentificación (3 puntos)
Ingresar la categoría / subcategoría (2 puntos)
Agregar a Carrito (2 puntos)
Validaciones en el Carrito (4 puntos)
Uso de esperas Explícitas (1 punto)
Reportes en PDF (1 punto)
Código claro, ordenado y limpio (1 puntos)
