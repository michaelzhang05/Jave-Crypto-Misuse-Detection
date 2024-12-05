package i6;

import java.util.concurrent.Future;

/* renamed from: i6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2831l extends AbstractC2833m {

    /* renamed from: a, reason: collision with root package name */
    private final Future f31787a;

    public C2831l(Future future) {
        this.f31787a = future;
    }

    @Override // i6.AbstractC2835n
    public void a(Throwable th) {
        if (th != null) {
            this.f31787a.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return L5.I.f6487a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f31787a + ']';
    }
}
