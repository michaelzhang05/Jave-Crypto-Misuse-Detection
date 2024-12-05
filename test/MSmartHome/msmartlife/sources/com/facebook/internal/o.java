package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;

/* compiled from: InstallReferrerUtil.java */
/* loaded from: classes.dex */
public class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstallReferrerUtil.java */
    /* loaded from: classes.dex */
    public static class a implements InstallReferrerStateListener {
        final /* synthetic */ InstallReferrerClient a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f9205b;

        a(InstallReferrerClient installReferrerClient, b bVar) {
            this.a = installReferrerClient;
            this.f9205b = bVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void a(int i2) {
            if (i2 != 0) {
                if (i2 != 2) {
                    return;
                }
                o.a();
                return;
            }
            try {
                String a = this.a.a().a();
                if (a != null && (a.contains("fb") || a.contains("facebook"))) {
                    this.f9205b.a(a);
                }
                o.a();
            } catch (RemoteException unused) {
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void b() {
        }
    }

    /* compiled from: InstallReferrerUtil.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    private o() {
    }

    static /* synthetic */ void a() {
        if (com.facebook.internal.a0.f.a.c(o.class)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, o.class);
        }
    }

    private static boolean b() {
        if (com.facebook.internal.a0.f.a.c(o.class)) {
            return false;
        }
        try {
            return com.facebook.f.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, o.class);
            return false;
        }
    }

    private static void c(b bVar) {
        if (com.facebook.internal.a0.f.a.c(o.class)) {
            return;
        }
        try {
            InstallReferrerClient a2 = InstallReferrerClient.b(com.facebook.f.e()).a();
            try {
                a2.c(new a(a2, bVar));
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, o.class);
        }
    }

    public static void d(b bVar) {
        if (com.facebook.internal.a0.f.a.c(o.class)) {
            return;
        }
        try {
            if (b()) {
                return;
            }
            c(bVar);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, o.class);
        }
    }

    private static void e() {
        if (com.facebook.internal.a0.f.a.c(o.class)) {
            return;
        }
        try {
            com.facebook.f.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, o.class);
        }
    }
}
