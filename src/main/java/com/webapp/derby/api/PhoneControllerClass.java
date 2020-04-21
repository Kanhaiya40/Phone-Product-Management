package com.webapp.derby.api;

import com.webapp.derby.dao.PhoneRepo;
import com.webapp.derby.model.Phone;
import com.webapp.derby.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneControllerClass {

    @Autowired
    private PhoneService service;

    @PostMapping("/addDetails")
    public String addingPhoneDetails(@RequestBody Phone p)
    {
        service.addPhoneSetails(p);
        return "Details Added Succesfully";
    }

    @GetMapping("/getDetails")
    public List<Phone> getPhoneDetails()
    {
        return service.gettingPhoneDetails();
    }

}
