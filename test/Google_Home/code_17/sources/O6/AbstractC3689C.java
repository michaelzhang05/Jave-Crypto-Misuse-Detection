package o6;

import n6.EnumC3487a;
import q6.C3865F;

/* renamed from: o6.C */
/* loaded from: classes5.dex */
public abstract class AbstractC3689C {

    /* renamed from: a */
    public static final C3865F f36575a = new C3865F("NO_VALUE");

    public static final v a(int i8, int i9, EnumC3487a enumC3487a) {
        if (i8 >= 0) {
            if (i9 >= 0) {
                if (i8 <= 0 && i9 <= 0 && enumC3487a != EnumC3487a.SUSPEND) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC3487a).toString());
                }
                int i10 = i9 + i8;
                if (i10 < 0) {
                    i10 = Integer.MAX_VALUE;
                }
                return new C3688B(i8, i10, enumC3487a);
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i9).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i8).toString());
    }

    public static /* synthetic */ v b(int i8, int i9, EnumC3487a enumC3487a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            enumC3487a = EnumC3487a.SUSPEND;
        }
        return a(i8, i9, enumC3487a);
    }

    public static final InterfaceC3706f e(InterfaceC3687A interfaceC3687A, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        if ((i8 == 0 || i8 == -3) && enumC3487a == EnumC3487a.SUSPEND) {
            return interfaceC3687A;
        }
        return new p6.h(interfaceC3687A, gVar, i8, enumC3487a);
    }

    public static final Object f(Object[] objArr, long j8) {
        return objArr[(objArr.length - 1) & ((int) j8)];
    }

    public static final void g(Object[] objArr, long j8, Object obj) {
        objArr[(objArr.length - 1) & ((int) j8)] = obj;
    }
}
