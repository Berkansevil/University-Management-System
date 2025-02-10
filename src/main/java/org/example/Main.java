package org.example;

import org.example.config.DataBaseConfig;
import org.example.config.DataBaseConnectorConfig;
import org.example.course.CourseService;
import org.example.instructor.Instructor;
import org.example.instructor.InstructorRepository;
import org.example.instructor.InstructorService;
import org.example.person.Person;
import org.example.person.PersonRepository;
import org.example.course.Course;
import org.example.course.CourseRepository;
import org.example.student.CourseStudentMapper;
import org.example.student.StudentRepository;

public class Main {
    public static void main(String[] args) {
        DataBaseConnectorConfig.setConnection();
        CourseRepository courseRepository=new CourseRepository();
        InstructorRepository instructorRepository=new InstructorRepository();
        InstructorService instructorService=new InstructorService(instructorRepository);
        CourseService courseService=new CourseService(courseRepository);

       courseService.generateCourseReport(28);
        /*
        InstructorRepository instructorRepository = new InstructorRepository();
        Instructor instructor = new Instructor();
        instructor.setInstructorFullName("berkan");
        instructor.setEmail("deneme@gmail.com");
        instructor.setPassword("1231254");
        instructorRepository.saveInstructor(instructor);
        PersonRepository personRepository = new PersonRepository();
        Person person = new Person();
        person.setFullName("Furkan");
        person.setEmail("deneme@gmail.com");
        person.setPassword("12345");
        personRepository.savePerson(person);
*/
    }
}