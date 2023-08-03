package com.Movies.Cast.service;

import com.Movies.Cast.repository.castrepo;
import com.Movies.Cast.table.Castmembers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service

public class castservice {
    private final castrepo castrepo;
    public castservice(castrepo castrepo){
        this.castrepo=castrepo;
    }

    public static List<Castmembers> findById(int i) {
        return null;
    }

    public void insertData(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter movie id: ");
        int movie_id = Integer.parseInt(input.nextLine());

        System.out.println("Enter hero name: ");
        String hero = input.nextLine();

        System.out.println("Enter heroine name: ");
        String heroine = input.nextLine();

        System.out.println("Enter director name:");
        String director = input.nextLine();

        System.out.println("Enter producer name:");
        String producer = input.nextLine();

        System.out.println("Enter music director name:");
        String music_director = input.nextLine();

        Castmembers c1 = new Castmembers();
        c1.setMovie_id(movie_id);
        c1.setDirector(director);
        c1.setHero(hero);
        c1.setProducer(producer);
        c1.setHeroine(heroine);
        c1.setMusic_director(music_director);

        castrepo.save(c1);

        input.close();
    }
    public Castmembers retreiveData(int movie_id){
        if (castrepo.existsById(movie_id))
        {
            //System.out.println(pd_abstracted.toString());
            return castrepo.findById(movie_id).get();
        }
        return null;
    }

    public Iterable<Castmembers> fetchAllData() {

        return castrepo.findAll();
    }

    public Castmembers fetchDataById(int id) {
        return castrepo.findById(id).get();
    }
}
