package com.mbridge.msdk.video.bt.module.b;

import android.content.Context;

/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private h f23029a;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f23030d;

    /* renamed from: e, reason: collision with root package name */
    private String f23031e;

    /* renamed from: f, reason: collision with root package name */
    private String f23032f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23033g;

    /* renamed from: h, reason: collision with root package name */
    private Context f23034h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23035i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23036j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23037k = false;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[Catch: Exception -> 0x0071, TryCatch #0 {Exception -> 0x0071, blocks: (B:3:0x0016, B:5:0x0026, B:7:0x0030, B:9:0x0039, B:10:0x0043, B:12:0x004d, B:14:0x0053, B:16:0x0059, B:18:0x0063, B:21:0x0067, B:23:0x006b), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: Exception -> 0x0071, TryCatch #0 {Exception -> 0x0071, blocks: (B:3:0x0016, B:5:0x0026, B:7:0x0030, B:9:0x0039, B:10:0x0043, B:12:0x004d, B:14:0x0053, B:16:0x0059, B:18:0x0063, B:21:0x0067, B:23:0x006b), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r4, boolean r5, com.mbridge.msdk.videocommon.d.c r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.video.bt.module.b.h r8, java.lang.String r9, java.lang.String r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f23035i = r0
            r3.f23036j = r0
            r3.f23037k = r0
            r3.f23029a = r8
            r3.f23030d = r6
            r3.f23031e = r10
            r3.f23032f = r9
            r3.f23033g = r5
            r3.f23034h = r4
            com.mbridge.msdk.foundation.controller.c r4 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L71
            java.lang.String r4 = r4.k()     // Catch: java.lang.Exception -> L71
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L71
            r8 = 0
            if (r5 != 0) goto L42
            com.mbridge.msdk.c.h r5 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L71
            com.mbridge.msdk.c.g r4 = r5.b(r4)     // Catch: java.lang.Exception -> L71
            if (r4 != 0) goto L37
            com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L71
            com.mbridge.msdk.c.g r4 = com.mbridge.msdk.c.i.a()     // Catch: java.lang.Exception -> L71
        L37:
            if (r4 == 0) goto L42
            long r4 = r4.ac()     // Catch: java.lang.Exception -> L71
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            goto L43
        L42:
            r4 = r8
        L43:
            com.mbridge.msdk.videocommon.d.b r10 = com.mbridge.msdk.videocommon.d.b.a()     // Catch: java.lang.Exception -> L71
            com.mbridge.msdk.videocommon.d.a r10 = r10.b()     // Catch: java.lang.Exception -> L71
            if (r10 == 0) goto L51
            long r8 = r10.f()     // Catch: java.lang.Exception -> L71
        L51:
            if (r7 == 0) goto L71
            boolean r4 = r7.isSpareOffer(r8, r4)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L6b
            r4 = 1
            r7.setSpareOfferFlag(r4)     // Catch: java.lang.Exception -> L71
            int r5 = r6.y()     // Catch: java.lang.Exception -> L71
            if (r5 != r4) goto L67
            r7.setCbt(r4)     // Catch: java.lang.Exception -> L71
            goto L71
        L67:
            r7.setCbt(r0)     // Catch: java.lang.Exception -> L71
            goto L71
        L6b:
            r7.setSpareOfferFlag(r0)     // Catch: java.lang.Exception -> L71
            r7.setCbt(r0)     // Catch: java.lang.Exception -> L71
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.b.d.<init>(android.content.Context, boolean, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.video.bt.module.b.h, java.lang.String, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        super.a(bVar);
        h hVar = this.f23029a;
        if (hVar == null || this.f23035i) {
            return;
        }
        this.f23035i = true;
        this.f23026c = true;
        hVar.a(bVar);
        this.f23029a.a(2, this.f23032f, this.f23031e);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void b(String str, String str2) {
        super.b(str, str2);
        h hVar = this.f23029a;
        if (hVar != null) {
            hVar.b(str, str2);
            this.f23029a.a(6, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
        super.a(bVar, z8, cVar);
        h hVar = this.f23029a;
        if (hVar == null || this.f23037k) {
            return;
        }
        this.f23037k = true;
        hVar.a(7, this.f23032f, this.f23031e);
        this.f23029a.a(bVar, z8, cVar);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z8, int i8) {
        super.a(z8, i8);
        h hVar = this.f23029a;
        if (hVar == null || this.f23037k) {
            return;
        }
        hVar.a(z8, i8);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        super.a(bVar, str);
        h hVar = this.f23029a;
        if (hVar == null || this.f23036j) {
            return;
        }
        this.f23036j = true;
        this.f23026c = true;
        hVar.a(bVar, str);
        this.f23029a.a(4, this.f23032f, this.f23031e);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z8, String str, String str2) {
        super.a(z8, str, str2);
        h hVar = this.f23029a;
        if (hVar != null) {
            hVar.a(z8, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(String str, String str2) {
        super.a(str, str2);
        h hVar = this.f23029a;
        if (hVar != null) {
            hVar.a(str, str2);
            this.f23029a.a(5, str, str2);
        }
    }
}
