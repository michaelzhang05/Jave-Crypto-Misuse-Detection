package o4;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import n4.C3479d;
import n4.C3480e;
import n4.EnumC3481f;
import n4.InterfaceC3476a;

/* renamed from: o4.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3651z implements InterfaceC3476a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3651z f36464a = new C3651z();

    /* renamed from: b, reason: collision with root package name */
    private static final String f36465b = "BL";

    private C3651z() {
    }

    @Override // n4.InterfaceC3476a
    public List a() {
        return AbstractC1378t.p(new C3479d(EnumC3481f.f35463e, true, null), new C3479d(EnumC3481f.f35464f, false, null), new C3479d(EnumC3481f.f35467i, true, new C3480e(false, (ArrayList) null, n4.g.f35497s, 2, (AbstractC3247p) null)), new C3479d(EnumC3481f.f35465g, true, new C3480e(false, (ArrayList) null, n4.g.f35483e, 2, (AbstractC3247p) null)), new C3479d(EnumC3481f.f35468j, false, new C3480e(false, (ArrayList) null, n4.g.f35482d, 2, (AbstractC3247p) null)));
    }

    public String b() {
        return f36465b;
    }
}