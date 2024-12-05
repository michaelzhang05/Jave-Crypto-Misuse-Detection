package i6;

/* loaded from: classes5.dex */
final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final I f31727a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2837o f31728b;

    public R0(I i8, InterfaceC2837o interfaceC2837o) {
        this.f31727a = i8;
        this.f31728b = interfaceC2837o;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31728b.w(this.f31727a, L5.I.f6487a);
    }
}
