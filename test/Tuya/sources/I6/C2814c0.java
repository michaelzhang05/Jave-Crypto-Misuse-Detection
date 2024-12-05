package i6;

import java.util.concurrent.Future;

/* renamed from: i6.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2814c0 implements InterfaceC2816d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Future f31752a;

    public C2814c0(Future future) {
        this.f31752a = future;
    }

    @Override // i6.InterfaceC2816d0
    public void dispose() {
        this.f31752a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f31752a + ']';
    }
}
