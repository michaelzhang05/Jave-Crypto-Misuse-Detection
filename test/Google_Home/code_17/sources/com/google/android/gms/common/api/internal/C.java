package com.google.android.gms.common.api.internal;

import N.C1331b;
import N.C1336g;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import d0.HandlerC2730i;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class C extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f15917b;

    /* renamed from: c, reason: collision with root package name */
    protected final AtomicReference f15918c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f15919d;

    /* renamed from: e, reason: collision with root package name */
    protected final C1336g f15920e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(P.e eVar, C1336g c1336g) {
        super(eVar);
        this.f15918c = new AtomicReference(null);
        this.f15919d = new HandlerC2730i(Looper.getMainLooper());
        this.f15920e = c1336g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C1331b c1331b, int i8) {
        this.f15918c.set(null);
        m(c1331b, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f15918c.set(null);
        n();
    }

    private static final int p(z zVar) {
        if (zVar == null) {
            return -1;
        }
        return zVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i8, int i9, Intent intent) {
        z zVar = (z) this.f15918c.get();
        if (i8 != 1) {
            if (i8 == 2) {
                int g8 = this.f15920e.g(b());
                if (g8 == 0) {
                    o();
                    return;
                } else if (zVar != null) {
                    if (zVar.b().p() == 18 && g8 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            if (i9 == -1) {
                o();
                return;
            }
            if (i9 == 0) {
                if (zVar != null) {
                    int i10 = 13;
                    if (intent != null) {
                        i10 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                    }
                    l(new C1331b(i10, null, zVar.b().toString()), p(zVar));
                    return;
                }
                return;
            }
        }
        if (zVar != null) {
            l(zVar.b(), zVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        z zVar;
        super.f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f15918c;
            if (bundle.getBoolean("resolving_error", false)) {
                zVar = new z(new C1331b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                zVar = null;
            }
            atomicReference.set(zVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        z zVar = (z) this.f15918c.get();
        if (zVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zVar.a());
        bundle.putInt("failed_status", zVar.b().p());
        bundle.putParcelable("failed_resolution", zVar.b().v());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f15917b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f15917b = false;
    }

    protected abstract void m(C1331b c1331b, int i8);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C1331b(13, null), p((z) this.f15918c.get()));
    }

    public final void s(C1331b c1331b, int i8) {
        AtomicReference atomicReference;
        z zVar = new z(c1331b, i8);
        do {
            atomicReference = this.f15918c;
            if (androidx.compose.animation.core.d.a(atomicReference, null, zVar)) {
                this.f15919d.post(new B(this, zVar));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
