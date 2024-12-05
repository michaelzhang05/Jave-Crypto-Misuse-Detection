package androidx.lifecycle.viewmodel.internal;

import L5.q;
import P5.g;
import P5.h;
import i6.C2812b0;
import i6.M;
import i6.U0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(M m8) {
        AbstractC3159y.i(m8, "<this>");
        return new CloseableCoroutineScope(m8);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        g gVar;
        try {
            gVar = C2812b0.c().E();
        } catch (q unused) {
            gVar = h.f7994a;
        } catch (IllegalStateException unused2) {
            gVar = h.f7994a;
        }
        return new CloseableCoroutineScope(gVar.plus(U0.b(null, 1, null)));
    }
}
