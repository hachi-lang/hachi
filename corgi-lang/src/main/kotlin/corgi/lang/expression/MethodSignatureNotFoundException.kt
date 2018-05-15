package corgi.lang.expression

import corgi.lang.domain.scope.Scope

class MethodSignatureNotFoundException(val scope: Scope, val methodName: String) : CompilationException() {
    override val message: String?
        get() = "There is no method %s in scope %s".format(this.methodName, this.scope.toString())
}