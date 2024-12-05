package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.u8;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import l0.EnumC3259B;

/* loaded from: classes3.dex */
public final class E5 extends C5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public E5(I5 i52) {
        super(i52);
    }

    private final String t(String str) {
        String R8 = o().R(str);
        if (!TextUtils.isEmpty(R8)) {
            Uri parse = Uri.parse((String) H.f17152r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(R8 + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) H.f17152r.a(null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ W5 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ g6 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2392m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2356g5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E5 q() {
        return super.q();
    }

    public final G5 r(String str) {
        C2485z2 L02;
        String str2;
        if (u8.a() && a().q(H.f17165x0)) {
            h();
            if (a6.H0(str)) {
                c().K().a("sgtm feature flag enabled.");
                C2485z2 L03 = n().L0(str);
                if (L03 == null) {
                    return new G5(t(str), EnumC3259B.GOOGLE_ANALYTICS);
                }
                String m8 = L03.m();
                com.google.android.gms.internal.measurement.Y1 L8 = o().L(str);
                if (L8 != null && (L02 = n().L0(str)) != null && ((L8.Z() && L8.P().j() == 100) || h().E0(str, L02.v()) || (!TextUtils.isEmpty(m8) && m8.hashCode() % 100 < L8.P().j()))) {
                    G5 g52 = null;
                    if (L03.C()) {
                        c().K().a("sgtm upload enabled in manifest.");
                        com.google.android.gms.internal.measurement.Y1 L9 = o().L(L03.l());
                        if (L9 != null && L9.Z()) {
                            String J8 = L9.P().J();
                            if (!TextUtils.isEmpty(J8)) {
                                String I8 = L9.P().I();
                                C2381k2 K8 = c().K();
                                if (TextUtils.isEmpty(I8)) {
                                    str2 = "Y";
                                } else {
                                    str2 = "N";
                                }
                                K8.c("sgtm configured with upload_url, server_info", J8, str2);
                                if (TextUtils.isEmpty(I8)) {
                                    g52 = new G5(J8, EnumC3259B.SGTM);
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("x-sgtm-server-info", I8);
                                    if (!TextUtils.isEmpty(L03.v())) {
                                        hashMap.put("x-gtm-server-preview", L03.v());
                                    }
                                    g52 = new G5(J8, hashMap, EnumC3259B.SGTM);
                                }
                            }
                        }
                    }
                    if (g52 != null) {
                        return g52;
                    }
                } else {
                    return new G5(t(str), EnumC3259B.GOOGLE_ANALYTICS);
                }
            }
        }
        return new G5(t(str), EnumC3259B.GOOGLE_ANALYTICS);
    }

    public final String s(C2485z2 c2485z2) {
        Uri.Builder builder = new Uri.Builder();
        String q8 = c2485z2.q();
        if (TextUtils.isEmpty(q8)) {
            q8 = c2485z2.j();
        }
        builder.scheme((String) H.f17118f.a(null)).encodedAuthority((String) H.f17121g.a(null)).path("config/app/" + q8).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "102001").appendQueryParameter("runtime_version", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        return builder.build().toString();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }
}
