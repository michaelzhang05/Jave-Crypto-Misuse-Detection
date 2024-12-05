package androidx.lifecycle.viewmodel.internal;

import O5.q;
import S5.g;
import S5.h;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.M;
import l6.U0;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(M m8) {
        AbstractC3255y.i(m8, "<this>");
        return new CloseableCoroutineScope(m8);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        g gVar;
        try {
            gVar = C3347b0.c().E();
        } catch (q unused) {
            gVar = h.f9825a;
        } catch (IllegalStateException unused2) {
            gVar = h.f9825a;
        }
        return new CloseableCoroutineScope(gVar.plus(U0.b(null, 1, null)));
    }
}
