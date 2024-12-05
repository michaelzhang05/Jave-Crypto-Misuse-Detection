package i.a;

import i.a.g.o;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NetworkTopologyDiscovery.java */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: NetworkTopologyDiscovery.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static volatile b a;

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicReference<InterfaceC0262a> f18271b = new AtomicReference<>();

        /* compiled from: NetworkTopologyDiscovery.java */
        /* renamed from: i.a.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0262a {
            b a();
        }

        private a() {
        }

        public static b a() {
            if (a == null) {
                synchronized (a.class) {
                    if (a == null) {
                        a = b();
                    }
                }
            }
            return a;
        }

        protected static b b() {
            InterfaceC0262a interfaceC0262a = f18271b.get();
            b a2 = interfaceC0262a != null ? interfaceC0262a.a() : null;
            return a2 != null ? a2 : new o();
        }
    }

    InetAddress[] a();
}
