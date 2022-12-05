package Challenge2;

public interface Expression {
    boolean interpret(Context context);
}

class AndExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(Context context) {
        return this.expr1.interpret(context) && this.expr2.interpret(context);
    }
}

class OrExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(Context context) {
        return this.expr1.interpret(context) || this.expr2.interpret(context);
    }
}

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(Context context) {
        return context.getResult(data);
    }
}