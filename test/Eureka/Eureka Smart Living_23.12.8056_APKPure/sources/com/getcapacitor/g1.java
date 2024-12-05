package com.getcapacitor;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private String f4371a;

    /* renamed from: b, reason: collision with root package name */
    private final f1 f4372b = new f1(null);

    /* renamed from: c, reason: collision with root package name */
    private final com.getcapacitor.a f4373c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f4374d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4375e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4376f;

    /* renamed from: g, reason: collision with root package name */
    private final i0 f4377g;

    /* renamed from: h, reason: collision with root package name */
    private final h f4378h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends d {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f4379f;

        a(String str) {
            this.f4379f = str;
        }

        @Override // com.getcapacitor.g1.d
        public InputStream e(Uri uri) {
            g1 g1Var;
            String path = uri.getPath();
            g1.this.f4378h.B();
            try {
                if (path.startsWith("/_capacitor_content_")) {
                    return g1.this.f4373c.b(uri);
                }
                if (path.startsWith("/_capacitor_file_")) {
                    g1Var = g1.this;
                } else {
                    if (g1.this.f4375e) {
                        return g1.this.f4373c.a(this.f4379f + path);
                    }
                    path = g1.this.f4371a + uri.getPath();
                    g1Var = g1.this;
                }
                return g1Var.f4373c.c(path);
            } catch (IOException unused) {
                l0.c("Unable to open asset URL: " + uri);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    private static abstract class b extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        protected final d f4381a;

        /* renamed from: b, reason: collision with root package name */
        private InputStream f4382b = null;

        public b(d dVar) {
            this.f4381a = dVar;
        }

        private InputStream g() {
            if (this.f4382b == null) {
                this.f4382b = q();
            }
            return this.f4382b;
        }

        @Override // java.io.InputStream
        public int available() {
            InputStream g6 = g();
            if (g6 != null) {
                return g6.available();
            }
            return -1;
        }

        protected abstract InputStream q();

        @Override // java.io.InputStream
        public int read() {
            InputStream g6 = g();
            if (g6 != null) {
                return g6.read();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public long skip(long j6) {
            InputStream g6 = g();
            if (g6 != null) {
                return g6.skip(j6);
            }
            return 0L;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            InputStream g6 = g();
            if (g6 != null) {
                return g6.read(bArr);
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            InputStream g6 = g();
            if (g6 != null) {
                return g6.read(bArr, i6, i7);
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: c, reason: collision with root package name */
        private WebResourceRequest f4383c;

        public c(d dVar, WebResourceRequest webResourceRequest) {
            super(dVar);
            this.f4383c = webResourceRequest;
        }

        @Override // com.getcapacitor.g1.b
        protected InputStream q() {
            return this.f4381a.f(this.f4383c);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        private String f4384a;

        /* renamed from: b, reason: collision with root package name */
        private String f4385b;

        /* renamed from: c, reason: collision with root package name */
        private int f4386c;

        /* renamed from: d, reason: collision with root package name */
        private String f4387d;

        /* renamed from: e, reason: collision with root package name */
        private Map f4388e;

        public d() {
            this(null, null, 200, "OK", null);
        }

        public String a() {
            return this.f4384a;
        }

        public String b() {
            return this.f4387d;
        }

        public Map c() {
            return this.f4388e;
        }

        public int d() {
            return this.f4386c;
        }

        public abstract InputStream e(Uri uri);

        public InputStream f(WebResourceRequest webResourceRequest) {
            return e(webResourceRequest.getUrl());
        }

        public d(String str, String str2, int i6, String str3, Map map) {
            this.f4384a = str;
            this.f4385b = str2;
            this.f4386c = i6;
            this.f4387d = str3;
            map = map == null ? new HashMap() : map;
            map.put("Cache-Control", "no-cache");
            this.f4388e = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(Context context, h hVar, i0 i0Var, ArrayList arrayList, boolean z5) {
        this.f4376f = z5;
        this.f4373c = new com.getcapacitor.a(context.getApplicationContext());
        this.f4374d = arrayList;
        this.f4378h = hVar;
        this.f4377g = i0Var;
    }

    private void e() {
        String str = this.f4371a;
        if (str.indexOf(42) != -1) {
            throw new IllegalArgumentException("assetPath cannot contain the '*' character.");
        }
        a aVar = new a(str);
        Iterator it = this.f4374d.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            r("http", aVar, str2);
            r("https", aVar, str2);
            String D = this.f4378h.D();
            if (!D.equals("http") && !D.equals("https")) {
                r(D, aVar, str2);
            }
        }
    }

    private String g(String str, InputStream inputStream) {
        String str2;
        try {
            str2 = URLConnection.guessContentTypeFromName(str);
            if (str2 != null) {
                try {
                    if (str.endsWith(".js") && str2.equals("image/x-icon")) {
                        l0.a("We shouldn't be here");
                    }
                } catch (Exception e6) {
                    e = e6;
                    l0.e("Unable to get mime type" + str, e);
                    return str2;
                }
            }
            if (str2 != null) {
                return str2;
            }
            if (!str.endsWith(".js") && !str.endsWith(".mjs")) {
                if (str.endsWith(".wasm")) {
                    return "application/wasm";
                }
                str2 = URLConnection.guessContentTypeFromStream(inputStream);
                return str2;
            }
            return "application/javascript";
        } catch (Exception e7) {
            e = e7;
            str2 = null;
        }
    }

    private int h(InputStream inputStream, int i6) {
        try {
            if (inputStream.available() == -1) {
                return 404;
            }
            return i6;
        } catch (IOException unused) {
            return 500;
        }
    }

    private WebResourceResponse i(WebResourceRequest webResourceRequest, d dVar) {
        int i6;
        String path = webResourceRequest.getUrl().getPath();
        if (webResourceRequest.getRequestHeaders().get("Range") != null) {
            c cVar = new c(dVar, webResourceRequest);
            String g6 = g(path, cVar);
            Map c6 = dVar.c();
            try {
                int available = cVar.available();
                String[] split = webResourceRequest.getRequestHeaders().get("Range").split("=")[1].split("-");
                String str = split[0];
                int i7 = available - 1;
                if (split.length > 1) {
                    i7 = Integer.parseInt(split[1]);
                }
                c6.put("Accept-Ranges", "bytes");
                c6.put("Content-Range", "bytes " + str + "-" + i7 + "/" + available);
                i6 = 206;
            } catch (IOException unused) {
                i6 = 404;
            }
            return new WebResourceResponse(g6, dVar.a(), i6, dVar.b(), c6, cVar);
        }
        if (o(webResourceRequest.getUrl()) || n(webResourceRequest.getUrl())) {
            c cVar2 = new c(dVar, webResourceRequest);
            return new WebResourceResponse(g(webResourceRequest.getUrl().getPath(), cVar2), dVar.a(), h(cVar2, dVar.d()), dVar.b(), dVar.c(), cVar2);
        }
        if (path.equals("/cordova.js")) {
            return new WebResourceResponse("application/javascript", dVar.a(), dVar.d(), dVar.b(), dVar.c(), null);
        }
        if (path.equals("/") || (!webResourceRequest.getUrl().getLastPathSegment().contains(".") && this.f4376f)) {
            try {
                String str2 = this.f4371a + "/index.html";
                this.f4378h.B();
                InputStream a6 = this.f4377g.a(this.f4375e ? this.f4373c.a(str2) : this.f4373c.c(str2));
                return new WebResourceResponse("text/html", dVar.a(), h(a6, dVar.d()), dVar.b(), dVar.c(), a6);
            } catch (IOException e6) {
                l0.e("Unable to open index.html", e6);
                return null;
            }
        }
        if ("/favicon.ico".equalsIgnoreCase(path)) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e7) {
                l0.e("favicon handling failed", e7);
            }
        }
        if (path.lastIndexOf(".") < 0) {
            return null;
        }
        String substring = path.substring(path.lastIndexOf("."));
        InputStream cVar3 = new c(dVar, webResourceRequest);
        if (substring.equals(".html")) {
            cVar3 = this.f4377g.a(cVar3);
        }
        InputStream inputStream = cVar3;
        return new WebResourceResponse(g(path, inputStream), dVar.a(), h(inputStream, dVar.d()), dVar.b(), dVar.c(), inputStream);
    }

    private WebResourceResponse j(WebResourceRequest webResourceRequest, d dVar) {
        boolean z5;
        String method = webResourceRequest.getMethod();
        if (!method.equals("GET")) {
            return null;
        }
        try {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            Iterator<Map.Entry<String, String>> it = requestHeaders.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                Map.Entry<String, String> next = it.next();
                if (next.getKey().equalsIgnoreCase("Accept") && next.getValue().toLowerCase().contains("text/html")) {
                    z5 = true;
                    break;
                }
            }
            if (!z5) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            String cookie = CookieManager.getInstance().getCookie(uri);
            if (cookie != null) {
                httpURLConnection.setRequestProperty("Cookie", cookie);
            }
            httpURLConnection.setRequestMethod(method);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            if (webResourceRequest.getUrl().getUserInfo() != null) {
                httpURLConnection.setRequestProperty("Authorization", "Basic " + Base64.encodeToString(webResourceRequest.getUrl().getUserInfo().getBytes(StandardCharsets.UTF_8), 2));
            }
            List<String> list = httpURLConnection.getHeaderFields().get("Set-Cookie");
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    CookieManager.getInstance().setCookie(uri, it2.next());
                }
            }
            return new WebResourceResponse("text/html", dVar.a(), dVar.d(), dVar.b(), dVar.c(), this.f4377g.a(httpURLConnection.getInputStream()));
        } catch (Exception e6) {
            this.f4378h.I(e6);
            return null;
        }
    }

    private boolean m(Uri uri) {
        return this.f4378h.F() != null || this.f4378h.m().a(uri.getHost());
    }

    private boolean n(Uri uri) {
        return uri.toString().equals(this.f4378h.p());
    }

    private boolean o(Uri uri) {
        String path = uri.getPath();
        return path.startsWith("/_capacitor_content_") || path.startsWith("/_capacitor_file_");
    }

    private boolean p(Uri uri) {
        return this.f4378h.F() == null && uri.getHost().equalsIgnoreCase(this.f4378h.q());
    }

    private void r(String str, d dVar, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str);
        builder.authority(str2);
        builder.path("");
        Uri build = builder.build();
        q(Uri.withAppendedPath(build, "/"), dVar);
        q(Uri.withAppendedPath(build, "**"), dVar);
    }

    public String f() {
        return this.f4371a;
    }

    public void k(String str) {
        this.f4375e = true;
        this.f4371a = str;
        e();
    }

    public void l(String str) {
        this.f4375e = false;
        this.f4371a = str;
        e();
    }

    void q(Uri uri, d dVar) {
        synchronized (this.f4372b) {
            this.f4372b.a(uri.getScheme(), uri.getAuthority(), uri.getPath(), dVar);
        }
    }

    public WebResourceResponse s(WebResourceRequest webResourceRequest) {
        d dVar;
        Uri url = webResourceRequest.getUrl();
        synchronized (this.f4372b) {
            dVar = (d) this.f4372b.b(webResourceRequest.getUrl());
        }
        if (dVar == null) {
            return null;
        }
        if (!o(url) && !p(url) && m(url) && !n(url)) {
            return j(webResourceRequest, dVar);
        }
        l0.a("Handling local request: " + webResourceRequest.getUrl().toString());
        return i(webResourceRequest, dVar);
    }
}
