package l6;

/* renamed from: l6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3353e0 extends AbstractC3368m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3351d0 f34616a;

    public C3353e0(InterfaceC3351d0 interfaceC3351d0) {
        this.f34616a = interfaceC3351d0;
    }

    @Override // l6.AbstractC3370n
    public void a(Throwable th) {
        this.f34616a.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return O5.I.f8278a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f34616a + ']';
    }
}
