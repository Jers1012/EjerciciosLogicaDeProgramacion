let numero;

do {
  // Solicitar al usuario un número
  numero = prompt("Ingresa un número:");

  // Verificar si el valor ingresado es un número
  if (isNaN(numero)) {
    alert("El valor ingresado no es un número. Por favor, intenta de nuevo.");
  }
} while (isNaN(numero));

// Convertir el valor ingresado a un número entero
numero = parseInt(numero);

// Calcular el factorial del número ingresado
let factorial = 1;
for (let i = 1; i <= numero; i++) {
  factorial *= i;
}

// Mostrar el resultado en la consola
console.log("El factorial de " + numero + " es " + factorial + ".");