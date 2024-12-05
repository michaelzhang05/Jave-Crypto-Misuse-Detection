package p6;

import i6.AbstractC2836n0;

/* renamed from: p6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3617f extends AbstractC2836n0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f37113b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37114c;

    /* renamed from: d, reason: collision with root package name */
    private final long f37115d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37116e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorC3612a f37117f = E();

    public AbstractC3617f(int i8, int i9, long j8, String str) {
        this.f37113b = i8;
        this.f37114c = i9;
        this.f37115d = j8;
        this.f37116e = str;
    }

    private final ExecutorC3612a E() {
        return new ExecutorC3612a(this.f37113b, this.f37114c, this.f37115d, this.f37116e);
    }

    public final void F(Runnable runnable, InterfaceC3620i interfaceC3620i, boolean z8) {
        this.f37117f.h(runnable, interfaceC3620i, z8);
    }

    @Override // i6.I
    public void dispatch(P5.g gVar, Runnable runnable) {
        ExecutorC3612a.l(this.f37117f, runnable, null, false, 6, null);
    }

    @Override // i6.I
    public void dispatchYield(P5.g gVar, Runnable runnable) {
        ExecutorC3612a.l(this.f37117f, runnable, null, true, 2, null);
    }
}
