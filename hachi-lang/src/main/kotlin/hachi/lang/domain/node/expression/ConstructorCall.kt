package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.type.ClassType
import hachi.lang.domain.type.Type

class ConstructorCall(className: String, private val arguments: List<FunctionArgument>) : Call {
    private val type = ClassType(className)

    private val constructorIdentifier = this.type.getName()

    constructor(identifier: String) : this(identifier, emptyList())

    override fun getArguments(): List<FunctionArgument> {
        return this.arguments
    }

    override fun getIdentifier(): String {
        return this.constructorIdentifier
    }

    override fun getType(): Type {
        return this.type
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}