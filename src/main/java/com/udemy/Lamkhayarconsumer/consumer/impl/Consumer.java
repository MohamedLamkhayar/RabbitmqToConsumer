package com.udemy.Lamkhayarconsumer.consumer.impl;

import com.udemy.Lamkhayarconsumer.consumer.IConsumer;
import com.udemy.Lamkhayarconsumer.entities.Etudiant;
import com.udemy.Lamkhayarconsumer.json.Student;
import com.udemy.Lamkhayarconsumer.repositories.EtudiantRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.Date;

@Component
public class Consumer implements IConsumer {

    @Autowired
    private EtudiantRepository repository;

    @Override
    @RabbitListener(queues = "${udemy.rabbitmq.queue}")
    public void consumeMessage(Student student) {
        Etudiant etudiant = Etudiant.builder().nom(student.getName()).prenom(student.getFirstname()).age(student.getAge()).dateReception(new Date()).build();
        repository.save(etudiant);
        System.out.println("Recieved message = " + student.toString());
    }
}
