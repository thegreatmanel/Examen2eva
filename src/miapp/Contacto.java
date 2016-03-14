package miapp;

/**
 * atributos de contacto.
 * @author thegreatmanel
 * @version 2.0
 */
public class Contacto {

    private int id;

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    /**
     * Constructor 
     */
    public Contacto() {
    }

    /**
     *
     * @param id  valores de id.
     * @param nombre  valores de nombre.
     * @param apellido valores de apellido.
     * @param telefono valores de telefono.
     * @param email valores de email.
     */
    public Contacto(int id, String nombre, String apellido, String telf, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return nombre de los contactos.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre nombre de los contactos.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return apellido de los contactos.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido apellidos de los contactos.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return telefono de contactos.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono telefono de contactos.
     */
    public void setTelf(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return email de los contactos.
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email de los contactos.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String texto;

        texto = "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telf=" + telefono + ", email=" + email + '}';
        return texto;
    }

}
