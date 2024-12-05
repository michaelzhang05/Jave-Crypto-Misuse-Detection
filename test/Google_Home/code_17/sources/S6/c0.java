package S6;

import j6.C3205d;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class c0 {
    public static final byte[] a(String str) {
        AbstractC3255y.i(str, "<this>");
        byte[] bytes = str.getBytes(C3205d.f34020b);
        AbstractC3255y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        AbstractC3255y.i(bArr, "<this>");
        return new String(bArr, C3205d.f34020b);
    }
}
