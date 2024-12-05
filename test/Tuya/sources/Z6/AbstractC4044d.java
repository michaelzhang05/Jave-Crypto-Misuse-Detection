package z6;

import L5.s;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4044d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f40554a;

    static {
        Object b8;
        int i8;
        try {
            s.a aVar = L5.s.f6511b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC3159y.h(property, "getProperty(...)");
            b8 = L5.s.b(g6.n.i(property));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        if (L5.s.g(b8)) {
            b8 = null;
        }
        Integer num = (Integer) b8;
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 2097152;
        }
        f40554a = i8;
    }
}
