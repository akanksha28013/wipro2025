var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.push = function (item) {
        this.items.push(item);
    };
    Stack.prototype.pop = function () {
        return this.items.pop();
    };
    Stack.prototype.peek = function () {
        return this.items[this.items.length - 1];
    };
    Stack.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    Stack.prototype.size = function () {
        return this.items.length;
    };
    return Stack;
}());
var stack = new Stack();
stack.push(67);
stack.push(50);
stack.push(98);
console.log(stack.peek());
console.log(stack.pop());
console.log(stack.peek());
console.log(stack.size());
