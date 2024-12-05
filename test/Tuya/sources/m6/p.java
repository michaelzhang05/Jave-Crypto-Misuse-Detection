package m6;

import k6.EnumC3132a;
import l6.InterfaceC3358f;

/* loaded from: classes5.dex */
public interface p extends InterfaceC3358f {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ InterfaceC3358f a(p pVar, P5.g gVar, int i8, EnumC3132a enumC3132a, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 1) != 0) {
                    gVar = P5.h.f7994a;
                }
                if ((i9 & 2) != 0) {
                    i8 = -3;
                }
                if ((i9 & 4) != 0) {
                    enumC3132a = EnumC3132a.SUSPEND;
                }
                return pVar.b(gVar, i8, enumC3132a);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    InterfaceC3358f b(P5.g gVar, int i8, EnumC3132a enumC3132a);
}
