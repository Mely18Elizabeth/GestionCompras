package ec.edu.ups.poo.clases;

public class Direccion {
    private String callePrincipal;
    private String calleSecundaria;
    private String ciudad;

    public Direccion() {}

    public Direccion(String callePrincipal, String calleSecundaria, String ciudad) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.ciudad = ciudad;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "callePrincipal='" + callePrincipal + '\'' +
                ", calleSecundaria='" + calleSecundaria + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
