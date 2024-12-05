package O1;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* renamed from: O1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1272a {
    public static byte[] a(K1.m mVar) {
        return b(mVar.h());
    }

    public static byte[] b(Z1.c cVar) {
        return cVar.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public static byte[] c(byte[] bArr) {
        return ByteBuffer.allocate(8).putLong(Z1.e.f(bArr)).array();
    }
}
