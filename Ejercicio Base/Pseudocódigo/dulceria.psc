Algoritmo ValorTotalVentas
	Escribir 'Ingrese La cantidad de productos para registrar'
	Leer Productos_Registrados
	TotalProductos <- 0
	Para Productos_Registrados<-1 Hasta Productos_Registrados Hacer
		Escribir ' Escriba Código del Producto:'
		Leer Codigo_Producto
		Escribir 'Escriba Nombre del Producto:'
		Leer Nombre_Producto
		Escribir 'Escriba Precio del Producto:'
		Leer Precio_Producto
		Escribir 'Escriba Cantidad del Producto'
		Leer Cantidad_Producto
		Escribir 'Escriba Unidades Vendidas del Producto'
		Leer Unidades_Vendidas
		TotalProducto <- Cantidad_Producto*Unidades_Vendidas
		Escribir 'El Total de Ventas de  '+Nombre_Producto+' es: ',TotalProducto
		TotalProductos <- TotalProductos+TotalProducto
	FinPara
	Escribir 'El Total de venta de todos los Productos de la Dulcería es: ',TotalProductos
FinAlgoritmo
