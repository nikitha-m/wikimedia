package net.javaguides.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public WikimediaData() {
    }

    public WikimediaData(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WikimediaData{" +
                "id=" + id +
                ", wikiEventData='" + wikiEventData + '\'' +
                '}';
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }

    @Lob
    private String wikiEventData;
}
