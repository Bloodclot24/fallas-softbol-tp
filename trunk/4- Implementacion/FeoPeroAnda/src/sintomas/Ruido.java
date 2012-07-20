package sintomas;

public class Ruido extends Sintoma {
	
	public Ruido(Valor valor) throws ValorIncorrectoException{
		super();
		if(valor != Valor.CRUJIENTE && valor != Valor.RUIDOSECO && valor != Valor.NINGUNO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}
	
}
