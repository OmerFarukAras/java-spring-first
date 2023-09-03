package com.example.springboottutorial.ContactUsForm;

import org.springframework.data.repository.CrudRepository;

public interface ContactUsFormRepository extends CrudRepository<ContactUsForm, Integer> {
    ContactUsForm findFormById(Integer id);
}