
package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Restaurante {
    private List<Menu>menus;
    private String Nombre;
    private List<Mesa>mesas;
    public Restaurante( String nombre) {
        this.menus = new LinkedList<>();
        Nombre = nombre;
        this.mesas = new LinkedList<>();
    }
    public List<Menu> getMenus() {
        return menus;
    }
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public List<Mesa> getMesas() {
        return mesas;
    }
    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }


}