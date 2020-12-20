package com.project.Tournamently.user;

public class AdminDto {

    private Long admin_id;
    private String admin_name;
    private String email;

    public Long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Long admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AdminDto{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
