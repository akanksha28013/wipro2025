function separateFirstRest(...args) {
  const [first, ...rest] = args;
  return { first, rest };
}
console.log(separateFirstRest(1, 2, 3, 4));