package L6;

import I6.B;
import I6.C1263a;
import I6.o;
import I6.r;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final C1263a f6300a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6301b;

    /* renamed from: c, reason: collision with root package name */
    private final I6.e f6302c;

    /* renamed from: d, reason: collision with root package name */
    private final o f6303d;

    /* renamed from: f, reason: collision with root package name */
    private int f6305f;

    /* renamed from: e, reason: collision with root package name */
    private List f6304e = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    private List f6306g = Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    private final List f6307h = new ArrayList();

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f6308a;

        /* renamed from: b, reason: collision with root package name */
        private int f6309b = 0;

        a(List list) {
            this.f6308a = list;
        }

        public List a() {
            return new ArrayList(this.f6308a);
        }

        public boolean b() {
            if (this.f6309b < this.f6308a.size()) {
                return true;
            }
            return false;
        }

        public B c() {
            if (b()) {
                List list = this.f6308a;
                int i8 = this.f6309b;
                this.f6309b = i8 + 1;
                return (B) list.get(i8);
            }
            throw new NoSuchElementException();
        }
    }

    public f(C1263a c1263a, d dVar, I6.e eVar, o oVar) {
        this.f6300a = c1263a;
        this.f6301b = dVar;
        this.f6302c = eVar;
        this.f6303d = oVar;
        h(c1263a.l(), c1263a.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean d() {
        if (this.f6305f < this.f6304e.size()) {
            return true;
        }
        return false;
    }

    private Proxy f() {
        if (d()) {
            List list = this.f6304e;
            int i8 = this.f6305f;
            this.f6305f = i8 + 1;
            Proxy proxy = (Proxy) list.get(i8);
            g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f6300a.l().k() + "; exhausted proxy configurations: " + this.f6304e);
    }

    private void g(Proxy proxy) {
        String k8;
        int w8;
        this.f6306g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                k8 = b(inetSocketAddress);
                w8 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            k8 = this.f6300a.l().k();
            w8 = this.f6300a.l().w();
        }
        if (w8 >= 1 && w8 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f6306g.add(InetSocketAddress.createUnresolved(k8, w8));
                return;
            }
            this.f6303d.j(this.f6302c, k8);
            List lookup = this.f6300a.c().lookup(k8);
            if (!lookup.isEmpty()) {
                this.f6303d.i(this.f6302c, k8, lookup);
                int size = lookup.size();
                for (int i8 = 0; i8 < size; i8++) {
                    this.f6306g.add(new InetSocketAddress((InetAddress) lookup.get(i8), w8));
                }
                return;
            }
            throw new UnknownHostException(this.f6300a.c() + " returned no addresses for " + k8);
        }
        throw new SocketException("No route to " + k8 + ":" + w8 + "; port is out of range");
    }

    private void h(r rVar, Proxy proxy) {
        List r8;
        if (proxy != null) {
            this.f6304e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f6300a.i().select(rVar.B());
            if (select != null && !select.isEmpty()) {
                r8 = J6.c.q(select);
            } else {
                r8 = J6.c.r(Proxy.NO_PROXY);
            }
            this.f6304e = r8;
        }
        this.f6305f = 0;
    }

    public void a(B b8, IOException iOException) {
        if (b8.b().type() != Proxy.Type.DIRECT && this.f6300a.i() != null) {
            this.f6300a.i().connectFailed(this.f6300a.l().B(), b8.b().address(), iOException);
        }
        this.f6301b.b(b8);
    }

    public boolean c() {
        if (!d() && this.f6307h.isEmpty()) {
            return false;
        }
        return true;
    }

    public a e() {
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (d()) {
                Proxy f8 = f();
                int size = this.f6306g.size();
                for (int i8 = 0; i8 < size; i8++) {
                    B b8 = new B(this.f6300a, f8, (InetSocketAddress) this.f6306g.get(i8));
                    if (this.f6301b.c(b8)) {
                        this.f6307h.add(b8);
                    } else {
                        arrayList.add(b8);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f6307h);
                this.f6307h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
