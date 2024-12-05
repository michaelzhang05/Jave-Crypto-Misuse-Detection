package l6;

import q6.C3865F;

/* loaded from: classes5.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3865F f34552a = new C3865F("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final C3865F f34553b = new C3865F("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final C3865F f34554c = new C3865F("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final C3865F f34555d = new C3865F("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final C3865F f34556e = new C3865F("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C3357g0 f34557f = new C3357g0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C3357g0 f34558g = new C3357g0(true);

    public static final Object g(Object obj) {
        if (obj instanceof InterfaceC3380s0) {
            return new C3382t0((InterfaceC3380s0) obj);
        }
        return obj;
    }

    public static final Object h(Object obj) {
        C3382t0 c3382t0;
        InterfaceC3380s0 interfaceC3380s0;
        if (obj instanceof C3382t0) {
            c3382t0 = (C3382t0) obj;
        } else {
            c3382t0 = null;
        }
        if (c3382t0 != null && (interfaceC3380s0 = c3382t0.f34655a) != null) {
            return interfaceC3380s0;
        }
        return obj;
    }
}
