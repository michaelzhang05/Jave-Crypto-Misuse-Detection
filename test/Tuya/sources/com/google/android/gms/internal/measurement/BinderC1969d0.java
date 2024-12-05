package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC1969d0 extends AbstractBinderC2021j0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f15686a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private boolean f15687b;

    public static final Object n0(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(CampaignEx.JSON_KEY_AD_R)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e8) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2029k0
    public final void G(Bundle bundle) {
        synchronized (this.f15686a) {
            try {
                try {
                    this.f15686a.set(bundle);
                    this.f15687b = true;
                } finally {
                    this.f15686a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle j(long j8) {
        Bundle bundle;
        synchronized (this.f15686a) {
            if (!this.f15687b) {
                try {
                    this.f15686a.wait(j8);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f15686a.get();
        }
        return bundle;
    }

    public final Long l(long j8) {
        return (Long) n0(j(j8), Long.class);
    }

    public final String m0(long j8) {
        return (String) n0(j(j8), String.class);
    }
}
