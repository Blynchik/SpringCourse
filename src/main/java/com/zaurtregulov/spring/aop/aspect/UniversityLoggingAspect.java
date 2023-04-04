package com.zaurtregulov.spring.aop.aspect;

import com.zaurtregulov.spring.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("Получение списка студентов перед методом getStudents");
//    }

//    @AfterReturning("execution(* getStudents())")
//    public void afterReturningGetStudentsLoggingAdvice(){
//        System.out.println("Получение списка студентов после метода getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student student = students.get(0);
//        String nameSurname = student.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        student.setNameSurname(nameSurname);
//
//        double avgGrade = student.getAverageGrade();
//        avgGrade = avgGrade + 1;
//        student.setAverageGrade(avgGrade);
//
//        System.out.println("Получение списка студентов после метода getStudents");
//    }

    @AfterThrowing("execution(* getStudents())")
    public void afterThrowingStudentsLoggingAdvice(){
        System.out.println("throwingAdvice выброшено исключение");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "ex")
    public void afterThrowingStudentsLoggingAdvice(Throwable ex){
        System.out.println("throwingAdvice выброшено исключение " + ex);
    }
}
