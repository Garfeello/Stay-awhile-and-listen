package org.backendComponents.StayAwhileAndListen.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Diablo2Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToMany
    private List<Diablo2Quotes> diablo2Quotes;

}
