package C6;

import O5.s;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: C6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1033d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1672a;

    static {
        Object b8;
        int i8;
        try {
            s.a aVar = O5.s.f8302b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC3255y.h(property, "getProperty(...)");
            b8 = O5.s.b(j6.n.i(property));
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        if (O5.s.g(b8)) {
            b8 = null;
        }
        Integer num = (Integer) b8;
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 2097152;
        }
        f1672a = i8;
    }
}
