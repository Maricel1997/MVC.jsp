/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.controller;

import com.maricel.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
@WebServlet(urlPatterns="/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
    Usuario user= new Usuario();
    
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
       req.setAttribute("id", user.getId());
        req.setAttribute("nombre", user.getNombre());
         req.setAttribute("email", user.getEmail());
         req.setAttribute("nacionalidad", user.getNacionalidad());
         
         
          req.getServletContext().getRequestDispatcher("/Usuariosdato.jsp").forward(req, resp);
          
          
    }
          
        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        user.setId(req.getParameter("id"));
         user.setNombre(req.getParameter("nombre"));
         user.setEmail(req.getParameter("email"));
         user.setNacionalidad(req.getParameter("nacionalidad"));
         
         resp.sendRedirect(req.getContextPath() + "/UsuarioServlet");
          
  
    
    }
        
    
         
    }
    
