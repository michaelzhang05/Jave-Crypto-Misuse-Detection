package T6;

import S6.C1417e;
import S6.c0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f10132a = c0.a("0123456789abcdef");

    public static final byte[] a() {
        return f10132a;
    }

    public static final String b(C1417e c1417e, long j8) {
        AbstractC3255y.i(c1417e, "<this>");
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (c1417e.n(j9) == 13) {
                String readUtf8 = c1417e.readUtf8(j9);
                c1417e.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = c1417e.readUtf8(j8);
        c1417e.skip(1L);
        return readUtf82;
    }
}
