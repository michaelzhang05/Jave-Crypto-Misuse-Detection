package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* loaded from: classes4.dex */
public final class e extends MBTempContainer.a.C0430a {

    /* renamed from: a, reason: collision with root package name */
    private h f21983a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f21984b;

    public e(com.mbridge.msdk.foundation.same.report.d.b bVar, h hVar) {
        this.f21983a = hVar;
        this.f21984b = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a.C0430a, com.mbridge.msdk.video.bt.module.MBTempContainer.a
    public final void a(String str) {
        super.a(str);
        h hVar = this.f21983a;
        if (hVar != null) {
            hVar.a(this.f21984b, str);
        }
    }
}
