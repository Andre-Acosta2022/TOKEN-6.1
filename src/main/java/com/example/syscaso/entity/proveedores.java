package com.example.syscaso.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Proveedores")
public class proveedores {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column (name="id")
private Long id;
@Column (name="ruc")
private Number ruc;
@Column (name="razonsocial")
private String razonsocial;
@Column (name="contacto")
private String contacto ;
@Column (name="telefono")
private Number telefono ;
@Column (name="estado")
private char estado;


@OneToOne(mappedBy = "Proveedores")
private ordenes Ordenes  ;

}
