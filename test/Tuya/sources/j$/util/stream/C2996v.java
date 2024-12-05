package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2996v extends AbstractC2930h2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f32631m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f32632n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2996v(AbstractC2897b abstractC2897b, int i8, Object obj, int i9) {
        super(abstractC2897b, i8, 1);
        this.f32631m = i9;
        this.f32632n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2996v(AbstractC2897b abstractC2897b, Consumer consumer) {
        super(abstractC2897b, 0, 1);
        this.f32631m = 3;
        this.f32632n = consumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        switch (this.f32631m) {
            case 0:
                return new C2991u(this, interfaceC2975q2, 0);
            case 1:
                return new X(this, interfaceC2975q2, 0);
            case 2:
                return new C2923g0(this, interfaceC2975q2, 0);
            case 3:
                return new C2972q(this, interfaceC2975q2, 1);
            default:
                return new C2972q(this, interfaceC2975q2, 2);
        }
    }
}
