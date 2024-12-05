package D0;

import b1.InterfaceC1955a;
import b1.InterfaceC1956b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class D implements InterfaceC1956b, InterfaceC1955a {

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1955a.InterfaceC0356a f1697c = new InterfaceC1955a.InterfaceC0356a() { // from class: D0.A
        @Override // b1.InterfaceC1955a.InterfaceC0356a
        public final void a(InterfaceC1956b interfaceC1956b) {
            D.f(interfaceC1956b);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1956b f1698d = new InterfaceC1956b() { // from class: D0.B
        @Override // b1.InterfaceC1956b
        public final Object get() {
            Object g8;
            g8 = D.g();
            return g8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1955a.InterfaceC0356a f1699a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC1956b f1700b;

    private D(InterfaceC1955a.InterfaceC0356a interfaceC0356a, InterfaceC1956b interfaceC1956b) {
        this.f1699a = interfaceC0356a;
        this.f1700b = interfaceC1956b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D e() {
        return new D(f1697c, f1698d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(InterfaceC1955a.InterfaceC0356a interfaceC0356a, InterfaceC1955a.InterfaceC0356a interfaceC0356a2, InterfaceC1956b interfaceC1956b) {
        interfaceC0356a.a(interfaceC1956b);
        interfaceC0356a2.a(interfaceC1956b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D i(InterfaceC1956b interfaceC1956b) {
        return new D(null, interfaceC1956b);
    }

    @Override // b1.InterfaceC1955a
    public void a(final InterfaceC1955a.InterfaceC0356a interfaceC0356a) {
        InterfaceC1956b interfaceC1956b;
        InterfaceC1956b interfaceC1956b2;
        InterfaceC1956b interfaceC1956b3 = this.f1700b;
        InterfaceC1956b interfaceC1956b4 = f1698d;
        if (interfaceC1956b3 != interfaceC1956b4) {
            interfaceC0356a.a(interfaceC1956b3);
            return;
        }
        synchronized (this) {
            interfaceC1956b = this.f1700b;
            if (interfaceC1956b != interfaceC1956b4) {
                interfaceC1956b2 = interfaceC1956b;
            } else {
                final InterfaceC1955a.InterfaceC0356a interfaceC0356a2 = this.f1699a;
                this.f1699a = new InterfaceC1955a.InterfaceC0356a() { // from class: D0.C
                    @Override // b1.InterfaceC1955a.InterfaceC0356a
                    public final void a(InterfaceC1956b interfaceC1956b5) {
                        D.h(InterfaceC1955a.InterfaceC0356a.this, interfaceC0356a, interfaceC1956b5);
                    }
                };
                interfaceC1956b2 = null;
            }
        }
        if (interfaceC1956b2 != null) {
            interfaceC0356a.a(interfaceC1956b);
        }
    }

    @Override // b1.InterfaceC1956b
    public Object get() {
        return this.f1700b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(InterfaceC1956b interfaceC1956b) {
        InterfaceC1955a.InterfaceC0356a interfaceC0356a;
        if (this.f1700b == f1698d) {
            synchronized (this) {
                interfaceC0356a = this.f1699a;
                this.f1699a = null;
                this.f1700b = interfaceC1956b;
            }
            interfaceC0356a.a(interfaceC1956b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(InterfaceC1956b interfaceC1956b) {
    }
}
