package Exceptions03;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Company {
	private final String name;
	private final ArrayList<Employee> employees;
	private int numberOfEmployees;
}
