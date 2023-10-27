package br.com.ifsp.boletim.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="nota")
public class NotaModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idNota;
	private String materia;
	private int nota;
}
