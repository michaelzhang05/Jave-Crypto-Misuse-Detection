package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeReader.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class h1 implements s1 {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private final c2 f18948b;

    public h1(c2 c2Var) {
        this.f18948b = c2Var;
    }

    private i4 b(byte[] bArr, int i2, int i3) {
        StringReader stringReader = new StringReader(new String(bArr, i2, i3, a));
        try {
            i4 i4Var = (i4) this.f18948b.c(stringReader, i4.class);
            stringReader.close();
            return i4Var;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    private k4 c(byte[] bArr, int i2, int i3) {
        StringReader stringReader = new StringReader(new String(bArr, i2, i3, a));
        try {
            k4 k4Var = (k4) this.f18948b.c(stringReader, k4.class);
            stringReader.close();
            return k4Var;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        r11 = new io.sentry.h4(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
    
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.sentry.h4 a(java.io.InputStream r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.h1.a(java.io.InputStream):io.sentry.h4");
    }
}
