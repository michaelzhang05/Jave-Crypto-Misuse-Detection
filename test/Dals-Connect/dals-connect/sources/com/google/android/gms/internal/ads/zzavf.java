package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzavf implements zzue {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13006f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f13007g;

    /* renamed from: h, reason: collision with root package name */
    private String f13008h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13009i;

    public zzavf(Context context, String str) {
        this.f13006f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f13008h = str;
        this.f13009i = false;
        this.f13007g = new Object();
    }

    public final String j() {
        return this.f13008h;
    }

    public final void k(boolean z) {
        if (zzk.zzme().D(this.f13006f)) {
            synchronized (this.f13007g) {
                if (this.f13009i == z) {
                    return;
                }
                this.f13009i = z;
                if (TextUtils.isEmpty(this.f13008h)) {
                    return;
                }
                if (this.f13009i) {
                    zzk.zzme().r(this.f13006f, this.f13008h);
                } else {
                    zzk.zzme().s(this.f13006f, this.f13008h);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void r0(zzud zzudVar) {
        k(zzudVar.m);
    }
}
