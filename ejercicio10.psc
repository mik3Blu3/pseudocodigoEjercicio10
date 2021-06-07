Algoritmo suma_numeros
	sumaNumeros <- 0
	sumNumAux <- 0
	numAuxmod <- 0
	numMultiplos <- 0
	Escribir 'Se leeran los numeros hasta que la suma de los mismos llegue a 1000'
	Mientras sumaNumeros <> 1000 Hacer
		Escribir 'Ingrese el numero: '
		Leer num
		sumaNumeros <- sumaNumeros+num
		numAuxmod <- (num MOD 6)
		Si numAuxmod=0 Entonces
			numMultiplos <- (numMultiplos+1)
		FinSi
		Si num>=1 Y num<=10 Entonces
			sumNumAux <- sumNumAux+num
		FinSi
	FinMientras
	Escribir 'La cantidad de numeros multiplos de 6 encontrados es: ',numMultiplos
	Escribir 'La suma de los numeros encontrados entre (1,10) es: ',sumNumAux
FinAlgoritmo
