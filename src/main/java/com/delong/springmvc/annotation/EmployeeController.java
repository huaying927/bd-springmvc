package com.delong.springmvc.annotation;


import com.delong.springmvc.model.Employee;
import com.delong.springmvc.model.EmployeeListForm;
import com.delong.springmvc.model.EmployeeMapForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final Log log = LogFactory.getLog(EmployeeController.class);

    @GetMapping("/add")
    public String addEmployee() {
        return "addEmployee";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute Employee employee) {
        log.info(employee);

        return "addEmployeeResult";
    }

    @GetMapping("/addList")
    public String addEmployeeWithList() {
        return "addEmployeeList";
    }

    @PostMapping("/addList")
    public String addEmployeeWithList(@ModelAttribute EmployeeListForm employeeListForm) {
        log.info("employeeListForm: " + employeeListForm);

        return "addEmployeeListResult";
    }

    @GetMapping("/addMap")
    public String addEmployeeWithMap() {
        return "addEmployeeMap";
    }

    @PostMapping("/addMap")
    public String addEmployeeWithMap(@ModelAttribute EmployeeMapForm employeeMapForm) {
        log.info("employeeMapForm: " + employeeMapForm);

        return "addEmployeeMapResult";
    }
}
