package q0;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38078a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f38079b;

    /* renamed from: c, reason: collision with root package name */
    private final C3815I f38080c;

    /* renamed from: d, reason: collision with root package name */
    private int f38081d;

    /* renamed from: e, reason: collision with root package name */
    private int f38082e;

    /* renamed from: f, reason: collision with root package name */
    private int f38083f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f38084g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38085h;

    public p(int i8, C3815I c3815i) {
        this.f38079b = i8;
        this.f38080c = c3815i;
    }

    private final void b() {
        if (this.f38081d + this.f38082e + this.f38083f == this.f38079b) {
            if (this.f38084g != null) {
                this.f38080c.q(new ExecutionException(this.f38082e + " out of " + this.f38079b + " underlying tasks failed", this.f38084g));
                return;
            }
            if (this.f38085h) {
                this.f38080c.s();
            } else {
                this.f38080c.r(null);
            }
        }
    }

    @Override // q0.InterfaceC3823g
    public final void a(Object obj) {
        synchronized (this.f38078a) {
            this.f38081d++;
            b();
        }
    }

    @Override // q0.InterfaceC3820d
    public final void c() {
        synchronized (this.f38078a) {
            this.f38083f++;
            this.f38085h = true;
            b();
        }
    }

    @Override // q0.InterfaceC3822f
    public final void d(Exception exc) {
        synchronized (this.f38078a) {
            this.f38082e++;
            this.f38084g = exc;
            b();
        }
    }
}
