package o4;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import n4.C3479d;
import n4.C3480e;
import n4.EnumC3481f;
import n4.InterfaceC3476a;

/* loaded from: classes4.dex */
public final class K2 implements InterfaceC3476a {

    /* renamed from: a, reason: collision with root package name */
    public static final K2 f36094a = new K2();

    /* renamed from: b, reason: collision with root package name */
    private static final String f36095b = "SM";

    private K2() {
    }

    @Override // n4.InterfaceC3476a
    public List a() {
        return AbstractC1378t.p(new C3479d(EnumC3481f.f35463e, true, null), new C3479d(EnumC3481f.f35464f, false, null), new C3479d(EnumC3481f.f35467i, true, new C3480e(false, (ArrayList) null, n4.g.f35497s, 2, (AbstractC3247p) null)), new C3479d(EnumC3481f.f35465g, false, new C3480e(false, (ArrayList) null, n4.g.f35483e, 2, (AbstractC3247p) null)));
    }

    public String b() {
        return f36095b;
    }
}