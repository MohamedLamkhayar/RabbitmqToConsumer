package com.udemy.Lamkhayarconsumer.consumer;

import com.udemy.Lamkhayarconsumer.json.Student;

public interface IConsumer {
    void consumeMessage(Student student);
}
