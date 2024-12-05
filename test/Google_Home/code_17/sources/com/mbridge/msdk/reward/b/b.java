package com.mbridge.msdk.reward.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.reward.b.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final a f22714a;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.f22714a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z8;
        String str;
        int i8;
        int i9 = message.what;
        Object obj = message.obj;
        com.mbridge.msdk.foundation.same.report.d.b a8 = this.f22714a.a(message);
        CopyOnWriteArrayList<CampaignEx> e8 = this.f22714a.e();
        List<CampaignEx> f8 = this.f22714a.f();
        com.mbridge.msdk.reward.adapter.c g8 = this.f22714a.g();
        boolean h8 = this.f22714a.h();
        String j8 = this.f22714a.j();
        String i10 = this.f22714a.i();
        a.c k8 = this.f22714a.k();
        InterVideoOutListener l8 = this.f22714a.l();
        boolean m8 = this.f22714a.m();
        MBridgeIds n8 = this.f22714a.n();
        boolean o8 = this.f22714a.o();
        switch (i9) {
            case 8:
                if (e8 != null && e8.size() > 0) {
                    if (f8 != null && f8.size() > 0) {
                        z8 = !TextUtils.isEmpty(f8.get(0).getCMPTEntryUrl());
                    } else {
                        z8 = false;
                    }
                    int nscpt = e8.get(0).getNscpt();
                    if (g8 != null && g8.a(e8, z8, nscpt)) {
                        if (k8 != null && h8) {
                            k8.a(j8, i10, a8);
                            return;
                        }
                        return;
                    }
                    if (k8 != null && h8) {
                        com.mbridge.msdk.videocommon.a.c(i10);
                        com.mbridge.msdk.videocommon.a.a();
                        com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880010, "load timeout");
                        if (a8 != null) {
                            a8.a(b8);
                        }
                        k8.a(b8, a8);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (l8 != null && h8) {
                    if (m8) {
                        this.f22714a.c();
                    }
                    l8.onVideoLoadSuccess(n8);
                    return;
                }
                return;
            case 16:
            case 18:
                if (l8 != null && h8) {
                    if (obj instanceof String) {
                        str = obj.toString();
                    } else {
                        str = "";
                    }
                    if (a8 != null && a8.o() != null) {
                        str = a8.o().b();
                    }
                    com.mbridge.msdk.videocommon.a.c(i10);
                    com.mbridge.msdk.videocommon.a.a();
                    if (m8) {
                        this.f22714a.c();
                    }
                    l8.onVideoLoadFail(n8, str);
                    return;
                }
                return;
            case 17:
                if (l8 != null && h8) {
                    if (m8) {
                        this.f22714a.c();
                    }
                    l8.onLoadSuccess(n8);
                    return;
                }
                return;
            case 1001001:
                com.mbridge.msdk.foundation.same.report.d.c a9 = com.mbridge.msdk.foundation.same.report.d.c.a();
                if (o8) {
                    i8 = 287;
                } else {
                    i8 = 94;
                }
                this.f22714a.a(false, a9.a(0, i8, i10, true, 1));
                return;
            case 1001002:
                if (g8 != null) {
                    if (g8.b()) {
                        if (k8 != null) {
                            CopyOnWriteArrayList<CampaignEx> d8 = g8.d();
                            if (d8 != null && d8.size() == 0) {
                                d8 = g8.e();
                            }
                            this.f22714a.a(d8);
                            com.mbridge.msdk.foundation.same.report.d.b a10 = this.f22714a.a(d8, a8);
                            if (a10 != null) {
                                a10.b(d8);
                            }
                            k8.b(j8, i10, a10);
                            return;
                        }
                        return;
                    }
                    if (g8.h(false)) {
                        if (g8.b()) {
                            if (k8 != null) {
                                g8.f(false);
                                CopyOnWriteArrayList<CampaignEx> d9 = g8.d();
                                if (d9 != null && d9.size() == 0) {
                                    d9 = g8.e();
                                }
                                this.f22714a.a(d9);
                                com.mbridge.msdk.foundation.same.report.d.b a11 = this.f22714a.a(d9, a8);
                                if (a11 != null) {
                                    a11.b(d9);
                                }
                                k8.b(j8, i10, a11);
                                return;
                            }
                            return;
                        }
                        g8.g(false);
                        if (g8.h(true)) {
                            if (g8.b()) {
                                if (k8 != null) {
                                    g8.f(true);
                                    CopyOnWriteArrayList<CampaignEx> d10 = g8.d();
                                    if (d10 != null && d10.size() == 0) {
                                        d10 = g8.e();
                                    }
                                    this.f22714a.a(d10);
                                    com.mbridge.msdk.foundation.same.report.d.b a12 = this.f22714a.a(d10, a8);
                                    if (a12 != null) {
                                        a12.b(d10);
                                    }
                                    k8.b(j8, i10, a12);
                                    return;
                                }
                                return;
                            }
                            g8.g(true);
                            return;
                        }
                        return;
                    }
                    if (g8.h(true)) {
                        if (g8.b()) {
                            if (k8 != null) {
                                g8.f(true);
                                CopyOnWriteArrayList<CampaignEx> d11 = g8.d();
                                if (d11 != null && d11.size() == 0) {
                                    d11 = g8.e();
                                }
                                this.f22714a.a(d11);
                                com.mbridge.msdk.foundation.same.report.d.b a13 = this.f22714a.a(d11, a8);
                                if (a13 != null) {
                                    a13.b(d11);
                                }
                                k8.b(j8, i10, a13);
                                return;
                            }
                            return;
                        }
                        g8.g(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
