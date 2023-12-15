package appgitclient;
/**
* gitclient: Describe el tipo de Gitclient elegido
* @author Alberto Casado
*/

public class GitClient {

    private String cliente;
    private String version;
    private String sistemoper;
    private String licencia;

    public void Gitclient() {
    }
    
    public String getcliente() {
        return cliente; 
    }
    
    public void setcliente (String cliente) {
    this.cliente = cliente;
    }
    
    public String getVersion () {
        return version;
    }
    
    public void setVersion (String version) { 
        this.version = version; 
    }
    
    public String getsistemoper () {
        return sistemoper;
    }
    
    public void setsistemOper(String sistemoper) {
        this.sistemoper = sistemoper;
    }
    public String getLicencia () {
        return licencia;
    }
    public void setLicencia (String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "GitClient{" + "cliente=" + cliente + ", version=" + version + ", sistemoper=" + sistemoper + ", licencia=" + licencia + '}';
    }
}