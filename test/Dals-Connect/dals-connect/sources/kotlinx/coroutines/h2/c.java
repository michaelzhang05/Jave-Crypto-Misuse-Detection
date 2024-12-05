package kotlinx.coroutines.h2;

import kotlinx.coroutines.l1;

/* compiled from: RxCancellable.kt */
/* loaded from: classes2.dex */
public final class c implements h.a.y.d {
    private final l1 a;

    public c(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // h.a.y.d
    public void cancel() {
        l1.a.a(this.a, null, 1, null);
    }
}
