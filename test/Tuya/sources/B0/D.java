package B0;

import Z0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class D implements Z0.b, Z0.a {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0257a f592c = new a.InterfaceC0257a() { // from class: B0.A
        @Override // Z0.a.InterfaceC0257a
        public final void a(Z0.b bVar) {
            D.f(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Z0.b f593d = new Z0.b() { // from class: B0.B
        @Override // Z0.b
        public final Object get() {
            Object g8;
            g8 = D.g();
            return g8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private a.InterfaceC0257a f594a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Z0.b f595b;

    private D(a.InterfaceC0257a interfaceC0257a, Z0.b bVar) {
        this.f594a = interfaceC0257a;
        this.f595b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D e() {
        return new D(f592c, f593d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0257a interfaceC0257a, a.InterfaceC0257a interfaceC0257a2, Z0.b bVar) {
        interfaceC0257a.a(bVar);
        interfaceC0257a2.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D i(Z0.b bVar) {
        return new D(null, bVar);
    }

    @Override // Z0.a
    public void a(final a.InterfaceC0257a interfaceC0257a) {
        Z0.b bVar;
        Z0.b bVar2;
        Z0.b bVar3 = this.f595b;
        Z0.b bVar4 = f593d;
        if (bVar3 != bVar4) {
            interfaceC0257a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f595b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0257a interfaceC0257a2 = this.f594a;
                this.f594a = new a.InterfaceC0257a() { // from class: B0.C
                    @Override // Z0.a.InterfaceC0257a
                    public final void a(Z0.b bVar5) {
                        D.h(a.InterfaceC0257a.this, interfaceC0257a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0257a.a(bVar);
        }
    }

    @Override // Z0.b
    public Object get() {
        return this.f595b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Z0.b bVar) {
        a.InterfaceC0257a interfaceC0257a;
        if (this.f595b == f593d) {
            synchronized (this) {
                interfaceC0257a = this.f594a;
                this.f594a = null;
                this.f595b = bVar;
            }
            interfaceC0257a.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Z0.b bVar) {
    }
}
