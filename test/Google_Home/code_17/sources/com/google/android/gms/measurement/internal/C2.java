package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC2096d0;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    final R2 f16986a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(I5 i52) {
        this.f16986a = i52.t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, InterfaceC2096d0 interfaceC2096d0) {
        this.f16986a.e().k();
        if (interfaceC2096d0 == null) {
            this.f16986a.c().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, str);
        try {
            Bundle e8 = interfaceC2096d0.e(bundle);
            if (e8 == null) {
                this.f16986a.c().G().a("Install Referrer Service returned a null response");
                return null;
            }
            return e8;
        } catch (Exception e9) {
            this.f16986a.c().G().b("Exception occurred while retrieving the Install Referrer", e9.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        try {
            X.d a8 = X.e.a(this.f16986a.w());
            if (a8 == null) {
                this.f16986a.c().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a8.e("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e8) {
            this.f16986a.c().K().b("Failed to retrieve Play Store version for Install Referrer", e8);
            return false;
        }
    }
}
