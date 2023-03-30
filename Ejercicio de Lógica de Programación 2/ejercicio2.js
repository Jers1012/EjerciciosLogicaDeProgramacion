let celsius;

do {
  // Solicitar al usuario la temperatura en grados Celsius
  celsius = prompt("Ingresa la temperatura en grados Celsius:");

  // Verificar si el valor ingresado es un número
  if (isNaN(celsius)) {
    alert("El valor ingresado no es un número. Por favor, intenta de nuevo.");
  }
} while (isNaN(celsius));

// Convertir Celsius a Fahrenheit
let fahrenheit = (celsius * 9/5) + 32;

// Convertir Celsius a Kelvin
let kelvin = parseFloat(celsius) + 273.15;

// Mostrar los resultados en la consola
console.log("Grados Fahrenheit: " + fahrenheit);
console.log("Grados Kelvin:" + kelvin);