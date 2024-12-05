package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.u1;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes2.dex */
public final class o {
    public static final o a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f22236b;

    /* renamed from: c, reason: collision with root package name */
    public static final u1 f22237c;

    static {
        o oVar = new o();
        a = oVar;
        f22236b = w.e("kotlinx.coroutines.fast.service.loader", true);
        f22237c = oVar.a();
    }

    private o() {
    }

    private final u1 a() {
        Sequence a2;
        List<MainDispatcherFactory> A;
        Object next;
        try {
            if (f22236b) {
                A = h.a.c();
            } else {
                a2 = kotlin.sequences.l.a(defpackage.a.b());
                A = kotlin.sequences.n.A(a2);
            }
            Iterator<T> it = A.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory == null) {
                return p.b(null, null, 3, null);
            }
            return p.d(mainDispatcherFactory, A);
        } catch (Throwable th) {
            return p.b(th, null, 2, null);
        }
    }
}
