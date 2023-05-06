package hw5.src.person;

public class TestMain {
    public static void main(String[] args) {
        Student stu1 = new Student("Sherlock", "221B Baker", "Cambridge", 100, 0);
        Staff sta1 = new Staff("Sherlock", "221B Baker", "Cambridge Highschool", 1);
        System.out.println(stu1);
        System.out.println(sta1);
        
        Student student1 = new Student("Nguyen Van A", "Ha Noi", "MT&KHTT", 4, 12000000);
            
        System.out.println("Student:[" + "Name: " + student1.getName() + ", Address: " + student1.getAddress() + ", Program: "
                    + student1.getProgram() + ", Year: " + student1.getYear() + ", Fee: " + student1.getFee());
        Staff staff1 = new Staff("Nguyen Van B", "Nam Dinh", "THPT CHUYEN LE HONG PHONG", 7000000);
        System.out.println("Staff:[" + "Name: " + staff1.getName() + ", Address: " + staff1.getAddress() + ", School: "
                    + staff1.getSchool() + ", Pay: " + staff1.getPay());
     }
}