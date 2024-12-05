package p6;

import O5.I;
import kotlin.jvm.internal.AbstractC3247p;
import n6.EnumC3487a;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC3706f interfaceC3706f, S5.g gVar, int i8, EnumC3487a enumC3487a, int i9, AbstractC3247p abstractC3247p) {
        this(interfaceC3706f, (i9 & 2) != 0 ? S5.h.f9825a : gVar, (i9 & 4) != 0 ? -3 : i8, (i9 & 8) != 0 ? EnumC3487a.SUSPEND : enumC3487a);
    }

    @Override // p6.e
    protected e i(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return new h(this.f37912d, gVar, i8, enumC3487a);
    }

    @Override // p6.e
    public InterfaceC3706f j() {
        return this.f37912d;
    }

    @Override // p6.g
    protected Object q(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        Object collect = this.f37912d.collect(interfaceC3707g, dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return I.f8278a;
    }

    public h(InterfaceC3706f interfaceC3706f, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        super(interfaceC3706f, gVar, i8, enumC3487a);
    }
}
