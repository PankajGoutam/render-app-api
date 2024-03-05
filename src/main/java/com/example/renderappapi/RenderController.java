package com.example.renderappapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class RenderController {
	
   @Autowired
    RenderService service;

    @RequestMapping("/emps")
    @ResponseBody
    public List<RenderEmp> showAll() {
        return this.service.showAll();
    }

    @RequestMapping("/emps/{id}")
    @ResponseBody
    public Optional<RenderEmp> showById(@PathVariable int id) {
        return this.service.getEmp(id);
    }

    @RequestMapping(value = "/emps/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Optional<RenderEmp> deleteById(@PathVariable int id) {
        return this.service.delEmp(id);
    }

    @RequestMapping(value = "/emps/update/{id}/{newName}/{newSalary}", method = RequestMethod.PUT)
    @ResponseBody
    public Optional<RenderEmp> updateEmployee(
            @PathVariable int id,
            @PathVariable String newName,
            @PathVariable int newSalary) {
        return this.service.updEmp(id, newName, newSalary);
    }

    @RequestMapping(value = "/emps/add", method = RequestMethod.POST)
    @ResponseBody
    public void addEmployee(@RequestBody RenderEmp newEmployee) {
        this.service.addEmp(newEmployee);
    }
}








