package j$.util.stream;

/* loaded from: classes2.dex */
final class Z extends AbstractC2945k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i8, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32470b = i8;
    }

    @Override // j$.util.stream.InterfaceC2965o2, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        switch (this.f32470b) {
            case 0:
                this.f32569a.accept(i8);
                return;
            default:
                this.f32569a.accept(i8);
                return;
        }
    }
}
