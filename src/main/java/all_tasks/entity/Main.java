package all_tasks.entity;

import javax.persistence.*;

@Entity
@Table(name = "main12")
public class Main extends BaseEntity {

    @Column(columnDefinition = "VARCHAR(280)")
    private String label;

    @ManyToOne
    @JoinColumn(name = "field_id", nullable = false)
    private Field field;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

