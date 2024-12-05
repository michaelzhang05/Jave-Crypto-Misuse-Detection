package Q6;

import P6.C1279e;
import P6.c0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8335a = c0.a("0123456789abcdef");

    public static final byte[] a() {
        return f8335a;
    }

    public static final String b(C1279e c1279e, long j8) {
        AbstractC3159y.i(c1279e, "<this>");
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (c1279e.l(j9) == 13) {
                String readUtf8 = c1279e.readUtf8(j9);
                c1279e.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = c1279e.readUtf8(j8);
        c1279e.skip(1L);
        return readUtf82;
    }
}
