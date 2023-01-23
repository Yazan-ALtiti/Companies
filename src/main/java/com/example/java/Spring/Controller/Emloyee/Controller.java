package com.example.java.Spring.Controller.Emloyee;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@org.springframework.stereotype.Controller


public class Controller {
    ArrayList<String>Teacher=new ArrayList<>();
    @ResponseBody
    @PostMapping("/teacher/add")
    public String addteacher(@RequestParam String teachername){
        this.Teacher.add(teachername);
        return "Successfully add"+teachername;

    }
    @ResponseBody
    @GetMapping("/teacher/search/{id}")
    public String search(@PathVariable ("id")int id){
       return this.Teacher.get(id);
    }
    @ResponseBody
    @GetMapping("/teacher/all")
    public ArrayList<String>allemployee(){
        return this.Teacher;
    }
    @ResponseBody
    @PutMapping("/teacher/update/{id}")
    public String employeeupdate(@RequestParam String teachername ,@PathVariable("id")int id){
        this.Teacher.set(id,teachername);
        return "successfully Update ";

    }
    @ResponseBody
    @DeleteMapping("/teacher/delete/{id}")
    public String delete(@PathVariable("id")int id){
        this.Teacher.remove(id);
        return "delete";
    }
}
