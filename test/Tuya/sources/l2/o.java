package l2;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class o implements InterfaceC3169d {

    /* renamed from: a, reason: collision with root package name */
    private final p f33879a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f33880b;

    public o(p accountRanges) {
        AbstractC3159y.i(accountRanges, "accountRanges");
        this.f33879a = accountRanges;
        this.f33880b = v4.g.n(Boolean.FALSE);
    }

    @Override // l2.InterfaceC3169d
    public InterfaceC3349K a() {
        return this.f33880b;
    }

    @Override // l2.InterfaceC3169d
    public Object b(f.b bVar, P5.d dVar) {
        return this.f33879a.b(bVar);
    }

    public /* synthetic */ o(p pVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? new k() : pVar);
    }
}
