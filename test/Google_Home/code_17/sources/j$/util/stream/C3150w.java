package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3150w extends C {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33833m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33834n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3150w(AbstractC3047b abstractC3047b, int i8, Object obj, int i9) {
        super(abstractC3047b, i8, 1);
        this.f33833m = i9;
        this.f33834n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3150w(AbstractC3047b abstractC3047b, DoubleConsumer doubleConsumer) {
        super(abstractC3047b, 0, 1);
        this.f33833m = 2;
        this.f33834n = doubleConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        switch (this.f33833m) {
            case 0:
                return new C3141u(this, interfaceC3125q2, 1);
            case 1:
                return new C3162z(this, interfaceC3125q2);
            case 2:
                return new C3141u(this, interfaceC3125q2, 5);
            case 3:
                return new C3122q(this, interfaceC3125q2, 6);
            default:
                return new C3060d2(this, interfaceC3125q2);
        }
    }
}
