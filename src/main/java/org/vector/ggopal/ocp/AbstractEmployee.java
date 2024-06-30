package org.vector.ggopal.ocp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEmployee implements Employee {

    private String name;
    private double salary;

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract public double calculateBonus();
}
