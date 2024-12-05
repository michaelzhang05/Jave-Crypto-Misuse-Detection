package j$.util.stream;

/* loaded from: classes2.dex */
final class A extends C {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33458m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC3047b abstractC3047b, int i8, int i9) {
        super(abstractC3047b, i8, 1);
        this.f33458m = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        switch (this.f33458m) {
            case 0:
                return interfaceC3125q2;
            case 1:
                return new C3141u(this, interfaceC3125q2, 4);
            case 2:
                return new Z(1, interfaceC3125q2);
            case 3:
                return new X(this, interfaceC3125q2, 4);
            case 4:
                return new AbstractC3100l2(interfaceC3125q2);
            default:
                return new C3073g0(this, interfaceC3125q2, 3);
        }
    }
}
