package net.mcpato.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.mcpato.empleos.model.Vacante;




@Controller
public class HomeController {

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model){
        Vacante vacante = new Vacante();
        vacante.setNombre("Ingeniero Comunicaciones");
        vacante.setDescripcion("");
        vacante.setSalario(9000.0);
        vacante.setFecha(new Date());

        model.addAttribute("vacante",vacante);
        return "detalle";
    }
    
    @GetMapping("/")
    public String mostrarHome(Model model){
        /*
        model.addAttribute("mensaje", "AAAAAAAAAAAAAA");
        model.addAttribute("fecha", new Date()  );
         */

        String nombre = "Aux Contabilidad";
        Date fechaPub = new Date();
        double salario = 9000.0;
        boolean vigente = true;

        model.addAttribute("nombre", nombre);
        model.addAttribute("fechaPub", fechaPub);
        model.addAttribute("salario", salario);
        model.addAttribute("vigente", vigente);
       
        return "home";
    }

    @GetMapping("/listado")
    public String mostrarListado(Model model) {

        List<String> lista = new LinkedList<String>();
        lista.add("Ingeniero de Sistemas");
        lista.add("Aux Contabilidad");
        lista.add("Vendedor");
        lista.add("Arquitecto");

        model.addAttribute("empleos", lista);

        return "listado";
    }
    
}
