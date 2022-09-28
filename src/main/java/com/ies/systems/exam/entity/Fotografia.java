package com.ies.systems.exam.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pimenteles1
 */
@Entity
@Table(name = "Fotografia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fotografia.findAll", query = "SELECT f FROM Fotografia f"),
    @NamedQuery(name = "Fotografia.findByIdFotografia", query = "SELECT f FROM Fotografia f WHERE f.idFotografia = :idFotografia"),
    @NamedQuery(name = "Fotografia.findByUrl", query = "SELECT f FROM Fotografia f WHERE f.url = :url"),
    @NamedQuery(name = "Fotografia.findByDescripcion", query = "SELECT f FROM Fotografia f WHERE f.descripcion = :descripcion")})
public class Fotografia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdFotografia")
    private Integer idFotografia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Url")
    private String url;
    @Size(max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "IdAlbum", referencedColumnName = "IdAlbum")
    @ManyToOne(optional = false)
    private Album idAlbum;

    public Fotografia() {
    }

    public Fotografia(Integer idFotografia) {
        this.idFotografia = idFotografia;
    }

    public Fotografia(Integer idFotografia, String url) {
        this.idFotografia = idFotografia;
        this.url = url;
    }

    public Integer getIdFotografia() {
        return idFotografia;
    }

    public void setIdFotografia(Integer idFotografia) {
        this.idFotografia = idFotografia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Album getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Album idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFotografia != null ? idFotografia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fotografia)) {
            return false;
        }
        Fotografia other = (Fotografia) object;
        if ((this.idFotografia == null && other.idFotografia != null) || (this.idFotografia != null && !this.idFotografia.equals(other.idFotografia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ies.systems.exam.entity.Fotografia[ idFotografia=" + idFotografia + " ]";
    }
    
}

