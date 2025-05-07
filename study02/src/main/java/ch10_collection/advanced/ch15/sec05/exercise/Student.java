package ch10_collection.advanced.ch15.sec05.exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student {

    private int id;
    private String name;
    private String email;
    private String github;
}
