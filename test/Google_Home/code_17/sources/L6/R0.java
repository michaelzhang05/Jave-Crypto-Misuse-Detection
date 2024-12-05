package l6;

/* loaded from: classes5.dex */
final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final I f34579a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3372o f34580b;

    public R0(I i8, InterfaceC3372o interfaceC3372o) {
        this.f34579a = i8;
        this.f34580b = interfaceC3372o;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f34580b.h(this.f34579a, O5.I.f8278a);
    }
}
