package j$.util.stream;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3008y extends AbstractC2948l0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f32660m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3008y(AbstractC2897b abstractC2897b, int i8, int i9) {
        super(abstractC2897b, i8, 1);
        this.f32660m = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        switch (this.f32660m) {
            case 0:
                return new C2991u(this, interfaceC2975q2, 3);
            case 1:
                return new Z(0, interfaceC2975q2);
            case 2:
                return new X(this, interfaceC2975q2, 3);
            case 3:
                return new C2923g0(this, interfaceC2975q2, 1);
            case 4:
                return interfaceC2975q2;
            default:
                return new C2923g0(this, interfaceC2975q2, 4);
        }
    }
}
