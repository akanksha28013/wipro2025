function pair<T, U>(first: T, second: U): [T, U] {
  return [first, second];
}
const pair1 = pair<number,string>(2891, 'hello');
console.log(pair1); 

const pair2 = pair<string,boolean>('Akanksha', true);
console.log(pair2);
