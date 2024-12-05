package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3146v extends AbstractC3080h2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33825m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33826n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3146v(AbstractC3047b abstractC3047b, int i8, Object obj, int i9) {
        super(abstractC3047b, i8, 1);
        this.f33825m = i9;
        this.f33826n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3146v(AbstractC3047b abstractC3047b, Consumer consumer) {
        super(abstractC3047b, 0, 1);
        this.f33825m = 3;
        this.f33826n = consumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        switch (this.f33825m) {
            case 0:
                return new C3141u(this, interfaceC3125q2, 0);
            case 1:
                return new X(this, interfaceC3125q2, 0);
            case 2:
                return new C3073g0(this, interfaceC3125q2, 0);
            case 3:
                return new C3122q(this, interfaceC3125q2, 1);
            default:
                return new C3122q(this, interfaceC3125q2, 2);
        }
    }
}
