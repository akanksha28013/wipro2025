class Stack<T> {
 items: T[] = [];
  push(item: T): void {
    this.items.push(item);
  }
  pop(): T | undefined {
    return this.items.pop();
  }
  peek(): T | undefined {
    return this.items[this.items.length - 1];
  }
  isEmpty(): boolean {
    return this.items.length === 0;
  }
  size(): number {
    return this.items.length;
  }
}
let stack = new Stack<number>();

stack.push(67);
stack.push(50);
stack.push(98);

console.log(stack.peek()); 
console.log(stack.pop());  
console.log(stack.peek()); 
console.log(stack.size()); 
