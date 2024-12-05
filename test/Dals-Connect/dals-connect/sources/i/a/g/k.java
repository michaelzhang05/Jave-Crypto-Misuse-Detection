package i.a.g;

import i.a.b;
import i.a.g.h;
import i.a.g.i;
import i.a.g.n;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import okhttp3.HttpUrl;

/* compiled from: HostInfo.java */
/* loaded from: classes2.dex */
public class k implements i {

    /* renamed from: f, reason: collision with root package name */
    private static k.b.b f18323f = k.b.c.i(k.class.getName());

    /* renamed from: g, reason: collision with root package name */
    protected String f18324g;

    /* renamed from: h, reason: collision with root package name */
    protected InetAddress f18325h;

    /* renamed from: i, reason: collision with root package name */
    protected NetworkInterface f18326i;

    /* renamed from: j, reason: collision with root package name */
    private final b f18327j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HostInfo.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HostInfo.java */
    /* loaded from: classes2.dex */
    public static final class b extends i.b {
        public b(l lVar) {
            q(lVar);
        }
    }

    private k(InetAddress inetAddress, String str, l lVar) {
        this.f18327j = new b(lVar);
        this.f18325h = inetAddress;
        this.f18324g = str;
        if (inetAddress != null) {
            try {
                this.f18326i = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e2) {
                f18323f.f("LocalHostInfo() exception ", e2);
            }
        }
    }

    public static k A(InetAddress inetAddress, l lVar, String str) {
        InetAddress localHost;
        String str2 = str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] a2 = b.a.a().a();
                        if (a2.length > 0) {
                            localHost = a2[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    f18323f.h("Could not find any address beside the loopback.");
                }
            } catch (IOException e2) {
                f18323f.f("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e2.getMessage(), e2);
                localHost = z();
                if (str == null || str.length() <= 0) {
                    str = "computer";
                }
            }
        } else {
            localHost = inetAddress;
        }
        if (str2.length() == 0) {
            str2 = localHost.getHostName();
        }
        if (str2.contains("in-addr.arpa") || str2.equals(localHost.getHostAddress())) {
            if (str == null || str.length() <= 0) {
                str = localHost.getHostAddress();
            }
            str2 = str;
        }
        int indexOf = str2.indexOf(".local");
        if (indexOf > 0) {
            str2 = str2.substring(0, indexOf);
        }
        return new k(localHost, str2.replaceAll("[:%\\.]", "-") + ".local.", lVar);
    }

    private h.a f(boolean z, int i2) {
        if (n() instanceof Inet4Address) {
            return new h.c(q(), i.a.g.s.d.CLASS_IN, z, i2, n());
        }
        return null;
    }

    private h.e g(boolean z, int i2) {
        if (!(n() instanceof Inet4Address)) {
            return null;
        }
        return new h.e(n().getHostAddress() + ".in-addr.arpa.", i.a.g.s.d.CLASS_IN, z, i2, q());
    }

    private h.a h(boolean z, int i2) {
        if (n() instanceof Inet6Address) {
            return new h.d(q(), i.a.g.s.d.CLASS_IN, z, i2, n());
        }
        return null;
    }

    private h.e i(boolean z, int i2) {
        if (!(n() instanceof Inet6Address)) {
            return null;
        }
        return new h.e(n().getHostAddress() + ".ip6.arpa.", i.a.g.s.d.CLASS_IN, z, i2, q());
    }

    private static InetAddress z() {
        try {
            return InetAddress.getByName(null);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public boolean B() {
        return this.f18327j.m();
    }

    public void C(i.a.g.t.a aVar) {
        this.f18327j.n(aVar);
    }

    public boolean D() {
        return this.f18327j.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(DatagramPacket datagramPacket) {
        InetAddress address;
        boolean z = false;
        if (n() == null || (address = datagramPacket.getAddress()) == null) {
            return false;
        }
        if ((n().isLinkLocalAddress() || n().isMCLinkLocal()) && !address.isLinkLocalAddress()) {
            z = true;
        }
        if (!address.isLoopbackAddress() || n().isLoopbackAddress()) {
            return z;
        }
        return true;
    }

    public boolean F(long j2) {
        return this.f18327j.t(j2);
    }

    public boolean G(long j2) {
        if (this.f18325h == null) {
            return true;
        }
        return this.f18327j.u(j2);
    }

    public Collection<h> a(i.a.g.s.d dVar, boolean z, int i2) {
        ArrayList arrayList = new ArrayList();
        h.a f2 = f(z, i2);
        if (f2 != null && f2.s(dVar)) {
            arrayList.add(f2);
        }
        h.a h2 = h(z, i2);
        if (h2 != null && h2.s(dVar)) {
            arrayList.add(h2);
        }
        return arrayList;
    }

    public void b(i.a.g.t.a aVar, i.a.g.s.g gVar) {
        this.f18327j.a(aVar, gVar);
    }

    public boolean c() {
        return this.f18327j.b();
    }

    public boolean d() {
        return this.f18327j.c();
    }

    public boolean e(h.a aVar) {
        h.a j2 = j(aVar.f(), aVar.p(), 3600);
        return j2 != null && j2.M(aVar) && j2.U(aVar) && !j2.N(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h.a j(i.a.g.s.e eVar, boolean z, int i2) {
        int i3 = a.a[eVar.ordinal()];
        if (i3 == 1) {
            return f(z, i2);
        }
        if (i3 == 2 || i3 == 3) {
            return h(z, i2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h.e k(i.a.g.s.e eVar, boolean z, int i2) {
        int i3 = a.a[eVar.ordinal()];
        if (i3 == 1) {
            return g(z, i2);
        }
        if (i3 == 2 || i3 == 3) {
            return i(z, i2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Inet4Address l() {
        if (n() instanceof Inet4Address) {
            return (Inet4Address) this.f18325h;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Inet6Address m() {
        if (n() instanceof Inet6Address) {
            return (Inet6Address) this.f18325h;
        }
        return null;
    }

    public InetAddress n() {
        return this.f18325h;
    }

    @Override // i.a.g.i
    public boolean o(i.a.g.t.a aVar) {
        return this.f18327j.o(aVar);
    }

    public NetworkInterface p() {
        return this.f18326i;
    }

    public String q() {
        return this.f18324g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String r() {
        String a2;
        a2 = n.c.a().a(n(), this.f18324g, n.d.HOST);
        this.f18324g = a2;
        return a2;
    }

    public boolean s() {
        return this.f18327j.e();
    }

    public boolean t(i.a.g.t.a aVar, i.a.g.s.g gVar) {
        return this.f18327j.g(aVar, gVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("local host info[");
        sb.append(q() != null ? q() : "no name");
        sb.append(", ");
        sb.append(p() != null ? p().getDisplayName() : "???");
        sb.append(":");
        sb.append(n() != null ? n().getHostAddress() : "no address");
        sb.append(", ");
        sb.append(this.f18327j);
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return this.f18327j.h();
    }

    public boolean v() {
        return this.f18327j.i();
    }

    public boolean w() {
        return this.f18327j.j();
    }

    public boolean x() {
        return this.f18327j.k();
    }

    public boolean y() {
        return this.f18327j.l();
    }
}
