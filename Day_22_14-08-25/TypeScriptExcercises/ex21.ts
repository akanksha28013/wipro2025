class Box<T> {
     value: T;
    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}

const numberBox = new Box<number>(42);
console.log(numberBox.getValue());

const stringBox = new Box<string>("Hello, TypeScript!");
console.log(stringBox.getValue());
