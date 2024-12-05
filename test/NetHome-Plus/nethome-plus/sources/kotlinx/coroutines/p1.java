package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class p1 {
    public static final u a(l1 l1Var) {
        return new n1(l1Var);
    }

    public static /* synthetic */ u b(l1 l1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l1Var = null;
        }
        return o1.a(l1Var);
    }

    public static final void c(CoroutineContext coroutineContext) {
        l1 l1Var = (l1) coroutineContext.get(l1.f22259e);
        if (l1Var == null) {
            return;
        }
        o1.d(l1Var);
    }

    public static final void d(l1 l1Var) {
        if (!l1Var.b()) {
            throw l1Var.D();
        }
    }
}
