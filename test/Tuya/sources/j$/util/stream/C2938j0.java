package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2938j0 extends AbstractC2948l0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f32564m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f32565n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2938j0(AbstractC2897b abstractC2897b, int i8, Object obj, int i9) {
        super(abstractC2897b, i8, 1);
        this.f32564m = i9;
        this.f32565n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2938j0(AbstractC2897b abstractC2897b, LongConsumer longConsumer) {
        super(abstractC2897b, 0, 1);
        this.f32564m = 1;
        this.f32565n = longConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        switch (this.f32564m) {
            case 0:
                return new C2933i0(this, interfaceC2975q2);
            case 1:
                return new C2923g0(this, interfaceC2975q2, 5);
            case 2:
                return new C2910d2(this, interfaceC2975q2);
            default:
                return new C2972q(this, interfaceC2975q2, 5);
        }
    }
}
