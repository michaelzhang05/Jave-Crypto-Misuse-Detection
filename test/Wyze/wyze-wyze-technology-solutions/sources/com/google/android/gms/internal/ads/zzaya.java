package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@zzard
/* loaded from: classes2.dex */
public final class zzaya {
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f13087b = 1.0f;

    public static float c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    private final synchronized boolean f() {
        return this.f13087b >= 0.0f;
    }

    public final synchronized void a(boolean z) {
        this.a = z;
    }

    public final synchronized void b(float f2) {
        this.f13087b = f2;
    }

    public final synchronized float d() {
        if (!f()) {
            return 1.0f;
        }
        return this.f13087b;
    }

    public final synchronized boolean e() {
        return this.a;
    }
}
