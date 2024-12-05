package l6;

import i6.InterfaceC2855x0;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3159y;
import m6.p;

/* renamed from: l6.l */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3364l {
    public static final InterfaceC3358f a(InterfaceC3358f interfaceC3358f, int i8, EnumC3132a enumC3132a) {
        int i9;
        EnumC3132a enumC3132a2;
        if (i8 < 0 && i8 != -2 && i8 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i8).toString());
        }
        if (i8 == -1 && enumC3132a != EnumC3132a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i8 == -1) {
            enumC3132a2 = EnumC3132a.DROP_OLDEST;
            i9 = 0;
        } else {
            i9 = i8;
            enumC3132a2 = enumC3132a;
        }
        if (interfaceC3358f instanceof m6.p) {
            return p.a.a((m6.p) interfaceC3358f, null, i9, enumC3132a2, 1, null);
        }
        return new m6.h(interfaceC3358f, null, i9, enumC3132a2, 2, null);
    }

    public static /* synthetic */ InterfaceC3358f b(InterfaceC3358f interfaceC3358f, int i8, EnumC3132a enumC3132a, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        if ((i9 & 2) != 0) {
            enumC3132a = EnumC3132a.SUSPEND;
        }
        return AbstractC3360h.c(interfaceC3358f, i8, enumC3132a);
    }

    private static final void c(P5.g gVar) {
        if (gVar.get(InterfaceC2855x0.f31809n0) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    public static final InterfaceC3358f d(InterfaceC3358f interfaceC3358f) {
        InterfaceC3358f b8;
        b8 = b(interfaceC3358f, -1, null, 2, null);
        return b8;
    }

    public static final InterfaceC3358f e(InterfaceC3358f interfaceC3358f, P5.g gVar) {
        c(gVar);
        if (!AbstractC3159y.d(gVar, P5.h.f7994a)) {
            if (interfaceC3358f instanceof m6.p) {
                return p.a.a((m6.p) interfaceC3358f, gVar, 0, null, 6, null);
            }
            return new m6.h(interfaceC3358f, gVar, 0, null, 12, null);
        }
        return interfaceC3358f;
    }
}
