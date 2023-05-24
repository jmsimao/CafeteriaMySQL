package br.com.ifsp.CafeteriaMySQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifsp.CafeteriaMySQL.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
