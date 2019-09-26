package br.com.bandtec.agendadeobjetivos.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface TodosUsuarios extends JpaRepository<Usuario, Long > {
    //linguagem HQL ou JPQL para escrever os scripts do banco

   @Query("select u from Usuario u where u.login = : login and u.senha = senha")
   public Usuario buscarUsando(String login, String senha);
}
