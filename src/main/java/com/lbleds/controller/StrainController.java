package com.lbleds.controller;

import com.lbleds.Entity.Strain;
import com.lbleds.Repository.StrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StrainController {

    public StrainController(){

    }

    public StrainController(StrainRepository strainRepository) {
        this.strainRepository = strainRepository;
    }

    @Autowired
    private StrainRepository strainRepository;

    @GetMapping("/")
    public void getStrainsDefault(){

    }

    @GetMapping("/strain")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Strain> getStrains(){
        return (List<Strain>) strainRepository.findAll();
    }

    @PostMapping("/strains")
    void addStrain(@RequestBody Strain strain) {
        strainRepository.save(strain);
    }

    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("templates/");
        //resolver.setSuffix(".html");
        return resolver;
    }

}
