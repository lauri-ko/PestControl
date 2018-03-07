package main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pest")
class Pest {
    private int pestId;
    private String name;
    private String description;

    @Id
    @GeneratedValue
    @Column(name = "PestId")
    public int getPestId() {
        return pestId;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setPestId(int pestId) {
        this.pestId = pestId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
