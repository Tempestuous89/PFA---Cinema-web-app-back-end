package org.sid.cinema.Entities;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketProj",types=Ticket.class)
public interface TicketProjection {
    public Long getId();
    public String getnomClient();
    public double getPrix();
    public Integer getCodePayement();
    public boolean getReserve();
    public Place getPlace();

}
