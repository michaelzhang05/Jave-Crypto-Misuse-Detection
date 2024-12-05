package o6;

import n6.EnumC3487a;
import q6.C3865F;

/* renamed from: o6.N, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3700N {

    /* renamed from: a, reason: collision with root package name */
    private static final C3865F f36616a = new C3865F("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final C3865F f36617b = new C3865F("PENDING");

    public static final w a(Object obj) {
        if (obj == null) {
            obj = p6.s.f37960a;
        }
        return new C3699M(obj);
    }

    public static final InterfaceC3706f d(InterfaceC3698L interfaceC3698L, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        if (((i8 >= 0 && i8 < 2) || i8 == -2) && enumC3487a == EnumC3487a.DROP_OLDEST) {
            return interfaceC3698L;
        }
        return AbstractC3689C.e(interfaceC3698L, gVar, i8, enumC3487a);
    }
}
