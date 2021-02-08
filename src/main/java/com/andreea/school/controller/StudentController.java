package com.andreea.school.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("students")
    public String showAllStudents(){

        return "showallstudents";
    }

    @GetMapping("/")
    public String Index(){

        return "index";
    }
}
