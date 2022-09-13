package com.tencent.subscribe.format.protobuf;

@FunctionalInterface
public interface ThrowableSupplier<OUT, EXCEPTION extends Throwable> {

    OUT get() throws EXCEPTION;

}
