package espol.poo.model;

import java.util.ArrayList;

public abstract class Persona {
    private String ruc;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private String sitioWeb;
    private String personaResponsable;
    private ArrayList<RedSocial> redesSociales;
    
    // Constructor con todos los parámetros menos redesSociales
    public Persona(String ruc, String nombre, String telefono, String email,
                   String direccion, String sitioWeb, String personaResponsable) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.sitioWeb = sitioWeb;
        this.personaResponsable = personaResponsable;
        redesSociales = new ArrayList<RedSocial>();
    }
    
    public void agregarRedSocial(String tipo, String usuario, String enlace){
        TipoRedSocial red = TipoRedSocial.Twitter;
        if (tipo.equals("Twitter")) {
            red = TipoRedSocial.Twitter;
        } else if (tipo.equals("Facebook")) {
            red = TipoRedSocial.Facebook;
        } else if (tipo.equals("Instagram")) {
            red = TipoRedSocial.Instagram;
        } else if (tipo.equals("Youtube")) {
            red = TipoRedSocial.Youtube;
        } else if (tipo.equals("TikTok")) {
            red = TipoRedSocial.TikTok;
        } else if (tipo.equals("LinkedIn")) {
            red = TipoRedSocial.LinkedIn;
        } else if (tipo.equals("Pinterest")) {
            red = TipoRedSocial.Pinterest;
        } else {}
        redesSociales.add(new RedSocial(red, usuario, enlace));
    }
    
    
    //Metodo toString
    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Ruc/Cedula: " + ruc + "\n" +
                "Telefono: " + telefono + "\n" +
                "Email: " + email + "\n" +
                "Direccion: " + direccion + "\n" +
                "SitioWeb: " + sitioWeb + "\n" +
                "PersonaResponsable: " + personaResponsable + "\n" +
                "Redes Sociales: " + redesSociales + "\n";
    }
    
    // Getter y Setter para 'ruc'
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    // Getter y Setter para 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para 'telefono'
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Getter y Setter para 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter y Setter para 'direccion'
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter y Setter para 'sitioWeb'
    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    // Getter y Setter para 'personaResponsable'
    public String getPersonaResponsable() {
        return personaResponsable;
    }

    public void setPersonaResponsable(String personaResponsable) {
        this.personaResponsable = personaResponsable;
    }

    // Getter y Setter para 'redesSociales'
    public ArrayList<RedSocial> getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(ArrayList<RedSocial> redesSociales) {
        this.redesSociales = redesSociales;
    }
}