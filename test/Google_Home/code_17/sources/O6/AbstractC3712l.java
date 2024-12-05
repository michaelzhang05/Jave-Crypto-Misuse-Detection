package o6;

import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3390x0;
import n6.EnumC3487a;
import p6.p;

/* renamed from: o6.l */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3712l {
    public static final InterfaceC3706f a(InterfaceC3706f interfaceC3706f, int i8, EnumC3487a enumC3487a) {
        int i9;
        EnumC3487a enumC3487a2;
        if (i8 < 0 && i8 != -2 && i8 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i8).toString());
        }
        if (i8 == -1 && enumC3487a != EnumC3487a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i8 == -1) {
            enumC3487a2 = EnumC3487a.DROP_OLDEST;
            i9 = 0;
        } else {
            i9 = i8;
            enumC3487a2 = enumC3487a;
        }
        if (interfaceC3706f instanceof p6.p) {
            return p.a.a((p6.p) interfaceC3706f, null, i9, enumC3487a2, 1, null);
        }
        return new p6.h(interfaceC3706f, null, i9, enumC3487a2, 2, null);
    }

    public static /* synthetic */ InterfaceC3706f b(InterfaceC3706f interfaceC3706f, int i8, EnumC3487a enumC3487a, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        if ((i9 & 2) != 0) {
            enumC3487a = EnumC3487a.SUSPEND;
        }
        return AbstractC3708h.c(interfaceC3706f, i8, enumC3487a);
    }

    private static final void c(S5.g gVar) {
        if (gVar.get(InterfaceC3390x0.f34661n0) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    public static final InterfaceC3706f d(InterfaceC3706f interfaceC3706f) {
        InterfaceC3706f b8;
        b8 = b(interfaceC3706f, -1, null, 2, null);
        return b8;
    }

    public static final InterfaceC3706f e(InterfaceC3706f interfaceC3706f, S5.g gVar) {
        c(gVar);
        if (!AbstractC3255y.d(gVar, S5.h.f9825a)) {
            if (interfaceC3706f instanceof p6.p) {
                return p.a.a((p6.p) interfaceC3706f, gVar, 0, null, 6, null);
            }
            return new p6.h(interfaceC3706f, gVar, 0, null, 12, null);
        }
        return interfaceC3706f;
    }
}
