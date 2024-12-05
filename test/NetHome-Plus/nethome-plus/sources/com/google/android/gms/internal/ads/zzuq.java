package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;

@zzard
/* loaded from: classes2.dex */
public final class zzuq {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private n40 f15642b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15643c = false;

    public final Activity a() {
        synchronized (this.a) {
            if (!PlatformVersion.a()) {
                return null;
            }
            n40 n40Var = this.f15642b;
            if (n40Var == null) {
                return null;
            }
            return n40Var.a();
        }
    }

    public final Context b() {
        synchronized (this.a) {
            if (!PlatformVersion.a()) {
                return null;
            }
            n40 n40Var = this.f15642b;
            if (n40Var == null) {
                return null;
            }
            return n40Var.b();
        }
    }

    public final void c(Context context) {
        synchronized (this.a) {
            if (!this.f15643c) {
                if (!PlatformVersion.a()) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzbad.i("Can not cast Context to Application");
                    return;
                }
                if (this.f15642b == null) {
                    this.f15642b = new n40();
                }
                this.f15642b.e(application, context);
                this.f15643c = true;
            }
        }
    }

    public final void d(zzut zzutVar) {
        synchronized (this.a) {
            if (PlatformVersion.a()) {
                if (this.f15642b == null) {
                    this.f15642b = new n40();
                }
                this.f15642b.f(zzutVar);
            }
        }
    }
}
