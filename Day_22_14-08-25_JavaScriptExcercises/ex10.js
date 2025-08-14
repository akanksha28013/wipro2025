function sumNumbers(...numbers) {
  return numbers.reduce((num, total) => num + total, 0);
}

console.log(sumNumbers(1, 2, 3, 4));