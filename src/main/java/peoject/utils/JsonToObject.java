package peoject.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String employeeJson = "{\"name\":\"Dipankar\",\"city\":\"Kolkata\",\"department\":\"Software\",\"designation\":\"Java_Developer\"}";

        // Json to object convert which is deserilization
        Employee employee = objectMapper.readValue(employeeJson, Employee.class);

        System.out.println(employee.getCity()+" - "+employee.getName());
    }
}
