public class Demo {
    public static void main(String[] args) {
        Employee CEO = new Employee(1, "Muzammal", 90000, "CEO");
        Employee HeadSales = new Employee(2, "Ali", 70000, "Head Sales");
        Employee HeadMarket = new Employee(3, "Raza", 70000, "Head Market");
        Employee Clark1 = new Employee(4, "Shabir", 50000, "Clark");
        Employee Clark2 = new Employee(5, "Arslan", 50000, "Clark");
        Employee SalesExecutive1 = new Employee(6, "Abid", 30000, "Sales Executive");
        Employee SalesExecutive2 = new Employee(7, "Amir", 30000, "Sales Executive");CEO.add(CEO);
        CEO.add(HeadSales);
        CEO.add(HeadMarket);
        HeadSales.add(Clark1);
        HeadSales.add(Clark2);
        HeadMarket.add(SalesExecutive1);
        HeadMarket.add(SalesExecutive2);
        for (Employee head:CEO.getEmployeeList())
        {
            System.out.println(head);
            for (Employee employee :head.getEmployeeList())
            {
                System.out.println(employee);
            }
        }

    }
}
