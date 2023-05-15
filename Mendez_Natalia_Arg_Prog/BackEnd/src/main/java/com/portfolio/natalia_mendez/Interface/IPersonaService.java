/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.natalia_mendez.Interface;

import com.portfolio.natalia_mendez.Entity.Persona;
import java.util.List;

/**
 *
 * @author Natalia Mendez
 */
public interface IPersonaService {
    //traer una persona
    public List<Persona> getPersona();
    
    //guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
    
}
