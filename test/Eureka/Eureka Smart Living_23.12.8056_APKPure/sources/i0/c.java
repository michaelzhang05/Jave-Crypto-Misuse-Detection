package i0;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import f5.f;
import f5.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6960d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f6961a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.savedstate.a f6962b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6963c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c a(d dVar) {
            h.e(dVar, "owner");
            return new c(dVar, null);
        }
    }

    private c(d dVar) {
        this.f6961a = dVar;
        this.f6962b = new androidx.savedstate.a();
    }

    public static final c a(d dVar) {
        return f6960d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f6962b;
    }

    public final void c() {
        androidx.lifecycle.h r5 = this.f6961a.r();
        if (!(r5.b() == h.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        r5.a(new Recreator(this.f6961a));
        this.f6962b.e(r5);
        this.f6963c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f6963c) {
            c();
        }
        androidx.lifecycle.h r5 = this.f6961a.r();
        if (!r5.b().b(h.b.STARTED)) {
            this.f6962b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + r5.b()).toString());
    }

    public final void e(Bundle bundle) {
        f5.h.e(bundle, "outBundle");
        this.f6962b.g(bundle);
    }

    public /* synthetic */ c(d dVar, f fVar) {
        this(dVar);
    }
}
