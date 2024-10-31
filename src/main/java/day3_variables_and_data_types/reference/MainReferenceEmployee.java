package day3_variables_and_data_types.reference;

public class MainReferenceEmployee {
    public static void main(String[] args) {

        EmployeeInterface manager = new Manager();
        EmployeeInterface developer = new Developer();
        EmployeeInterface designer = new Designer();


        EmployeeInterface[] employees = { manager,developer,designer};

        for(EmployeeInterface employee : employees){
            employee.work();
            employee.takeBreak();
            employee.attendMeeting();
            System.out.println();
        }

    }
}
