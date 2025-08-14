class Calculator {
  add(a: number, b: number): number {
    return a + b;
  }
  subtract(a: number, b: number): number {
    return a - b;
  }
}

const calculator = new Calculator();

console.log(calculator.add(20, 3));      
console.log(calculator.subtract(15, 5));  
