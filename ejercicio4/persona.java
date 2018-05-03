
package ejercicio4;

import java.io.Serializable;


public class persona implements Serializable{
   /*
  Alumno: Jose Franco Gutierrez
------------------------------   -------
Módulo                            Nota
------------------------------   -------
Lenguaje de marcas         9
Programación                   4
Entornos de desarrollo     6
Base de datos                  5
Sistemas informáticos      8
FOL                                  c-5 */
    String nombre;
    String apellido1;
    String apellido2;
    String lm;
    String prog;
    String ed;
    String bd;
    String si;
    String fol;

    public persona() {
    }

    public persona(String nombre, String apellido1, String apellido2, String lm, String prog, String ed, String bd, String si, String fol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.lm = lm;
        this.prog = prog;
        this.ed = ed;
        this.bd = bd;
        this.si = si;
        this.fol = fol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public String getProg() {
        return prog;
    }

    public void setProg(String prog) {
        this.prog = prog;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.end = ed;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getFol() {
        return fol;
    }

    public void setFol(String fol) {
        this.fol = fol;
    }



    
}
