package org.sid.cinema.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.cinema.Entities.Cinema;

import java.util.Collection;
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Ville {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private double longitude,latitude,altitude;
@OneToMany(mappedBy ="ville")
private Collection<Cinema> cinemas;

}
