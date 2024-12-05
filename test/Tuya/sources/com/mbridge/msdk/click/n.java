package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final class n extends e implements a.InterfaceC0401a {

    /* renamed from: a, reason: collision with root package name */
    private f f18198a;

    /* renamed from: b, reason: collision with root package name */
    private JumpLoaderResult f18199b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18201d;

    /* renamed from: e, reason: collision with root package name */
    private Context f18202e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f18203f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f18204g;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18200c = true;

    /* renamed from: h, reason: collision with root package name */
    private Handler f18205h = new Handler(Looper.getMainLooper());

    public n(Context context) {
        this.f18202e = context;
        this.f18203f = new com.mbridge.msdk.foundation.same.e.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, f fVar, boolean z8, String str2, String str3, CampaignEx campaignEx, boolean z9, boolean z10, int i8) {
        a aVar;
        this.f18198a = fVar;
        this.f18201d = z8;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f18202e);
        bVar.a(str);
        bVar.c(z8);
        bVar.b(str2);
        bVar.c(str3);
        bVar.a(campaignEx);
        bVar.a(z9);
        bVar.b(z10);
        bVar.a(i8);
        if (str.startsWith("tcp")) {
            k kVar = new k(bVar);
            kVar.a(this.f18198a);
            kVar.a(new j() { // from class: com.mbridge.msdk.click.n.1
                @Override // com.mbridge.msdk.click.j
                public final void a(JumpLoaderResult jumpLoaderResult) {
                    n.this.f18199b = jumpLoaderResult;
                }
            });
            aVar = kVar;
        } else {
            aVar = new a(this.f18202e, str, str2, str3, campaignEx, z9, z10, i8);
        }
        this.f18203f.a(aVar, this);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f18200c = false;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0401a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f18200c) {
            this.f18205h.post(new Runnable() { // from class: com.mbridge.msdk.click.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.f18198a != null) {
                        if (n.this.f18199b.isSuccess()) {
                            n.this.f18198a.b(n.this.f18199b);
                        } else {
                            n.this.f18198a.a(n.this.f18199b, n.this.f18199b.getMsg());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f18210c;

        /* renamed from: d, reason: collision with root package name */
        private String f18211d;

        /* renamed from: e, reason: collision with root package name */
        private String f18212e;

        /* renamed from: f, reason: collision with root package name */
        private String f18213f;

        /* renamed from: g, reason: collision with root package name */
        private CampaignEx f18214g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f18215h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f18216i;

        /* renamed from: j, reason: collision with root package name */
        private int f18217j;

        /* renamed from: b, reason: collision with root package name */
        private final Semaphore f18209b = new Semaphore(0);

        /* renamed from: k, reason: collision with root package name */
        private m.a f18218k = new m.a() { // from class: com.mbridge.msdk.click.n.a.1
            @Override // com.mbridge.msdk.click.m.a
            public final boolean a(String str) {
                boolean a8 = a.a(a.this, str);
                if (a8) {
                    a();
                }
                return a8;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean b(String str) {
                boolean a8 = a.a(a.this, str);
                if (a8) {
                    a();
                }
                return a8;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean c(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(String str, boolean z8, String str2) {
                a.a(a.this, str);
                n.this.f18199b.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(int i8, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    n.this.f18199b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    n.this.f18199b.setContent(str3);
                }
                a.a(a.this, str);
                a();
            }

            private void a() {
                synchronized (n.this) {
                    n.this.f18199b.setSuccess(true);
                    a.a(a.this);
                }
            }
        };

        public a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z8, boolean z9, int i8) {
            this.f18210c = context;
            this.f18211d = str;
            this.f18212e = str2;
            this.f18213f = str3;
            this.f18214g = campaignEx;
            this.f18215h = z8;
            this.f18216i = z9;
            this.f18217j = i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01f0 A[EDGE_INSN: B:85:0x01f0->B:34:0x01f0 BREAK  A[LOOP:0: B:16:0x005a->B:58:0x01e9], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                Method dump skipped, instructions count: 497
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.n.a.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            if (n.this.f18198a != null) {
                n.this.f18198a.a(null);
            }
            n.this.f18199b = new JumpLoaderResult();
            n.this.f18199b.setUrl(this.f18211d);
            n.this.f18199b = a(this.f18211d, this.f18215h, this.f18216i, this.f18214g, this.f18217j);
            if (!TextUtils.isEmpty(n.this.f18199b.getExceptionMsg())) {
                n.this.f18199b.setSuccess(true);
            }
            if (!n.this.f18200c || !n.this.f18199b.isSuccess()) {
                return;
            }
            if (n.this.f18204g != null) {
                n.this.f18199b.setStatusCode(n.this.f18204g.f18126f);
            }
            CampaignEx campaignEx = this.f18214g;
            JumpLoaderResult jumpLoaderResult = n.this.f18199b;
            com.mbridge.msdk.click.entity.a aVar = n.this.f18204g;
            String str = this.f18212e;
            String str2 = this.f18213f;
            Context context = this.f18210c;
            m.a aVar2 = this.f18218k;
            Semaphore semaphore = this.f18209b;
            if (!ah.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f18126f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                jumpLoaderResult.setType(2);
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    new m().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), aVar2);
                } else {
                    try {
                        new m().a(str, str2, context, jumpLoaderResult.getUrl(), aVar2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WebViewSpiderLoaderDiff", e8.getMessage());
                        }
                    }
                }
                semaphore.acquireUninterruptibly();
                return;
            }
            if (aVar != null) {
                jumpLoaderResult.setType(1);
                jumpLoaderResult.setExceptionMsg(aVar.f18128h);
                jumpLoaderResult.setStatusCode(aVar.f18126f);
                jumpLoaderResult.setHeader(aVar.a());
                jumpLoaderResult.setContent(aVar.f18127g);
            }
            o.a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
        }

        private boolean a(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        static /* synthetic */ boolean a(a aVar, String str) {
            return o.a(str, aVar.f18214g, n.this.f18199b);
        }

        static /* synthetic */ void a(a aVar) {
            aVar.f18209b.release();
        }
    }
}
