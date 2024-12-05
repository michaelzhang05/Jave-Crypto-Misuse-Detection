package m2;

import L5.r;
import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import b3.EnumC1870e;
import com.stripe.android.paymentsheet.u;
import j4.C3086l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3395a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0793a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0793a f34893a = new C0793a();

        C0793a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            return brand.f();
        }
    }

    public static final List a(u.g gVar) {
        AbstractC3159y.i(gVar, "<this>");
        List n8 = gVar.n();
        if (!(!n8.isEmpty())) {
            n8 = null;
        }
        if (n8 == null) {
            return null;
        }
        return AbstractC1246t.Q0(n8, 10);
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
        AbstractC3159y.i(bVar, "<this>");
        u.o e8 = bVar.e();
        u.p c8 = bVar.e().c();
        u.p.a aVar = u.p.f26501f;
        r a8 = x.a("colorsLight", Boolean.valueOf(!AbstractC3159y.d(c8, aVar.b())));
        r a9 = x.a("colorsDark", Boolean.valueOf(!AbstractC3159y.d(bVar.e().b(), aVar.a())));
        if (e8.e().c() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        r a10 = x.a("corner_radius", Boolean.valueOf(z8));
        if (e8.e().b() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        r a11 = x.a("border_width", Boolean.valueOf(z9));
        if (e8.f().b() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Map k8 = Q.k(a8, a9, a10, a11, x.a("font", Boolean.valueOf(z10)));
        u.e c9 = bVar.c();
        u.e.a aVar2 = u.e.f26402l;
        r a12 = x.a("colorsLight", Boolean.valueOf(!AbstractC3159y.d(c9, aVar2.b())));
        r a13 = x.a("colorsDark", Boolean.valueOf(!AbstractC3159y.d(bVar.b(), aVar2.a())));
        float e9 = bVar.f().e();
        C3086l c3086l = C3086l.f33236a;
        if (e9 == c3086l.e().e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        r a14 = x.a("corner_radius", Boolean.valueOf(!z11));
        if (bVar.f().c() == c3086l.e().c()) {
            z12 = true;
        } else {
            z12 = false;
        }
        r a15 = x.a("border_width", Boolean.valueOf(!z12));
        if (bVar.i().c() != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        r a16 = x.a("font", Boolean.valueOf(z13));
        if (bVar.i().e() == c3086l.f().g()) {
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
        AbstractC3159y.i(dVar, "<this>");
        return Q.k(x.a("attach_defaults", Boolean.valueOf(dVar.c())), x.a("name", dVar.n().name()), x.a(NotificationCompat.CATEGORY_EMAIL, dVar.k().name()), x.a(HintConstants.AUTOFILL_HINT_PHONE, dVar.o().name()), x.a("address", dVar.b().name()));
    }

    public static final String d(List list) {
        AbstractC3159y.i(list, "<this>");
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        return AbstractC1246t.w0(list, null, null, null, 0, null, C0793a.f34893a, 31, null);
    }
}
