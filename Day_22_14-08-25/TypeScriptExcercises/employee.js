var emp = [
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
function employeeList(empList) {
    empList.forEach(function (emp) {
        console.log("EmpID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return empList.length;
}
console.log(employeeList(emp));
