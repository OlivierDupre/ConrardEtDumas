package fr.conrard.dumas;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author olivierdupre
 */
@ManagedBean(name = "contact")
@RequestScoped
public class ContactBean implements Serializable{
    /**
     * Submit the form, gathering values from bean
     * @return 
     */
    public String submit() {
        return "result";
    }
}
