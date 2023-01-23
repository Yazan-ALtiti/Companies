package com.example.java.Spring.Controller;

import com.example.java.Spring.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class School_Employee {
    ArrayList<Employee>EmloyeeData=new ArrayList<Employee>();
    @ResponseBody
    @PostMapping("/employee/add")
    public String AddEmployee(@RequestParam String name, @RequestParam float salary ){
        Employee employee=new Employee(name,EmloyeeData.size()+1,salary);
        EmloyeeData.add(employee);
        return "successful";
    }
}
