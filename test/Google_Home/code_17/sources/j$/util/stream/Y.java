package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y extends AbstractC3053c0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33654m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33655n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC3047b abstractC3047b, int i8, Object obj, int i9) {
        super(abstractC3047b, i8, 1);
        this.f33654m = i9;
        this.f33655n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC3047b abstractC3047b, IntConsumer intConsumer) {
        super(abstractC3047b, 0, 1);
        this.f33654m = 0;
        this.f33655n = intConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        switch (this.f33654m) {
            case 0:
                return new X(this, interfaceC3125q2, 1);
            case 1:
                return new C3043a0(this, interfaceC3125q2);
            case 2:
                return new C3122q(this, interfaceC3125q2, 4);
            default:
                return new C3060d2(this, interfaceC3125q2);
        }
    }
}
