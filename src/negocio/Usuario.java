/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Gabriel
 */
public class Usuario {
    
   private long id;
   private String CrieUsuario;
   private String CrieSenha;
   private String RepitaSenha;
   private String Tipo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCrieUsuario() {
        return CrieUsuario;
    }

    public void setCrieUsuario(String CrieUsuario) {
        this.CrieUsuario = CrieUsuario;
    }

    public String getCrieSenha() {
        return CrieSenha;
    }

    public void setCrieSenha(String CrieSenha) {
        this.CrieSenha = CrieSenha;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
   public String getRepitaSenha(){
       return RepitaSenha;
   }
   public void setRepitaSenha(String RepitaSenha){
       this.RepitaSenha = RepitaSenha;
   }
   
}
     
