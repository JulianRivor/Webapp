package org.imasd.webapp.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Persona {

    /**
     */
    private String nombre;

    /**
     */
    private String apellido;

    /**
     */
    private String direccion;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date fechaDeNacimiento;
}
