package IR.Node;

import java.util.ArrayList;

public class funcDef {
    public String funcName = null;
    public IRType retType = null;
    public ArrayList<IRType> parameters = null;
    public ArrayList<block> blocks = null;
}