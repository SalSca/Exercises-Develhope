package co.develhope.email1.students.services;

import org.springframework.stereotype.Service;
import co.develhope.email1.students.entities.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "John", "Walker", "john@walker.com"),
            new Student("2", "Walter", "White", "walter@white.com"),
            new Student("3", "Samuel", "Dungeon", "samuel@dangeon.com"),
            new Student("4", "Ursula", "Von Der Leyen", "ursula@boss.eu"),
            new Student("5", "Salvo", "Scalisi", "scalisi.salvo02@gmail.com")
            );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromList = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        return studentFromList.orElse(null);
    }
}