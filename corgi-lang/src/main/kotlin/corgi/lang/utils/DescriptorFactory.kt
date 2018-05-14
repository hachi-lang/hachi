package corgi.lang.utils

import corgi.lang.domain.`class`.Function
import corgi.lang.domain.expressions.FunctionParameter
import corgi.lang.domain.scope.FunctionSignature
import corgi.lang.domain.type.Type

object DescriptorFactory {
    fun getMethodDescriptor(function: Function): String {
        return this.getMethodDescriptor(function.arguments, function.returnType)
    }

    fun getMethodDescriptor(functionSignature: FunctionSignature): String {
        return this.getMethodDescriptor(functionSignature.arguments, functionSignature.returnType)
    }

    fun getMethodDescriptor(arguments: Collection<FunctionParameter>, returnType: Type): String {
        val argumentDescriptors = arguments.map { it -> it.type.getDescriptor() }
                .joinToString("", "(", ")")

        return argumentDescriptors + returnType.getDescriptor()
    }
}