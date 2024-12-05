package p2;

import O5.r;
import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.stripe.android.paymentsheet.u;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.C3440l;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3738a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0823a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0823a f36919a = new C0823a();

        C0823a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(EnumC2791e brand) {
            AbstractC3255y.i(brand, "brand");
            return brand.f();
        }
    }

    public static final List a(u.g gVar) {
        AbstractC3255y.i(gVar, "<this>");
        List s8 = gVar.s();
        if (!(!s8.isEmpty())) {
            s8 = null;
        }
        if (s8 == null) {
            return null;
        }
        return AbstractC1378t.Q0(s8, 10);
    }

    public static final Map b(u.b bVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        AbstractC3255y.i(bVar, "<this>");
        u.o g8 = bVar.g();
        u.p b8 = bVar.g().b();
        u.p.a aVar = u.p.f27556f;
        r a8 = x.a("colorsLight", Boolean.valueOf(!AbstractC3255y.d(b8, aVar.b())));
        r a9 = x.a("colorsDark", Boolean.valueOf(!AbstractC3255y.d(bVar.g().a(), aVar.a())));
        if (g8.g().b() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        r a10 = x.a("corner_radius", Boolean.valueOf(z8));
        if (g8.g().a() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        r a11 = x.a("border_width", Boolean.valueOf(z9));
        if (g8.h().a() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Map k8 = Q.k(a8, a9, a10, a11, x.a("font", Boolean.valueOf(z10)));
        u.e b9 = bVar.b();
        u.e.a aVar2 = u.e.f27457l;
        r a12 = x.a("colorsLight", Boolean.valueOf(!AbstractC3255y.d(b9, aVar2.b())));
        r a13 = x.a("colorsDark", Boolean.valueOf(!AbstractC3255y.d(bVar.a(), aVar2.a())));
        float g9 = bVar.h().g();
        C3440l c3440l = C3440l.f35212a;
        if (g9 == c3440l.e().e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        r a14 = x.a("corner_radius", Boolean.valueOf(!z11));
        if (bVar.h().b() == c3440l.e().c()) {
            z12 = true;
        } else {
            z12 = false;
        }
        r a15 = x.a("border_width", Boolean.valueOf(!z12));
        if (bVar.i().b() != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        r a16 = x.a("font", Boolean.valueOf(z13));
        if (bVar.i().g() == c3440l.f().g()) {
            z14 = true;
        } else {
            z14 = false;
        }
        Map m8 = Q.m(a12, a13, a14, a15, a16, x.a("size_scale_factor", Boolean.valueOf(!z14)), x.a("primary_button", k8));
        boolean contains = k8.values().contains(Boolean.TRUE);
        Collection values = m8.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof Boolean) {
                arrayList.add(obj);
            }
        }
        if (arrayList.contains(Boolean.TRUE) || contains) {
            z15 = true;
        }
        m8.put("usage", Boolean.valueOf(z15));
        return m8;
    }

    public static final Map c(u.d dVar) {
        AbstractC3255y.i(dVar, "<this>");
        return Q.k(x.a("attach_defaults", Boolean.valueOf(dVar.b())), x.a("name", dVar.s().name()), x.a(NotificationCompat.CATEGORY_EMAIL, dVar.p().name()), x.a(HintConstants.AUTOFILL_HINT_PHONE, dVar.u().name()), x.a("address", dVar.a().name()));
    }

    public static final String d(List list) {
        AbstractC3255y.i(list, "<this>");
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        return AbstractC1378t.w0(list, null, null, null, 0, null, C0823a.f36919a, 31, null);
    }
}
