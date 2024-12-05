package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class d2<T> extends kotlinx.coroutines.internal.t<T> {

    /* renamed from: i, reason: collision with root package name */
    private CoroutineContext f22145i;

    /* renamed from: j, reason: collision with root package name */
    private Object f22146j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d2(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.e2.f22148f
            kotlin.y.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            kotlin.y.g r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.d2.<init>(kotlin.y.g, kotlin.y.d):void");
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.c
    protected void o0(Object obj) {
        CoroutineContext coroutineContext = this.f22145i;
        if (coroutineContext != null) {
            kotlinx.coroutines.internal.z.a(coroutineContext, this.f22146j);
            this.f22145i = null;
            this.f22146j = null;
        }
        Object a = z.a(obj, this.f22240h);
        Continuation<T> continuation = this.f22240h;
        CoroutineContext context = continuation.getContext();
        Object c2 = kotlinx.coroutines.internal.z.c(context, null);
        d2<?> e2 = c2 != kotlinx.coroutines.internal.z.a ? b0.e(continuation, context, c2) : null;
        try {
            this.f22240h.resumeWith(a);
            kotlin.u uVar = kotlin.u.a;
        } finally {
            if (e2 == null || e2.t0()) {
                kotlinx.coroutines.internal.z.a(context, c2);
            }
        }
    }

    public final boolean t0() {
        if (this.f22145i == null) {
            return false;
        }
        this.f22145i = null;
        this.f22146j = null;
        return true;
    }

    public final void u0(CoroutineContext coroutineContext, Object obj) {
        this.f22145i = coroutineContext;
        this.f22146j = obj;
    }
}
