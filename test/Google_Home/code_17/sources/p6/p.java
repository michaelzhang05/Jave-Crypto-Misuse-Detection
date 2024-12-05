package p6;

import n6.EnumC3487a;
import o6.InterfaceC3706f;

/* loaded from: classes5.dex */
public interface p extends InterfaceC3706f {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ InterfaceC3706f a(p pVar, S5.g gVar, int i8, EnumC3487a enumC3487a, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 1) != 0) {
                    gVar = S5.h.f9825a;
                }
                if ((i9 & 2) != 0) {
                    i8 = -3;
                }
                if ((i9 & 4) != 0) {
                    enumC3487a = EnumC3487a.SUSPEND;
                }
                return pVar.a(gVar, i8, enumC3487a);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    InterfaceC3706f a(S5.g gVar, int i8, EnumC3487a enumC3487a);
}
