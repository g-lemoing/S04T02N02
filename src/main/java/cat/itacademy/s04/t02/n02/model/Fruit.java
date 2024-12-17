package cat.itacademy.s04.t02.n02.model;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(length = 50, name = "name")
    private String name;

    @Column(name = "kg_Qty")
    private int kgQty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKgQty() {
        return kgQty;
    }

    public void setKgQty(int kgQty) {
        this.kgQty = kgQty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
