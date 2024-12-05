package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    final Y1 f16212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(r4 r4Var) {
        this.f16212a = r4Var.b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        try {
            Y.d a8 = Y.e.a(this.f16212a.c());
            if (a8 == null) {
                this.f16212a.d().v().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a8.e("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e8) {
            this.f16212a.d().v().b("Failed to retrieve Play Store version for Install Referrer", e8);
            return false;
        }
    }
}
