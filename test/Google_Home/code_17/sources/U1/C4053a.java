package u1;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x1.b;
import x1.c;
import z1.C4223d;
import z1.InterfaceC4222c;
import z1.f;
import z1.g;
import z1.h;
import z1.i;
import z1.j;
import z1.k;
import z1.l;
import z1.m;
import z1.n;
import z1.o;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4053a {

    /* renamed from: a, reason: collision with root package name */
    private Map f39938a = new HashMap();

    public C4053a() {
    }

    public void a(String str) {
        this.f39938a.clear();
        String[] split = str.split("~");
        C4223d c4223d = new C4223d(split[0]);
        this.f39938a.put(C4223d.f41073f, c4223d);
        List list = (List) c4223d.c("SectionIds");
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (((Integer) list.get(i8)).equals(Integer.valueOf(h.f41083d))) {
                this.f39938a.put(h.f41085f, new h(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(g.f41077d))) {
                this.f39938a.put(g.f41079f, new g(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(o.f41113b))) {
                this.f39938a.put(o.f41115d, new o(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(i.f41089d))) {
                this.f39938a.put(i.f41091f, new i(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(l.f41101d))) {
                this.f39938a.put(l.f41103f, new l(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(n.f41109d))) {
                this.f39938a.put(n.f41111f, new n(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(j.f41093d))) {
                this.f39938a.put(j.f41095f, new j(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(m.f41105d))) {
                this.f39938a.put(m.f41107f, new m(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(k.f41097d))) {
                this.f39938a.put(k.f41099f, new k(split[i8 + 1]));
            }
        }
    }

    public void b(int i8) {
        c((String) f.f41076b.get(Integer.valueOf(i8)));
    }

    public void c(String str) {
        if (this.f39938a.containsKey(str)) {
            this.f39938a.remove(str);
        }
    }

    public String d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < f.f41075a.size(); i8++) {
            String str = (String) f.f41075a.get(i8);
            if (this.f39938a.containsKey(str)) {
                InterfaceC4222c interfaceC4222c = (InterfaceC4222c) this.f39938a.get(str);
                arrayList.add(interfaceC4222c.b());
                arrayList2.add(Integer.valueOf(interfaceC4222c.getId()));
            }
        }
        C4223d c4223d = new C4223d();
        try {
            c4223d.a("SectionIds", h());
            arrayList.add(0, c4223d.b());
            return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("~"));
        } catch (c e8) {
            throw new b(e8);
        }
    }

    public C4223d e() {
        C4223d c4223d = new C4223d();
        try {
            c4223d.a("SectionIds", h());
        } catch (c unused) {
        }
        return c4223d;
    }

    public InterfaceC4222c f(int i8) {
        return g((String) f.f41076b.get(Integer.valueOf(i8)));
    }

    public InterfaceC4222c g(String str) {
        if (this.f39938a.containsKey(str)) {
            return (InterfaceC4222c) this.f39938a.get(str);
        }
        return null;
    }

    public List h() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < f.f41075a.size(); i8++) {
            String str = (String) f.f41075a.get(i8);
            if (this.f39938a.containsKey(str)) {
                arrayList.add(Integer.valueOf(((InterfaceC4222c) this.f39938a.get(str)).getId()));
            }
        }
        return arrayList;
    }

    public boolean i(int i8) {
        return j((String) f.f41076b.get(Integer.valueOf(i8)));
    }

    public boolean j(String str) {
        return this.f39938a.containsKey(str);
    }

    public void k(String str, String str2, Object obj) {
        InterfaceC4222c interfaceC4222c;
        if (!this.f39938a.containsKey(str)) {
            if (str.equals(g.f41079f)) {
                interfaceC4222c = new g();
                this.f39938a.put(g.f41079f, interfaceC4222c);
            } else if (str.equals(h.f41085f)) {
                interfaceC4222c = new h();
                this.f39938a.put(h.f41085f, interfaceC4222c);
            } else if (str.equals(o.f41115d)) {
                interfaceC4222c = new o();
                this.f39938a.put(o.f41115d, interfaceC4222c);
            } else if (str.equals(l.f41103f)) {
                interfaceC4222c = new l();
                this.f39938a.put(l.f41103f, interfaceC4222c);
            } else if (str.equals(i.f41091f)) {
                interfaceC4222c = new i();
                this.f39938a.put(i.f41091f, interfaceC4222c);
            } else if (str.equals(n.f41111f)) {
                interfaceC4222c = new n();
                this.f39938a.put(n.f41111f, interfaceC4222c);
            } else if (str.equals(j.f41095f)) {
                interfaceC4222c = new j();
                this.f39938a.put(j.f41095f, interfaceC4222c);
            } else if (str.equals(m.f41107f)) {
                interfaceC4222c = new m();
                this.f39938a.put(m.f41107f, interfaceC4222c);
            } else if (str.equals(k.f41099f)) {
                interfaceC4222c = new k();
                this.f39938a.put(k.f41099f, interfaceC4222c);
            } else {
                interfaceC4222c = null;
            }
        } else {
            interfaceC4222c = (InterfaceC4222c) this.f39938a.get(str);
        }
        if (interfaceC4222c != null) {
            interfaceC4222c.a(str2, obj);
            return;
        }
        throw new c(str + "." + str2 + " not found");
    }

    public C4053a(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        a(str);
    }
}
