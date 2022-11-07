package pe.edu.upc.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Contrato")
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;

    @Column(name = "fechainiContrato", length = 60, nullable = false)
    private String fechainiContrato;

    @Column(name = "fechafinContrato", length = 60, nullable = false)
    private String fechafinContrato;

    @Column(name = "montoContrato")
    private Integer montoContrato;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idtipomoneda", nullable = false)
    private tipomoneda tipomoneda;

    @ManyToOne
    @JoinColumn(name = "idTP", nullable = false)
    private tipopago tipopago;
/*
    @ManyToOne
    @JoinColumn(name = "idCurriculum", nullable = false)
    private curriculumVitae curriculumVitae;*/

    public Contrato(int idContrato, String fechainiContrato, String fechafinContrato, Integer montoContrato, usuario usuario, tipomoneda tipomoneda, tipopago tipopago/*,curriculumVitae curriculumVitae*/ ){
        this.idContrato = idContrato;
        this.fechainiContrato = fechainiContrato;
        this.fechafinContrato = fechafinContrato;
        this.montoContrato = montoContrato;
        this.usuario = usuario;
    }

    public Contrato() {
        super();
    }

    public int getIdContrato(){
        return idContrato;
    }

    public void setIdContrato(int idContrato){
        this.idContrato = idContrato;
    }

    public String getFechainiContrato(){
        return fechainiContrato;
    }

    public void setFechainiContrato(String fechainiContrato){
        this.fechafinContrato = fechainiContrato;
    }

    public String getFechafinContrato(){
        return fechafinContrato;
    }

    public void setFechafinContrato(String fechafinContrato){
        this.fechafinContrato = fechafinContrato;
    }

    public Integer getMontoContrato(){
        return montoContrato;
    }

    public void setMontoContrato(Integer montoContrato){
        this.montoContrato = montoContrato;
    }

    public usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(usuario usuario){
        this.usuario = usuario;
    }

    public tipomoneda getTipomoneda(tipomoneda tipomoneda){
        return tipomoneda;
    }
    public void setTipomoneda(tipomoneda tipomoneda){
        this.tipomoneda=tipomoneda;
    }

    public tipopago getTipopago(){
        return tipopago;
    }
    public void setTipopago(tipopago tipopago){
        this.tipopago = tipopago;
    }
/*
    public CurriculumVitae getCurriculumVitae(){
        return curriculumVitae;
    }
    public void setCurriculumVitae(CurriculumVitae curriculumVitae){
        this.CurriculumVitae = curriculumVitae;
    }
*/
}
