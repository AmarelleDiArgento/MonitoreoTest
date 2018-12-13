/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

/**
 *
 * @author almoreno
 */
public class tbInf_Monitoreo {

    private String Id_terminal;
    private String fecha;
    private int Id_encabezado;
    private String Nombre_monitor;
    private String Nombre_finca;
    private String Nombre_tipo;
    private String Nombre_prod;
    private String Nombre;
    private String Bloque;
    private int Cama;
    private int Linea;
    private int Cantidad_R;
    private int Valor1;
    private int Valor2;
    private int Valor3;
    private int Valor4;
    private int Valor5;
    private int Valor6;
    private int Valor7;
    private int Valor8;
    private int cantidad;
    private int id_causa1;
    private int id_causa2;
    private int id_causa3;

    public tbInf_Monitoreo(String Id_terminal, String fecha, int Id_encabezado, String Nombre_monitor, String Nombre_finca, String Nombre_tipo, String Nombre_prod, String Nombre, String Bloque, int Cama, int Linea, int Cantidad_R, int Valor1, int Valor2, int Valor3, int Valor4, int Valor5, int Valor6, int Valor7, int Valor8, int cantidad, int id_causa1, int id_causa2, int id_causa3) {
        this.Id_terminal = Id_terminal;
        this.fecha = fecha;
        this.Id_encabezado = Id_encabezado;
        this.Nombre_monitor = Nombre_monitor;
        this.Nombre_finca = Nombre_finca;
        this.Nombre_tipo = Nombre_tipo;
        this.Nombre_prod = Nombre_prod;
        this.Nombre = Nombre;
        this.Bloque = Bloque;
        this.Cama = Cama;
        this.Linea = Linea;
        this.Cantidad_R = Cantidad_R;
        this.Valor1 = Valor1;
        this.Valor2 = Valor2;
        this.Valor3 = Valor3;
        this.Valor4 = Valor4;
        this.Valor5 = Valor5;
        this.Valor6 = Valor6;
        this.Valor7 = Valor7;
        this.Valor8 = Valor8;
        this.cantidad = cantidad;
        this.id_causa1 = id_causa1;
        this.id_causa2 = id_causa2;
        this.id_causa3 = id_causa3;
    }

    public int getId_causa3() {
        return id_causa3;
    }

    public void setId_causa3(int id_causa3) {
        this.id_causa3 = id_causa3;
    }

    public String getId_terminal() {
        return Id_terminal;
    }

    public void setId_terminal(String Id_terminal) {
        this.Id_terminal = Id_terminal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_encabezado() {
        return Id_encabezado;
    }

    public void setId_encabezado(int Id_encabezado) {
        this.Id_encabezado = Id_encabezado;
    }

    public String getNombre_monitor() {
        return Nombre_monitor;
    }

    public void setNombre_monitor(String Nombre_monitor) {
        this.Nombre_monitor = Nombre_monitor;
    }

    public String getNombre_finca() {
        return Nombre_finca;
    }

    public void setNombre_finca(String Nombre_finca) {
        this.Nombre_finca = Nombre_finca;
    }

    public String getNombre_tipo() {
        return Nombre_tipo;
    }

    public void setNombre_tipo(String Nombre_tipo) {
        this.Nombre_tipo = Nombre_tipo;
    }

    public String getNombre_prod() {
        return Nombre_prod;
    }

    public void setNombre_prod(String Nombre_prod) {
        this.Nombre_prod = Nombre_prod;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getBloque() {
        return Bloque;
    }

    public void setBloque(String Bloque) {
        this.Bloque = Bloque;
    }

    public int getCama() {
        return Cama;
    }

    public void setCama(int Cama) {
        this.Cama = Cama;
    }

    public int getLinea() {
        return Linea;
    }

    public void setLinea(int Linea) {
        this.Linea = Linea;
    }

    public int getCantidad_R() {
        return Cantidad_R;
    }

    public void setCantidad_R(int Cantidad_R) {
        this.Cantidad_R = Cantidad_R;
    }

    public int getValor1() {
        return Valor1;
    }

    public void setValor1(int Valor1) {
        this.Valor1 = Valor1;
    }

    public int getValor2() {
        return Valor2;
    }

    public void setValor2(int Valor2) {
        this.Valor2 = Valor2;
    }

    public int getValor3() {
        return Valor3;
    }

    public void setValor3(int Valor3) {
        this.Valor3 = Valor3;
    }

    public int getValor4() {
        return Valor4;
    }

    public void setValor4(int Valor4) {
        this.Valor4 = Valor4;
    }

    public int getValor5() {
        return Valor5;
    }

    public void setValor5(int Valor5) {
        this.Valor5 = Valor5;
    }

    public int getValor6() {
        return Valor6;
    }

    public void setValor6(int Valor6) {
        this.Valor6 = Valor6;
    }

    public int getValor7() {
        return Valor7;
    }

    public void setValor7(int Valor7) {
        this.Valor7 = Valor7;
    }

    public int getValor8() {
        return Valor8;
    }

    public void setValor8(int Valor8) {
        this.Valor8 = Valor8;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_causa1() {
        return id_causa1;
    }

    public void setId_causa1(int id_causa1) {
        this.id_causa1 = id_causa1;
    }

    public int getId_causa2() {
        return id_causa2;
    }

    public void setId_causa2(int id_causa2) {
        this.id_causa2 = id_causa2;
    }

    @Override
    public String toString() {
        return "tbInf_Monitoreo{" + "Id_terminal=" + Id_terminal + ", fecha=" + fecha + ", Id_encabezado=" + Id_encabezado + ", Nombre_monitor=" + Nombre_monitor + ", Nombre_finca=" + Nombre_finca + ", Nombre_tipo=" + Nombre_tipo + ", Nombre_prod=" + Nombre_prod + ", Nombre=" + Nombre + ", Bloque=" + Bloque + ", Cama=" + Cama + ", Linea=" + Linea + ", Cantidad_R=" + Cantidad_R + ", Valor1=" + Valor1 + ", Valor2=" + Valor2 + ", Valor3=" + Valor3 + ", Valor4=" + Valor4 + ", Valor5=" + Valor5 + ", Valor6=" + Valor6 + ", Valor7=" + Valor7 + ", Valor8=" + Valor8 + ", cantidad=" + cantidad + ", id_causa1=" + id_causa1 + ", id_causa2=" + id_causa2 + ", id_causa3=" + id_causa3 + '}';
    }
    
}
