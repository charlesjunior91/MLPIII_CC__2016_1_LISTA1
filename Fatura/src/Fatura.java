
public class Fatura {

	private String numero;
	private String descri��o;
	private int q_item;
	private double p_item;
	private double ValorFatura;

	private Fatura(String numero, String descri��o, int q_item, double p_item, double ValorFatura) {
		super();
		this.setNumero(numero);
		this.setDescri��o(descri��o);
		this.setQ_item(q_item);
		this.setP_item(p_item);
		this.ValorFatura(ValorFatura);

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public int getQ_item() {
		return q_item;
	}

	public void setQ_item(int q_item) {
		this.q_item = q_item;
	}

	public double getP_item() {
		return p_item;
	}

	public void setP_item(double p_item) {
		this.p_item = p_item;
	}

	public boolean ValorFatura(double ValorFatura) {

		ValorFatura = ValorFatura * p_item;

		return true;
	}

	{
		if (ValorFatura <= 0) {
			double ValorFatura = 0;
		} else
			ValorFatura = 0.0;
	}
}
