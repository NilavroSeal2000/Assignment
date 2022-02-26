package lab4;

import java.util.Random;

class Account {
	static Random rand = new Random();
	private static long unknown_number = rand.nextInt(1000000000);
	private long accNum;
	private double balance;
	private Person accHolder;

	public Account(Person accHolder, double balance) {
		if (balance < 500)
			System.out.println("Violating the minimum balance rule.");
		else {
			this.accNum = Account.unknown_number++;
			this.balance = balance;
			this.accHolder = accHolder;
		}
	}

	public Account(double balance, Person accHolder) {
		if (balance < 500)
			System.out.println("Violating the minimum balance rule.");
		else {
			this.accNum = Account.unknown_number++;
			this.balance = balance;
			this.accHolder = accHolder;
		}
	}

	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 500)
			System.out.println("Violating the minimum balance rule.");
		else
			this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void deposit(double balance) {
		this.balance += balance;
	}

	public void withdraw(double balance) {
		if (this.balance - balance < 500)
			System.out.println("Violating the minimum balance rule.");
		else
			this.balance -= balance;
	}
}

class Person {
	private String name;
	private float age;

	public Person(String name) {
		this.name = name;
		this.age = 18.0f;
	}

	public Person(String name, float age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

}

class SavingsAccount extends Account {
	private final double minimumBalance;

	public SavingsAccount(Person accHolder, double balance, double minimumBalance) {
		super(accHolder, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public void withdraw(double balance) {
		if (super.getBalance() - balance < this.minimumBalance)
			System.out.println("Violating the minimum balance rule.");
		else
			super.setBalance(super.getBalance() - balance);
	}

}

class CurrentAccount extends Account {
	private double overDraftLimit;

	public CurrentAccount(Person accHolder, double balance, double overDraftLimit) {
		super(accHolder, balance);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public void withdraw(double balance) {
		if (this.overDraftLimit >= 0) {
			if (super.getBalance() - balance < 500)
				System.out.println("Violating the minimum balance rule.");
			else {
				super.setBalance(super.getBalance() - balance);
				this.overDraftLimit--;
			}
		}
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Account a1 = new Account(new Person("Smith"), 3000.00);
		Account a2 = new Account(new Person("Kathy"), 2000.00);
		System.out.println("Balance in Smith account: " + a1.getBalance());
		System.out.println("Balance in Kathy account: " + a2.getBalance());

		a1.deposit(3000.0);
		System.out.println("Updated Balance in Smith's account: " + a1.getBalance());

		a2.withdraw(2000.0);
		System.out.println("Updated Balance in Kathy's account: " + a2.getBalance());

	}
}
