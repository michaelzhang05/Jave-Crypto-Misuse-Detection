package l4;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.List;
import k4.C3124d;
import k4.C3125e;
import k4.EnumC3126f;
import k4.InterfaceC3121a;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: l4.p2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3267p2 implements InterfaceC3121a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3267p2 f34369a = new C3267p2();

    /* renamed from: b, reason: collision with root package name */
    private static final String f34370b = "PN";

    private C3267p2() {
    }

    @Override // k4.InterfaceC3121a
    public List a() {
        return AbstractC1246t.p(new C3124d(EnumC3126f.f33471e, true, null), new C3124d(EnumC3126f.f33472f, false, null), new C3124d(EnumC3126f.f33473g, true, new C3125e(false, (ArrayList) null, k4.g.f33491e, 2, (AbstractC3151p) null)), new C3124d(EnumC3126f.f33475i, true, new C3125e(false, (ArrayList) null, k4.g.f33505s, 2, (AbstractC3151p) null)));
    }

    public String b() {
        return f34370b;
    }
}