package k6;

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
                return vVar.p(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    boolean B();

    Object i(Object obj, P5.d dVar);

    boolean p(Throwable th);

    void s(Function1 function1);

    Object y(Object obj);
}
