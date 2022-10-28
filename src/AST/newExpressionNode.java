package AST;

import Utility.Position;

public class newExpressionNode extends expressionNode{

    public String typeName = null;
    public newArrayTypeNode newArray = null;

    public newExpressionNode(Position pos) {super(pos);}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
