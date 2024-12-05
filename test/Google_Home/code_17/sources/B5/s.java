package B5;

import P5.AbstractC1371l;
import b.AbstractC1941c;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;
import y5.C4209b;
import y5.EnumC4210c;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public Vector f969A;

    /* renamed from: B, reason: collision with root package name */
    public Vector f970B;

    /* renamed from: C, reason: collision with root package name */
    public Vector f971C;

    /* renamed from: D, reason: collision with root package name */
    public Vector f972D;

    /* renamed from: E, reason: collision with root package name */
    public Vector f973E;

    /* renamed from: F, reason: collision with root package name */
    public Vector f974F;

    /* renamed from: G, reason: collision with root package name */
    public j f975G;

    /* renamed from: b, reason: collision with root package name */
    public long f977b;

    /* renamed from: c, reason: collision with root package name */
    public long f978c;

    /* renamed from: d, reason: collision with root package name */
    public ZonedDateTime f979d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f981f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f982g;

    /* renamed from: j, reason: collision with root package name */
    public int f985j;

    /* renamed from: o, reason: collision with root package name */
    public int f990o;

    /* renamed from: p, reason: collision with root package name */
    public int f991p;

    /* renamed from: z, reason: collision with root package name */
    public Vector f1001z;

    /* renamed from: a, reason: collision with root package name */
    public E6.e f976a = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f980e = true;

    /* renamed from: h, reason: collision with root package name */
    public String f983h = "AA";

    /* renamed from: i, reason: collision with root package name */
    public int f984i = 2;

    /* renamed from: k, reason: collision with root package name */
    public int f986k = 2;

    /* renamed from: l, reason: collision with root package name */
    public String f987l = "EN";

    /* renamed from: m, reason: collision with root package name */
    public int f988m = 10;

    /* renamed from: n, reason: collision with root package name */
    public int f989n = 2021;

    /* renamed from: q, reason: collision with root package name */
    public Vector f992q = new Vector(null, 1, null);

    /* renamed from: r, reason: collision with root package name */
    public Vector f993r = new Vector(null, 1, null);

    /* renamed from: s, reason: collision with root package name */
    public Vector f994s = new Vector(null, 1, null);

    /* renamed from: t, reason: collision with root package name */
    public Vector f995t = new Vector(null, 1, null);

    /* renamed from: u, reason: collision with root package name */
    public Vector f996u = new Vector(null, 1, null);

    /* renamed from: v, reason: collision with root package name */
    public Vector f997v = new Vector(null, 1, null);

    /* renamed from: w, reason: collision with root package name */
    public Vector f998w = new Vector(null, 1, null);

    /* renamed from: x, reason: collision with root package name */
    public Vector f999x = new Vector(null, 1, null);

    /* renamed from: y, reason: collision with root package name */
    public Vector f1000y = new Vector(null, 1, null);

    public s(E6.e eVar) {
        new LinkedHashSet();
        this.f1001z = new Vector(null, 1, null);
        this.f969A = new Vector(null, 1, null);
        this.f970B = new Vector(null, 1, null);
        this.f971C = new Vector(null, 1, null);
        this.f972D = new Vector(null, 1, null);
        this.f973E = new Vector(null, 1, null);
        this.f974F = new Vector(null, 1, null);
        this.f975G = new j(this.f976a, null, null, null, 14);
    }

    public static final boolean c(s sVar, E6.l lVar) {
        sVar.getClass();
        List list = R7.d.f9662a.j().f3925b.f3892j;
        Set set = lVar.f2650e;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1941c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e(s sVar, E6.l lVar) {
        sVar.getClass();
        List list = R7.d.f9662a.j().f3925b.f3890h;
        Set set = lVar.f2649d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1941c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(s sVar, E6.l lVar) {
        sVar.getClass();
        List list = R7.d.f9662a.j().f3925b.f3894l;
        Set set = lVar.f2652g;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1941c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int a() {
        return this.f988m;
    }

    public final void b(String value) {
        String str;
        AbstractC3255y.i(value, "value");
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC3255y.h(iSOCountries, "getISOCountries()");
        Locale locale = Locale.getDefault();
        AbstractC3255y.h(locale, "getDefault()");
        String upperCase = value.toUpperCase(locale);
        AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (AbstractC1371l.W(iSOCountries, upperCase)) {
            Locale locale2 = Locale.getDefault();
            AbstractC3255y.h(locale2, "getDefault()");
            String upperCase2 = value.toUpperCase(locale2);
            AbstractC3255y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            this.f983h = upperCase2;
            return;
        }
        u uVar = new u("publisherCountryCode", value, "");
        C4209b c4209b = C4209b.f41007a;
        ChoiceError choiceError = ChoiceError.TC_MODEL_PROPERTY_ERROR;
        AbstractC3255y.h("f.s", "TAG");
        String message = uVar.getMessage();
        if (message == null) {
            str = "";
        } else {
            str = message;
        }
        c4209b.a(choiceError, "f.s", str, EnumC4210c.CONSOLE_AND_CALLBACK, uVar);
    }

    public final int d() {
        return this.f989n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && AbstractC3255y.d(this.f976a, ((s) obj).f976a)) {
            return true;
        }
        return false;
    }

    public final int f() {
        Integer num;
        E6.e eVar = this.f976a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f2632c;
        }
        if (num == null) {
            return this.f986k;
        }
        return num.intValue();
    }

    public final Vector h() {
        return this.f997v;
    }

    public int hashCode() {
        E6.e eVar = this.f976a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String i() {
        return this.f983h;
    }

    public final Vector j() {
        return this.f999x;
    }

    public final Vector k() {
        return this.f1000y;
    }

    public final Vector l() {
        return this.f998w;
    }

    public final j m() {
        return this.f975G;
    }

    public final Vector n() {
        return this.f993r;
    }

    public final Vector o() {
        return this.f994s;
    }

    public final boolean p() {
        return this.f982g;
    }

    public final Vector q() {
        return this.f992q;
    }

    public final boolean r() {
        return this.f981f;
    }

    public final Vector s() {
        return this.f1001z;
    }

    public final Vector t() {
        return this.f971C;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("TCModel(gvl=");
        a8.append(this.f976a);
        a8.append(')');
        return a8.toString();
    }

    public final Vector u() {
        return this.f974F;
    }

    public final Vector v() {
        return this.f973E;
    }

    public final boolean w() {
        return this.f980e;
    }

    public final void x() {
        this.f970B.setAllOwnedItems();
        this.f1001z.forEach(new o(this));
        this.f993r.setAllOwnedItems();
        this.f994s.setAllOwnedItems();
        this.f992q.setAllOwnedItems();
        this.f971C.forEach(new p(this));
        this.f969A.forEach(new n(this));
        this.f972D.setAllOwnedItems();
    }
}
