package peoject.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ObjectToJson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = new Employee("Dipankar", "Kolkata", "Software", "Java_Developer");

        // Create a Json file from the employee object
        // Serialization
        objectMapper.writeValue(new File("target/emp.json"), employee);
    }
}
