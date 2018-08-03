/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author payal_2
 */
@Entity
@Table(name = "DATA", catalog = "", schema = "PAYAL")
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d")
    , @NamedQuery(name = "Data.findByStudid", query = "SELECT d FROM Data d WHERE d.studid = :studid")
    , @NamedQuery(name = "Data.findByStudname", query = "SELECT d FROM Data d WHERE d.studname = :studname")})
public class Data implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STUDID")
    private Integer studid;
    @Column(name = "STUDNAME")
    private String studname;

    public Data() {
    }

    public Data(Integer studid) {
        this.studid = studid;
    }

    public Integer getStudid() {
        return studid;
    }

    public void setStudid(Integer studid) {
        Integer oldStudid = this.studid;
        this.studid = studid;
        changeSupport.firePropertyChange("studid", oldStudid, studid);
    }

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        String oldStudname = this.studname;
        this.studname = studname;
        changeSupport.firePropertyChange("studname", oldStudname, studname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studid != null ? studid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.studid == null && other.studid != null) || (this.studid != null && !this.studid.equals(other.studid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "one.Data[ studid=" + studid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
