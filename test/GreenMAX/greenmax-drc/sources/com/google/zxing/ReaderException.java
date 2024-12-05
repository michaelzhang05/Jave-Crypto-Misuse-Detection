package com.google.zxing;

/* loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: f, reason: collision with root package name */
    protected static final boolean f16987f;

    /* renamed from: g, reason: collision with root package name */
    protected static final StackTraceElement[] f16988g;

    static {
        f16987f = System.getProperty("surefire.test.class.path") != null;
        f16988g = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
