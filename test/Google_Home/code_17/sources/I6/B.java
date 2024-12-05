package I6;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes5.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final C1263a f4227a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f4228b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f4229c;

    public B(C1263a c1263a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c1263a != null) {
            if (proxy != null) {
                if (inetSocketAddress != null) {
                    this.f4227a = c1263a;
                    this.f4228b = proxy;
                    this.f4229c = inetSocketAddress;
                    return;
                }
                throw new NullPointerException("inetSocketAddress == null");
            }
            throw new NullPointerException("proxy == null");
        }
        throw new NullPointerException("address == null");
    }

    public C1263a a() {
        return this.f4227a;
    }

    public Proxy b() {
        return this.f4228b;
    }

    public boolean c() {
        if (this.f4227a.f4245i != null && this.f4228b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public InetSocketAddress d() {
        return this.f4229c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof B) {
            B b8 = (B) obj;
            if (b8.f4227a.equals(this.f4227a) && b8.f4228b.equals(this.f4228b) && b8.f4229c.equals(this.f4229c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f4227a.hashCode()) * 31) + this.f4228b.hashCode()) * 31) + this.f4229c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f4229c + "}";
    }
}
