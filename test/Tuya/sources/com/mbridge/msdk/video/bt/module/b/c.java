package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f21972a;

    /* renamed from: d, reason: collision with root package name */
    private String f21973d;

    public c(com.mbridge.msdk.video.bt.module.a.b bVar, String str) {
        this.f21972a = bVar;
        this.f21973d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f21972a != null) {
            ad.a("H5ShowRewardListener", "onAdShow");
            this.f21972a.a(this.f21973d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void b(String str, String str2) {
        if (this.f21972a != null) {
            ad.a("H5ShowRewardListener", "onEndcardShow");
            this.f21972a.c(this.f21973d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
        if (this.f21972a != null) {
            ad.a("H5ShowRewardListener", "onAdClose");
            this.f21972a.a(this.f21973d, z8, cVar);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        if (this.f21972a != null) {
            ad.a("H5ShowRewardListener", "onShowFail");
            this.f21972a.a(this.f21973d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z8, String str, String str2) {
        if (this.f21972a != null) {
            ad.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f21972a.a(this.f21973d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(String str, String str2) {
        if (this.f21972a != null) {
            ad.a("H5ShowRewardListener", "onVideoComplete");
            this.f21972a.b(this.f21973d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(int i8, String str, String str2) {
        if (this.f21972a != null) {
            ad.a("H5ShowRewardListener", "onAutoLoad");
            this.f21972a.a(this.f21973d, i8, str, str2);
        }
    }
}
