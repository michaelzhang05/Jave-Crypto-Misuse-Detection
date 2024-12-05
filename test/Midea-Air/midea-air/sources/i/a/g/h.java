package i.a.g;

import i.a.d;
import i.a.g.f;
import i.a.g.n;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* compiled from: DNSRecord.java */
/* loaded from: classes2.dex */
public abstract class h extends i.a.g.b {

    /* renamed from: h, reason: collision with root package name */
    private static k.b.b f18306h = k.b.c.i(h.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f18307i = {0};

    /* renamed from: j, reason: collision with root package name */
    private int f18308j;

    /* renamed from: k, reason: collision with root package name */
    private long f18309k;
    private int l;
    private final int m;
    private InetAddress n;

    /* compiled from: DNSRecord.java */
    /* loaded from: classes2.dex */
    public static class b extends h {
        String o;
        String p;

        public b(String str, i.a.g.s.d dVar, boolean z, int i2, String str2, String str3) {
            super(str, i.a.g.s.e.TYPE_HINFO, dVar, z, i2);
            this.p = str2;
            this.o = str3;
        }

        @Override // i.a.g.h
        public i.a.c B(l lVar) {
            i.a.d D = D(false);
            ((q) D).e0(lVar);
            return new p(lVar, D.s(), D.j(), D);
        }

        @Override // i.a.g.h
        public i.a.d D(boolean z) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("cpu", this.p);
            hashMap.put("os", this.o);
            return new q(d(), 0, 0, 0, z, hashMap);
        }

        @Override // i.a.g.h
        boolean F(l lVar, long j2) {
            return false;
        }

        @Override // i.a.g.h
        boolean G(l lVar) {
            return false;
        }

        @Override // i.a.g.h
        public boolean I() {
            return true;
        }

        @Override // i.a.g.h
        boolean N(h hVar) {
            if (!(hVar instanceof b)) {
                return false;
            }
            b bVar = (b) hVar;
            String str = this.p;
            if (str != null || bVar.p == null) {
                return (this.o != null || bVar.o == null) && str.equals(bVar.p) && this.o.equals(bVar.o);
            }
            return false;
        }

        @Override // i.a.g.h
        void S(f.a aVar) {
            String str = this.p + " " + this.o;
            aVar.L(str, 0, str.length());
        }

        @Override // i.a.g.h, i.a.g.b
        protected void x(StringBuilder sb) {
            super.x(sb);
            sb.append(" cpu: '" + this.p + "' os: '" + this.o + "'");
        }
    }

    /* compiled from: DNSRecord.java */
    /* loaded from: classes2.dex */
    public static class c extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, i.a.g.s.d dVar, boolean z, int i2, InetAddress inetAddress) {
            super(str, i.a.g.s.e.TYPE_A, dVar, z, i2, inetAddress);
        }

        @Override // i.a.g.h.a, i.a.g.h
        public i.a.d D(boolean z) {
            q qVar = (q) super.D(z);
            qVar.A((Inet4Address) this.p);
            return qVar;
        }

        @Override // i.a.g.h
        void S(f.a aVar) {
            InetAddress inetAddress = this.p;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (!(this.p instanceof Inet4Address)) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(address, 12, bArr, 0, 4);
                    address = bArr;
                }
                aVar.b(address, 0, address.length);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, i.a.g.s.d dVar, boolean z, int i2, byte[] bArr) {
            super(str, i.a.g.s.e.TYPE_A, dVar, z, i2, bArr);
        }
    }

    /* compiled from: DNSRecord.java */
    /* loaded from: classes2.dex */
    public static class d extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, i.a.g.s.d dVar, boolean z, int i2, InetAddress inetAddress) {
            super(str, i.a.g.s.e.TYPE_AAAA, dVar, z, i2, inetAddress);
        }

        @Override // i.a.g.h.a, i.a.g.h
        public i.a.d D(boolean z) {
            q qVar = (q) super.D(z);
            qVar.B((Inet6Address) this.p);
            return qVar;
        }

        @Override // i.a.g.h
        void S(f.a aVar) {
            InetAddress inetAddress = this.p;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (this.p instanceof Inet4Address) {
                    byte[] bArr = new byte[16];
                    for (int i2 = 0; i2 < 16; i2++) {
                        if (i2 < 11) {
                            bArr[i2] = address[i2 - 12];
                        } else {
                            bArr[i2] = 0;
                        }
                    }
                    address = bArr;
                }
                aVar.b(address, 0, address.length);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, i.a.g.s.d dVar, boolean z, int i2, byte[] bArr) {
            super(str, i.a.g.s.e.TYPE_AAAA, dVar, z, i2, bArr);
        }
    }

    /* compiled from: DNSRecord.java */
    /* loaded from: classes2.dex */
    public static class e extends h {
        private final String o;

        public e(String str, i.a.g.s.d dVar, boolean z, int i2, String str2) {
            super(str, i.a.g.s.e.TYPE_PTR, dVar, z, i2);
            this.o = str2;
        }

        @Override // i.a.g.h
        public i.a.c B(l lVar) {
            i.a.d D = D(false);
            ((q) D).e0(lVar);
            String s = D.s();
            return new p(lVar, s, l.s1(s, T()), D);
        }

        @Override // i.a.g.h
        public i.a.d D(boolean z) {
            if (o()) {
                return new q(q.K(T()), 0, 0, 0, z, (byte[]) null);
            }
            if (k()) {
                return new q(d(), 0, 0, 0, z, (byte[]) null);
            }
            if (i()) {
                return new q(d(), 0, 0, 0, z, (byte[]) null);
            }
            Map<d.a, String> K = q.K(T());
            d.a aVar = d.a.Subtype;
            K.put(aVar, d().get(aVar));
            return new q(K, 0, 0, 0, z, T());
        }

        @Override // i.a.g.h
        boolean F(l lVar, long j2) {
            return false;
        }

        @Override // i.a.g.h
        boolean G(l lVar) {
            return false;
        }

        @Override // i.a.g.h
        public boolean I() {
            return false;
        }

        @Override // i.a.g.h
        boolean N(h hVar) {
            if (!(hVar instanceof e)) {
                return false;
            }
            e eVar = (e) hVar;
            String str = this.o;
            if (str != null || eVar.o == null) {
                return str.equals(eVar.o);
            }
            return false;
        }

        @Override // i.a.g.h
        void S(f.a aVar) {
            aVar.o(this.o);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String T() {
            return this.o;
        }

        @Override // i.a.g.b
        public boolean l(i.a.g.b bVar) {
            return super.l(bVar) && (bVar instanceof e) && N((e) bVar);
        }

        @Override // i.a.g.h, i.a.g.b
        protected void x(StringBuilder sb) {
            super.x(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" alias: '");
            String str = this.o;
            sb2.append(str != null ? str.toString() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }
    }

    /* compiled from: DNSRecord.java */
    /* loaded from: classes2.dex */
    public static class f extends h {
        private static k.b.b o = k.b.c.i(f.class.getName());
        private final int p;
        private final int q;
        private final int r;
        private final String s;

        public f(String str, i.a.g.s.d dVar, boolean z, int i2, int i3, int i4, int i5, String str2) {
            super(str, i.a.g.s.e.TYPE_SRV, dVar, z, i2);
            this.p = i3;
            this.q = i4;
            this.r = i5;
            this.s = str2;
        }

        @Override // i.a.g.h
        public i.a.c B(l lVar) {
            i.a.d D = D(false);
            ((q) D).e0(lVar);
            return new p(lVar, D.s(), D.j(), D);
        }

        @Override // i.a.g.h
        public i.a.d D(boolean z) {
            return new q(d(), this.r, this.q, this.p, z, (byte[]) null);
        }

        @Override // i.a.g.h
        boolean F(l lVar, long j2) {
            q qVar = (q) lVar.M0().get(b());
            if (qVar != null && ((qVar.U() || qVar.T()) && (this.r != qVar.k() || !this.s.equalsIgnoreCase(lVar.H0().q())))) {
                o.c("handleQuery() Conflicting probe detected from: " + z());
                f fVar = new f(qVar.n(), i.a.g.s.d.CLASS_IN, true, 3600, qVar.l(), qVar.t(), qVar.k(), lVar.H0().q());
                try {
                    if (lVar.F0().equals(z())) {
                        o.h("Got conflicting probe from ourselves\nincoming: " + toString() + "\nlocal   : " + fVar.toString());
                    }
                } catch (IOException e2) {
                    o.f("IOException", e2);
                }
                int a = a(fVar);
                if (a == 0) {
                    o.c("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (qVar.W() && a > 0) {
                    String lowerCase = qVar.n().toLowerCase();
                    qVar.f0(n.c.a().a(lVar.H0().n(), qVar.j(), n.d.SERVICE));
                    lVar.M0().remove(lowerCase);
                    lVar.M0().put(qVar.n().toLowerCase(), qVar);
                    o.c("handleQuery() Lost tie break: new unique name chosen:" + qVar.j());
                    qVar.d0();
                    return true;
                }
            }
            return false;
        }

        @Override // i.a.g.h
        boolean G(l lVar) {
            q qVar = (q) lVar.M0().get(b());
            if (qVar == null) {
                return false;
            }
            if (this.r == qVar.k() && this.s.equalsIgnoreCase(lVar.H0().q())) {
                return false;
            }
            o.c("handleResponse() Denial detected");
            if (qVar.W()) {
                String lowerCase = qVar.n().toLowerCase();
                qVar.f0(n.c.a().a(lVar.H0().n(), qVar.j(), n.d.SERVICE));
                lVar.M0().remove(lowerCase);
                lVar.M0().put(qVar.n().toLowerCase(), qVar);
                o.c("handleResponse() New unique name chose:" + qVar.j());
            }
            qVar.d0();
            return true;
        }

        @Override // i.a.g.h
        public boolean I() {
            return true;
        }

        @Override // i.a.g.h
        boolean N(h hVar) {
            if (!(hVar instanceof f)) {
                return false;
            }
            f fVar = (f) hVar;
            return this.p == fVar.p && this.q == fVar.q && this.r == fVar.r && this.s.equals(fVar.s);
        }

        @Override // i.a.g.h
        void S(f.a aVar) {
            aVar.J(this.p);
            aVar.J(this.q);
            aVar.J(this.r);
            if (i.a.g.c.f18286i) {
                aVar.o(this.s);
                return;
            }
            String str = this.s;
            aVar.L(str, 0, str.length());
            aVar.a(0);
        }

        public int T() {
            return this.r;
        }

        public int U() {
            return this.p;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String V() {
            return this.s;
        }

        public int W() {
            return this.q;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // i.a.g.b
        public void v(DataOutputStream dataOutputStream) throws IOException {
            super.v(dataOutputStream);
            dataOutputStream.writeShort(this.p);
            dataOutputStream.writeShort(this.q);
            dataOutputStream.writeShort(this.r);
            try {
                dataOutputStream.write(this.s.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }

        @Override // i.a.g.h, i.a.g.b
        protected void x(StringBuilder sb) {
            super.x(sb);
            sb.append(" server: '" + this.s + ":" + this.r + "'");
        }
    }

    /* compiled from: DNSRecord.java */
    /* loaded from: classes2.dex */
    public static class g extends h {
        private final byte[] o;

        public g(String str, i.a.g.s.d dVar, boolean z, int i2, byte[] bArr) {
            super(str, i.a.g.s.e.TYPE_TXT, dVar, z, i2);
            this.o = (bArr == null || bArr.length <= 0) ? h.f18307i : bArr;
        }

        @Override // i.a.g.h
        public i.a.c B(l lVar) {
            i.a.d D = D(false);
            ((q) D).e0(lVar);
            return new p(lVar, D.s(), D.j(), D);
        }

        @Override // i.a.g.h
        public i.a.d D(boolean z) {
            return new q(d(), 0, 0, 0, z, this.o);
        }

        @Override // i.a.g.h
        boolean F(l lVar, long j2) {
            return false;
        }

        @Override // i.a.g.h
        boolean G(l lVar) {
            return false;
        }

        @Override // i.a.g.h
        public boolean I() {
            return true;
        }

        @Override // i.a.g.h
        boolean N(h hVar) {
            if (!(hVar instanceof g)) {
                return false;
            }
            g gVar = (g) hVar;
            byte[] bArr = this.o;
            if ((bArr == null && gVar.o != null) || gVar.o.length != bArr.length) {
                return false;
            }
            int length = bArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    return true;
                }
                if (gVar.o[i2] != this.o[i2]) {
                    return false;
                }
                length = i2;
            }
        }

        @Override // i.a.g.h
        void S(f.a aVar) {
            byte[] bArr = this.o;
            aVar.b(bArr, 0, bArr.length);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public byte[] T() {
            return this.o;
        }

        @Override // i.a.g.h, i.a.g.b
        protected void x(StringBuilder sb) {
            String str;
            super.x(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" text: '");
            if (this.o.length > 20) {
                str = new String(this.o, 0, 17) + "...";
            } else {
                str = new String(this.o);
            }
            sb2.append(str);
            sb2.append("'");
            sb.append(sb2.toString());
        }
    }

    h(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z, int i2) {
        super(str, eVar, dVar, z);
        this.f18308j = i2;
        this.f18309k = System.currentTimeMillis();
        int nextInt = new Random().nextInt(3);
        this.m = nextInt;
        this.l = nextInt + 80;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int A(long j2) {
        return (int) Math.max(0L, (y(100) - j2) / 1000);
    }

    public abstract i.a.c B(l lVar);

    public i.a.d C() {
        return D(false);
    }

    public abstract i.a.d D(boolean z);

    public int E() {
        return this.f18308j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean F(l lVar, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean G(l lVar);

    public void H() {
        int i2 = this.l + 5;
        this.l = i2;
        if (i2 > 100) {
            this.l = 100;
        }
    }

    public abstract boolean I();

    public boolean J(long j2) {
        return y(50) <= j2;
    }

    public boolean K(long j2) {
        return y(this.l) <= j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(h hVar) {
        this.f18309k = hVar.f18309k;
        this.f18308j = hVar.f18308j;
        this.l = this.m + 80;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M(h hVar) {
        return f() == hVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean N(h hVar);

    public void O(InetAddress inetAddress) {
        this.n = inetAddress;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(long j2) {
        this.f18309k = j2;
        this.f18308j = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q(i.a.g.c cVar) {
        try {
            Iterator<h> it = cVar.b().iterator();
            while (it.hasNext()) {
                if (R(it.next())) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e2) {
            f18306h.f("suppressedBy() message " + cVar + " exception ", e2);
            return false;
        }
    }

    boolean R(h hVar) {
        return equals(hVar) && hVar.f18308j > this.f18308j / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void S(f.a aVar);

    @Override // i.a.g.b
    public boolean equals(Object obj) {
        return (obj instanceof h) && super.equals(obj) && N((h) obj);
    }

    @Override // i.a.g.b
    public boolean j(long j2) {
        return y(100) <= j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i.a.g.b
    public void x(StringBuilder sb) {
        super.x(sb);
        sb.append(" ttl: '" + A(System.currentTimeMillis()) + "/" + this.f18308j + "'");
    }

    long y(int i2) {
        return this.f18309k + (i2 * this.f18308j * 10);
    }

    public InetAddress z() {
        return this.n;
    }

    /* compiled from: DNSRecord.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends h {
        private static k.b.b o = k.b.c.i(a.class.getName());
        InetAddress p;

        protected a(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z, int i2, InetAddress inetAddress) {
            super(str, eVar, dVar, z, i2);
            this.p = inetAddress;
        }

        @Override // i.a.g.h
        public i.a.c B(l lVar) {
            i.a.d D = D(false);
            ((q) D).e0(lVar);
            return new p(lVar, D.s(), D.j(), D);
        }

        @Override // i.a.g.h
        public i.a.d D(boolean z) {
            return new q(d(), 0, 0, 0, z, (byte[]) null);
        }

        @Override // i.a.g.h
        boolean F(l lVar, long j2) {
            a j3;
            if (!lVar.H0().e(this) || (j3 = lVar.H0().j(f(), p(), 3600)) == null) {
                return false;
            }
            int a = a(j3);
            if (a == 0) {
                o.c("handleQuery() Ignoring an identical address query");
                return false;
            }
            o.c("handleQuery() Conflicting query detected.");
            if (lVar.a1() && a > 0) {
                lVar.H0().r();
                lVar.B0().clear();
                Iterator<i.a.d> it = lVar.M0().values().iterator();
                while (it.hasNext()) {
                    ((q) it.next()).d0();
                }
            }
            lVar.n1();
            return true;
        }

        @Override // i.a.g.h
        boolean G(l lVar) {
            if (!lVar.H0().e(this)) {
                return false;
            }
            o.c("handleResponse() Denial detected");
            if (lVar.a1()) {
                lVar.H0().r();
                lVar.B0().clear();
                Iterator<i.a.d> it = lVar.M0().values().iterator();
                while (it.hasNext()) {
                    ((q) it.next()).d0();
                }
            }
            lVar.n1();
            return true;
        }

        @Override // i.a.g.h
        public boolean I() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // i.a.g.h
        public boolean N(h hVar) {
            try {
                if (!(hVar instanceof a)) {
                    return false;
                }
                a aVar = (a) hVar;
                if (T() != null || aVar.T() == null) {
                    return T().equals(aVar.T());
                }
                return false;
            } catch (Exception e2) {
                o.e("Failed to compare addresses of DNSRecords", e2);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public InetAddress T() {
            return this.p;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean U(h hVar) {
            return c().equalsIgnoreCase(hVar.c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // i.a.g.b
        public void v(DataOutputStream dataOutputStream) throws IOException {
            super.v(dataOutputStream);
            for (byte b2 : T().getAddress()) {
                dataOutputStream.writeByte(b2);
            }
        }

        @Override // i.a.g.h, i.a.g.b
        protected void x(StringBuilder sb) {
            super.x(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" address: '");
            sb2.append(T() != null ? T().getHostAddress() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        protected a(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z, int i2, byte[] bArr) {
            super(str, eVar, dVar, z, i2);
            try {
                this.p = InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e2) {
                o.f("Address() exception ", e2);
            }
        }
    }
}
