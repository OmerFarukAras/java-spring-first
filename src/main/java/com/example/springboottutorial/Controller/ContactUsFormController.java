package com.example.springboottutorial.Controller;

import com.example.springboottutorial.util.util;
import com.example.springboottutorial.ContactUsForm.ContactUsForm;
import com.example.springboottutorial.ContactUsForm.ContactUsFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactUsFormController {

    @Autowired
    private ContactUsFormRepository contactUsFormRepository;


    @PostMapping("/contact")
    public String addCustomer(@RequestParam String head, @RequestParam String body, @RequestParam String mail) {
        ContactUsForm form = new ContactUsForm();
        String ND = util.GetDate();

        form.setHead(head);
        form.setBody(body);
        form.setDate(ND);
        form.setMail(mail);
        contactUsFormRepository.save(form);
        return "Your form is sent!";
    }

    @GetMapping("/contact/list")
    public Iterable<ContactUsForm> getContactForms() {
        return contactUsFormRepository.findAll();
    }

    @GetMapping("/contact/find/{id}")
    public ContactUsForm findCustomerById(@PathVariable Integer id) {
        return contactUsFormRepository.findFormById(id);
    }
}