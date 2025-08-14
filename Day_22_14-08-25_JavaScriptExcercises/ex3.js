class Util {
   static getDate = () => {
    const today = new Date();
    const day = today.getDate(); 
    const month = today.getMonth() + 1; 
    const year = today.getFullYear();
    return `${day}-${month}-${year}`; 
  };

  static getPIValue = () => Math.PI;

  static convertC2F = (celsius) => (celsius * 9/5) + 32;

  static getFibonacci = (n) => {
    const fibonacciSeries = [0, 1];
    for (let i = 2; i < n; i++) {
      fibonacciSeries.push(fibonacciSeries[i - 1] + fibonacciSeries[i - 2]);
    }
    return fibonacciSeries.slice(0, n); 
  };
}

console.log(`Today's Date: ${Util.getDate()}`);
console.log(`PI Value: ${Util.getPIValue()}`);
console.log(`Convert 25°C to Fahrenheit: ${Util.convertC2F(25)}`);
console.log(`First 5 Fibonacci numbers: ${Util.getFibonacci(5)}`);
