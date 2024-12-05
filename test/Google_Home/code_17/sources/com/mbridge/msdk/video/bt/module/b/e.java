package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* loaded from: classes4.dex */
public final class e extends MBTempContainer.a.C0426a {

    /* renamed from: a, reason: collision with root package name */
    private h f23038a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f23039b;

    public e(com.mbridge.msdk.foundation.same.report.d.b bVar, h hVar) {
        this.f23038a = hVar;
        this.f23039b = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a.C0426a, com.mbridge.msdk.video.bt.module.MBTempContainer.a
    public final void a(String str) {
        super.a(str);
        h hVar = this.f23038a;
        if (hVar != null) {
            hVar.a(this.f23039b, str);
        }
    }
}
