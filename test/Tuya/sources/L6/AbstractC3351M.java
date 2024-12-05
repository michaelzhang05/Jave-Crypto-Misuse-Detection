package l6;

import k6.EnumC3132a;
import n6.C3486F;

/* renamed from: l6.M, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3351M {

    /* renamed from: a, reason: collision with root package name */
    private static final C3486F f34615a = new C3486F("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final C3486F f34616b = new C3486F("PENDING");

    public static final v a(Object obj) {
        if (obj == null) {
            obj = m6.s.f35934a;
        }
        return new C3350L(obj);
    }

    public static final InterfaceC3358f d(InterfaceC3349K interfaceC3349K, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        if (((i8 >= 0 && i8 < 2) || i8 == -2) && enumC3132a == EnumC3132a.DROP_OLDEST) {
            return interfaceC3349K;
        }
        return AbstractC3340B.e(interfaceC3349K, gVar, i8, enumC3132a);
    }
}
