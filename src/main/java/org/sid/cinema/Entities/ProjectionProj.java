package org.sid.cinema.Entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;
import java.util.List;

//Pour customiser les informations a afficher lors du fetching d'une projection
@Projection(name="p1",types={org.sid.cinema.Entities.Projection.class})
public interface ProjectionProj {
    public Long getId();
    public double getPrix();
    public Date getDateProjection();
    public Salle getSalle();
    public Film getFilm();
    public Seance getSeance();
    public Collection<Ticket> getTickets();
}
