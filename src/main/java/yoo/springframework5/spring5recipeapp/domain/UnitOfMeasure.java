package yoo.springframework5.spring5recipeapp.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uom;

    @OneToOne
    private Ingredient ingredient;
}
