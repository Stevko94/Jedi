
package moduls;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "userlog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userlog.findAll", query = "SELECT u FROM Userlog u")
    , @NamedQuery(name = "Userlog.findById", query = "SELECT u FROM Userlog u WHERE u.id = :id")
    , @NamedQuery(name = "Userlog.findByUsername", query = "SELECT u FROM Userlog u WHERE u.username = :username")
    , @NamedQuery(name = "Userlog.findByPass", query = "SELECT u FROM Userlog u WHERE u.pass = :pass")
    , @NamedQuery(name ="Auth", query = "SELECT u FROM Userlog u WHERE u.username=:username and u.pass = :pass")})
public class Userlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "username")
    private String username;
    @Size(max = 45)
    @Column(name = "pass")
    private String pass;

    public Userlog() {
    }

    public Userlog(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Userlog)) {
            return false;
        }
        Userlog other = (Userlog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "moduls.Userlog[ id=" + id + " ]";
    }
    
}
