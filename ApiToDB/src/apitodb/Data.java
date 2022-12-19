/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apitodb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Capellix
 */
@Entity
@Table(name = "DATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d"),
    @NamedQuery(name = "Data.findById", query = "SELECT d FROM Data d WHERE d.id = :id"),
    @NamedQuery(name = "Data.findByDeathYear", query = "SELECT d FROM Data d WHERE d.deathYear = :deathYear"),
    @NamedQuery(name = "Data.findByWeeknum", query = "SELECT d FROM Data d WHERE d.weeknum = :weeknum"),
    @NamedQuery(name = "Data.findByProvince", query = "SELECT d FROM Data d WHERE d.province = :province"),
    @NamedQuery(name = "Data.findByAge", query = "SELECT d FROM Data d WHERE d.age = :age"),
    @NamedQuery(name = "Data.findByAgeRange", query = "SELECT d FROM Data d WHERE d.ageRange = :ageRange"),
    @NamedQuery(name = "Data.findByOccupation", query = "SELECT d FROM Data d WHERE d.occupation = :occupation"),
    @NamedQuery(name = "Data.findByDeathType", query = "SELECT d FROM Data d WHERE d.deathType = :deathType"),
    @NamedQuery(name = "Data.findByDeathCluster", query = "SELECT d FROM Data d WHERE d.deathCluster = :deathCluster"),
    @NamedQuery(name = "Data.findByUpdateDate", query = "SELECT d FROM Data d WHERE d.updateDate = :updateDate")})
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DEATH_YEAR")
    private Integer deathYear;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "AGE_RANGE")
    private String ageRange;
    @Column(name = "OCCUPATION")
    private String occupation;
    @Column(name = "DEATH_TYPE")
    private String deathType;
    @Column(name = "DEATH_CLUSTER")
    private String deathCluster;
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Data() {
    }

    public Data(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDeathType() {
        return deathType;
    }

    public void setDeathType(String deathType) {
        this.deathType = deathType;
    }

    public String getDeathCluster() {
        return deathCluster;
    }

    public void setDeathCluster(String deathCluster) {
        this.deathCluster = deathCluster;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "apitodb.Data[ id=" + id + " ]";
    }
    
}
