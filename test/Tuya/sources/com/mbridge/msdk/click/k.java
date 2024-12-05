package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final class k extends com.mbridge.msdk.foundation.same.e.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f18149b;

    /* renamed from: c, reason: collision with root package name */
    private String f18150c;

    /* renamed from: d, reason: collision with root package name */
    private String f18151d;

    /* renamed from: e, reason: collision with root package name */
    private String f18152e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f18153f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18154g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18155h;

    /* renamed from: i, reason: collision with root package name */
    private int f18156i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18157j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f18158k;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f18159l;

    /* renamed from: m, reason: collision with root package name */
    private f f18160m;

    /* renamed from: n, reason: collision with root package name */
    private j f18161n;

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f18148a = new Semaphore(0);

    /* renamed from: o, reason: collision with root package name */
    private final m.a f18162o = new m.a() { // from class: com.mbridge.msdk.click.k.1
        @Override // com.mbridge.msdk.click.m.a
        public final boolean a(String str) {
            boolean a8 = k.a(k.this, str);
            if (a8) {
                a();
            }
            return a8;
        }

        @Override // com.mbridge.msdk.click.m.a
        public final boolean b(String str) {
            boolean a8 = k.a(k.this, str);
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
            k.a(k.this, str);
            k.this.f18159l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    k.this.f18159l.setSuccess(true);
                    if (k.this.f18161n != null) {
                        k.this.f18161n.a(k.this.f18159l);
                    }
                    k.c(k.this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.click.m.a
        public final void a(int i8, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                k.this.f18159l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                k.this.f18159l.setContent(str3);
            }
            k.a(k.this, str);
            a();
        }
    };

    public k(com.mbridge.msdk.click.entity.b bVar) {
        this.f18149b = bVar.a();
        this.f18150c = bVar.b();
        this.f18151d = bVar.c();
        this.f18152e = bVar.d();
        this.f18153f = bVar.e();
        this.f18154g = bVar.f();
        this.f18155h = bVar.g();
        this.f18156i = bVar.i();
        this.f18157j = bVar.h();
    }

    static /* synthetic */ void c(k kVar) {
        kVar.f18148a.release();
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z8) {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        f fVar = this.f18160m;
        if (fVar != null) {
            fVar.a(null);
        }
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        this.f18159l = jumpLoaderResult;
        jumpLoaderResult.setUrl(this.f18150c);
        JumpLoaderResult a8 = a(this.f18150c);
        this.f18159l = a8;
        if (!TextUtils.isEmpty(a8.getExceptionMsg())) {
            this.f18159l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            j jVar = this.f18161n;
            if (jVar != null) {
                jVar.a(this.f18159l);
                return;
            }
            return;
        }
        if (!this.f18159l.isSuccess()) {
            j jVar2 = this.f18161n;
            if (jVar2 != null) {
                jVar2.a(this.f18159l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f18158k;
        if (aVar != null) {
            this.f18159l.setStatusCode(aVar.f18126f);
        }
        JumpLoaderResult jumpLoaderResult2 = this.f18159l;
        com.mbridge.msdk.click.entity.a aVar2 = this.f18158k;
        String str = this.f18151d;
        String str2 = this.f18152e;
        Context context = this.f18149b;
        m.a aVar3 = this.f18162o;
        j jVar3 = this.f18161n;
        Semaphore semaphore = this.f18148a;
        if (!ah.a.b(jumpLoaderResult2.getUrl()) && 200 == aVar2.f18126f && !TextUtils.isEmpty(jumpLoaderResult2.getContent()) && !jumpLoaderResult2.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            jumpLoaderResult2.setType(2);
            if (!TextUtils.isEmpty(jumpLoaderResult2.getContent())) {
                new m().a(str, str2, context, jumpLoaderResult2.getUrl(), jumpLoaderResult2.getContent(), aVar3);
            } else {
                try {
                    new m().a(str, str2, context, jumpLoaderResult2.getUrl(), aVar3);
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("TAG", "webview spider start error");
                    }
                }
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar2 != null) {
            jumpLoaderResult2.setType(1);
            jumpLoaderResult2.setExceptionMsg(aVar2.f18128h);
            jumpLoaderResult2.setStatusCode(aVar2.f18126f);
            jumpLoaderResult2.setHeader(aVar2.a());
            jumpLoaderResult2.setContent(aVar2.f18127g);
        }
        String url = jumpLoaderResult2.getUrl();
        if (ah.a.b(url)) {
            jumpLoaderResult2.setCode(1);
            jumpLoaderResult2.setUrl(url);
            jumpLoaderResult2.setjumpDone(true);
        } else {
            jumpLoaderResult2.setCode(2);
            jumpLoaderResult2.setUrl(url);
        }
        if (jVar3 != null) {
            jVar3.a(jumpLoaderResult2);
        }
    }

    private String b(String str) {
        if (this.f18157j) {
            String a8 = com.mbridge.msdk.c.b.a(this.f18149b, str);
            if (!TextUtils.isEmpty(a8)) {
                str = str + a8;
            }
        }
        com.mbridge.msdk.f.b.a();
        return str;
    }

    public final void a(f fVar) {
        this.f18160m = fVar;
    }

    public final void a(j jVar) {
        this.f18161n = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a A[EDGE_INSN: B:72:0x016a->B:34:0x016a BREAK  A[LOOP:0: B:11:0x003d->B:53:0x0162], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.k.a(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    static /* synthetic */ boolean a(k kVar, String str) {
        CampaignEx campaignEx = kVar.f18153f;
        JumpLoaderResult jumpLoaderResult = kVar.f18159l;
        if (ah.a.b(jumpLoaderResult.getUrl())) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(str);
            jumpLoaderResult.setjumpDone(true);
            return true;
        }
        jumpLoaderResult.setCode(2);
        jumpLoaderResult.setUrl(str);
        return false;
    }
}
