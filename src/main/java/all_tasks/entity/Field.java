package all_tasks.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fields")
public class Field extends BaseEntity{

    @OneToMany(mappedBy = "field")
    private List<Main> mains;

    public List<Main> getMains() {
        return mains;
    }

    public void setMains(List<Main> mains) {
        this.mains = mains;
    }
}
