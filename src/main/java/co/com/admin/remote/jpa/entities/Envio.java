package co.com.admin.remote.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan David Martinez
 */
@Entity
@Table(name = "envios")
@XmlRootElement
public class Envio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fecha_carga")
    private String fechaCarga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "observaciones_vendedor")
    private String observacionesVendedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fecha_estimada")
    private String fechaEstimada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "establecimiento")
    private String establecimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "despachado")
    private String despachado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estatus_novedad")
    private String estatusNovedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fecha_estatus_novedad")
    private String fechaEstatusNovedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "comentarios")
    private String comentarios;
    @JoinColumn(name = "id_pedidos", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedido pedido;

    public Envio() {
    }

    public Envio(Integer id) {
        this.id = id;
    }

    public Envio(Integer id, String fechaCarga, String observacionesVendedor, String fechaEstimada, String establecimiento, String despachado, String estatusNovedad, String fechaEstatusNovedad, String comentarios) {
        this.id = id;
        this.fechaCarga = fechaCarga;
        this.observacionesVendedor = observacionesVendedor;
        this.fechaEstimada = fechaEstimada;
        this.establecimiento = establecimiento;
        this.despachado = despachado;
        this.estatusNovedad = estatusNovedad;
        this.fechaEstatusNovedad = fechaEstatusNovedad;
        this.comentarios = comentarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(String fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getObservacionesVendedor() {
        return observacionesVendedor;
    }

    public void setObservacionesVendedor(String observacionesVendedor) {
        this.observacionesVendedor = observacionesVendedor;
    }

    public String getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(String fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getDespachado() {
        return despachado;
    }

    public void setDespachado(String despachado) {
        this.despachado = despachado;
    }

    public String getEstatusNovedad() {
        return estatusNovedad;
    }

    public void setEstatusNovedad(String estatusNovedad) {
        this.estatusNovedad = estatusNovedad;
    }

    public String getFechaEstatusNovedad() {
        return fechaEstatusNovedad;
    }

    public void setFechaEstatusNovedad(String fechaEstatusNovedad) {
        this.fechaEstatusNovedad = fechaEstatusNovedad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "co.com.admin.remote.jpa.entities.Envio[ id=" + id + " ]";
    }
    
}
