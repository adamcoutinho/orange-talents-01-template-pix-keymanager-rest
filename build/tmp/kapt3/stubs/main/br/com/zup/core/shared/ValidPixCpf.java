package br.com.zup.core.shared;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B6\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00060\u0005R\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\tR\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\nR\u001d\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00060\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/core/shared/ValidPixCpf;", "", "message", "", "groups", "", "Lkotlin/reflect/KClass;", "payload", "Ljavax/validation/Payload;", "()[Ljava/lang/Class;", "()Ljava/lang/String;", "api-pix"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@javax.validation.Constraint(validatedBy = {br.com.zup.core.shared.ValidaPixCpfImpl.class})
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD})
public abstract @interface ValidPixCpf {
    
    public abstract java.lang.String message() default "{CPF INVALIDO.}";
    
    public abstract java.lang.Class<?>[] groups() default {};
    
    public abstract java.lang.Class<? extends javax.validation.Payload>[] payload() default {};
}