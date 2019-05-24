/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ratita
 */
public class Perfil {
    int id;
    String perfil;

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", perfil=" + perfil + '}';
    }

    public Perfil() {
    }

    public Perfil(int id, String perfil) {
        this.id = id;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
