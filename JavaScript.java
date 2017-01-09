import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScript {

	public static void main(String[] args) {
		
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine script = scriptEngineManager.getEngineByName("nashorn");

		try {
			
			script.eval("print('Hello Word via javascript feito no java')");
			
			Integer resultado = (Integer) script.eval("2 + 2;");
			System.out.println(resultado);
			
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		
	}

}
