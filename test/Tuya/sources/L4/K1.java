package l4;

import M5.AbstractC1246t;
import java.util.List;
import k4.C3124d;
import k4.EnumC3126f;
import k4.InterfaceC3121a;

/* loaded from: classes4.dex */
public final class K1 implements InterfaceC3121a {

    /* renamed from: a, reason: collision with root package name */
    public static final K1 f34091a = new K1();

    /* renamed from: b, reason: collision with root package name */
    private static final String f34092b = "MO";

    private K1() {
    }

    @Override // k4.InterfaceC3121a
    public List a() {
        return AbstractC1246t.p(new C3124d(EnumC3126f.f33471e, true, null), new C3124d(EnumC3126f.f33472f, false, null));
    }

    public String b() {
        return f34092b;
    }
}
