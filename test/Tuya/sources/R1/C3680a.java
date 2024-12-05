package r1;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u1.b;
import u1.c;
import w1.C3843d;
import w1.InterfaceC3842c;
import w1.f;
import w1.g;
import w1.h;
import w1.i;
import w1.j;
import w1.k;
import w1.l;
import w1.m;
import w1.n;
import w1.o;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3680a {

    /* renamed from: a, reason: collision with root package name */
    private Map f37558a = new HashMap();

    public C3680a() {
    }

    public void a(String str) {
        this.f37558a.clear();
        String[] split = str.split("~");
        C3843d c3843d = new C3843d(split[0]);
        this.f37558a.put(C3843d.f38950f, c3843d);
        List list = (List) c3843d.c("SectionIds");
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (((Integer) list.get(i8)).equals(Integer.valueOf(h.f38960d))) {
                this.f37558a.put(h.f38962f, new h(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(g.f38954d))) {
                this.f37558a.put(g.f38956f, new g(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(o.f38990b))) {
                this.f37558a.put(o.f38992d, new o(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(i.f38966d))) {
                this.f37558a.put(i.f38968f, new i(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(l.f38978d))) {
                this.f37558a.put(l.f38980f, new l(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(n.f38986d))) {
                this.f37558a.put(n.f38988f, new n(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(j.f38970d))) {
                this.f37558a.put(j.f38972f, new j(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(m.f38982d))) {
                this.f37558a.put(m.f38984f, new m(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(k.f38974d))) {
                this.f37558a.put(k.f38976f, new k(split[i8 + 1]));
            }
        }
    }

    public void b(int i8) {
        c((String) f.f38953b.get(Integer.valueOf(i8)));
    }

    public void c(String str) {
        if (this.f37558a.containsKey(str)) {
            this.f37558a.remove(str);
        }
    }

    public String d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < f.f38952a.size(); i8++) {
            String str = (String) f.f38952a.get(i8);
            if (this.f37558a.containsKey(str)) {
                InterfaceC3842c interfaceC3842c = (InterfaceC3842c) this.f37558a.get(str);
                arrayList.add(interfaceC3842c.b());
                arrayList2.add(Integer.valueOf(interfaceC3842c.getId()));
            }
        }
        C3843d c3843d = new C3843d();
        try {
            c3843d.a("SectionIds", h());
            arrayList.add(0, c3843d.b());
            return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("~"));
        } catch (c e8) {
            throw new b(e8);
        }
    }

    public C3843d e() {
        C3843d c3843d = new C3843d();
        try {
            c3843d.a("SectionIds", h());
        } catch (c unused) {
        }
        return c3843d;
    }

    public InterfaceC3842c f(int i8) {
        return g((String) f.f38953b.get(Integer.valueOf(i8)));
    }

    public InterfaceC3842c g(String str) {
        if (this.f37558a.containsKey(str)) {
            return (InterfaceC3842c) this.f37558a.get(str);
        }
        return null;
    }

    public List h() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < f.f38952a.size(); i8++) {
            String str = (String) f.f38952a.get(i8);
            if (this.f37558a.containsKey(str)) {
                arrayList.add(Integer.valueOf(((InterfaceC3842c) this.f37558a.get(str)).getId()));
            }
        }
        return arrayList;
    }

    public boolean i(int i8) {
        return j((String) f.f38953b.get(Integer.valueOf(i8)));
    }

    public boolean j(String str) {
        return this.f37558a.containsKey(str);
    }

    public void k(String str, String str2, Object obj) {
        InterfaceC3842c interfaceC3842c;
        if (!this.f37558a.containsKey(str)) {
            if (str.equals(g.f38956f)) {
                interfaceC3842c = new g();
                this.f37558a.put(g.f38956f, interfaceC3842c);
            } else if (str.equals(h.f38962f)) {
                interfaceC3842c = new h();
                this.f37558a.put(h.f38962f, interfaceC3842c);
            } else if (str.equals(o.f38992d)) {
                interfaceC3842c = new o();
                this.f37558a.put(o.f38992d, interfaceC3842c);
            } else if (str.equals(l.f38980f)) {
                interfaceC3842c = new l();
                this.f37558a.put(l.f38980f, interfaceC3842c);
            } else if (str.equals(i.f38968f)) {
                interfaceC3842c = new i();
                this.f37558a.put(i.f38968f, interfaceC3842c);
            } else if (str.equals(n.f38988f)) {
                interfaceC3842c = new n();
                this.f37558a.put(n.f38988f, interfaceC3842c);
            } else if (str.equals(j.f38972f)) {
                interfaceC3842c = new j();
                this.f37558a.put(j.f38972f, interfaceC3842c);
            } else if (str.equals(m.f38984f)) {
                interfaceC3842c = new m();
                this.f37558a.put(m.f38984f, interfaceC3842c);
            } else if (str.equals(k.f38976f)) {
                interfaceC3842c = new k();
                this.f37558a.put(k.f38976f, interfaceC3842c);
            } else {
                interfaceC3842c = null;
            }
        } else {
            interfaceC3842c = (InterfaceC3842c) this.f37558a.get(str);
        }
        if (interfaceC3842c != null) {
            interfaceC3842c.a(str2, obj);
            return;
        }
        throw new c(str + "." + str2 + " not found");
    }

    public C3680a(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        a(str);
    }
}
