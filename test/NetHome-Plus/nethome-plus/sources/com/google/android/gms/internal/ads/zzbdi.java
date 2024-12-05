package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbdi implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager a;

    /* renamed from: b, reason: collision with root package name */
    private final g8 f13207b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13208c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13209d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13210e;

    /* renamed from: f, reason: collision with root package name */
    private float f13211f = 1.0f;

    public zzbdi(Context context, g8 g8Var) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.f13207b = g8Var;
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3 = this.f13209d && !this.f13210e && this.f13211f > 0.0f;
        if (z3 && !(z2 = this.f13208c)) {
            AudioManager audioManager = this.a;
            if (audioManager != null && !z2) {
                this.f13208c = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.f13207b.a();
            return;
        }
        if (z3 || !(z = this.f13208c)) {
            return;
        }
        AudioManager audioManager2 = this.a;
        if (audioManager2 != null && z) {
            this.f13208c = audioManager2.abandonAudioFocus(this) == 0;
        }
        this.f13207b.a();
    }

    public final float a() {
        float f2 = this.f13210e ? 0.0f : this.f13211f;
        if (this.f13208c) {
            return f2;
        }
        return 0.0f;
    }

    public final void b(boolean z) {
        this.f13210e = z;
        f();
    }

    public final void c(float f2) {
        this.f13211f = f2;
        f();
    }

    public final void d() {
        this.f13209d = true;
        f();
    }

    public final void e() {
        this.f13209d = false;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.f13208c = i2 > 0;
        this.f13207b.a();
    }
}
