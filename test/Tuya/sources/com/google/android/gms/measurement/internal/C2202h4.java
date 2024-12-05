package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2141y1;
import com.google.android.gms.internal.measurement.k7;
import java.util.HashMap;

/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2202h4 extends AbstractC2184e4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2202h4(r4 r4Var) {
        super(r4Var);
    }

    private final String j(String str) {
        String w8 = this.f16482b.Z().w(str);
        if (!TextUtils.isEmpty(w8)) {
            Uri parse = Uri.parse((String) AbstractC2217k1.f16618s.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(w8 + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) AbstractC2217k1.f16618s.a(null);
    }

    public final C2196g4 i(String str) {
        String str2;
        k7.c();
        C2196g4 c2196g4 = null;
        if (this.f16777a.z().B(null, AbstractC2217k1.f16619s0)) {
            this.f16777a.d().v().a("sgtm feature flag enabled.");
            C2268u2 R8 = this.f16482b.V().R(str);
            if (R8 == null) {
                return new C2196g4(j(str));
            }
            if (R8.Q()) {
                this.f16777a.d().v().a("sgtm upload enabled in manifest.");
                C2141y1 t8 = this.f16482b.Z().t(R8.l0());
                if (t8 != null) {
                    String M8 = t8.M();
                    if (!TextUtils.isEmpty(M8)) {
                        String K8 = t8.K();
                        C2257s1 v8 = this.f16777a.d().v();
                        if (true != TextUtils.isEmpty(K8)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        v8.c("sgtm configured with upload_url, server_info", M8, str2);
                        if (TextUtils.isEmpty(K8)) {
                            this.f16777a.b();
                            c2196g4 = new C2196g4(M8);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", K8);
                            c2196g4 = new C2196g4(M8, hashMap);
                        }
                    }
                }
            }
            if (c2196g4 != null) {
                return c2196g4;
            }
        }
        return new C2196g4(j(str));
    }
}
