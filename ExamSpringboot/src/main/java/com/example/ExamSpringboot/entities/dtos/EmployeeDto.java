package com.example.ExamSpringboot.entities.dtos;

import com.example.ExamSpringboot.entities.Employee;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    public long id;
    public String fullName;
    public String salary;

    public EmployeeDto(Employee employee) {
        BeanUtils.copyProperties(employee, this);
    }
}
