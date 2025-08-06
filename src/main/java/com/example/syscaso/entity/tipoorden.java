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
@Table(name="Tipoorden")
public class tipoorden {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column (name="id")
private Long id;
@Column (name="descripcion")
private String descripcion;

@OneToOne(mappedBy = "Tipoorden")
private ordenes Ordenes  ;


}
