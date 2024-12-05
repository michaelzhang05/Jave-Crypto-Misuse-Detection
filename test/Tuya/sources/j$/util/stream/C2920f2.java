package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2920f2 extends AbstractC2930h2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f32539m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function f32540n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2920f2(AbstractC2897b abstractC2897b, int i8, Function function, int i9) {
        super(abstractC2897b, i8, 1);
        this.f32539m = i9;
        this.f32540n = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        switch (this.f32539m) {
            case 0:
                return new C2972q(this, interfaceC2975q2, 3);
            default:
                return new C2967p(this, interfaceC2975q2);
        }
    }
}
