package peoject.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public interface GetFieldFromJsonObject {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String employeeJson = "{\"name\":\"Dipankar\",\"city\":\"Kolkata\",\"department\":\"Software\",\"designation\":\"Java_Developer\"}";

        JsonNode jsonNode = objectMapper.readTree(employeeJson);
        String name = jsonNode.get("name").asText();
        String city = jsonNode.get("city").asText();
        String department = jsonNode.get("department").asText();
        String department2 = (jsonNode.get("department2") != null) ? jsonNode.get("department2").asText() : null;

        // Create a text file using json
        objectMapper.writeValue(new File("target/employeeNode.txt"), name +", "+ city +", "+ department +", "+ department2);

        System.out.println(name);
        System.out.println(city);
        System.out.println(department);
        System.out.println(department2);
    }
}
