package br.com.ifsp.CafeteriaMySQL.Model;

import org.hibernate.validator.constraints.NotBlank;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "usuario")
@Entity(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private long Id;
	
	@NotBlank(message = "Login não pode ser vazio!")
	private String login;
	@NotBlank(message = "Senha não pode ser vazio!")
	private String senha;
	
}
