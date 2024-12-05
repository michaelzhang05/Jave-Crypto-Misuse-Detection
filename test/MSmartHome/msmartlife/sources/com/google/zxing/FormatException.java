package com.google.zxing;

/* loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* renamed from: h, reason: collision with root package name */
    private static final FormatException f16985h;

    static {
        FormatException formatException = new FormatException();
        f16985h = formatException;
        formatException.setStackTrace(ReaderException.f16988g);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f16987f ? new FormatException() : f16985h;
    }
}
