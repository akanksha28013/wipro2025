class BankAccount {
  constructor(accountNumber, balance = 0) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  deposit(amount) {
    this.balance += amount;
  }

  withdraw(amount) {
    if (this.balance >= amount) this.balance -= amount;
  }
}

const myAccount = new BankAccount('123456', 1000);
console.log('Initial Balance:', myAccount.balance);

myAccount.deposit(300);
console.log('After Deposit of 500:', myAccount.balance);

myAccount.withdraw(200);
console.log('After Withdrawal of 200:', myAccount.balance);
