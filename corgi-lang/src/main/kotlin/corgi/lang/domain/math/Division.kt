package corgi.lang.domain.math

import corgi.lang.bytecode.generator.ExpressionGenerator

class Division(leftExpression: ArithmeticExpression, rightExpression: ArithmeticExpression) : ArithmeticExpression(leftExpression, rightExpression, leftExpression.type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}