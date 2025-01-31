package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The `@MaybeZero` qualifier is used to denote that a value may be zero.
 */
@DefaultQualifierInHierarchy
@SubtypeOf({})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface MaybeZero {
}
