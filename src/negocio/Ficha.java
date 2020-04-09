/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;

/**
 *
 * @author Gabriel
 */
public class Ficha {
    private int id;
    private String Paciente;
    private Calendar Data;
    private String Queixas;
    private String Sintomas;
    private String Habitos_alimentares;
    private String Mamografia;
    private String Protese;
    private String Alteracoes_mamilos;
    private String Outras_informacoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public Calendar getData() {
        return Data;
    }

    public void setData(Calendar Data) {
        this.Data = Data;
    }

    public String getQueixas() {
        return Queixas;
    }

    public void setQueixas(String Queixas) {
        this.Queixas = Queixas;
    }

    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    public String getHabitos_alimentares() {
        return Habitos_alimentares;
    }

    public void setHabitos_alimentares(String Habitos_alimentares) {
        this.Habitos_alimentares = Habitos_alimentares;
    }

    public String getMamografia() {
        return Mamografia;
    }

    public void setMamografia(String Mamografia) {
        this.Mamografia = Mamografia;
    }

    public String getProtese() {
        return Protese;
    }

    public void setProtese(String Protese) {
        this.Protese = Protese;
    }

    public String getAlteracoes_mamilos() {
        return Alteracoes_mamilos;
    }

    public void setAlteracoes_mamilos(String Alteracoes_mamilos) {
        this.Alteracoes_mamilos = Alteracoes_mamilos;
    }

    public String getOutras_informacoes() {
        return Outras_informacoes;
    }

    public void setOutras_informacoes(String Outras_informacoes) {
        this.Outras_informacoes = Outras_informacoes;
    }

}