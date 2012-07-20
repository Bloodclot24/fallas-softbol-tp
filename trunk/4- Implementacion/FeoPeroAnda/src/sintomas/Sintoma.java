package sintomas;

public abstract class Sintoma {
	
	public Sintoma() throws ValorIncorrectoException{
	}
	
	public Valor valor;
	
	public enum Valor{
		BAJO,
		MEDIO,
		ALTO,
		MUY_ALTO,
		CRUJIENTE,
		RUIDOSECO,
		NINGUNO,
		ANTERIOR,
		POSTERIOR,
		AMBOS,
		FRONTAL,
        NORMAL,
        MUY_BAJO,
        NO_DETERMINADO;
	}
	
	@Override
	public boolean equals(Object obj){
		Sintoma sintoma = (Sintoma) obj;
		return (this.valor == sintoma.valor && this.getClass().equals(sintoma.getClass()));
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public Valor getValor() {
		return valor;
	}
}
