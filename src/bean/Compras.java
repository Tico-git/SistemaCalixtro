package bean;

import java.time.LocalDate;

public class Compras {

    private int mhc_idCompra;
    private String mhc_status;
    private int mhc_idFornecedor;
    private LocalDate mhc_dataCompra;
    private double mhc_valorTotal;

    public int getMhc_idCompra() {
        return mhc_idCompra;
    }

    public void setMhc_idCompra(int mhc_idCompra) {
        this.mhc_idCompra = mhc_idCompra;
    }

    public String getMhc_status() {
        return mhc_status;
    }

    public void setMhc_status(String mhc_status) {
        this.mhc_status = mhc_status;
    }

    public int getMhc_idFornecedor() {
        return mhc_idFornecedor;
    }

    public void setMhc_idFornecedor(int mhc_idFornecedor) {
        this.mhc_idFornecedor = mhc_idFornecedor;
    }

    public LocalDate getMhc_dataCompra() {
        return mhc_dataCompra;
    }

    public void setMhc_dataCompra(LocalDate mhc_dataCompra) {
        this.mhc_dataCompra = mhc_dataCompra;
    }

    public double getMhc_valorTotal() {
        return mhc_valorTotal;
    }

    public void setMhc_valorTotal(double mhc_valorTotal) {
        this.mhc_valorTotal = mhc_valorTotal;
    }
}