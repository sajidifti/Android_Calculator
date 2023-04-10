package com.ifti.calc3;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class Result {
    public String getResult(String equation){
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);

        String finalResult = "";

        Scriptable scriptable = rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, equation, "Javascript", 1, null).toString();

        return finalResult;
    }
}
