package n6;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public interface v {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean a(v vVar, Throwable th, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    th = null;
                }
                return vVar.q(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    Object d(Object obj, S5.d dVar);

    boolean q(Throwable th);

    void v(Function1 function1);

    Object w(Object obj);

    boolean z();
}
