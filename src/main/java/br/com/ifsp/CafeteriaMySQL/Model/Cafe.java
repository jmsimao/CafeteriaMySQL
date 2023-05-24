package br.com.ifsp.CafeteriaMySQL.Model;

import java.util.UUID;

import org.hibernate.validator.constraints.NotBlank;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "cafe")
@Entity(name = "Cafe")
public class Cafe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private int Id;
	//

	@NotBlank(message = "Nome não pode ser vazio!")
	private String name;
	private String historia;
	private String sabor;
	private String referencia;
	private String imagem;
	private final String uuid_key;
	
	public Cafe(int Id, String name, String historia, String sabor, String referencia, String imagem) {
		super();
		this.Id = Id;
		this.name = name;
		this.historia = historia;
		this.sabor = sabor;
		this.referencia = referencia;
		this.imagem = imagem;
		this.uuid_key = UUID.randomUUID().toString();
	}

	public Cafe() {
		this.uuid_key = UUID.randomUUID().toString();
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getUuid_key() {
		return uuid_key;
	}
	
}
