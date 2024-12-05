package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
final class d50 extends PushbackInputStream {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ a50 f11290f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(a50 a50Var, InputStream inputStream, int i2) {
        super(inputStream, 1);
        this.f11290f = a50Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f11290f.f11057c.a();
        super.close();
    }
}
