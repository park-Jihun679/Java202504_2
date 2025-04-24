package ch07_java_base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class StudentDTO {

    private String name;
    private int age;
    private String email;
}
