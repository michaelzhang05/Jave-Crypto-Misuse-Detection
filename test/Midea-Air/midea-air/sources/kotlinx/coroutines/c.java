package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes2.dex */
public abstract class c<T> extends r1 implements l1, Continuation<T>, h0 {

    /* renamed from: g, reason: collision with root package name */
    private final CoroutineContext f22138g;

    public c(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            H((l1) coroutineContext.get(l1.f22259e));
        }
        this.f22138g = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.r1
    public final void G(Throwable th) {
        e0.a(this.f22138g, th);
    }

    @Override // kotlinx.coroutines.r1
    public String O() {
        String b2 = b0.b(this.f22138g);
        if (b2 == null) {
            return super.O();
        }
        return '\"' + b2 + "\":" + super.O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.r1
    protected final void T(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            p0(wVar.f22295b, wVar.a());
        } else {
            r0(obj);
        }
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.l1
    public boolean b() {
        return super.b();
    }

    @Override // kotlinx.coroutines.h0
    public CoroutineContext c() {
        return this.f22138g;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f22138g;
    }

    protected void o0(Object obj) {
        k(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.r1
    public String p() {
        return kotlin.jvm.internal.l.m(m0.a(this), " was cancelled");
    }

    protected void p0(Throwable th, boolean z) {
    }

    protected void r0(T t) {
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object M = M(z.d(obj, null, 1, null));
        if (M == s1.f22278b) {
            return;
        }
        o0(M);
    }

    public final <R> void s0(j0 j0Var, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        j0Var.f(function2, r, this);
    }
}
