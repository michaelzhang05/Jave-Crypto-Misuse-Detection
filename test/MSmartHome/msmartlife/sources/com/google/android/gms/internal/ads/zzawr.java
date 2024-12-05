package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzawr {

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    private final String f13056g;

    /* renamed from: h, reason: collision with root package name */
    private final zzaxb f13057h;

    @VisibleForTesting
    private long a = -1;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    private long f13051b = -1;

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    private int f13052c = -1;

    /* renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    int f13053d = -1;

    /* renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    private long f13054e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f13055f = new Object();

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    private int f13058i = 0;

    /* renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    private int f13059j = 0;

    public zzawr(String str, zzaxb zzaxbVar) {
        this.f13056g = str;
        this.f13057h = zzaxbVar;
    }

    private static boolean b(Context context) {
        Context f2 = zzasq.f(context);
        int identifier = f2.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzbad.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == f2.getPackageManager().getActivityInfo(new ComponentName(f2.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzbad.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzbad.i("Fail to fetch AdActivity theme");
            zzbad.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final void a(zzxz zzxzVar, long j2) {
        Bundle bundle;
        synchronized (this.f13055f) {
            long v = this.f13057h.v();
            long a = zzk.zzln().a();
            if (this.f13051b == -1) {
                if (a - v > ((Long) zzyt.e().c(zzacu.f1)).longValue()) {
                    this.f13053d = -1;
                } else {
                    this.f13053d = this.f13057h.r();
                }
                this.f13051b = j2;
                this.a = j2;
            } else {
                this.a = j2;
            }
            if (zzxzVar == null || (bundle = zzxzVar.f15793h) == null || bundle.getInt("gw", 2) != 1) {
                this.f13052c++;
                int i2 = this.f13053d + 1;
                this.f13053d = i2;
                if (i2 == 0) {
                    this.f13054e = 0L;
                    this.f13057h.F(a);
                } else {
                    this.f13054e = a - this.f13057h.n();
                }
            }
        }
    }

    public final Bundle c(Context context, String str) {
        Bundle bundle;
        synchronized (this.f13055f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f13056g);
            bundle.putLong("basets", this.f13051b);
            bundle.putLong("currts", this.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f13052c);
            bundle.putInt("preqs_in_session", this.f13053d);
            bundle.putLong("time_in_session", this.f13054e);
            bundle.putInt("pclick", this.f13058i);
            bundle.putInt("pimp", this.f13059j);
            bundle.putBoolean("support_transparent_background", b(context));
        }
        return bundle;
    }

    public final void d() {
        synchronized (this.f13055f) {
            this.f13059j++;
        }
    }

    public final void e() {
        synchronized (this.f13055f) {
            this.f13058i++;
        }
    }
}
