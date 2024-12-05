package i6;

import n6.C3486F;

/* loaded from: classes5.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3486F f31700a = new C3486F("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final C3486F f31701b = new C3486F("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final C3486F f31702c = new C3486F("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final C3486F f31703d = new C3486F("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final C3486F f31704e = new C3486F("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C2822g0 f31705f = new C2822g0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C2822g0 f31706g = new C2822g0(true);

    public static final Object g(Object obj) {
        if (obj instanceof InterfaceC2845s0) {
            return new C2847t0((InterfaceC2845s0) obj);
        }
        return obj;
    }

    public static final Object h(Object obj) {
        C2847t0 c2847t0;
        InterfaceC2845s0 interfaceC2845s0;
        if (obj instanceof C2847t0) {
            c2847t0 = (C2847t0) obj;
        } else {
            c2847t0 = null;
        }
        if (c2847t0 != null && (interfaceC2845s0 = c2847t0.f31803a) != null) {
            return interfaceC2845s0;
        }
        return obj;
    }
}
