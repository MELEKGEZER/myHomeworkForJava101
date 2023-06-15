public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsOfWork = 2021 - hireYear;
        if (yearsOfWork < 10) {
            return salary * 0.05;
        } else if (yearsOfWork < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    public double calculateTotalSalary() {
        return salary - tax() + bonus() + raiseSalary();
    }

    @Override
    public String toString() {
        String result = "Adı: " + name + "\n";
        result += "Maaşı: " + salary + "\n";
        result += "Çalışma Saati: " + workHours + "\n";
        result += "Başlangıç Yılı: " + hireYear + "\n";
        result += "Vergi: " + tax() + "\n";
        result += "Bonus: " + bonus() + "\n";
        result += "Maaş Artışı: " + raiseSalary() + "\n";
        result += "Vergi ve Bonuslar ile birlikte maaş: " + calculateTotalSalary() + "\n";
        result += "Toplam Maaş: " + (salary + raiseSalary()) + "\n";
        return result;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(employee.toString());
    }
}
