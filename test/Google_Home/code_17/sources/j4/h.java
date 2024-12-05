package j4;

import P5.AbstractC1378t;
import P5.a0;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.stripe.android.model.a;
import j4.g;
import j6.n;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f33987a = a0.i("BE", "BR", "CH", "DE", "ES", "ID", "IT", "MX", "NL", "NO", "PL", "RU", "SE");

    public static final C3194a a(C3194a c3194a) {
        String g8;
        AbstractC3255y.i(c3194a, "<this>");
        C3194a b8 = C3194a.b(c3194a, null, null, null, null, null, null, null, 127, null);
        if (c3194a.g() != null) {
            if (c3194a.d() != null) {
                g8 = c3194a.d() + ", " + c3194a.g();
            } else {
                g8 = c3194a.g();
            }
            b8.k(g8);
        }
        return b8;
    }

    public static final String b(Context context, c addressLine1, C3194a address) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(addressLine1, "addressLine1");
        AbstractC3255y.i(address, "address");
        String b8 = addressLine1.b();
        if (b8 == null) {
            b8 = "";
        }
        String a8 = addressLine1.a();
        if (a8 == null) {
            a8 = "";
        }
        String h8 = address.h();
        String f8 = address.f();
        if (AbstractC3255y.d(f8, "JP")) {
            return c(context, addressLine1, h8, address.d());
        }
        if (!(!n.u(b8)) && !(!n.u(a8))) {
            return "";
        }
        if (AbstractC1378t.d0(f33987a, f8)) {
            return n.M0(a8 + " " + b8).toString();
        }
        return n.M0(b8 + " " + a8).toString();
    }

    public static final String c(Context context, c addressLine1, String str, String str2) {
        boolean z8;
        Locale locale;
        LocaleList locales;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(addressLine1, "addressLine1");
        if (addressLine1.c() != null && addressLine1.d() != null && addressLine1.e() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        String d8 = addressLine1.d();
        String e8 = addressLine1.e();
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        String c8 = addressLine1.c();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        if (AbstractC3255y.d(locale, Locale.JAPANESE)) {
            if (z8) {
                str3 = d8 + e8 + "-" + str2;
            }
            return str + c8 + str3;
        }
        if (z8) {
            str3 = d8 + "-" + e8 + "-" + str2;
        }
        return str3 + " " + c8 + " " + str;
    }

    public static final b d(g gVar, g.c type) {
        AbstractC3255y.i(gVar, "<this>");
        AbstractC3255y.i(type, "type");
        List b8 = gVar.b();
        Object obj = null;
        if (b8 == null) {
            return null;
        }
        Iterator it = b8.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((b) next).d().contains(type.b())) {
                obj = next;
                break;
            }
        }
        return (b) obj;
    }

    public static final C3194a e(C3194a c3194a, g place) {
        String str;
        String str2;
        AbstractC3255y.i(c3194a, "<this>");
        AbstractC3255y.i(place, "place");
        b d8 = d(place, g.c.f33968c);
        if (d8 != null) {
            str = d8.c();
        } else {
            str = null;
        }
        b d9 = d(place, g.c.f33967b);
        if (d9 != null) {
            str2 = d9.b();
        } else {
            str2 = null;
        }
        C3194a b8 = C3194a.b(c3194a, null, null, null, null, null, null, null, 127, null);
        String f8 = c3194a.f();
        if (f8 != null) {
            int hashCode = f8.hashCode();
            if (hashCode != 2128) {
                if (hashCode != 2222) {
                    if (hashCode != 2332) {
                        if (hashCode != 2347) {
                            if (hashCode != 2374) {
                                if (hashCode != 2552) {
                                    if (hashCode != 2686) {
                                        if (hashCode != 2855) {
                                            if (hashCode != 2475) {
                                                if (hashCode != 2476 || !f8.equals("MY")) {
                                                    return b8;
                                                }
                                            } else if (!f8.equals("MX")) {
                                                return b8;
                                            }
                                        } else if (!f8.equals("ZA")) {
                                            return b8;
                                        }
                                    } else if (!f8.equals("TR")) {
                                        return b8;
                                    }
                                } else if (!f8.equals("PH")) {
                                    return b8;
                                }
                                return a(b8);
                            }
                            if (f8.equals("JP")) {
                                b8.k(null);
                                return b8;
                            }
                            return b8;
                        }
                        if (!f8.equals("IT")) {
                            return b8;
                        }
                    } else {
                        if (f8.equals("IE") && str2 != null) {
                            b8.l(str2);
                            return a(b8);
                        }
                        return b8;
                    }
                } else if (!f8.equals("ES")) {
                    return b8;
                }
                if (str != null) {
                    b8.l(str);
                    return b8;
                }
                return b8;
            }
            if (!f8.equals("BR")) {
                return b8;
            }
            if (c3194a.h() == null && str != null) {
                b8.o(str);
            }
            return a(b8);
        }
        return b8;
    }

    public static final com.stripe.android.model.a f(g gVar, Context context) {
        boolean d8;
        AbstractC3255y.i(gVar, "<this>");
        AbstractC3255y.i(context, "context");
        C3194a c3194a = new C3194a(null, null, null, null, null, null, null, 127, null);
        c cVar = new c(null, null, null, null, null, 31, null);
        List<b> b8 = gVar.b();
        if (b8 != null) {
            for (b bVar : b8) {
                String str = (String) bVar.d().get(0);
                if (AbstractC3255y.d(str, g.c.f33978m.b())) {
                    cVar.g(bVar.b());
                } else if (AbstractC3255y.d(str, g.c.f33977l.b())) {
                    cVar.f(bVar.b());
                } else if (AbstractC3255y.d(str, g.c.f33976k.b())) {
                    c3194a.k(bVar.b());
                } else {
                    boolean z8 = true;
                    if (AbstractC3255y.d(str, g.c.f33972g.b())) {
                        d8 = true;
                    } else {
                        d8 = AbstractC3255y.d(str, g.c.f33979n.b());
                    }
                    if (!d8) {
                        z8 = AbstractC3255y.d(str, g.c.f33974i.b());
                    }
                    if (z8) {
                        c3194a.o(bVar.b());
                    } else if (AbstractC3255y.d(str, g.c.f33967b.b())) {
                        c3194a.l(bVar.c());
                    } else if (AbstractC3255y.d(str, g.c.f33969d.b())) {
                        if (c3194a.h() == null) {
                            c3194a.o(bVar.b());
                        }
                    } else if (AbstractC3255y.d(str, g.c.f33968c.b())) {
                        if (c3194a.e() == null && c3194a.g() == null) {
                            c3194a.n(bVar.b());
                        } else {
                            c3194a.l(bVar.c());
                        }
                    } else if (AbstractC3255y.d(str, g.c.f33973h.b())) {
                        if (c3194a.h() == null) {
                            c3194a.o(bVar.b());
                        } else {
                            c3194a.n(bVar.b());
                        }
                    } else if (AbstractC3255y.d(str, g.c.f33975j.b())) {
                        c3194a.p(bVar.b());
                    } else if (AbstractC3255y.d(str, g.c.f33971f.b())) {
                        c3194a.m(bVar.c());
                    } else if (AbstractC3255y.d(str, g.c.f33980o.b())) {
                        if (c3194a.h() == null) {
                            c3194a.n(bVar.b());
                        } else {
                            c3194a.o(bVar.b());
                        }
                    } else if (AbstractC3255y.d(str, g.c.f33981p.b())) {
                        cVar.h(bVar.b());
                    } else if (AbstractC3255y.d(str, g.c.f33982q.b())) {
                        cVar.i(bVar.b());
                    } else if (AbstractC3255y.d(str, g.c.f33983r.b())) {
                        cVar.j(bVar.b());
                    }
                }
            }
        }
        c3194a.j(b(context, cVar, c3194a));
        C3194a e8 = e(c3194a, gVar);
        return new a.C0494a().e(e8.c()).f(e8.d()).b(e8.h()).h(e8.e()).c(e8.f()).g(e8.i()).a();
    }
}
