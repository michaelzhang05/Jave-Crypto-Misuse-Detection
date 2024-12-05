package com.google.zxing;

/* loaded from: classes2.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: h, reason: collision with root package name */
    private static final NotFoundException f16986h;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f16986h = notFoundException;
        notFoundException.setStackTrace(ReaderException.f16988g);
    }

    private NotFoundException() {
    }
}
