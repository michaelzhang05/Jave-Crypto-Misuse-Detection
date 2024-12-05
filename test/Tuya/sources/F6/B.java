package F6;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes5.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final C1164a f2687a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f2688b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f2689c;

    public B(C1164a c1164a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c1164a != null) {
            if (proxy != null) {
                if (inetSocketAddress != null) {
                    this.f2687a = c1164a;
                    this.f2688b = proxy;
                    this.f2689c = inetSocketAddress;
                    return;
                }
                throw new NullPointerException("inetSocketAddress == null");
            }
            throw new NullPointerException("proxy == null");
        }
        throw new NullPointerException("address == null");
    }

    public C1164a a() {
        return this.f2687a;
    }

    public Proxy b() {
        return this.f2688b;
    }

    public boolean c() {
        if (this.f2687a.f2705i != null && this.f2688b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public InetSocketAddress d() {
        return this.f2689c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof B) {
            B b8 = (B) obj;
            if (b8.f2687a.equals(this.f2687a) && b8.f2688b.equals(this.f2688b) && b8.f2689c.equals(this.f2689c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f2687a.hashCode()) * 31) + this.f2688b.hashCode()) * 31) + this.f2689c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f2689c + "}";
    }
}
