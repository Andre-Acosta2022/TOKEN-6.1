package com.example.syscaso.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="Ordenes")
public class ordenes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column (name="id")
private Long id;
@Column (name="fecha_orden")
private Number fecha_orden ;
@Column (name="fecha_solicita")
private Number fecha_solicita ;
@Column (name="estado")
private char estado;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "proveedores_id", referencedColumnName = "id")
private proveedores Proveedores;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "almacenes_id", referencedColumnName = "id")
private almacenes Almacenes;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "tipoorden_id", referencedColumnName = "id")
private tipoorden Tipoorden;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "formapago_id", referencedColumnName = "id")
private formapago Formapago;
}

