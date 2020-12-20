package com.project.Tournamently.user;

public class TournamentOrganizerDto {

    private Long organizer_id;
    private String organizer_name;
    private String email;

    public Long getOrganizer_id() {
        return organizer_id;
    }

    public void setOrganizer_id(Long organizer_id) {
        this.organizer_id = organizer_id;
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

    @Override
    public String toString() {
        return "TournamentOrganizerDto{" +
                "organizer_id=" + organizer_id +
                ", organizer_name='" + organizer_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
