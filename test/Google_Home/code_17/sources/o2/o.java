package o2;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o2.f;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class o implements InterfaceC3517d {

    /* renamed from: a, reason: collision with root package name */
    private final p f35880a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f35881b;

    public o(p accountRanges) {
        AbstractC3255y.i(accountRanges, "accountRanges");
        this.f35880a = accountRanges;
        this.f35881b = y4.g.n(Boolean.FALSE);
    }

    @Override // o2.InterfaceC3517d
    public InterfaceC3698L a() {
        return this.f35881b;
    }

    @Override // o2.InterfaceC3517d
    public Object b(f.b bVar, S5.d dVar) {
        return this.f35880a.b(bVar);
    }

    public /* synthetic */ o(p pVar, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? new k() : pVar);
    }
}
