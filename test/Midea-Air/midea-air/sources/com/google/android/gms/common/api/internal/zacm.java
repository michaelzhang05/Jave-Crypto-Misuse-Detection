package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zacm<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    private ResultTransform<? super R, ? extends Result> a;

    /* renamed from: b, reason: collision with root package name */
    private zacm<? extends Result> f10712b;

    /* renamed from: c, reason: collision with root package name */
    private volatile ResultCallbacks<? super R> f10713c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f10714d;

    /* renamed from: e, reason: collision with root package name */
    private Status f10715e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<GoogleApiClient> f10716f;

    /* renamed from: g, reason: collision with root package name */
    private final i0 f10717g;

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e2);
            }
        }
    }

    private final boolean e() {
        return (this.f10713c == null || this.f10716f.get() == null) ? false : true;
    }

    private final void h(Status status) {
        synchronized (this.f10714d) {
            this.f10715e = status;
            j(status);
        }
    }

    private final void j(Status status) {
        synchronized (this.f10714d) {
            ResultTransform<? super R, ? extends Result> resultTransform = this.a;
            if (resultTransform != null) {
                Status a = resultTransform.a(status);
                Preconditions.k(a, "onFailure must not return null");
                this.f10712b.h(a);
            } else if (e()) {
                this.f10713c.b(status);
            }
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(R r) {
        synchronized (this.f10714d) {
            if (r.getStatus().J()) {
                if (this.a != null) {
                    zacc.a().submit(new h0(this, r));
                } else if (e()) {
                    this.f10713c.c(r);
                }
            } else {
                h(r.getStatus());
                c(r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f10713c = null;
    }
}
