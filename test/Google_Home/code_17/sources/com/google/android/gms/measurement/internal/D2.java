package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC2096d0;
import com.google.android.gms.internal.measurement.K7;

/* loaded from: classes3.dex */
final class D2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2096d0 f17000a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f17001b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ B2 f17002c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D2(B2 b22, InterfaceC2096d0 interfaceC2096d0, ServiceConnection serviceConnection) {
        this.f17000a = interfaceC2096d0;
        this.f17001b = serviceConnection;
        this.f17002c = b22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z8;
        B2 b22 = this.f17002c;
        C2 c22 = b22.f16979b;
        str = b22.f16978a;
        InterfaceC2096d0 interfaceC2096d0 = this.f17000a;
        ServiceConnection serviceConnection = this.f17001b;
        Bundle a8 = c22.a(str, interfaceC2096d0);
        c22.f16986a.e().k();
        c22.f16986a.Q();
        if (a8 != null) {
            long j8 = a8.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j8 == 0) {
                c22.f16986a.c().L().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a8.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    c22.f16986a.c().K().b("InstallReferrer API result", string);
                    if (K7.a() && c22.f16986a.z().q(H.f17092U0)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Bundle C8 = c22.f16986a.L().C(Uri.parse("?" + string), z8);
                    if (C8 == null) {
                        c22.f16986a.c().G().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (z8) {
                            if (C8.containsKey("gclid") || C8.containsKey("gbraid")) {
                                long j9 = a8.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j9 > 0) {
                                    C8.putLong("click_timestamp", j9);
                                }
                            }
                        } else {
                            String string2 = C8.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j10 = a8.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j10 == 0) {
                                    c22.f16986a.c().G().a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    C8.putLong("click_timestamp", j10);
                                }
                            }
                        }
                        if (j8 == c22.f16986a.F().f17818h.a()) {
                            c22.f16986a.c().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c22.f16986a.m()) {
                            c22.f16986a.F().f17818h.b(j8);
                            c22.f16986a.c().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            C8.putString("_cis", "referrer API v2");
                            c22.f16986a.H().g0("auto", "_cmp", C8, str);
                        }
                    }
                } else {
                    c22.f16986a.c().G().a("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            U.b.b().c(c22.f16986a.w(), serviceConnection);
        }
    }
}
