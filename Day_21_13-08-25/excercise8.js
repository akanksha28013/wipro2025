
const employees = [
    { name: 'Akanksha', role: 'Manager', empId: 'M001', salary: 80000 },
    { name: 'Pratik', role: 'Developer', empId: 'D001', salary: 60000 },
    { name: 'Ashu', role: 'Manager', empId: 'M002', salary: 75000 }
];
const totalManagerSalary = employees
    .filter(employee => employee.role === 'Manager')  
    .reduce((total, manager) => total + manager.salary, 0);  

console.log('Total Salary of Managers:' + totalManagerSalary);
