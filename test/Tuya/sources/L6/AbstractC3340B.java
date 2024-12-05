package l6;

import k6.EnumC3132a;
import n6.C3486F;

/* renamed from: l6.B */
/* loaded from: classes5.dex */
public abstract class AbstractC3340B {

    /* renamed from: a */
    public static final C3486F f34574a = new C3486F("NO_VALUE");

    public static final u a(int i8, int i9, EnumC3132a enumC3132a) {
        if (i8 >= 0) {
            if (i9 >= 0) {
                if (i8 <= 0 && i9 <= 0 && enumC3132a != EnumC3132a.SUSPEND) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC3132a).toString());
                }
                int i10 = i9 + i8;
                if (i10 < 0) {
                    i10 = Integer.MAX_VALUE;
                }
                return new C3339A(i8, i10, enumC3132a);
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i9).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i8).toString());
    }

    public static /* synthetic */ u b(int i8, int i9, EnumC3132a enumC3132a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            enumC3132a = EnumC3132a.SUSPEND;
        }
        return a(i8, i9, enumC3132a);
    }

    public static final InterfaceC3358f e(z zVar, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        if ((i8 == 0 || i8 == -3) && enumC3132a == EnumC3132a.SUSPEND) {
            return zVar;
        }
        return new m6.h(zVar, gVar, i8, enumC3132a);
    }

    public static final Object f(Object[] objArr, long j8) {
        return objArr[(objArr.length - 1) & ((int) j8)];
    }

    public static final void g(Object[] objArr, long j8, Object obj) {
        objArr[(objArr.length - 1) & ((int) j8)] = obj;
    }
}
