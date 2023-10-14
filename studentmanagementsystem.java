import java.util.HashMap;
import java.util.Map;

class Student{
    String name;
    int rollno;
    Map<String, Integer>grades;
    public Student(String name, Integer rollno){
        this.name = name;
        this.rollno = rollno;
        this.grades = new HashMap<>();
    }
}

class StudentManagementSystem{
    Map<Integer, Student>students;
    
    public StudentManagementSystem(){
        students = new HashMap<>();
    }
    
    void addStudent(String name, Integer rollno){
         Student student = students.get(rollno);
         if(student==null){
             students.put(rollno, new Student(name, rollno));
             System.out.println("Student added Successfully");
         }else{
             System.out.println("Rollno already in use");
         }
    }
    
    void removeStudent(Integer rollno){
        Student student = students.get(rollno);
        if(student!=null){
            students.remove(rollno);
        }else{
            System.out.println("NO student exist with this roll no");
        }
    }
    
    Student searchStudent(Integer rollno){
        Student student = students.get(rollno);
        if(student==null){
            return null;
        }
        return student;
    }
    void displayStudents(){
        System.out.println("Displaying all Students");
        for(Map.Entry<Integer, Student>entry: students.entrySet()){
            Student student = entry.getValue();
            System.out.println(entry.getKey()+ " : "+ student.name);
        }
    }
    
}

class Demo{
    public static void main(String args[]){
        StudentManagementSystem students;
        students.addStudent("Akash", 1);
        students.addStudent("Abhi", 2);
        students.displayStudents();
    }
}