package src.ast;

import src.datastructures.compiladorVariable;

public class CommandLeitura extends AbstractCommand {

	private String id;
	private compiladorVariable var;
	
	public CommandLeitura (String id, compiladorVariable var) {
		this.id = id;
		this.var = var;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		return id +"= _key." + (var.getType()==compiladorVariable.NUMBER? "nextDouble();": "nextLine();");
	}
	@Override
	public String toString() {
		return "CommandLeitura [id=" + id + "]";
	}

}
