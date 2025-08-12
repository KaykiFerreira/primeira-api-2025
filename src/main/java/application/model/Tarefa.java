package application.model;

import java.persistence.Entity;
import java.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tarefa {
    @id
    private long id;
    private String descricao; 

}