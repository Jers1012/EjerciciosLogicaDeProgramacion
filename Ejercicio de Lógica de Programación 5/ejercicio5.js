let numeroSecreto = Math.floor(Math.random() * 100) + 1;
let numerosIngresados = [];

do {
  let numeroIngresado = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:");

  if (isNaN(numeroIngresado)) {
    alert("El valor ingresado no es un número. Por favor, intenta de nuevo.");
    continue;
  }

  numeroIngresado = parseInt(numeroIngresado);

  if (numeroIngresado < 1 || numeroIngresado > 100) {
    alert("El número ingresado está fuera del rango permitido. Por favor, intenta de nuevo.");
    continue;
  }

  numerosIngresados.push(numeroIngresado);

  if (numeroIngresado === numeroSecreto) {
    console.log("Felicidades, adivinaste el número secreto.");
    break;
  } else {
    console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
  }
} while (true);

console.log("Números ingresados antes de adivinar el número secreto:");
console.log(numerosIngresados);