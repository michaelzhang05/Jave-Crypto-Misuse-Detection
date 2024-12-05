package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3070f2 extends AbstractC3080h2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33733m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function f33734n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3070f2(AbstractC3047b abstractC3047b, int i8, Function function, int i9) {
        super(abstractC3047b, i8, 1);
        this.f33733m = i9;
        this.f33734n = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        switch (this.f33733m) {
            case 0:
                return new C3122q(this, interfaceC3125q2, 3);
            default:
                return new C3117p(this, interfaceC3125q2);
        }
    }
}
