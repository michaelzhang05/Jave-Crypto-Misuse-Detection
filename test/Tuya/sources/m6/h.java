package m6;

import L5.I;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3151p;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC3358f interfaceC3358f, P5.g gVar, int i8, EnumC3132a enumC3132a, int i9, AbstractC3151p abstractC3151p) {
        this(interfaceC3358f, (i9 & 2) != 0 ? P5.h.f7994a : gVar, (i9 & 4) != 0 ? -3 : i8, (i9 & 8) != 0 ? EnumC3132a.SUSPEND : enumC3132a);
    }

    @Override // m6.e
    protected e i(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return new h(this.f35886d, gVar, i8, enumC3132a);
    }

    @Override // m6.e
    public InterfaceC3358f j() {
        return this.f35886d;
    }

    @Override // m6.g
    protected Object q(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        Object collect = this.f35886d.collect(interfaceC3359g, dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return I.f6487a;
    }

    public h(InterfaceC3358f interfaceC3358f, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        super(interfaceC3358f, gVar, i8, enumC3132a);
    }
}
