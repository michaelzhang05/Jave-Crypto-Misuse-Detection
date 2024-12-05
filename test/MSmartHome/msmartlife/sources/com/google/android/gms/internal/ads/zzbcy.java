package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbcy {

    /* renamed from: b, reason: collision with root package name */
    private long f13180b;
    private final long a = TimeUnit.MILLISECONDS.toNanos(((Long) zzyt.e().c(zzacu.L)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f13181c = true;

    public final void a(SurfaceTexture surfaceTexture, zzbcn zzbcnVar) {
        if (zzbcnVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f13181c || Math.abs(timestamp - this.f13180b) >= this.a) {
            this.f13181c = false;
            this.f13180b = timestamp;
            zzaxi.a.post(new b8(this, zzbcnVar));
        }
    }

    public final void b() {
        this.f13181c = true;
    }
}
