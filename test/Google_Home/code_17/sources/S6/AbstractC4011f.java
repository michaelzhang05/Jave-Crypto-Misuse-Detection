package s6;

import l6.AbstractC3371n0;

/* renamed from: s6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4011f extends AbstractC3371n0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f39312b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39313c;

    /* renamed from: d, reason: collision with root package name */
    private final long f39314d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39315e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorC4006a f39316f = E();

    public AbstractC4011f(int i8, int i9, long j8, String str) {
        this.f39312b = i8;
        this.f39313c = i9;
        this.f39314d = j8;
        this.f39315e = str;
    }

    private final ExecutorC4006a E() {
        return new ExecutorC4006a(this.f39312b, this.f39313c, this.f39314d, this.f39315e);
    }

    public final void F(Runnable runnable, InterfaceC4014i interfaceC4014i, boolean z8) {
        this.f39316f.m(runnable, interfaceC4014i, z8);
    }

    @Override // l6.I
    public void dispatch(S5.g gVar, Runnable runnable) {
        ExecutorC4006a.n(this.f39316f, runnable, null, false, 6, null);
    }

    @Override // l6.I
    public void dispatchYield(S5.g gVar, Runnable runnable) {
        ExecutorC4006a.n(this.f39316f, runnable, null, true, 2, null);
    }
}
