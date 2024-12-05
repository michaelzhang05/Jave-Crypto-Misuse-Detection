package P6;

import g6.C2728d;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class c0 {
    public static final byte[] a(String str) {
        AbstractC3159y.i(str, "<this>");
        byte[] bytes = str.getBytes(C2728d.f31293b);
        AbstractC3159y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        AbstractC3159y.i(bArr, "<this>");
        return new String(bArr, C2728d.f31293b);
    }
}
