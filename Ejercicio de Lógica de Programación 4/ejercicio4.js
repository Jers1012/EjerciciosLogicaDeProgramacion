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

// Calcular la serie de Fibonacci
let fibonacci = [0, 1];
for (let i = 2; i <= numero; i++) {
  fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
}

// Mostrar la serie de Fibonacci en la consola
console.log("La serie de Fibonacci para " + numero + " números es:");
for (let i = 0; i < fibonacci.length; i++) {
  console.log(fibonacci[i]);
}