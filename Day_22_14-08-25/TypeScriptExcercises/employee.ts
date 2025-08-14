
interface Employee {
  empId: number;
  empName: string;
  salary: number;
}

const emp: Employee[] = [
  { 
    empId: 1, 
    empName: "Akanksha", 
    salary: 60000
 },
  { 
    empId: 2, 
    empName: "Onkar", 
    salary: 60000 
},
  { 
    empId: 3, 
    empName: "Ashwini", 
    salary: 55000 
}
];

function employeeList(empList: Employee[]): number {
  empList.forEach(emp => {
    console.log(`EmpID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
  });

  return empList.length; 
}
console.log(employeeList(emp));
