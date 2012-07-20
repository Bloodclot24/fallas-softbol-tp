package sintomas;

public class Rigidez extends Sintoma {
	
	public Rigidez(Valor valor) throws ValorIncorrectoException{
		super();
		if(valor != Valor.MEDIO && valor != Valor.ALTO && valor != Valor.BAJO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}
	
}
