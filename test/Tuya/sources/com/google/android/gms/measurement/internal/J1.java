package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h7;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
final class J1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.V f16178a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f16179b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K1 f16180c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(K1 k12, com.google.android.gms.internal.measurement.V v8, ServiceConnection serviceConnection) {
        this.f16180c = k12;
        this.f16178a = v8;
        this.f16179b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        K1 k12 = this.f16180c;
        L1 l12 = k12.f16195b;
        str = k12.f16194a;
        com.google.android.gms.internal.measurement.V v8 = this.f16178a;
        ServiceConnection serviceConnection = this.f16179b;
        l12.f16212a.f().h();
        Bundle bundle2 = new Bundle();
        bundle2.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, str);
        try {
            bundle = v8.H(bundle2);
        } catch (Exception e8) {
            l12.f16212a.d().r().b("Exception occurred while retrieving the Install Referrer", e8.getMessage());
        }
        if (bundle == null) {
            l12.f16212a.d().r().a("Install Referrer Service returned a null response");
            bundle = null;
        }
        l12.f16212a.f().h();
        Y1.t();
        if (bundle != null) {
            long j8 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j8 == 0) {
                l12.f16212a.d().w().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    l12.f16212a.d().v().b("InstallReferrer API result", string);
                    y4 N8 = l12.f16212a.N();
                    Uri parse = Uri.parse("?".concat(string));
                    h7.c();
                    Bundle v02 = N8.v0(parse, l12.f16212a.z().B(null, AbstractC2217k1.f16631y0));
                    if (v02 == null) {
                        l12.f16212a.d().r().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = v02.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j9 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j9 == 0) {
                                l12.f16212a.d().r().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                v02.putLong("click_timestamp", j9);
                            }
                        }
                        if (j8 == l12.f16212a.F().f16150f.a()) {
                            l12.f16212a.d().v().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (l12.f16212a.o()) {
                            l12.f16212a.F().f16150f.b(j8);
                            l12.f16212a.d().v().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            v02.putString("_cis", "referrer API v2");
                            l12.f16212a.I().t("auto", "_cmp", v02, str);
                        }
                    }
                } else {
                    l12.f16212a.d().r().a("No referrer defined in Install Referrer response");
                }
            }
        }
        V.b.b().c(l12.f16212a.c(), serviceConnection);
    }
}
