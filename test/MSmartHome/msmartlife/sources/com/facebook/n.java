package com.facebook;

import android.content.Intent;
import com.facebook.internal.x;
import com.facebook.internal.y;

/* compiled from: ProfileManager.java */
/* loaded from: classes.dex */
public final class n {
    private static volatile n a;

    /* renamed from: b, reason: collision with root package name */
    private final c.m.a.a f9367b;

    /* renamed from: c, reason: collision with root package name */
    private final m f9368c;

    /* renamed from: d, reason: collision with root package name */
    private Profile f9369d;

    n(c.m.a.a aVar, m mVar) {
        y.i(aVar, "localBroadcastManager");
        y.i(mVar, "profileCache");
        this.f9367b = aVar;
        this.f9368c = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n b() {
        if (a == null) {
            synchronized (n.class) {
                if (a == null) {
                    a = new n(c.m.a.a.b(f.e()), new m());
                }
            }
        }
        return a;
    }

    private void d(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f9367b.d(intent);
    }

    private void f(Profile profile, boolean z) {
        Profile profile2 = this.f9369d;
        this.f9369d = profile;
        if (z) {
            if (profile != null) {
                this.f9368c.c(profile);
            } else {
                this.f9368c.a();
            }
        }
        if (x.b(profile2, profile)) {
            return;
        }
        d(profile2, profile);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Profile a() {
        return this.f9369d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        Profile b2 = this.f9368c.b();
        if (b2 == null) {
            return false;
        }
        f(b2, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Profile profile) {
        f(profile, true);
    }
}
