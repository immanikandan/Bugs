/*
 * HelloWorld! Classe para testar apenas. 
 * 
*/
package com.test.one.controller;

import java.util.List;

import org.hibernate.Session;

import com.test.one.model.Usuario;
import com.test.one.util.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends BaseAction{
	
	public String execute(){
		System.out.println("Teste");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Teste");
		
		HibernateUtil.persist(usuario);
		
		
		return "success";
	}

}
