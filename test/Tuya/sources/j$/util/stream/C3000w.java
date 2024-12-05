package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3000w extends C {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f32639m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f32640n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3000w(AbstractC2897b abstractC2897b, int i8, Object obj, int i9) {
        super(abstractC2897b, i8, 1);
        this.f32639m = i9;
        this.f32640n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3000w(AbstractC2897b abstractC2897b, DoubleConsumer doubleConsumer) {
        super(abstractC2897b, 0, 1);
        this.f32639m = 2;
        this.f32640n = doubleConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        switch (this.f32639m) {
            case 0:
                return new C2991u(this, interfaceC2975q2, 1);
            case 1:
                return new C3012z(this, interfaceC2975q2);
            case 2:
                return new C2991u(this, interfaceC2975q2, 5);
            case 3:
                return new C2972q(this, interfaceC2975q2, 6);
            default:
                return new C2910d2(this, interfaceC2975q2);
        }
    }
}
