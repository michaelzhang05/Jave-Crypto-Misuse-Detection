package kotlin.reflect.x.internal.l0.d.a.n0;

import java.util.Iterator;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: javaElements.kt */
/* loaded from: classes2.dex */
public interface e0 extends d {

    /* compiled from: javaElements.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static kotlin.reflect.x.internal.l0.d.a.n0.a a(e0 e0Var, c cVar) {
            Object obj;
            l.f(cVar, "fqName");
            Iterator<T> it = e0Var.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                b c2 = ((kotlin.reflect.x.internal.l0.d.a.n0.a) next).c();
                if (l.a(c2 != null ? c2.b() : null, cVar)) {
                    obj = next;
                    break;
                }
            }
            return (kotlin.reflect.x.internal.l0.d.a.n0.a) obj;
        }
    }
}
