package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y extends AbstractC2903c0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f32460m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f32461n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC2897b abstractC2897b, int i8, Object obj, int i9) {
        super(abstractC2897b, i8, 1);
        this.f32460m = i9;
        this.f32461n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC2897b abstractC2897b, IntConsumer intConsumer) {
        super(abstractC2897b, 0, 1);
        this.f32460m = 0;
        this.f32461n = intConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        switch (this.f32460m) {
            case 0:
                return new X(this, interfaceC2975q2, 1);
            case 1:
                return new C2893a0(this, interfaceC2975q2);
            case 2:
                return new C2972q(this, interfaceC2975q2, 4);
            default:
                return new C2910d2(this, interfaceC2975q2);
        }
    }
}
