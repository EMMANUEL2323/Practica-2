/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clases.ito.poo;

import java.time.LocalDate;

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuentaBancaria.
 * 
 * @author emman
 */
public class CuentaBancaria {

	/**
	 * Description of the property numCuenta.
	 */
	private long numCuenta = 0L;

	/**
	 * Description of the property nomCliente.
	 */
	private String nomCliente = "";

	/**
	 * Description of the property saldo.
	 */
	private float saldo = 0;

	/**
	 * Description of the property fechaApertura.
	 */
	private LocalDate fechaApertura = null;

	/**
	 * Description of the property fechaActualizacion.
	 */
	private LocalDate fechaActualizacion = null;

	public boolean Saldo;

	public boolean cantidad;

	// Start of user code (user defined attributes for CuentaBancaria)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuentaBancaria() {
		// Start of user code constructor for CuentaBancaria)
		super();
		// End of user code
	}

	public CuentaBancaria(long numCuenta, String nomCliente, float saldo, LocalDate fechaApertura, LocalDate fechaActualizacion) {
		super();
		this.numCuenta = numCuenta;
		this.nomCliente = nomCliente;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.fechaActualizacion = fechaActualizacion;
	}
	
	/**
	 * Description of the method deposito.
	 * @param cantidad 
	 */
	private void deposito(float cantidad) {
		// Start of user code for method deposito
		this.saldo= saldo + cantidad;
		// End of user code
	}
	
	/**
	 * Description of the method retiro.
	 * @param cantidad 
	 * @return 
	 */
	private void retiro(float cantidad) {
		// Start of user code for method retiro
		this.saldo= saldo - cantidad;
		
		// End of user code
	}

	// Start of user code (user defined methods for CuentaBancaria)

	// End of user code
	/**
	 * Returns numCuenta.
	 * @return numCuenta 
	 */
	public long getNumCuenta() {
		return this.numCuenta;
	}

	/**
	 * Sets a value to attribute numCuenta. 
	 * @param newNumCuenta 
	 */
	public void setNumCuenta(long newNumCuenta) {
		this.numCuenta = newNumCuenta;
	}

	/**
	 * Returns nomCliente.
	 * @return nomCliente 
	 */
	public String getNomCliente() {
		return this.nomCliente;
	}

	/**
	 * Sets a value to attribute nomCliente. 
	 * @param newNomCliente 
	 */
	public void setNomCliente(String newNomCliente) {
		this.nomCliente = newNomCliente;
	}

	/**
	 * Returns saldo.
	 * @return saldo 
	 */
	public float getSaldo() {
		return this.saldo;
	}

	/**
	 * Sets a value to attribute saldo. 
	 * @param newSaldo 
	 */
	public void setSaldo(float newSaldo) {
		this.saldo = newSaldo;
	}

	/**
	 * Returns fechaApertura.
	 * @return fechaApertura 
	 */
	public LocalDate getFechaApertura() {
		return this.fechaApertura;
	}

	/**
	 * Returns fechaActualizacion.
	 * @return fechaActualizacion 
	 */
	public LocalDate getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	/**
	 * Sets a value to attribute fechaActualizacion. 
	 * @param newFechaActualizacion 
	 */
	public void setFechaActualizacion(LocalDate newFechaActualizacion) {
		this.fechaActualizacion = newFechaActualizacion;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura + ", fechaActualizacion=" + fechaActualizacion + "]";
	}

}
