
package Logica;

/**
 *
 * @author end savage
 */
public class cls_empleados {
    
    private String idStr;
    private String nombreStr;
    private String apellidoStr;
    private String numero_contactoStr;
    private String correoStr;
    private String sexoStr;
    private String perfil_profesionalStr;
    private String estudios_realizadosStr;

    public cls_empleados(String idStr, String nombreStr, String apellidoStr, String numero_contactoStr, String correoStr, String sexoStr, String perfil_profesionalStr, String estudios_realizadosStr) {
        this.idStr = idStr;
        this.nombreStr = nombreStr;
        this.apellidoStr = apellidoStr;
        this.numero_contactoStr = numero_contactoStr;
        this.correoStr = correoStr;
        this.sexoStr = sexoStr;
        this.perfil_profesionalStr = perfil_profesionalStr;
        this.estudios_realizadosStr = estudios_realizadosStr;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getApellidoStr() {
        return apellidoStr;
    }

    public void setApellidoStr(String apellidoStr) {
        this.apellidoStr = apellidoStr;
    }

    public String getNumero_contactoStr() {
        return numero_contactoStr;
    }

    public void setNumero_contactoStr(String numero_contactoStr) {
        this.numero_contactoStr = numero_contactoStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    public String getSexoStr() {
        return sexoStr;
    }

    public void setSexoStr(String sexoStr) {
        this.sexoStr = sexoStr;
    }

    public String getPerfil_profesionalStr() {
        return perfil_profesionalStr;
    }

    public void setPerfil_profesionalStr(String perfil_profesionalStr) {
        this.perfil_profesionalStr = perfil_profesionalStr;
    }

    public String getEstudios_realizadosStr() {
        return estudios_realizadosStr;
    }

    public void setEstudios_realizadosStr(String estudios_realizadosStr) {
        this.estudios_realizadosStr = estudios_realizadosStr;
    }
    
    
    
    
    
}
