package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Topico;
/*
 * Esta interface irá herdar de JpaRe, que já possui as operações básicas de CRUD, onde não será mais necessário
 * criar um DAO para cada controle. Esta interface ficará vazia, pois o métodos que utilizaremos virão todos da classe extendida.
 * 
 * */
public interface TopicoRepository extends JpaRepository<Topico, Long>{
								//<Entidade que vai trabalhar, tipo da chave primária da entidade>
	List<Topico> findByCursoNome(String nomeCurso);
	
	/* Se for seguido o padrão do SpringData("findBy" + nome do Atributo em maisuculo), de forma
	 * automática, será montada a query jpql para você.
	 * Nesse caso em espcífico, estamos viajando entre relacionamentos, então, dentro da Classe Tópico, possui
	 * o atributo Curso(que também é uma classe e possui relacionamento com o topico) e vamos buscar dentro o seu nome
	 * dentro da própria classe Curso, por isso o "CursoNome".
	 * Os relaciomentos podem ser infinitos, o springdata irá fazer o Join, basta seguir o padrão, "CursoAlunoPessoa" por ex.
	 * As vezes pode acontecer de você ter um atributo de mesmo nome do método, por exemplo, nesse caso do CursoNome e se tem
	 * um atributo "nomeCurso", isso ficara ambiguo para o Spring e o mesmo irá considerar o ATRIBUTO para a query, para resolver
	 * apenas adicionar um "_" entre os nomes, ficariam assim: "Nome_Curso".
	 * 
	 */
													
	
	

}
