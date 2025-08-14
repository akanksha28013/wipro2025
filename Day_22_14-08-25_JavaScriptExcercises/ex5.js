class Vehicle {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo() {
    return `${this.year} ${this.make} ${this.model}`;
  }
}

class Car extends Vehicle {
  constructor(make, model, year, numDoors) {
    super(make, model, year);
    this.numDoors = numDoors;
  }

  getInfo() {
    return `${super.getInfo()} with ${this.numDoors} doors`;
  }
}

const myCar = new Car('Mahindra', 'Camry', 2025, 4);
console.log(myCar.getInfo());
