const sumArray = (arr) => {
  return arr.reduce((acc, num) => acc + num, 0);
};

const numbers = [1, 2, 3, 4, 5];
console.log(sumArray(numbers));  
