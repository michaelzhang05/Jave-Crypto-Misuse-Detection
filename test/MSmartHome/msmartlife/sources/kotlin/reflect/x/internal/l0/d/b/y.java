package kotlin.reflect.x.internal.l0.d.b;

import java.util.Collection;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* loaded from: classes2.dex */
public interface y<T> {

    /* compiled from: descriptorBasedTypeSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static <T> String a(y<? extends T> yVar, e eVar) {
            l.f(eVar, "classDescriptor");
            return null;
        }

        public static <T> e0 b(y<? extends T> yVar, e0 e0Var) {
            l.f(e0Var, "kotlinType");
            return null;
        }
    }

    T a(e eVar);

    String b(e eVar);

    e0 c(Collection<e0> collection);

    String d(e eVar);

    e0 e(e0 e0Var);

    void f(e0 e0Var, e eVar);
}
