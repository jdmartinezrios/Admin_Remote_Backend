package co.com.admin.remote.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juan David Martinez
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sku")
    private String sku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "upc")
    private String upc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "desc_solicitante")
    private String descSolicitante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_pedido")
    private int tipoPedido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo_pedido_desc")
    private String tipoPedidoDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orden_sap")
    private int ordenSap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "orden_compra")
    private String ordenCompra;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "id_tienda", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tienda tienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<Envio> envioList;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Pedido(Integer id, String codigo, String sku, String upc, int cantidad, String descSolicitante, int tipoPedido, String tipoPedidoDesc, int ordenSap, String ordenCompra) {
        this.id = id;
        this.codigo = codigo;
        this.sku = sku;
        this.upc = upc;
        this.cantidad = cantidad;
        this.descSolicitante = descSolicitante;
        this.tipoPedido = tipoPedido;
        this.tipoPedidoDesc = tipoPedidoDesc;
        this.ordenSap = ordenSap;
        this.ordenCompra = ordenCompra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescSolicitante() {
        return descSolicitante;
    }

    public void setDescSolicitante(String descSolicitante) {
        this.descSolicitante = descSolicitante;
    }

    public int getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(int tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getTipoPedidoDesc() {
        return tipoPedidoDesc;
    }

    public void setTipoPedidoDesc(String tipoPedidoDesc) {
        this.tipoPedidoDesc = tipoPedidoDesc;
    }

    public int getOrdenSap() {
        return ordenSap;
    }

    public void setOrdenSap(int ordenSap) {
        this.ordenSap = ordenSap;
    }

    public String getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    @XmlTransient
    public List<Envio> getEnvioList() {
        return envioList;
    }

    public void setEnvioList(List<Envio> envioList) {
        this.envioList = envioList;
    }

    @Override
    public String toString() {
        return "co.com.admin.remote.jpa.entities.Pedido[ id=" + id + " ]";
    }
    
}
