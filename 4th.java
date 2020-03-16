import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CodeMain  {
    public static class Student {
        private String firstName;
        private String lastName;
        Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("aa", "bc"));
        studentList.add(new Student("aa", "bd"));
        studentList.add(new Student("bb", "bd"));
        studentList.add(new Student("bb", "ef"));
        studentList.add(new Student("db", "ef"));
        System.out.println("Count of students sharing same first name are : " + getCountOfStudentsHavingSameFirstName(studentList));
    }
    public static int getCountOfStudentsHavingSameFirstName(List<Student> studentList) {
        Map<String, Integer> firstNamesMap = new HashMap<String, Integer>();
        for (Student student : studentList) {
            firstNamesMap.put(student.getFirstName(), firstNamesMap.getOrDefault(student.getFirstName(), 0) + 1);
        }
        int studentsHavingSameFirstNameCount = 0;
        for (Map.Entry<String, Integer> mapEntry : firstNamesMap.entrySet()) {
            if (mapEntry.getValue() > 1) {
                studentsHavingSameFirstNameCount += mapEntry.getValue();
            }
        }
        return studentsHavingSameFirstNameCount;
    }
}
