package r0;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37526a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f37527b;

    /* renamed from: c, reason: collision with root package name */
    private final I f37528c;

    /* renamed from: d, reason: collision with root package name */
    private int f37529d;

    /* renamed from: e, reason: collision with root package name */
    private int f37530e;

    /* renamed from: f, reason: collision with root package name */
    private int f37531f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f37532g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37533h;

    public p(int i8, I i9) {
        this.f37527b = i8;
        this.f37528c = i9;
    }

    private final void a() {
        if (this.f37529d + this.f37530e + this.f37531f == this.f37527b) {
            if (this.f37532g != null) {
                this.f37528c.q(new ExecutionException(this.f37530e + " out of " + this.f37527b + " underlying tasks failed", this.f37532g));
                return;
            }
            if (this.f37533h) {
                this.f37528c.s();
            } else {
                this.f37528c.r(null);
            }
        }
    }

    @Override // r0.InterfaceC3676g
    public final void b(Object obj) {
        synchronized (this.f37526a) {
            this.f37529d++;
            a();
        }
    }

    @Override // r0.InterfaceC3673d
    public final void c() {
        synchronized (this.f37526a) {
            this.f37531f++;
            this.f37533h = true;
            a();
        }
    }

    @Override // r0.InterfaceC3675f
    public final void d(Exception exc) {
        synchronized (this.f37526a) {
            this.f37530e++;
            this.f37532g = exc;
            a();
        }
    }
}
