/*
 * Classe responsavel por implementar regras de negocios de manejamento de usuarios 
 * usando os insumos (criados na package util)
*/
package com.test.one.services;

import com.test.one.exceptions.UsuarioNAutorizado;
import com.test.one.model.Usuario;
import com.test.one.util.SQLAutentica;

public class ControleUsuario{
	
	 /* Autenticacao de usuarios
	 */ 
	public static void autenticaUsuario(Usuario usuario) throws UsuarioNAutorizado {
		if (!SQLAutentica.doAutentica(usuario)) throw new UsuarioNAutorizado();
	}
	

}

