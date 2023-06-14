class Bank {
    private String name;
    private String location;
    private int branches;

    public Bank(String name, String location, int branches) {
        this.name = name;
        this.location = location;
        this.branches = branches;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getBranches() {
        return branches;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank", "New York", 10);
        System.out.println(bank.getName() + " has " + bank.getBranches() + " branches in " + bank.getLocation());
    }
}