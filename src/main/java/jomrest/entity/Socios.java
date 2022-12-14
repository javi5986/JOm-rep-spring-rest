package jomrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * MAPEO DE ENTIDADES CON HIBERNATE
 */
/*
 * 
 JPA: java persistence api (muchas interfaces)
 Hibernate: implementacion de JPA
 @Entity > es una entidad: representa tabla: DEBEN tener un id=PK
 @Table: indicar el nombre de la tabla
*/
@Entity
@Table(name = "socios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Socios {

	@Id
	//la clave en la db: es AUTOINCREMENT
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	//pk compusta (vemos mas adelante)
	
	@Column(nullable = false,length = 50, name="apellido")//jpa+hibernate
	@NotEmpty//validators: para controller
	//@MiValidador(value = "100")
	private String apellido;
	
	@Column(nullable = false,length = 60)
	@NotEmpty
	private String nombre;
	
	@Column(nullable = false,length = 6,unique = true)
	@NotEmpty
	private String codigo;
}
