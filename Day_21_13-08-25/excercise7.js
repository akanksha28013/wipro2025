window.onload = function() {
    const persons = [
        { name: 'Akanksha', age: 25, city: 'Navi mumbai' },
        { name: 'Onkar', age: 17, city: 'Khalapur' },
        { name: 'Pratik', age: 19, city: 'Sangli' },
        { name: 'Dhanu', age: 15, city: 'Satara' },
        { name: 'Ashu', age: 30, city: 'Khopoli' },
        { name: 'Shravan', age: 22, city: 'Mahuli' }
    ];

    const eligibleVoters = persons.filter(person => person.age >= 18);

    
    console.log('Eligible Voters:', eligibleVoters);

};
