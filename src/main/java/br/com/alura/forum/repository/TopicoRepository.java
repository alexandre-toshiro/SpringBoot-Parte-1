package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
													//<Entidade que vai trabalhar, tipo da chave primária da entidade>
	
	/*
	 * Esta interface irá herdar de JpaRe, que já possui as operações básicas de CRUD, onde não será mais necessário
	 * criar um DAO para cada controle. Esta interface ficará vazia, pois o métodos que utilizaremos virão todos da classe extendida.
	 * 
	 * */

}
