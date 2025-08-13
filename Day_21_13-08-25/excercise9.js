//Excercise 10 
var persons = [
  { name: 'Akanksha', age: 25, city: 'Navi mumbai' },
        { name: 'Onkar', age: 17, city: 'Khalapur' },
        { name: 'Pratik', age: 19, city: 'Sangli' },
       { name: 'Dhanu', age: 15, city: 'Satara' },
        { name: 'Ashu', age: 30, city: 'Khopoli' },
        { name: 'Shravan', age: 22, city: 'Mahuli' }];
 
persons.map(function(person) {
  person.status = person.age >= 18 ? "Adult" : "Minor"; 
  return person; 
});
console.log(persons);

//Excercise 9
// for (let i = 0; i < persons.length; i++) {
   
//     if (persons[i].age >= 18) {
//         persons[i].status = "Adult";
//     } else {
//         persons[i].status = "Minor";
//     }
// }
// console.log(persons);