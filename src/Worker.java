public class Worker extends Person {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, float weight, float height, float salary) {
        super(name, age, weight, height);
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("I'm working... still...");
    }

    public void doBreak() {
        System.out.println("Don't touch me, I'm trying to sleep");
    }

}
