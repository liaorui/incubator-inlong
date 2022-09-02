package com.tencent.subscribe.format.protobuf;

@FunctionalInterface
public interface ThrowableRunable<EXCEPTION extends Throwable> {

    void run() throws EXCEPTION;

}
