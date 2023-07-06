package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = Arrays.asList(
            new Contact(1L, "ali@gmail.com", "ALi", 1311L),
            new Contact(2L, "qadir@gmail.com", "Qadir", 1311L),
            new Contact(3L, "atif@gmail.com", "Atif", 1312L),
            new Contact(4L, "sattar@gmail.com", "Sattar", 1314L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
