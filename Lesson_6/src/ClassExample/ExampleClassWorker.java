package ClassExample;

import java.awt.*;

public class ExampleClassWorker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id: %d fn: %s ln: %s salary:%d", id, firstName,lastName,salary);

    }

    @Override
    public boolean equals(Object obj) {
        ExampleClassWorker t = (ExampleClassWorker) obj;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
