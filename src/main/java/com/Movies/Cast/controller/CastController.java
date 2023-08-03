package com.Movies.Cast.controller;

import com.Movies.Cast.service.castservice;
import com.Movies.Cast.table.Castmembers;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//@Controller
//@AllArgsConstructor
//public class CastController {
//    private castservice cs;

    /* @RequestMapping(value="bro")
        public String gotobro(@RequestParam int movie_id, ModelMap modelMap){
            Castmembers c2 = cs.retreiveData(1);
            modelMap.put("movieDirector",c2.getDirector());
            modelMap.put("movieHero",c2.getHero());
            modelMap.put("movieHeroine",c2.getHeroine());
            modelMap.put("movieProducer",c2.getProducer());
            modelMap.put("movieMusicDirector",c2.getMusic_director());
            return "bro";
        }*/
//   @RequestMapping("bro")
//    public String gotobro(ModelMap model){
//       List<Castmembers> castmembersList = castservice.findById(1);
//       model.addAttribute("castmembers",castmembersList);
//       return "bro";
//
//    }
//    @RequestMapping(value="baby")
//    public String gotobaby(){
//        return "baby";
//    }
//
//}

@RestController
public class CastController
{

    @Autowired
    private castservice cservice;

    @GetMapping("fetchAllData")
    public Iterable<Castmembers> fetchData()
    {

        return cservice.fetchAllData();
    }
    @GetMapping("fetchById/{id}")
    public Castmembers fetchById(@PathVariable int id)
    {

        return cservice.fetchDataById(id);
    }

}






















