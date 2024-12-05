package y5;

import M5.AbstractC1239l;
import b.AbstractC1832c;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import v5.C3832b;
import v5.EnumC3833c;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public Vector f39925A;

    /* renamed from: B, reason: collision with root package name */
    public Vector f39926B;

    /* renamed from: C, reason: collision with root package name */
    public Vector f39927C;

    /* renamed from: D, reason: collision with root package name */
    public Vector f39928D;

    /* renamed from: E, reason: collision with root package name */
    public Vector f39929E;

    /* renamed from: F, reason: collision with root package name */
    public Vector f39930F;

    /* renamed from: G, reason: collision with root package name */
    public j f39931G;

    /* renamed from: b, reason: collision with root package name */
    public long f39933b;

    /* renamed from: c, reason: collision with root package name */
    public long f39934c;

    /* renamed from: d, reason: collision with root package name */
    public ZonedDateTime f39935d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39938g;

    /* renamed from: j, reason: collision with root package name */
    public int f39941j;

    /* renamed from: o, reason: collision with root package name */
    public int f39946o;

    /* renamed from: p, reason: collision with root package name */
    public int f39947p;

    /* renamed from: z, reason: collision with root package name */
    public Vector f39957z;

    /* renamed from: a, reason: collision with root package name */
    public B6.e f39932a = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39936e = true;

    /* renamed from: h, reason: collision with root package name */
    public String f39939h = "AA";

    /* renamed from: i, reason: collision with root package name */
    public int f39940i = 2;

    /* renamed from: k, reason: collision with root package name */
    public int f39942k = 2;

    /* renamed from: l, reason: collision with root package name */
    public String f39943l = "EN";

    /* renamed from: m, reason: collision with root package name */
    public int f39944m = 10;

    /* renamed from: n, reason: collision with root package name */
    public int f39945n = 2021;

    /* renamed from: q, reason: collision with root package name */
    public Vector f39948q = new Vector(null, 1, null);

    /* renamed from: r, reason: collision with root package name */
    public Vector f39949r = new Vector(null, 1, null);

    /* renamed from: s, reason: collision with root package name */
    public Vector f39950s = new Vector(null, 1, null);

    /* renamed from: t, reason: collision with root package name */
    public Vector f39951t = new Vector(null, 1, null);

    /* renamed from: u, reason: collision with root package name */
    public Vector f39952u = new Vector(null, 1, null);

    /* renamed from: v, reason: collision with root package name */
    public Vector f39953v = new Vector(null, 1, null);

    /* renamed from: w, reason: collision with root package name */
    public Vector f39954w = new Vector(null, 1, null);

    /* renamed from: x, reason: collision with root package name */
    public Vector f39955x = new Vector(null, 1, null);

    /* renamed from: y, reason: collision with root package name */
    public Vector f39956y = new Vector(null, 1, null);

    public s(B6.e eVar) {
        new LinkedHashSet();
        this.f39957z = new Vector(null, 1, null);
        this.f39925A = new Vector(null, 1, null);
        this.f39926B = new Vector(null, 1, null);
        this.f39927C = new Vector(null, 1, null);
        this.f39928D = new Vector(null, 1, null);
        this.f39929E = new Vector(null, 1, null);
        this.f39930F = new Vector(null, 1, null);
        this.f39931G = new j(this.f39932a, null, null, null, 14);
    }

    public static final boolean c(s sVar, B6.l lVar) {
        sVar.getClass();
        List list = O7.d.f7806a.j().f2375b.f2342j;
        Set set = lVar.f1055e;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1832c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e(s sVar, B6.l lVar) {
        sVar.getClass();
        List list = O7.d.f7806a.j().f2375b.f2340h;
        Set set = lVar.f1054d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1832c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(s sVar, B6.l lVar) {
        sVar.getClass();
        List list = O7.d.f7806a.j().f2375b.f2344l;
        Set set = lVar.f1057g;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1832c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int a() {
        return this.f39944m;
    }

    public final void b(String value) {
        String str;
        AbstractC3159y.i(value, "value");
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC3159y.h(iSOCountries, "getISOCountries()");
        Locale locale = Locale.getDefault();
        AbstractC3159y.h(locale, "getDefault()");
        String upperCase = value.toUpperCase(locale);
        AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (AbstractC1239l.W(iSOCountries, upperCase)) {
            Locale locale2 = Locale.getDefault();
            AbstractC3159y.h(locale2, "getDefault()");
            String upperCase2 = value.toUpperCase(locale2);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            this.f39939h = upperCase2;
            return;
        }
        u uVar = new u("publisherCountryCode", value, "");
        C3832b c3832b = C3832b.f38876a;
        ChoiceError choiceError = ChoiceError.TC_MODEL_PROPERTY_ERROR;
        AbstractC3159y.h("f.s", "TAG");
        String message = uVar.getMessage();
        if (message == null) {
            str = "";
        } else {
            str = message;
        }
        c3832b.a(choiceError, "f.s", str, EnumC3833c.CONSOLE_AND_CALLBACK, uVar);
    }

    public final int d() {
        return this.f39945n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && AbstractC3159y.d(this.f39932a, ((s) obj).f39932a)) {
            return true;
        }
        return false;
    }

    public final int f() {
        Integer num;
        B6.e eVar = this.f39932a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f1037c;
        }
        if (num == null) {
            return this.f39942k;
        }
        return num.intValue();
    }

    public final Vector h() {
        return this.f39953v;
    }

    public int hashCode() {
        B6.e eVar = this.f39932a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String i() {
        return this.f39939h;
    }

    public final Vector j() {
        return this.f39955x;
    }

    public final Vector k() {
        return this.f39956y;
    }

    public final Vector l() {
        return this.f39954w;
    }

    public final j m() {
        return this.f39931G;
    }

    public final Vector n() {
        return this.f39949r;
    }

    public final Vector o() {
        return this.f39950s;
    }

    public final boolean p() {
        return this.f39938g;
    }

    public final Vector q() {
        return this.f39948q;
    }

    public final boolean r() {
        return this.f39937f;
    }

    public final Vector s() {
        return this.f39957z;
    }

    public final Vector t() {
        return this.f39927C;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TCModel(gvl=");
        a8.append(this.f39932a);
        a8.append(')');
        return a8.toString();
    }

    public final Vector u() {
        return this.f39930F;
    }

    public final Vector v() {
        return this.f39929E;
    }

    public final boolean w() {
        return this.f39936e;
    }

    public final void x() {
        this.f39926B.setAllOwnedItems();
        this.f39957z.forEach(new o(this));
        this.f39949r.setAllOwnedItems();
        this.f39950s.setAllOwnedItems();
        this.f39948q.setAllOwnedItems();
        this.f39927C.forEach(new p(this));
        this.f39925A.forEach(new n(this));
        this.f39928D.setAllOwnedItems();
    }
}
