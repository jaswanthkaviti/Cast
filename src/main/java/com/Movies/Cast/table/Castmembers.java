package com.Movies.Cast.table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Castmembers {
    @Id
    private int movie_id;
    private String hero;
    private String heroine;
    private String director;
    private String producer;
    private String music_director;

}
