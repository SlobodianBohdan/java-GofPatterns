package behavioural.interpreter;

import behavioural.interpreter.expression.Expression;
import behavioural.interpreter.expression.Impl.AndExpression;
import behavioural.interpreter.expression.Impl.Developer;
import behavioural.interpreter.expression.Impl.OrExpression;

public class InterpretRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Developer knows Java EE: " + isJavaEEDeveloper.interpret("Java Spring Boot"));
    }

    public static Expression getJavaExpression() {
        Expression java = new Developer("Java");
        Expression javaCore = new Developer("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new Developer("Java");
        Expression springBoot = new Developer("Spring Boot");

        return new AndExpression(java, springBoot);
    }
}
