package l6;

import java.util.concurrent.Future;

/* renamed from: l6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3366l extends AbstractC3368m {

    /* renamed from: a, reason: collision with root package name */
    private final Future f34639a;

    public C3366l(Future future) {
        this.f34639a = future;
    }

    @Override // l6.AbstractC3370n
    public void a(Throwable th) {
        if (th != null) {
            this.f34639a.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return O5.I.f8278a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f34639a + ']';
    }
}
