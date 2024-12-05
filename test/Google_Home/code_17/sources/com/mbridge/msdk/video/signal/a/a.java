package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* renamed from: j, reason: collision with root package name */
    protected String f23655j;

    /* renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.d.c f23656k;

    /* renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f23657l;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f23646a = false;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f23647b = false;

    /* renamed from: c, reason: collision with root package name */
    protected int f23648c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f23649d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f23650e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f23651f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f23652g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f23653h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f23654i = -1;

    /* renamed from: m, reason: collision with root package name */
    public a.InterfaceC0433a f23658m = new C0434a();

    /* renamed from: n, reason: collision with root package name */
    protected int f23659n = 2;

    /* renamed from: com.mbridge.msdk.video.signal.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0434a implements a.InterfaceC0433a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public void a() {
            ad.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public void b() {
            ad.a("DefaultJSCommon", "videoLocationReady");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i8) {
            ad.a("DefaultJSCommon", "onDownloadProgress,progress:" + i8);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            ad.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public void a(boolean z8) {
            ad.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public void a(int i8, String str) {
            ad.a("DefaultJSCommon", "onH5Error,code:" + i8 + "，msg:" + str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(int i8) {
        this.f23659n = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(int i8) {
        this.f23649d = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void c(int i8) {
        this.f23648c = i8;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i8, String str) {
        ad.a("DefaultJSCommon", "click:type" + i8 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void d(int i8) {
        this.f23650e = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e(int i8) {
        this.f23652g = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int g() {
        return this.f23654i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void h(int i8) {
        ad.a("DefaultJSCommon", "setAlertDialogRole " + i8);
        this.f23653h = i8;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i8, String str) {
        ad.a("DefaultJSCommon", "handlerH5Exception,code=" + i8 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    public final int j() {
        if (this.f23648c == 0 && this.f23647b) {
            this.f23648c = 1;
        }
        return this.f23648c;
    }

    public final int k() {
        if (this.f23649d == 0 && this.f23647b) {
            this.f23649d = 1;
        }
        return this.f23649d;
    }

    public final int l() {
        if (this.f23650e == 0 && this.f23647b) {
            this.f23650e = 1;
        }
        return this.f23650e;
    }

    public final boolean m() {
        return this.f23647b;
    }

    /* loaded from: classes4.dex */
    public static class b implements a.InterfaceC0433a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f23660a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0433a f23661b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0433a interfaceC0433a) {
            this.f23660a = dVar;
            this.f23661b = interfaceC0433a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a() {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void b() {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.b();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDismissLoading(Campaign campaign) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadProgress(int i8) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onDownloadProgress(i8);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadStart(Campaign campaign) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f23660a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null && interfaceC0433a.onInterceptDefaultLoadingDialog()) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f23660a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onShowLoading(Campaign campaign) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a(boolean z8) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.a(z8);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0433a
        public final void a(int i8, String str) {
            a.InterfaceC0433a interfaceC0433a = this.f23661b;
            if (interfaceC0433a != null) {
                interfaceC0433a.a(i8, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int a() {
        return this.f23652g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final boolean b() {
        return this.f23646a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        ad.a("DefaultJSCommon", "init");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d() {
        ad.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e() {
        ad.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f23657l;
        if (aVar != null) {
            aVar.a(false);
            this.f23657l.a((NativeListener.NativeTrackingListener) null);
            this.f23657l.a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void f(int i8) {
        this.f23654i = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g(int i8) {
        ad.a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(boolean z8) {
        ad.a("DefaultJSCommon", "setIsShowingTransparent:" + z8);
        this.f23647b = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(boolean z8) {
        this.f23646a = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int h() {
        ad.a("DefaultJSCommon", "getAlertDialogRole " + this.f23653h);
        return this.f23653h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(String str) {
        ad.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(String str) {
        ad.a("DefaultJSCommon", "setUnitId:" + str);
        this.f23655j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(a.InterfaceC0433a interfaceC0433a) {
        ad.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0433a);
        this.f23658m = interfaceC0433a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        ad.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f23656k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i8, String str) {
        ad.a("DefaultJSCommon", "statistics,type:" + i8 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(Activity activity) {
        ad.a("DefaultJSCommon", "setActivity ");
    }
}
