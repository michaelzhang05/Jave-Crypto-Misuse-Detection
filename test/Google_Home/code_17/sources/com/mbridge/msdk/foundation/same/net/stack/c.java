package com.mbridge.msdk.foundation.same.net.stack;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.net.dns.MBDns;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.thrid.okhttp.ConnectionPool;
import com.mbridge.msdk.thrid.okhttp.Dispatcher;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a */
    private String f20838a;

    /* renamed from: b */
    private OkHttpClient f20839b;

    /* renamed from: c */
    private g f20840c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.stack.c$1 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends EventListener {
        AnonymousClass1() {
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.stack.c$2 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ b f20842a;

        AnonymousClass2(b bVar) {
            r2 = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                StringBuilder sb = new StringBuilder("key=2000102&");
                sb.append("app_id=");
                sb.append(com.mbridge.msdk.foundation.controller.c.m().k());
                sb.append("&");
                sb.append("status=");
                sb.append(r2.f20856k);
                sb.append("&");
                sb.append("domain=");
                sb.append(r2.f20853h);
                sb.append("&");
                sb.append("method=");
                sb.append(r2.f20855j);
                sb.append("&");
                if (TextUtils.isEmpty(r2.f20852g)) {
                    if (!TextUtils.isEmpty(r2.f20847b)) {
                        sb.append("connect_e=");
                        sb.append(r2.f20847b);
                    } else if (!TextUtils.isEmpty(r2.f20849d)) {
                        sb.append("connect_e=");
                        sb.append(r2.f20849d);
                    }
                } else {
                    sb.append("dns_r=");
                    sb.append(r2.f20852g);
                    sb.append("&");
                    sb.append("dns_d=");
                    sb.append(r2.f20851f);
                    sb.append("&");
                    sb.append("host=");
                    sb.append(r2.f20854i);
                    sb.append("&");
                    if (TextUtils.isEmpty(r2.f20849d)) {
                        if (TextUtils.isEmpty(r2.f20847b)) {
                            sb.append("call_d=");
                            sb.append(r2.f20846a);
                            sb.append("&");
                            sb.append("connect_d=");
                            sb.append(r2.f20848c);
                            sb.append("&");
                            sb.append("connection_d=");
                            sb.append(r2.f20850e);
                        } else {
                            sb.append("connect_d=");
                            sb.append(r2.f20848c);
                            sb.append("&");
                            sb.append("connection_e=");
                            sb.append(r2.f20847b);
                        }
                    } else if (!TextUtils.isEmpty(r2.f20849d)) {
                        sb.append("connect_e=");
                        sb.append(r2.f20849d);
                    } else if (!TextUtils.isEmpty(r2.f20847b)) {
                        sb.append("connect_e=");
                        sb.append(r2.f20847b);
                    }
                }
                if (e.a().b()) {
                    e.a().a(sb.toString());
                    return;
                }
                c cVar = c.this;
                String sb2 = sb.toString();
                Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(c8);
                com.mbridge.msdk.foundation.same.net.h.e a8 = k.a(c8);
                a8.a(DataSchemeDataSource.SCHEME_DATA, URLEncoder.encode(sb2, "utf-8"));
                a8.a("m_sdk", "msdk");
                aVar.post(0, d.f().f20751c, a8, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.net.stack.c.3
                    AnonymousClass3() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str) {
                        ad.a("OKHTTPClientManager", "report failed");
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str) {
                        ad.a("OKHTTPClientManager", "report success");
                    }
                });
            } catch (Exception e8) {
                ad.b("OKHTTPClientManager", e8.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.stack.c$3 */
    /* loaded from: classes4.dex */
    final class AnonymousClass3 extends com.mbridge.msdk.foundation.same.report.e.b {
        AnonymousClass3() {
        }

        @Override // com.mbridge.msdk.foundation.same.report.e.b
        public final void onFailed(String str) {
            ad.a("OKHTTPClientManager", "report failed");
        }

        @Override // com.mbridge.msdk.foundation.same.report.e.b
        public final void onSuccess(String str) {
            ad.a("OKHTTPClientManager", "report success");
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private static final c f20845a = new c();

        public static /* synthetic */ c a() {
            return f20845a;
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements Serializable {

        /* renamed from: a */
        public long f20846a = 0;

        /* renamed from: b */
        public String f20847b = "";

        /* renamed from: c */
        public long f20848c = 0;

        /* renamed from: d */
        public String f20849d = "";

        /* renamed from: e */
        public long f20850e = 0;

        /* renamed from: f */
        public long f20851f = 0;

        /* renamed from: g */
        public String f20852g = "";

        /* renamed from: h */
        public String f20853h = "";

        /* renamed from: i */
        public String f20854i = "";

        /* renamed from: j */
        public String f20855j = "";

        /* renamed from: k */
        public int f20856k;

        public static b a(b bVar) {
            b bVar2 = new b();
            bVar2.f20856k = bVar.f20856k;
            bVar2.f20855j = bVar.f20855j;
            bVar2.f20853h = bVar.f20853h;
            bVar2.f20846a = bVar.f20846a;
            bVar2.f20848c = bVar.f20848c;
            bVar2.f20847b = bVar.f20847b;
            bVar2.f20852g = bVar.f20852g;
            bVar2.f20851f = bVar.f20851f;
            bVar2.f20854i = bVar.f20854i;
            bVar2.f20849d = bVar.f20849d;
            bVar2.f20850e = bVar.f20850e;
            return bVar2;
        }
    }

    /* synthetic */ c(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static c a() {
        return a.f20845a;
    }

    public final synchronized OkHttpClient b() {
        try {
            if (this.f20839b == null) {
                Dispatcher dispatcher = new Dispatcher();
                dispatcher.setMaxRequestsPerHost(50);
                dispatcher.setMaxRequests(256);
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builder.readTimeout(100L, timeUnit);
                builder.connectTimeout(60L, timeUnit);
                builder.writeTimeout(60L, timeUnit);
                builder.connectionPool(new ConnectionPool(32, 5L, TimeUnit.MINUTES));
                builder.dispatcher(dispatcher);
                builder.eventListener(new EventListener() { // from class: com.mbridge.msdk.foundation.same.net.stack.c.1
                    AnonymousClass1() {
                    }
                });
                builder.dns(new MBDns());
                this.f20839b = builder.build();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20839b;
    }

    public final b c() {
        b bVar = new b();
        bVar.f20853h = this.f20838a;
        return bVar;
    }

    private c() {
        this.f20838a = "";
        this.f20839b = null;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f20840c == null) {
                this.f20840c = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
            }
            g gVar = this.f20840c;
            if (gVar == null) {
                return false;
            }
            String H8 = gVar.H();
            String str2 = d.f().f20751c;
            if (TextUtils.isEmpty(H8) || !str.startsWith(H8) || TextUtils.equals(H8, str2)) {
                return false;
            }
            this.f20838a = H8;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a(b bVar) {
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.stack.c.2

            /* renamed from: a */
            final /* synthetic */ b f20842a;

            AnonymousClass2(b bVar2) {
                r2 = bVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    StringBuilder sb = new StringBuilder("key=2000102&");
                    sb.append("app_id=");
                    sb.append(com.mbridge.msdk.foundation.controller.c.m().k());
                    sb.append("&");
                    sb.append("status=");
                    sb.append(r2.f20856k);
                    sb.append("&");
                    sb.append("domain=");
                    sb.append(r2.f20853h);
                    sb.append("&");
                    sb.append("method=");
                    sb.append(r2.f20855j);
                    sb.append("&");
                    if (TextUtils.isEmpty(r2.f20852g)) {
                        if (!TextUtils.isEmpty(r2.f20847b)) {
                            sb.append("connect_e=");
                            sb.append(r2.f20847b);
                        } else if (!TextUtils.isEmpty(r2.f20849d)) {
                            sb.append("connect_e=");
                            sb.append(r2.f20849d);
                        }
                    } else {
                        sb.append("dns_r=");
                        sb.append(r2.f20852g);
                        sb.append("&");
                        sb.append("dns_d=");
                        sb.append(r2.f20851f);
                        sb.append("&");
                        sb.append("host=");
                        sb.append(r2.f20854i);
                        sb.append("&");
                        if (TextUtils.isEmpty(r2.f20849d)) {
                            if (TextUtils.isEmpty(r2.f20847b)) {
                                sb.append("call_d=");
                                sb.append(r2.f20846a);
                                sb.append("&");
                                sb.append("connect_d=");
                                sb.append(r2.f20848c);
                                sb.append("&");
                                sb.append("connection_d=");
                                sb.append(r2.f20850e);
                            } else {
                                sb.append("connect_d=");
                                sb.append(r2.f20848c);
                                sb.append("&");
                                sb.append("connection_e=");
                                sb.append(r2.f20847b);
                            }
                        } else if (!TextUtils.isEmpty(r2.f20849d)) {
                            sb.append("connect_e=");
                            sb.append(r2.f20849d);
                        } else if (!TextUtils.isEmpty(r2.f20847b)) {
                            sb.append("connect_e=");
                            sb.append(r2.f20847b);
                        }
                    }
                    if (e.a().b()) {
                        e.a().a(sb.toString());
                        return;
                    }
                    c cVar = c.this;
                    String sb2 = sb.toString();
                    Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                    com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(c8);
                    com.mbridge.msdk.foundation.same.net.h.e a8 = k.a(c8);
                    a8.a(DataSchemeDataSource.SCHEME_DATA, URLEncoder.encode(sb2, "utf-8"));
                    a8.a("m_sdk", "msdk");
                    aVar.post(0, d.f().f20751c, a8, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.net.stack.c.3
                        AnonymousClass3() {
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str) {
                            ad.a("OKHTTPClientManager", "report failed");
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str) {
                            ad.a("OKHTTPClientManager", "report success");
                        }
                    });
                } catch (Exception e8) {
                    ad.b("OKHTTPClientManager", e8.getMessage());
                }
            }
        });
    }
}
