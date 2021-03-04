package behavioural.interpreter.expression.Impl;

import behavioural.interpreter.expression.Expression;

public class Developer implements Expression {
    private String skill;

    public Developer(String skill) {
        this.skill = skill;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(skill)) {
            return true;
        }
        return false;
    }
}
