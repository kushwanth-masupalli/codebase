package therobust18.annotations;

import org.hibernate.sql.results.graph.embeddable.EmbeddableLoadingLogger;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    int id;
    String name ;
   public Employee(){}
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
