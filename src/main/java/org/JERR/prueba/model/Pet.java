package org.JERR.prueba.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

/**
 * This is an example of an entity.
 * 
 * Feel free feel to rename, modify or remove at your taste.
 */

@Entity @Getter @Setter
public class Pet extends Identifiable {
	
	@Column(length=50) @Required
	String nombre;
	String descripcion;
	@Column(length=50,nullable=false)
	String raza;
	@Column(length=50,nullable=false)
	LocalDate fecha_nacimiento;

}
