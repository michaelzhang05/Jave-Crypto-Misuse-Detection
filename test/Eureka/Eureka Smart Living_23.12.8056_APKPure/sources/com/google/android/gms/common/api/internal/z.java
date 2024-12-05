package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class z extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f4646b;

    /* renamed from: c, reason: collision with root package name */
    protected final AtomicReference f4647c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f4648d;

    /* renamed from: e, reason: collision with root package name */
    protected final s1.f f4649e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(u1.e eVar, s1.f fVar) {
        super(eVar);
        this.f4647c = new AtomicReference(null);
        this.f4648d = new d2.f(Looper.getMainLooper());
        this.f4649e = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(s1.a aVar, int i6) {
        this.f4647c.set(null);
        m(aVar, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f4647c.set(null);
        n();
    }

    private static final int p(w wVar) {
        if (wVar == null) {
            return -1;
        }
        return wVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i6, int i7, Intent intent) {
        w wVar = (w) this.f4647c.get();
        if (i6 != 1) {
            if (i6 == 2) {
                int e6 = this.f4649e.e(b());
                if (e6 == 0) {
                    o();
                    return;
                } else {
                    if (wVar == null) {
                        return;
                    }
                    if (wVar.b().a() == 18 && e6 == 18) {
                        return;
                    }
                }
            }
        } else if (i7 == -1) {
            o();
            return;
        } else if (i7 == 0) {
            if (wVar == null) {
                return;
            }
            l(new s1.a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, wVar.b().toString()), p(wVar));
            return;
        }
        if (wVar != null) {
            l(wVar.b(), wVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f4647c.set(bundle.getBoolean("resolving_error", false) ? new w(new s1.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        w wVar = (w) this.f4647c.get();
        if (wVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", wVar.a());
        bundle.putInt("failed_status", wVar.b().a());
        bundle.putParcelable("failed_resolution", wVar.b().c());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f4646b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f4646b = false;
    }

    protected abstract void m(s1.a aVar, int i6);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new s1.a(13, null), p((w) this.f4647c.get()));
    }

    public final void s(s1.a aVar, int i6) {
        w wVar = new w(aVar, i6);
        if (u1.x.a(this.f4647c, null, wVar)) {
            this.f4648d.post(new y(this, wVar));
        }
    }
}
