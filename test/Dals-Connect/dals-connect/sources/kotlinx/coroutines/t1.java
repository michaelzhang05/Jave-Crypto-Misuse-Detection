package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
final class t1 extends z1 {

    /* renamed from: h, reason: collision with root package name */
    private final Continuation<kotlin.u> f22287h;

    public t1(CoroutineContext coroutineContext, Function2<? super h0, ? super Continuation<? super kotlin.u>, ? extends Object> function2) {
        super(coroutineContext, false);
        Continuation<kotlin.u> a;
        a = kotlin.coroutines.intrinsics.c.a(function2, this, this);
        this.f22287h = a;
    }

    @Override // kotlinx.coroutines.r1
    protected void U() {
        kotlinx.coroutines.g2.a.a(this.f22287h, this);
    }
}
