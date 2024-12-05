package kotlinx.coroutines.h2;

import kotlin.coroutines.CoroutineContext;
import kotlin.u;

/* compiled from: RxCompletable.kt */
/* loaded from: classes2.dex */
final class e extends kotlinx.coroutines.c<u> {

    /* renamed from: h, reason: collision with root package name */
    private final h.a.c f22161h;

    public e(CoroutineContext coroutineContext, h.a.c cVar) {
        super(coroutineContext, false, true);
        this.f22161h = cVar;
    }

    @Override // kotlinx.coroutines.c
    protected void p0(Throwable th, boolean z) {
        try {
            if (this.f22161h.c(th)) {
                return;
            }
        } catch (Throwable th2) {
            kotlin.b.a(th, th2);
        }
        d.a(th, getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.c
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void r0(u uVar) {
        try {
            this.f22161h.a();
        } catch (Throwable th) {
            d.a(th, getContext());
        }
    }
}
