package g4;

import M5.AbstractC1246t;
import M5.a0;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.stripe.android.model.a;
import g4.g;
import g6.n;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f31260a = a0.i("BE", "BR", "CH", "DE", "ES", "ID", "IT", "MX", "NL", "NO", "PL", "RU", "SE");

    public static final C2717a a(C2717a c2717a) {
        String g8;
        AbstractC3159y.i(c2717a, "<this>");
        C2717a b8 = C2717a.b(c2717a, null, null, null, null, null, null, null, 127, null);
        if (c2717a.g() != null) {
            if (c2717a.d() != null) {
                g8 = c2717a.d() + ", " + c2717a.g();
            } else {
                g8 = c2717a.g();
            }
            b8.k(g8);
        }
        return b8;
    }

    public static final String b(Context context, c addressLine1, C2717a address) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(addressLine1, "addressLine1");
        AbstractC3159y.i(address, "address");
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
        if (AbstractC3159y.d(f8, "JP")) {
            return c(context, addressLine1, h8, address.d());
        }
        if (!(!n.u(b8)) && !(!n.u(a8))) {
            return "";
        }
        if (AbstractC1246t.d0(f31260a, f8)) {
            return n.M0(a8 + " " + b8).toString();
        }
        return n.M0(b8 + " " + a8).toString();
    }

    public static final String c(Context context, c addressLine1, String str, String str2) {
        boolean z8;
        Locale locale;
        LocaleList locales;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(addressLine1, "addressLine1");
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
        if (AbstractC3159y.d(locale, Locale.JAPANESE)) {
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
        AbstractC3159y.i(gVar, "<this>");
        AbstractC3159y.i(type, "type");
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

    public static final C2717a e(C2717a c2717a, g place) {
        String str;
        String str2;
        AbstractC3159y.i(c2717a, "<this>");
        AbstractC3159y.i(place, "place");
        b d8 = d(place, g.c.f31241c);
        if (d8 != null) {
            str = d8.c();
        } else {
            str = null;
        }
        b d9 = d(place, g.c.f31240b);
        if (d9 != null) {
            str2 = d9.b();
        } else {
            str2 = null;
        }
        C2717a b8 = C2717a.b(c2717a, null, null, null, null, null, null, null, 127, null);
        String f8 = c2717a.f();
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
            if (c2717a.h() == null && str != null) {
                b8.o(str);
            }
            return a(b8);
        }
        return b8;
    }

    public static final com.stripe.android.model.a f(g gVar, Context context) {
        boolean d8;
        AbstractC3159y.i(gVar, "<this>");
        AbstractC3159y.i(context, "context");
        C2717a c2717a = new C2717a(null, null, null, null, null, null, null, 127, null);
        c cVar = new c(null, null, null, null, null, 31, null);
        List<b> b8 = gVar.b();
        if (b8 != null) {
            for (b bVar : b8) {
                String str = (String) bVar.d().get(0);
                if (AbstractC3159y.d(str, g.c.f31251m.b())) {
                    cVar.g(bVar.b());
                } else if (AbstractC3159y.d(str, g.c.f31250l.b())) {
                    cVar.f(bVar.b());
                } else if (AbstractC3159y.d(str, g.c.f31249k.b())) {
                    c2717a.k(bVar.b());
                } else {
                    boolean z8 = true;
                    if (AbstractC3159y.d(str, g.c.f31245g.b())) {
                        d8 = true;
                    } else {
                        d8 = AbstractC3159y.d(str, g.c.f31252n.b());
                    }
                    if (!d8) {
                        z8 = AbstractC3159y.d(str, g.c.f31247i.b());
                    }
                    if (z8) {
                        c2717a.o(bVar.b());
                    } else if (AbstractC3159y.d(str, g.c.f31240b.b())) {
                        c2717a.l(bVar.c());
                    } else if (AbstractC3159y.d(str, g.c.f31242d.b())) {
                        if (c2717a.h() == null) {
                            c2717a.o(bVar.b());
                        }
                    } else if (AbstractC3159y.d(str, g.c.f31241c.b())) {
                        if (c2717a.e() == null && c2717a.g() == null) {
                            c2717a.n(bVar.b());
                        } else {
                            c2717a.l(bVar.c());
                        }
                    } else if (AbstractC3159y.d(str, g.c.f31246h.b())) {
                        if (c2717a.h() == null) {
                            c2717a.o(bVar.b());
                        } else {
                            c2717a.n(bVar.b());
                        }
                    } else if (AbstractC3159y.d(str, g.c.f31248j.b())) {
                        c2717a.p(bVar.b());
                    } else if (AbstractC3159y.d(str, g.c.f31244f.b())) {
                        c2717a.m(bVar.c());
                    } else if (AbstractC3159y.d(str, g.c.f31253o.b())) {
                        if (c2717a.h() == null) {
                            c2717a.n(bVar.b());
                        } else {
                            c2717a.o(bVar.b());
                        }
                    } else if (AbstractC3159y.d(str, g.c.f31254p.b())) {
                        cVar.h(bVar.b());
                    } else if (AbstractC3159y.d(str, g.c.f31255q.b())) {
                        cVar.i(bVar.b());
                    } else if (AbstractC3159y.d(str, g.c.f31256r.b())) {
                        cVar.j(bVar.b());
                    }
                }
            }
        }
        c2717a.j(b(context, cVar, c2717a));
        C2717a e8 = e(c2717a, gVar);
        return new a.C0498a().e(e8.c()).f(e8.d()).b(e8.h()).h(e8.e()).c(e8.f()).g(e8.i()).a();
    }
}
