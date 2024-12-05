package com.mbridge.msdk.video.module.a.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.a.a.k;
import java.io.File;
import java.util.Map;

/* loaded from: classes4.dex */
public class o extends k {

    /* renamed from: k, reason: collision with root package name */
    protected int f22578k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22579l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22580m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22581n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22582o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22583p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22584q;

    /* renamed from: r, reason: collision with root package name */
    private Map<Integer, String> f22585r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVideoView.a f22586s;

    /* renamed from: t, reason: collision with root package name */
    private int f22587t;

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i8, z8);
        this.f22584q = false;
        this.f22578k = 0;
        this.f22587t = -1;
        if (this.f22541a) {
            this.f22585r = campaignEx.getAdvImpList();
        }
        this.f22578k = campaignEx.getVideoCompleteTime();
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, final Object obj) {
        int i9;
        CampaignEx campaignEx;
        try {
            if (i8 != 2) {
                int i10 = 0;
                if (i8 != 20) {
                    if (i8 != 130) {
                        if (i8 != 6) {
                            if (i8 != 7) {
                                if (i8 != 15) {
                                    if (i8 != 16) {
                                        switch (i8) {
                                            case 11:
                                                com.mbridge.msdk.videocommon.download.b.getInstance().b(false);
                                                d();
                                                break;
                                            case 12:
                                                Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.o.1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object obj2 = obj;
                                                        if (obj2 instanceof String) {
                                                            o.this.a((String) obj2);
                                                        }
                                                    }
                                                };
                                                com.mbridge.msdk.foundation.controller.d.a();
                                                com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
                                                d();
                                                b();
                                                c();
                                                k.AnonymousClass4 anonymousClass4 = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.4
                                                    public AnonymousClass4() {
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        com.mbridge.msdk.videocommon.download.a aVar;
                                                        try {
                                                            if (af.a().a("c_r_v_f_w_s_e", false)) {
                                                                return;
                                                            }
                                                            k kVar = k.this;
                                                            if (kVar.f22541a && (aVar = kVar.f22545e) != null) {
                                                                if (aVar.l() != null && !TextUtils.isEmpty(k.this.f22545e.l().getVideoUrlEncode())) {
                                                                    p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).b(k.this.f22545e.l().getVideoUrlEncode());
                                                                }
                                                                if (!TextUtils.isEmpty(k.this.f22545e.h())) {
                                                                    File file = new File(k.this.f22545e.h());
                                                                    if (file.exists() && file.isFile() && file.delete()) {
                                                                        ad.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e8) {
                                                            e8.printStackTrace();
                                                        }
                                                    }
                                                };
                                                com.mbridge.msdk.foundation.controller.d.a();
                                                com.mbridge.msdk.foundation.same.f.b.b().execute(anonymousClass4);
                                                com.mbridge.msdk.videocommon.download.b.getInstance().b(false);
                                                break;
                                            case 13:
                                                b();
                                                c();
                                                break;
                                        }
                                    }
                                } else {
                                    g();
                                    f();
                                    e();
                                    if (af.a().a("i_l_s_t_r_i", false) && !this.f22582o) {
                                        this.f22582o = true;
                                        MBridgeVideoView.a aVar = this.f22586s;
                                        if (aVar != null) {
                                            aVar.a();
                                        }
                                    }
                                    if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                        int i11 = ((MBridgeVideoView.b) obj).f22509a;
                                        i10 = ((MBridgeVideoView.b) obj).f22510b;
                                        i9 = i11;
                                    } else {
                                        i9 = 0;
                                    }
                                    if (i10 == 0 && (campaignEx = this.f22542b) != null) {
                                        i10 = campaignEx.getVideoLength();
                                    }
                                    com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22542b, i9, i10, this.f22550j);
                                    com.mbridge.msdk.video.module.b.b.a(this.f22542b, this.f22585r, this.f22547g, i9);
                                    if (!this.f22583p) {
                                        this.f22583p = true;
                                        com.mbridge.msdk.video.module.b.b.a(this.f22542b, this.f22547g);
                                    }
                                    if (!this.f22584q) {
                                        int i12 = this.f22578k;
                                        if (i12 != 0) {
                                            i10 = i12;
                                        }
                                        if (i9 >= i10) {
                                            this.f22584q = true;
                                            i8 = 17;
                                        }
                                    }
                                    ad.b("NotifyListener", "onPlayProgress:" + i9);
                                    this.f22587t = i9;
                                }
                            } else if (this.f22541a && obj != null && (obj instanceof Integer)) {
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == 2) {
                                    if (!this.f22580m) {
                                        this.f22580m = true;
                                        com.mbridge.msdk.video.module.b.b.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22542b);
                                    }
                                } else if (intValue == 1 && !this.f22579l) {
                                    this.f22579l = true;
                                    com.mbridge.msdk.video.module.b.b.c(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22542b);
                                }
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f22578k = ((Integer) obj).intValue();
                    }
                } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                    this.f22586s = (MBridgeVideoView.a) obj;
                }
                this.f22549i.a(i8, obj);
            }
            if (this.f22541a && !this.f22581n) {
                this.f22581n = true;
                d();
                com.mbridge.msdk.video.module.b.b.e(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22542b);
            }
            this.f22549i.a(i8, obj);
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }
}
