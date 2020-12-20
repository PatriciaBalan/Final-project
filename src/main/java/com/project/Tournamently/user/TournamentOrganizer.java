package com.project.Tournamently.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TournamentOrganizer")
@Table(name = "tournament_organizer")
public class TournamentOrganizer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long organizer_id;
    private Long user_id;
    private String user_type;
    private String organizer_name;
    private String email;
    private Long tournament_id;

    public TournamentOrganizer() {
    }

    public Long getOrganizer_id() {
        return organizer_id;
    }

    public void setOrganizer_id(Long organizer_id) {
        this.organizer_id = organizer_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getOrganizer_name() {
        return organizer_name;
    }

    public void setOrganizer_name(String organizer_name) {
        this.organizer_name = organizer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(Long tournament_id) {
        this.tournament_id = tournament_id;
    }

    @Override
    public String toString() {
        return "TournamentOrganizer{" +
                "organizer_id=" + organizer_id +
                ", user_id=" + user_id +
                ", user_type='" + user_type + '\'' +
                ", organizer_name='" + organizer_name + '\'' +
                ", email='" + email + '\'' +
                ", tournament_id=" + tournament_id +
                '}';
    }
}
