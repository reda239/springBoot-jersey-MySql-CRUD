package com.example.springrestandsoapdemo.Web;

import com.example.springrestandsoapdemo.Entity.Comptes;
import com.example.springrestandsoapdemo.Respositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Component//pour scanner linjection de dependence
@Path("/banque")
public class CompteRestApi {
    @Autowired
    private CompteRepository compteRepository;
    @Path("/Comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Comptes> comptesList(){
        return compteRepository.findAll();
    }
    @Path("/Comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response compte(@PathParam(value="id") Long id){
        Optional<Comptes> compte =  compteRepository.findById(id);
        compte.orElseThrow(NotFoundException::new);
        return Response.ok(compte.get()).build();
    }
    @Path("/Comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Comptes save(Comptes compte){
        return compteRepository.save(compte);
    }
    @Path("/Comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Comptes update(@PathParam(value="id") Long id,Comptes compte){
        Optional<Comptes> compteCheck =  compteRepository.findById(id);
        compteCheck.orElseThrow(NotFoundException::new);
        compte.setId(id);
        return compteRepository.save(compte);
    }
    @Path("/Comptes/{id}")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam(value="id") Long id){
         compteRepository.deleteById(id);
    }
}
