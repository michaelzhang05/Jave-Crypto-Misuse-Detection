package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f23027a;

    /* renamed from: d, reason: collision with root package name */
    private String f23028d;

    public c(com.mbridge.msdk.video.bt.module.a.b bVar, String str) {
        this.f23027a = bVar;
        this.f23028d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f23027a != null) {
            ad.a("H5ShowRewardListener", "onAdShow");
            this.f23027a.a(this.f23028d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void b(String str, String str2) {
        if (this.f23027a != null) {
            ad.a("H5ShowRewardListener", "onEndcardShow");
            this.f23027a.c(this.f23028d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
        if (this.f23027a != null) {
            ad.a("H5ShowRewardListener", "onAdClose");
            this.f23027a.a(this.f23028d, z8, cVar);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        if (this.f23027a != null) {
            ad.a("H5ShowRewardListener", "onShowFail");
            this.f23027a.a(this.f23028d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z8, String str, String str2) {
        if (this.f23027a != null) {
            ad.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f23027a.a(this.f23028d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(String str, String str2) {
        if (this.f23027a != null) {
            ad.a("H5ShowRewardListener", "onVideoComplete");
            this.f23027a.b(this.f23028d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(int i8, String str, String str2) {
        if (this.f23027a != null) {
            ad.a("H5ShowRewardListener", "onAutoLoad");
            this.f23027a.a(this.f23028d, i8, str, str2);
        }
    }
}
