package i.a.g;

import androidx.recyclerview.widget.RecyclerView;
import i.a.a;
import i.a.d;
import i.a.g.h;
import i.a.g.j;
import i.a.g.m;
import i.a.g.n;
import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.HttpUrl;

/* compiled from: JmDNSImpl.java */
/* loaded from: classes2.dex */
public class l extends i.a.a implements i.a.g.i, i.a.g.j {

    /* renamed from: g, reason: collision with root package name */
    private static k.b.b f18328g = k.b.c.i(l.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static final Random f18329h = new Random();
    private final String A;

    /* renamed from: i, reason: collision with root package name */
    private volatile InetAddress f18330i;

    /* renamed from: j, reason: collision with root package name */
    private volatile MulticastSocket f18331j;

    /* renamed from: k, reason: collision with root package name */
    private final List<i.a.g.d> f18332k;
    final ConcurrentMap<String, List<m.a>> l;
    private final Set<m.b> m;
    private final i.a.g.a n;
    private final ConcurrentMap<String, i.a.d> o;
    private final ConcurrentMap<String, j> p;
    private volatile a.InterfaceC0261a q;
    protected Thread r;
    private k s;
    private Thread t;
    private int u;
    private long v;
    private i.a.g.c y;
    private final ConcurrentMap<String, i> z;
    private final ExecutorService w = Executors.newSingleThreadExecutor(new i.a.g.u.a("JmDNS"));
    private final ReentrantLock x = new ReentrantLock();
    private final Object B = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m.a f18333f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.a.c f18334g;

        a(m.a aVar, i.a.c cVar) {
            this.f18333f = aVar;
            this.f18334g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18333f.f(this.f18334g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m.b f18336f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.a.c f18337g;

        b(m.b bVar, i.a.c cVar) {
            this.f18336f = bVar;
            this.f18337g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18336f.c(this.f18337g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m.b f18339f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.a.c f18340g;

        c(m.b bVar, i.a.c cVar) {
            this.f18339f = bVar;
            this.f18340g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18339f.d(this.f18340g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m.a f18342f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.a.c f18343g;

        d(m.a aVar, i.a.c cVar) {
            this.f18342f = aVar;
            this.f18343g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18342f.d(this.f18343g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m.a f18345f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.a.c f18346g;

        e(m.a aVar, i.a.c cVar) {
            this.f18345f = aVar;
            this.f18346g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18345f.e(this.f18346g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    class f extends Thread {
        f(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            l.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class g {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.values().length];
            a = iArr;
            try {
                iArr[h.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.Remove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public enum h {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public static class i implements i.a.e {

        /* renamed from: c, reason: collision with root package name */
        private final String f18356c;
        private final ConcurrentMap<String, i.a.d> a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap<String, i.a.c> f18355b = new ConcurrentHashMap();

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f18357d = true;

        public i(String str) {
            this.f18356c = str;
        }

        @Override // i.a.e
        public void serviceAdded(i.a.c cVar) {
            synchronized (this) {
                i.a.d d2 = cVar.d();
                if (d2 != null && d2.u()) {
                    this.a.put(cVar.e(), d2);
                } else {
                    q l1 = ((l) cVar.c()).l1(cVar.g(), cVar.e(), d2 != null ? d2.q() : HttpUrl.FRAGMENT_ENCODE_SET, true);
                    if (l1 != null) {
                        this.a.put(cVar.e(), l1);
                    } else {
                        this.f18355b.put(cVar.e(), cVar);
                    }
                }
            }
        }

        @Override // i.a.e
        public void serviceRemoved(i.a.c cVar) {
            synchronized (this) {
                this.a.remove(cVar.e());
                this.f18355b.remove(cVar.e());
            }
        }

        @Override // i.a.e
        public void serviceResolved(i.a.c cVar) {
            synchronized (this) {
                this.a.put(cVar.e(), cVar.d());
                this.f18355b.remove(cVar.e());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\tType: ");
            stringBuffer.append(this.f18356c);
            if (this.a.isEmpty()) {
                stringBuffer.append("\n\tNo services collected.");
            } else {
                stringBuffer.append("\n\tServices");
                for (String str : this.a.keySet()) {
                    stringBuffer.append("\n\t\tService: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.a.get(str));
                }
            }
            if (this.f18355b.isEmpty()) {
                stringBuffer.append("\n\tNo event queued.");
            } else {
                stringBuffer.append("\n\tEvents");
                for (String str2 : this.f18355b.keySet()) {
                    stringBuffer.append("\n\t\tEvent: ");
                    stringBuffer.append(str2);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f18355b.get(str2));
                }
            }
            return stringBuffer.toString();
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* loaded from: classes2.dex */
    public static class j extends AbstractMap<String, String> implements Cloneable {

        /* renamed from: f, reason: collision with root package name */
        private final Set<Map.Entry<String, String>> f18358f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        private final String f18359g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: JmDNSImpl.java */
        /* loaded from: classes2.dex */
        public static class a implements Map.Entry<String, String>, Serializable, Cloneable {

            /* renamed from: f, reason: collision with root package name */
            private final String f18360f;

            /* renamed from: g, reason: collision with root package name */
            private final String f18361g;

            public a(String str) {
                str = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                this.f18361g = str;
                this.f18360f = str.toLowerCase();
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a clone() {
                return this;
            }

            @Override // java.util.Map.Entry
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public String getKey() {
                return this.f18360f;
            }

            @Override // java.util.Map.Entry
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public String getValue() {
                return this.f18361g;
            }

            @Override // java.util.Map.Entry
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public String setValue(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                String str = this.f18360f;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f18361g;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return this.f18360f + "=" + this.f18361g;
            }
        }

        public j(String str) {
            this.f18359g = str;
        }

        public boolean b(String str) {
            if (str == null || d(str)) {
                return false;
            }
            this.f18358f.add(new a(str));
            return true;
        }

        @Override // java.util.AbstractMap
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public j clone() {
            j jVar = new j(e());
            Iterator<Map.Entry<String, String>> it = entrySet().iterator();
            while (it.hasNext()) {
                jVar.b(it.next().getValue());
            }
            return jVar;
        }

        public boolean d(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        public String e() {
            return this.f18359g;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return this.f18358f;
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder(200);
            if (isEmpty()) {
                sb.append("empty");
            } else {
                Iterator<String> it = values().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(", ");
                }
                sb.setLength(sb.length() - 2);
            }
            return sb.toString();
        }
    }

    public l(InetAddress inetAddress, String str) throws IOException {
        if (f18328g.b()) {
            f18328g.c("JmDNS instance created");
        }
        this.n = new i.a.g.a(100);
        this.f18332k = Collections.synchronizedList(new ArrayList());
        this.l = new ConcurrentHashMap();
        this.m = Collections.synchronizedSet(new HashSet());
        this.z = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap(20);
        this.p = new ConcurrentHashMap(20);
        k A = k.A(inetAddress, this, str);
        this.s = A;
        this.A = str == null ? A.q() : str;
        c1(H0());
        r1(M0().values());
        D();
    }

    private void A0() {
        if (f18328g.b()) {
            f18328g.c("disposeServiceCollectors()");
        }
        for (String str : this.z.keySet()) {
            i iVar = this.z.get(str);
            if (iVar != null) {
                j1(str, iVar);
                this.z.remove(str, iVar);
            }
        }
    }

    public static Random J0() {
        return f18329h;
    }

    private boolean b1(q qVar) {
        boolean z;
        i.a.d dVar;
        String N = qVar.N();
        long currentTimeMillis = System.currentTimeMillis();
        do {
            z = false;
            for (i.a.g.b bVar : B0().f(qVar.N())) {
                if (i.a.g.s.e.TYPE_SRV.equals(bVar.f()) && !bVar.j(currentTimeMillis)) {
                    h.f fVar = (h.f) bVar;
                    if (fVar.T() != qVar.k() || !fVar.V().equals(this.s.q())) {
                        if (f18328g.b()) {
                            f18328g.c("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + bVar + " s.server=" + fVar.V() + " " + this.s.q() + " equals:" + fVar.V().equals(this.s.q()));
                        }
                        qVar.f0(n.c.a().a(this.s.n(), qVar.j(), n.d.SERVICE));
                        z = true;
                        dVar = this.o.get(qVar.N());
                        if (dVar != null && dVar != qVar) {
                            qVar.f0(n.c.a().a(this.s.n(), qVar.j(), n.d.SERVICE));
                            z = true;
                        }
                    }
                }
            }
            dVar = this.o.get(qVar.N());
            if (dVar != null) {
                qVar.f0(n.c.a().a(this.s.n(), qVar.j(), n.d.SERVICE));
                z = true;
            }
        } while (z);
        return !N.equals(qVar.N());
    }

    private void c1(k kVar) throws IOException {
        if (this.f18330i == null) {
            if (kVar.n() instanceof Inet6Address) {
                this.f18330i = InetAddress.getByName("FF02::FB");
            } else {
                this.f18330i = InetAddress.getByName("224.0.0.251");
            }
        }
        if (this.f18331j != null) {
            y0();
        }
        this.f18331j = new MulticastSocket(i.a.g.s.a.a);
        if (kVar != null && kVar.p() != null) {
            try {
                this.f18331j.setNetworkInterface(kVar.p());
            } catch (SocketException e2) {
                if (f18328g.b()) {
                    f18328g.c("openMulticastSocket() Set network interface exception: " + e2.getMessage());
                }
            }
        }
        this.f18331j.setTimeToLive(255);
        this.f18331j.joinGroup(this.f18330i);
    }

    private void r1(Collection<? extends i.a.d> collection) {
        if (this.t == null) {
            r rVar = new r(this);
            this.t = rVar;
            rVar.start();
        }
        J();
        Iterator<? extends i.a.d> it = collection.iterator();
        while (it.hasNext()) {
            try {
                f1(new q(it.next()));
            } catch (Exception e2) {
                f18328g.f("start() Registration exception ", e2);
            }
        }
    }

    private List<i.a.g.h> s0(List<i.a.g.h> list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        for (i.a.g.h hVar : list) {
            if (!hVar.f().equals(i.a.g.s.e.TYPE_A) && !hVar.f().equals(i.a.g.s.e.TYPE_AAAA)) {
                arrayList.add(hVar);
            } else {
                arrayList2.add(hVar);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String s1(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    private void u0(String str, i.a.e eVar, boolean z) {
        m.a aVar = new m.a(eVar, z);
        String lowerCase = str.toLowerCase();
        List<m.a> list = this.l.get(lowerCase);
        if (list == null) {
            if (this.l.putIfAbsent(lowerCase, new LinkedList()) == null && this.z.putIfAbsent(lowerCase, new i(str)) == null) {
                u0(lowerCase, this.z.get(lowerCase), true);
            }
            list = this.l.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<i.a.g.b> it = B0().c().iterator();
        while (it.hasNext()) {
            i.a.g.h hVar = (i.a.g.h) it.next();
            if (hVar.f() == i.a.g.s.e.TYPE_SRV && hVar.b().endsWith(lowerCase)) {
                arrayList.add(new p(this, hVar.h(), s1(hVar.h(), hVar.c()), hVar.C()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar.d((i.a.c) it2.next());
        }
        f(str);
    }

    private void y0() {
        if (f18328g.b()) {
            f18328g.c("closeMulticastSocket()");
        }
        if (this.f18331j != null) {
            try {
                try {
                    this.f18331j.leaveGroup(this.f18330i);
                } catch (Exception e2) {
                    f18328g.f("closeMulticastSocket() Close socket exception ", e2);
                }
            } catch (SocketException unused) {
            }
            this.f18331j.close();
            while (true) {
                Thread thread = this.t;
                if (thread == null || !thread.isAlive()) {
                    break;
                }
                synchronized (this) {
                    try {
                        Thread thread2 = this.t;
                        if (thread2 != null && thread2.isAlive()) {
                            if (f18328g.b()) {
                                f18328g.c("closeMulticastSocket(): waiting for jmDNS monitor");
                            }
                            wait(1000L);
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            this.t = null;
            this.f18331j = null;
        }
    }

    public i.a.g.a B0() {
        return this.n;
    }

    public a.InterfaceC0261a C0() {
        return this.q;
    }

    @Override // i.a.g.j
    public void D() {
        j.b.b().c(D0()).D();
    }

    public l D0() {
        return this;
    }

    public InetAddress E0() {
        return this.f18330i;
    }

    public InetAddress F0() throws IOException {
        return this.s.n();
    }

    public long G0() {
        return this.v;
    }

    public k H0() {
        return this.s;
    }

    public String I0() {
        return this.A;
    }

    @Override // i.a.g.j
    public void J() {
        j.b.b().c(D0()).J();
    }

    q K0(String str, String str2, String str3, boolean z) {
        q qVar;
        q qVar2;
        String str4;
        i.a.d D;
        i.a.d D2;
        i.a.d D3;
        i.a.d D4;
        q qVar3 = new q(str, str2, str3, 0, 0, 0, z, null);
        i.a.g.a B0 = B0();
        i.a.g.s.d dVar = i.a.g.s.d.CLASS_ANY;
        i.a.g.b e2 = B0.e(new h.e(str, dVar, false, 0, qVar3.n()));
        if (!(e2 instanceof i.a.g.h) || (qVar = (q) ((i.a.g.h) e2).D(z)) == null) {
            return qVar3;
        }
        Map<d.a, String> Q = qVar.Q();
        byte[] bArr = null;
        i.a.g.b d2 = B0().d(qVar3.n(), i.a.g.s.e.TYPE_SRV, dVar);
        if (!(d2 instanceof i.a.g.h) || (D4 = ((i.a.g.h) d2).D(z)) == null) {
            qVar2 = qVar;
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            qVar2 = new q(Q, D4.k(), D4.t(), D4.l(), z, (byte[]) null);
            bArr = D4.r();
            str4 = D4.p();
        }
        Iterator<? extends i.a.g.b> it = B0().g(str4, i.a.g.s.e.TYPE_A, dVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i.a.g.b next = it.next();
            if ((next instanceof i.a.g.h) && (D3 = ((i.a.g.h) next).D(z)) != null) {
                for (Inet4Address inet4Address : D3.g()) {
                    qVar2.A(inet4Address);
                }
                qVar2.y(D3.r());
            }
        }
        for (i.a.g.b bVar : B0().g(str4, i.a.g.s.e.TYPE_AAAA, i.a.g.s.d.CLASS_ANY)) {
            if ((bVar instanceof i.a.g.h) && (D2 = ((i.a.g.h) bVar).D(z)) != null) {
                for (Inet6Address inet6Address : D2.h()) {
                    qVar2.B(inet6Address);
                }
                qVar2.y(D2.r());
            }
        }
        i.a.g.b d3 = B0().d(qVar2.n(), i.a.g.s.e.TYPE_TXT, i.a.g.s.d.CLASS_ANY);
        if ((d3 instanceof i.a.g.h) && (D = ((i.a.g.h) d3).D(z)) != null) {
            qVar2.y(D.r());
        }
        if (qVar2.r().length == 0) {
            qVar2.y(bArr);
        }
        return qVar2.u() ? qVar2 : qVar3;
    }

    @Override // i.a.g.j
    public void L() {
        j.b.b().c(D0()).L();
    }

    public Map<String, j> L0() {
        return this.p;
    }

    public Map<String, i.a.d> M0() {
        return this.o;
    }

    public MulticastSocket N0() {
        return this.f18331j;
    }

    public int O0() {
        return this.u;
    }

    @Override // i.a.g.j
    public void P(i.a.g.c cVar, InetAddress inetAddress, int i2) {
        j.b.b().c(D0()).P(cVar, inetAddress, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(i.a.g.c cVar, InetAddress inetAddress, int i2) throws IOException {
        if (f18328g.b()) {
            f18328g.c(I0() + ".handle query: " + cVar);
        }
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis() + 120;
        Iterator<i.a.g.h> it = cVar.b().iterator();
        while (it.hasNext()) {
            z |= it.next().F(this, currentTimeMillis);
        }
        T0();
        try {
            i.a.g.c cVar2 = this.y;
            if (cVar2 != null) {
                cVar2.y(cVar);
            } else {
                i.a.g.c clone = cVar.clone();
                if (cVar.r()) {
                    this.y = clone;
                }
                P(clone, inetAddress, i2);
            }
            U0();
            long currentTimeMillis2 = System.currentTimeMillis();
            Iterator<? extends i.a.g.h> it2 = cVar.c().iterator();
            while (it2.hasNext()) {
                Q0(it2.next(), currentTimeMillis2);
            }
            if (z) {
                J();
            }
        } catch (Throwable th) {
            U0();
            throw th;
        }
    }

    void Q0(i.a.g.h hVar, long j2) {
        h hVar2 = h.Noop;
        boolean j3 = hVar.j(j2);
        if (f18328g.b()) {
            f18328g.c(I0() + " handle response: " + hVar);
        }
        if (!hVar.o() && !hVar.i()) {
            boolean p = hVar.p();
            i.a.g.h hVar3 = (i.a.g.h) B0().e(hVar);
            if (f18328g.b()) {
                f18328g.c(I0() + " handle response cached record: " + hVar3);
            }
            if (p) {
                for (i.a.g.b bVar : B0().f(hVar.b())) {
                    if (hVar.f().equals(bVar.f()) && hVar.e().equals(bVar.e()) && bVar != hVar3) {
                        ((i.a.g.h) bVar).P(j2);
                    }
                }
            }
            if (hVar3 != null) {
                if (j3) {
                    if (hVar.E() == 0) {
                        hVar2 = h.Noop;
                        hVar3.P(j2);
                    } else {
                        hVar2 = h.Remove;
                        B0().h(hVar3);
                    }
                } else if (hVar.N(hVar3) && (hVar.u(hVar3) || hVar.g().length() <= 0)) {
                    hVar3.L(hVar);
                    hVar = hVar3;
                } else if (hVar.I()) {
                    hVar2 = h.Update;
                    B0().i(hVar, hVar3);
                } else {
                    hVar2 = h.Add;
                    B0().b(hVar);
                }
            } else if (!j3) {
                hVar2 = h.Add;
                B0().b(hVar);
            }
        }
        if (hVar.f() == i.a.g.s.e.TYPE_PTR) {
            if (hVar.o()) {
                if (j3) {
                    return;
                }
                g1(((h.e) hVar).T());
                return;
            } else if ((g1(hVar.c()) | false) && hVar2 == h.Noop) {
                hVar2 = h.RegisterServiceType;
            }
        }
        if (hVar2 != h.Noop) {
            t1(j2, hVar, hVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0(i.a.g.c cVar) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = false;
        for (i.a.g.h hVar : s0(cVar.b())) {
            Q0(hVar, currentTimeMillis);
            if (!i.a.g.s.e.TYPE_A.equals(hVar.f()) && !i.a.g.s.e.TYPE_AAAA.equals(hVar.f())) {
                z2 |= hVar.G(this);
            } else {
                z |= hVar.G(this);
            }
        }
        if (z || z2) {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0(i.a.c cVar) {
        ArrayList arrayList;
        List<m.a> list = this.l.get(cVar.g().toLowerCase());
        if (list == null || list.isEmpty() || cVar.d() == null || !cVar.d().u()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.w.submit(new a((m.a) it.next(), cVar));
        }
    }

    @Override // i.a.g.j
    public void T() {
        j.b.b().c(D0()).T();
    }

    public void T0() {
        this.x.lock();
    }

    public void U0() {
        this.x.unlock();
    }

    public boolean V0() {
        return this.s.s();
    }

    public boolean W0(i.a.g.t.a aVar, i.a.g.s.g gVar) {
        return this.s.t(aVar, gVar);
    }

    public boolean X0() {
        return this.s.u();
    }

    @Override // i.a.g.j
    public void Y() {
        j.b.b().c(D0()).Y();
    }

    public boolean Y0() {
        return this.s.v();
    }

    public boolean Z0() {
        return this.s.x();
    }

    @Override // i.a.g.j
    public void a() {
        j.b.b().c(D0()).a();
    }

    public boolean a1() {
        return this.s.y();
    }

    @Override // i.a.g.j
    public void b() {
        j.b.b().c(D0()).b();
    }

    @Override // i.a.g.j
    public void c0(q qVar) {
        j.b.b().c(D0()).c0(qVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (Z0()) {
            return;
        }
        if (f18328g.b()) {
            f18328g.c("Cancelling JmDNS: " + this);
        }
        if (z0()) {
            f18328g.c("Canceling the timer");
            w();
            k0();
            A0();
            if (f18328g.b()) {
                f18328g.c("Wait for JmDNS cancel: " + this);
            }
            v1(5000L);
            f18328g.c("Canceling the state timer");
            b();
            this.w.shutdown();
            y0();
            if (this.r != null) {
                Runtime.getRuntime().removeShutdownHook(this.r);
            }
            j.b.b().a(D0());
            if (f18328g.b()) {
                f18328g.c("JmDNS closed.");
            }
        }
        o(null);
    }

    public void d1() {
        f18328g.c(I0() + "recover()");
        if (Z0() || isClosed() || Y0() || X0()) {
            return;
        }
        synchronized (this.B) {
            if (w0()) {
                f18328g.c(I0() + "recover() thread " + Thread.currentThread().getName());
                StringBuilder sb = new StringBuilder();
                sb.append(I0());
                sb.append(".recover()");
                new f(sb.toString()).start();
            }
        }
    }

    public boolean e1() {
        return this.s.B();
    }

    @Override // i.a.g.j
    public void f(String str) {
        j.b.b().c(D0()).f(str);
    }

    public void f1(i.a.d dVar) throws IOException {
        if (!Z0() && !isClosed()) {
            q qVar = (q) dVar;
            if (qVar.M() != null) {
                if (qVar.M() == this) {
                    if (this.o.get(qVar.N()) != null) {
                        throw new IllegalStateException("A service information can only be registered once.");
                    }
                } else {
                    throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
                }
            }
            qVar.e0(this);
            g1(qVar.R());
            qVar.a0();
            qVar.h0(this.s.q());
            qVar.A(this.s.l());
            qVar.B(this.s.m());
            u1(6000L);
            b1(qVar);
            while (this.o.putIfAbsent(qVar.N(), qVar) != null) {
                b1(qVar);
            }
            J();
            qVar.k0(6000L);
            if (f18328g.b()) {
                f18328g.c("registerService() JmDNS registered service as " + qVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("This DNS is closed.");
    }

    @Override // i.a.a
    public void g0(String str, i.a.e eVar) {
        u0(str, eVar, false);
    }

    public boolean g1(String str) {
        boolean z;
        j jVar;
        Map<d.a, String> K = q.K(str);
        String str2 = K.get(d.a.Domain);
        String str3 = K.get(d.a.Protocol);
        String str4 = K.get(d.a.Application);
        String str5 = K.get(d.a.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? "_" + str4 + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(str3.length() > 0 ? "_" + str3 + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(str2);
        sb.append(".");
        String sb2 = sb.toString();
        String lowerCase = sb2.toLowerCase();
        if (f18328g.b()) {
            k.b.b bVar = f18328g;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(I0());
            sb3.append(".registering service type: ");
            sb3.append(str);
            sb3.append(" as: ");
            sb3.append(sb2);
            sb3.append(str5.length() > 0 ? " subtype: " + str5 : HttpUrl.FRAGMENT_ENCODE_SET);
            bVar.c(sb3.toString());
        }
        boolean z2 = true;
        if (this.p.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.p.putIfAbsent(lowerCase, new j(sb2)) == null;
            if (z) {
                Set<m.b> set = this.m;
                m.b[] bVarArr = (m.b[]) set.toArray(new m.b[set.size()]);
                p pVar = new p(this, sb2, HttpUrl.FRAGMENT_ENCODE_SET, null);
                for (m.b bVar2 : bVarArr) {
                    this.w.submit(new b(bVar2, pVar));
                }
            }
        }
        if (str5.length() <= 0 || (jVar = this.p.get(lowerCase)) == null || jVar.d(str5)) {
            return z;
        }
        synchronized (jVar) {
            if (jVar.d(str5)) {
                z2 = z;
            } else {
                jVar.b(str5);
                Set<m.b> set2 = this.m;
                m.b[] bVarArr2 = (m.b[]) set2.toArray(new m.b[set2.size()]);
                p pVar2 = new p(this, "_" + str5 + "._sub." + sb2, HttpUrl.FRAGMENT_ENCODE_SET, null);
                for (m.b bVar3 : bVarArr2) {
                    this.w.submit(new c(bVar3, pVar2));
                }
            }
        }
        return z2;
    }

    public void h1(i.a.g.t.a aVar) {
        this.s.C(aVar);
    }

    public void i1(i.a.g.d dVar) {
        this.f18332k.remove(dVar);
    }

    public boolean isClosed() {
        return this.s.w();
    }

    public void j1(String str, i.a.e eVar) {
        String lowerCase = str.toLowerCase();
        List<m.a> list = this.l.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new m.a(eVar, false));
                if (list.isEmpty()) {
                    this.l.remove(lowerCase, list);
                }
            }
        }
    }

    @Override // i.a.a
    public void k0() {
        if (f18328g.b()) {
            f18328g.c("unregisterAllServices()");
        }
        Iterator<String> it = this.o.keySet().iterator();
        while (it.hasNext()) {
            q qVar = (q) this.o.get(it.next());
            if (qVar != null) {
                if (f18328g.b()) {
                    f18328g.c("Cancelling service info: " + qVar);
                }
                qVar.F();
            }
        }
        z();
        for (String str : this.o.keySet()) {
            q qVar2 = (q) this.o.get(str);
            if (qVar2 != null) {
                if (f18328g.b()) {
                    f18328g.c("Wait for service info cancel: " + qVar2);
                }
                qVar2.l0(5000L);
                this.o.remove(str, qVar2);
            }
        }
    }

    public void k1(String str) {
        if (this.z.containsKey(str.toLowerCase())) {
            f(str);
        }
    }

    q l1(String str, String str2, String str3, boolean z) {
        x0();
        String lowerCase = str.toLowerCase();
        g1(str);
        if (this.z.putIfAbsent(lowerCase, new i(str)) == null) {
            u0(lowerCase, this.z.get(lowerCase), true);
        }
        q K0 = K0(str, str2, str3, z);
        c0(K0);
        return K0;
    }

    public void m1(i.a.g.c cVar) {
        T0();
        try {
            if (this.y == cVar) {
                this.y = null;
            }
        } finally {
            U0();
        }
    }

    public boolean n1() {
        return this.s.D();
    }

    @Override // i.a.g.i
    public boolean o(i.a.g.t.a aVar) {
        return this.s.o(aVar);
    }

    public void o1(i.a.g.f fVar) throws IOException {
        InetAddress inetAddress;
        int i2;
        if (fVar.n()) {
            return;
        }
        if (fVar.D() != null) {
            inetAddress = fVar.D().getAddress();
            i2 = fVar.D().getPort();
        } else {
            inetAddress = this.f18330i;
            i2 = i.a.g.s.a.a;
        }
        byte[] C = fVar.C();
        DatagramPacket datagramPacket = new DatagramPacket(C, C.length, inetAddress, i2);
        if (f18328g.d()) {
            try {
                i.a.g.c cVar = new i.a.g.c(datagramPacket);
                if (f18328g.d()) {
                    f18328g.i("send(" + I0() + ") JmDNS out:" + cVar.C(true));
                }
            } catch (IOException e2) {
                f18328g.a(l.class.toString(), "send(" + I0() + ") - JmDNS can not parse what it sends!!!", e2);
            }
        }
        MulticastSocket multicastSocket = this.f18331j;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    public void p1(long j2) {
        this.v = j2;
    }

    void q0() {
        if (f18328g.b()) {
            f18328g.c(I0() + "recover() Cleanning up");
        }
        f18328g.h("RECOVERING");
        a();
        ArrayList arrayList = new ArrayList(M0().values());
        k0();
        A0();
        v1(5000L);
        T();
        y0();
        B0().clear();
        if (f18328g.b()) {
            f18328g.c(I0() + "recover() All is clean");
        }
        if (X0()) {
            Iterator<i.a.d> it = arrayList.iterator();
            while (it.hasNext()) {
                ((q) it.next()).a0();
            }
            e1();
            try {
                c1(H0());
                r1(arrayList);
            } catch (Exception e2) {
                f18328g.f(I0() + "recover() Start services exception ", e2);
            }
            f18328g.h(I0() + "recover() We are back!");
            return;
        }
        f18328g.h(I0() + "recover() Could not recover we are Down!");
        if (C0() != null) {
            C0().a(D0(), arrayList);
        }
    }

    public void q1(int i2) {
        this.u = i2;
    }

    public void t0(i.a.g.d dVar, i.a.g.g gVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f18332k.add(dVar);
        if (gVar != null) {
            for (i.a.g.b bVar : B0().f(gVar.c().toLowerCase())) {
                if (gVar.A(bVar) && !bVar.j(currentTimeMillis)) {
                    dVar.b(B0(), currentTimeMillis, bVar);
                }
            }
        }
    }

    public void t1(long j2, i.a.g.h hVar, h hVar2) {
        ArrayList arrayList;
        List<m.a> emptyList;
        synchronized (this.f18332k) {
            arrayList = new ArrayList(this.f18332k);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((i.a.g.d) it.next()).b(B0(), j2, hVar);
        }
        if (i.a.g.s.e.TYPE_PTR.equals(hVar.f())) {
            i.a.c B = hVar.B(this);
            if (B.d() == null || !B.d().u()) {
                q K0 = K0(B.g(), B.e(), HttpUrl.FRAGMENT_ENCODE_SET, false);
                if (K0.u()) {
                    B = new p(this, B.g(), B.e(), K0);
                }
            }
            List<m.a> list = this.l.get(B.g().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    emptyList = new ArrayList(list);
                }
            } else {
                emptyList = Collections.emptyList();
            }
            if (f18328g.d()) {
                f18328g.i(I0() + ".updating record for event: " + B + " list " + emptyList + " operation: " + hVar2);
            }
            if (emptyList.isEmpty()) {
                return;
            }
            int i2 = g.a[hVar2.ordinal()];
            if (i2 == 1) {
                for (m.a aVar : emptyList) {
                    if (aVar.b()) {
                        aVar.d(B);
                    } else {
                        this.w.submit(new d(aVar, B));
                    }
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            for (m.a aVar2 : emptyList) {
                if (aVar2.b()) {
                    aVar2.e(B);
                } else {
                    this.w.submit(new e(aVar2, B));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.AbstractMap, i.a.g.l$j] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    public String toString() {
        StringBuilder sb = new StringBuilder(RecyclerView.l.FLAG_MOVED);
        sb.append("\n");
        sb.append("\t---- Local Host -----");
        sb.append("\n\t");
        sb.append(this.s);
        sb.append("\n\t---- Services -----");
        for (String str : this.o.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.o.get(str));
        }
        sb.append("\n");
        sb.append("\t---- Types ----");
        Iterator<String> it = this.p.keySet().iterator();
        while (it.hasNext()) {
            j jVar = this.p.get(it.next());
            sb.append("\n\t\tType: ");
            sb.append(jVar.e());
            sb.append(": ");
            if (jVar.isEmpty()) {
                jVar = "no subtypes";
            }
            sb.append(jVar);
        }
        sb.append("\n");
        sb.append(this.n.toString());
        sb.append("\n");
        sb.append("\t---- Service Collectors ----");
        for (String str2 : this.z.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(this.z.get(str2));
        }
        sb.append("\n");
        sb.append("\t---- Service Listeners ----");
        for (String str3 : this.l.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(this.l.get(str3));
        }
        return sb.toString();
    }

    public boolean u1(long j2) {
        return this.s.F(j2);
    }

    public void v0(i.a.g.t.a aVar, i.a.g.s.g gVar) {
        this.s.b(aVar, gVar);
    }

    public boolean v1(long j2) {
        return this.s.G(j2);
    }

    @Override // i.a.g.j
    public void w() {
        j.b.b().c(D0()).w();
    }

    public boolean w0() {
        return this.s.c();
    }

    public void x0() {
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        for (i.a.g.b bVar : B0().c()) {
            try {
                i.a.g.h hVar = (i.a.g.h) bVar;
                if (hVar.j(currentTimeMillis)) {
                    t1(currentTimeMillis, hVar, h.Remove);
                    B0().h(hVar);
                } else if (hVar.K(currentTimeMillis)) {
                    hVar.H();
                    String lowerCase = hVar.C().s().toLowerCase();
                    if (hashSet.add(lowerCase)) {
                        k1(lowerCase);
                    }
                }
            } catch (Exception e2) {
                f18328g.f(I0() + ".Error while reaping records: " + bVar, e2);
                f18328g.h(toString());
            }
        }
    }

    @Override // i.a.g.j
    public void z() {
        j.b.b().c(D0()).z();
    }

    public boolean z0() {
        return this.s.d();
    }
}
