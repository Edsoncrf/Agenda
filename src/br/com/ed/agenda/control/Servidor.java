package br.com.ed.agenda.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public interface Servidor {
	String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
