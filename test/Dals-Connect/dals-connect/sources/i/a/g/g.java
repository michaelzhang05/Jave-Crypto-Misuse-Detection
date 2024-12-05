package i.a.g;

import i.a.d;
import i.a.g.h;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: DNSQuestion.java */
/* loaded from: classes2.dex */
public class g extends i.a.g.b {

    /* renamed from: h, reason: collision with root package name */
    private static k.b.b f18305h = k.b.c.i(g.class.getName());

    /* compiled from: DNSQuestion.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.a.g.s.e.values().length];
            a = iArr;
            try {
                iArr[i.a.g.s.e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.a.g.s.e.TYPE_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i.a.g.s.e.TYPE_AAAA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i.a.g.s.e.TYPE_ANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i.a.g.s.e.TYPE_HINFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[i.a.g.s.e.TYPE_PTR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[i.a.g.s.e.TYPE_SRV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[i.a.g.s.e.TYPE_TXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* loaded from: classes2.dex */
    private static class b extends g {
        b(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        @Override // i.a.g.g
        public boolean B(l lVar) {
            String lowerCase = c().toLowerCase();
            return lVar.H0().q().equals(lowerCase) || lVar.M0().keySet().contains(lowerCase);
        }

        @Override // i.a.g.b
        public boolean n(i.a.g.b bVar) {
            return bVar != null;
        }

        @Override // i.a.g.g
        public void y(l lVar, Set<i.a.g.h> set) {
            String lowerCase = c().toLowerCase();
            if (lVar.H0().q().equalsIgnoreCase(lowerCase)) {
                set.addAll(lVar.H0().a(e(), p(), 3600));
            } else {
                if (lVar.L0().containsKey(lowerCase)) {
                    new f(c(), i.a.g.s.e.TYPE_PTR, e(), p()).y(lVar, set);
                    return;
                }
                Iterator<i.a.d> it = lVar.M0().values().iterator();
                while (it.hasNext()) {
                    z(lVar, set, (q) it.next());
                }
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* loaded from: classes2.dex */
    private static class c extends g {
        c(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        @Override // i.a.g.g
        public boolean B(l lVar) {
            String lowerCase = c().toLowerCase();
            return lVar.H0().q().equals(lowerCase) || lVar.M0().keySet().contains(lowerCase);
        }

        @Override // i.a.g.g
        public void y(l lVar, Set<i.a.g.h> set) {
            h.a j2 = lVar.H0().j(f(), true, 3600);
            if (j2 != null) {
                set.add(j2);
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* loaded from: classes2.dex */
    private static class d extends g {
        d(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        @Override // i.a.g.g
        public boolean B(l lVar) {
            String lowerCase = c().toLowerCase();
            return lVar.H0().q().equals(lowerCase) || lVar.M0().keySet().contains(lowerCase);
        }

        @Override // i.a.g.g
        public void y(l lVar, Set<i.a.g.h> set) {
            h.a j2 = lVar.H0().j(f(), true, 3600);
            if (j2 != null) {
                set.add(j2);
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* loaded from: classes2.dex */
    private static class e extends g {
        e(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }
    }

    /* compiled from: DNSQuestion.java */
    /* loaded from: classes2.dex */
    private static class f extends g {
        f(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        @Override // i.a.g.g
        public void y(l lVar, Set<i.a.g.h> set) {
            Iterator<i.a.d> it = lVar.M0().values().iterator();
            while (it.hasNext()) {
                z(lVar, set, (q) it.next());
            }
            if (o()) {
                Iterator<String> it2 = lVar.L0().keySet().iterator();
                while (it2.hasNext()) {
                    set.add(new h.e("_services._dns-sd._udp.local.", i.a.g.s.d.CLASS_IN, false, 3600, lVar.L0().get(it2.next()).e()));
                }
                return;
            }
            if (k()) {
                String str = d().get(d.a.Instance);
                if (str == null || str.length() <= 0) {
                    return;
                }
                InetAddress n = lVar.H0().n();
                if (str.equalsIgnoreCase(n != null ? n.getHostAddress() : HttpUrl.FRAGMENT_ENCODE_SET)) {
                    if (q()) {
                        set.add(lVar.H0().k(i.a.g.s.e.TYPE_A, false, 3600));
                    }
                    if (r()) {
                        set.add(lVar.H0().k(i.a.g.s.e.TYPE_AAAA, false, 3600));
                        return;
                    }
                    return;
                }
                return;
            }
            i();
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$g, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0263g extends g {
        C0263g(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        @Override // i.a.g.g
        public boolean B(l lVar) {
            String lowerCase = c().toLowerCase();
            return lVar.H0().q().equals(lowerCase) || lVar.M0().keySet().contains(lowerCase);
        }

        @Override // i.a.g.g
        public void y(l lVar, Set<i.a.g.h> set) {
            String lowerCase = c().toLowerCase();
            if (lVar.H0().q().equalsIgnoreCase(lowerCase)) {
                set.addAll(lVar.H0().a(e(), p(), 3600));
            } else if (lVar.L0().containsKey(lowerCase)) {
                new f(c(), i.a.g.s.e.TYPE_PTR, e(), p()).y(lVar, set);
            } else {
                z(lVar, set, (q) lVar.M0().get(lowerCase));
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* loaded from: classes2.dex */
    private static class h extends g {
        h(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        @Override // i.a.g.g
        public boolean B(l lVar) {
            String lowerCase = c().toLowerCase();
            return lVar.H0().q().equals(lowerCase) || lVar.M0().keySet().contains(lowerCase);
        }

        @Override // i.a.g.g
        public void y(l lVar, Set<i.a.g.h> set) {
            z(lVar, set, (q) lVar.M0().get(c().toLowerCase()));
        }
    }

    g(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
        super(str, eVar, dVar, z);
    }

    public static g C(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
        switch (a.a[eVar.ordinal()]) {
            case 1:
                return new c(str, eVar, dVar, z);
            case 2:
                return new d(str, eVar, dVar, z);
            case 3:
                return new d(str, eVar, dVar, z);
            case 4:
                return new b(str, eVar, dVar, z);
            case 5:
                return new e(str, eVar, dVar, z);
            case 6:
                return new f(str, eVar, dVar, z);
            case 7:
                return new C0263g(str, eVar, dVar, z);
            case 8:
                return new h(str, eVar, dVar, z);
            default:
                return new g(str, eVar, dVar, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A(i.a.g.b bVar) {
        return m(bVar) && n(bVar) && c().equals(bVar.c());
    }

    public boolean B(l lVar) {
        return false;
    }

    @Override // i.a.g.b
    public boolean j(long j2) {
        return false;
    }

    @Override // i.a.g.b
    public void x(StringBuilder sb) {
    }

    public void y(l lVar, Set<i.a.g.h> set) {
    }

    protected void z(l lVar, Set<i.a.g.h> set, q qVar) {
        if (qVar == null || !qVar.T()) {
            return;
        }
        if (c().equalsIgnoreCase(qVar.n()) || c().equalsIgnoreCase(qVar.s()) || c().equalsIgnoreCase(qVar.R())) {
            set.addAll(lVar.H0().a(e(), true, 3600));
            set.addAll(qVar.C(e(), true, 3600, lVar.H0()));
        }
        if (f18305h.b()) {
            f18305h.c(lVar.I0() + " DNSQuestion(" + c() + ").addAnswersForServiceInfo(): info: " + qVar + "\n" + set);
        }
    }
}
