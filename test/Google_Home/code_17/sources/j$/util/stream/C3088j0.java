package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3088j0 extends AbstractC3098l0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33758m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33759n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3088j0(AbstractC3047b abstractC3047b, int i8, Object obj, int i9) {
        super(abstractC3047b, i8, 1);
        this.f33758m = i9;
        this.f33759n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3088j0(AbstractC3047b abstractC3047b, LongConsumer longConsumer) {
        super(abstractC3047b, 0, 1);
        this.f33758m = 1;
        this.f33759n = longConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        switch (this.f33758m) {
            case 0:
                return new C3083i0(this, interfaceC3125q2);
            case 1:
                return new C3073g0(this, interfaceC3125q2, 5);
            case 2:
                return new C3060d2(this, interfaceC3125q2);
            default:
                return new C3122q(this, interfaceC3125q2, 5);
        }
    }
}
