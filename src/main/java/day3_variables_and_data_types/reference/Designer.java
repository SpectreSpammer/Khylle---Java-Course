package day3_variables_and_data_types.reference;

public class Designer implements EmployeeInterface {
    @Override
    public void work() {
        System.out.println("Designer is creating a user interface");
    }

    @Override
    public void takeBreak() {
        System.out.println("Designer is having a short walk");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the designs to the team");
    }
}
