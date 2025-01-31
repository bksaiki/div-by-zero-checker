package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The `@Zero` qualifier is used to denote that a value is not zero.
 */
@SubtypeOf({MaybeZero.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface AlwaysZero {
}
