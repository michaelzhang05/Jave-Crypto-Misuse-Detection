package R1;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* renamed from: R1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1410a {
    public static byte[] a(N1.m mVar) {
        return b(mVar.h());
    }

    public static byte[] b(c2.c cVar) {
        return cVar.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public static byte[] c(byte[] bArr) {
        return ByteBuffer.allocate(8).putLong(c2.e.f(bArr)).array();
    }
}
