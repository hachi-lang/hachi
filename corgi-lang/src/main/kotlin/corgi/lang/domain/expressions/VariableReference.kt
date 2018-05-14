package corgi.lang.domain.expressions

import corgi.lang.bytecode.generators.ExpressionGenerator
import corgi.lang.domain.type.Type

class VariableReference(val variableName: String, type: Type) : Expression(type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}