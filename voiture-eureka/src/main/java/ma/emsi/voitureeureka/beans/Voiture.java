package ma.emsi.voitureeureka.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.voitureeureka.utils.ClientVo;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    private Long id_client;
    @Transient
    private ClientVo client;
}
