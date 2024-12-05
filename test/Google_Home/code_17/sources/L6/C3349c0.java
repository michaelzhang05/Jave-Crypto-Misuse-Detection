package l6;

import java.util.concurrent.Future;

/* renamed from: l6.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3349c0 implements InterfaceC3351d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Future f34604a;

    public C3349c0(Future future) {
        this.f34604a = future;
    }

    @Override // l6.InterfaceC3351d0
    public void dispose() {
        this.f34604a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f34604a + ']';
    }
}
