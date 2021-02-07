package org.backendComponents.StayAwhileAndListen.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class Diablo2Quotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Column(columnDefinition = "mediumblob")
    private byte[] quote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getQuote() {
        return quote;
    }

    public void setQuote(byte[] quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Diablo2Quotes{" +
                "id=" + id +
                ", quote=" + Arrays.toString(quote) +
                '}';
    }
}
