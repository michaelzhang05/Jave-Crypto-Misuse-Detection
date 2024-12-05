package l6;

import kotlin.jvm.functions.Function1;

/* renamed from: l6.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3384u0 extends AbstractC3368m {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f34656a;

    public C3384u0(Function1 function1) {
        this.f34656a = function1;
    }

    @Override // l6.AbstractC3370n
    public void a(Throwable th) {
        this.f34656a.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return O5.I.f8278a;
    }

    public String toString() {
        return "InvokeOnCancel[" + Q.a(this.f34656a) + '@' + Q.b(this) + ']';
    }
}
