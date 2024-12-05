package j$.util.stream;

/* loaded from: classes2.dex */
final class A extends C {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f32264m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC2897b abstractC2897b, int i8, int i9) {
        super(abstractC2897b, i8, 1);
        this.f32264m = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        switch (this.f32264m) {
            case 0:
                return interfaceC2975q2;
            case 1:
                return new C2991u(this, interfaceC2975q2, 4);
            case 2:
                return new Z(1, interfaceC2975q2);
            case 3:
                return new X(this, interfaceC2975q2, 4);
            case 4:
                return new AbstractC2950l2(interfaceC2975q2);
            default:
                return new C2923g0(this, interfaceC2975q2, 3);
        }
    }
}
