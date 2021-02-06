package org.backendComponents.StayAwhileAndListen.model;

import javax.persistence.*;

@Entity
public class Diablo2Quotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Column(columnDefinition = "mediumblob")
    private byte[] quote;
}
