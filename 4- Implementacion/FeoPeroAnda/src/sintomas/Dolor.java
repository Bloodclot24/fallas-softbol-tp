package sintomas;

public class Dolor extends Sintoma {
		
	public Dolor(Valor valor) throws ValorIncorrectoException{
		super();
		if(valor != Valor.MEDIO && valor != Valor.ALTO && valor != Valor.MUY_ALTO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}

}
