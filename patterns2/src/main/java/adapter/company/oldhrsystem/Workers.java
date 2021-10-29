package adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"45646456466", "John", "Smith"},
            {"76567575757", "Jola", "Novak"},
            {"65757575757", "Jessie", "Red"},
            {"35464645646", "Walter", "Black"},
            {"87687674653", "Clara", "White"}};

    private double[] salaries = {
            4600.00,
            3400.00,
            7750.00,
            8000.00,
            5600.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}