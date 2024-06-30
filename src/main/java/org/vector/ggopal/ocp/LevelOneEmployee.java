package org.vector.ggopal.ocp;

public class LevelOneEmployee extends AbstractEmployee {

    public LevelOneEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return 0;
    }
}
