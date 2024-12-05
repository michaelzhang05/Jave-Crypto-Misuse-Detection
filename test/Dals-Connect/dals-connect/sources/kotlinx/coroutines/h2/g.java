package kotlinx.coroutines.h2;

import h.a.t;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RxSingle.kt */
/* loaded from: classes2.dex */
public final class g<T> extends kotlinx.coroutines.c<T> {

    /* renamed from: h, reason: collision with root package name */
    private final t<T> f22162h;

    public g(CoroutineContext coroutineContext, t<T> tVar) {
        super(coroutineContext, false, true);
        this.f22162h = tVar;
    }

    @Override // kotlinx.coroutines.c
    protected void p0(Throwable th, boolean z) {
        try {
            if (this.f22162h.c(th)) {
                return;
            }
        } catch (Throwable th2) {
            kotlin.b.a(th, th2);
        }
        d.a(th, getContext());
    }

    @Override // kotlinx.coroutines.c
    protected void r0(T t) {
        try {
            this.f22162h.onSuccess(t);
        } catch (Throwable th) {
            d.a(th, getContext());
        }
    }
}
