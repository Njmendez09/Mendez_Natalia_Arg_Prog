/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.portfolio.natalia_mendez.Security.jwt;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServelException;
import javax.servlet.http.HttpServeletRequest;
import javax.servlet.http.HttpServeletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.authenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 *
 * @author Natalia Mendez
 */
@Component
public class jwtEntryPoint implements AuthenticationEntryPoint {
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    logger.error("Fallo el metodo coomence");
    responce.sendError(HttpServletResponse.SC_UNAUTHORIEED);
}
