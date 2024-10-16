package org.JERR.prueba.model;

import java.time.*;

import javax.persistence.*;

import lombok.*;

/**
 * This is an example of an entity.
 * 
 * Feel free feel to rename, modify or remove at your taste.
 */

@Entity @Getter @Setter
public class Computer {
	private int id;
	private String model;
	private LocalDate release_date;
	private int ram;
	private int rom;
	private String computer_type;
}
