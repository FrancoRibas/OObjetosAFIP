package model;

public class Rodado {

	private int idRodado;
	private String dominio;
	private int modelo;
	private String marca;

	public Rodado(int idRodado, String dominio, int modelo, String marca) throws Exception {
		super();
		this.idRodado = idRodado;
		this.dominio = dominio;
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getIdRodado() {
		return idRodado;
	}

	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) throws Exception {
		if (validarDominio(dominio)) {
			this.dominio = dominio;
		}
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Rodado [idRodado=" + idRodado + ", dominio=" + dominio + ", modelo=" + modelo + ", marca=" + marca
				+ "]";
	}

	public boolean validarDominio(String dominio) throws Exception {
		boolean esValido = false;
		if (dominio.length() == 6) {
			if (Character.isLetter(dominio.indexOf(0)) && Character.isLetter(dominio.indexOf(1))
					&& Character.isLetter(dominio.indexOf(2)) && Character.isDigit(dominio.indexOf(3))
					&& Character.isDigit(dominio.indexOf(4)) && Character.isDigit(dominio.indexOf(5))) {
				esValido = true;
			} else {
				throw new Exception("ERROR: dominio incorrecto");
			}
		} else {
			if ((dominio.length() == 7)) {
				if (Character.isLetter(dominio.indexOf(0)) && Character.isLetter(dominio.indexOf(1))
						&& Character.isDigit(dominio.indexOf(2)) && Character.isDigit(dominio.indexOf(3))
						&& Character.isDigit(dominio.indexOf(4)) && Character.isLetter(dominio.indexOf(5))
						&& Character.isLetter(dominio.indexOf(6))) {
					esValido = true;
				} else {
					throw new Exception("ERROR: dominio incorrecto");
				}
			} else
				throw new Exception("ERROR: domino de longitud invalida");
		}

		return esValido;
	}

}
