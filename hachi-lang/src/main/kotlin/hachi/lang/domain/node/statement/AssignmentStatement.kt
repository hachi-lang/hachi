package hachi.lang.domain.node.statement

import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.node.expression.Expression

class AssignmentStatement(val variableName: String, val expression: Expression) : Statement {
    constructor(variableDeclarationStatement: VariableDeclarationStatement)
            : this(variableDeclarationStatement.name, variableDeclarationStatement.expression)

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}