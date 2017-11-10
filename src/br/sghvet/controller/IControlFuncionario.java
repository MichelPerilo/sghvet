package br.sghvet.controller;

import br.sghvet.model.Administrativo;
import br.sghvet.model.Auxiliar;
import br.sghvet.model.Usuario;
import br.sghvet.model.Veterinario;

public interface IControlFuncionario {

	public Usuario buscaUsuario(String cpf, String senha) throws Exception; // Login
	public boolean cadastrarUsuario(Usuario user) throws Exception;
	public boolean atualizarUsuario(Usuario user) throws Exception;
	public boolean deletarUsuario(Usuario user) throws Exception;
	
	public Veterinario buscaVeterinario(String cpf)throws Exception;
	public boolean cadastrarVeterinario(Usuario user, Veterinario vet) throws Exception;
	public boolean atualizarVeterinario(Veterinario vet) throws Exception;
	public boolean deletarVeterinario(Veterinario vet) throws Exception;
	
	public Administrativo buscaAdm(String cpf) throws Exception;
	public boolean cadastraAdm(Usuario user, Administrativo adm) throws Exception;
	public boolean atualizaAdm(Administrativo adm) throws Exception;
	public boolean deletarAdm(Administrativo adm) throws Exception;
	
	public Auxiliar buscaAuxiliar(String cpf) throws Exception;
	public boolean cadastrarAuxiliar(Usuario user, Auxiliar aux) throws Exception;
	public boolean atualizarAuxiliar(Auxiliar aux) throws Exception;
	public boolean deletarAuxiliar(Auxiliar aux)throws Exception;
}
