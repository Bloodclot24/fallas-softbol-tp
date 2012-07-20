package sintomas;

public class Zona extends Sintoma {
	
	public Zona(Valor valor) throws ValorIncorrectoException{
		super();
		if(valor != Valor.ANTERIOR && valor != Valor.POSTERIOR && valor != Valor.AMBOS && valor != Valor.FRONTAL)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}

}
