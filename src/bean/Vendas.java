package bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vendas {

    private int mhc_idVenda;
    private int mhc_idCliente;
    private int mhc_idUsuario;
    private LocalDate mhc_dataVenda;
    private LocalTime mhc_horaVenda;
    private double mhc_valorTotal;
    private String mhc_formaPagamento;
    private String mhc_status;

    public int getMhc_idVenda() {
        return mhc_idVenda;
    }

    public void setMhc_idVenda(int mhc_idVenda) {
        this.mhc_idVenda = mhc_idVenda;
    }

    public int getMhc_idCliente() {
        return mhc_idCliente;
    }

    public void setMhc_idCliente(int mhc_idCliente) {
        this.mhc_idCliente = mhc_idCliente;
    }

    public int getMhc_idUsuario() {
        return mhc_idUsuario;
    }

    public void setMhc_idUsuario(int mhc_idUsuario) {
        this.mhc_idUsuario = mhc_idUsuario;
    }

    public LocalDate getMhc_dataVenda() {
        return mhc_dataVenda;
    }

    public void setMhc_dataVenda(LocalDate mhc_dataVenda) {
        this.mhc_dataVenda = mhc_dataVenda;
    }

    public LocalTime getMhc_horaVenda() {
        return mhc_horaVenda;
    }

    public void setMhc_horaVenda(LocalTime mhc_horaVenda) {
        this.mhc_horaVenda = mhc_horaVenda;
    }

    public double getMhc_valorTotal() {
        return mhc_valorTotal;
    }

    public void setMhc_valorTotal(double mhc_valorTotal) {
        this.mhc_valorTotal = mhc_valorTotal;
    }

    public String getMhc_formaPagamento() {
        return mhc_formaPagamento;
    }

    public void setMhc_formaPagamento(String mhc_formaPagamento) {
        this.mhc_formaPagamento = mhc_formaPagamento;
    }

    public String getMhc_status() {
        return mhc_status;
    }

    public void setMhc_status(String mhc_status) {
        this.mhc_status = mhc_status;
    }
}