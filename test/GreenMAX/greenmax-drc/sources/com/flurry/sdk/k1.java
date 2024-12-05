package com.flurry.sdk;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class k1 extends g2 {
    private boolean B;
    boolean F;
    public String l;
    public c m;
    private int p;
    private int q;
    d s;
    HttpURLConnection t;
    boolean u;
    boolean v;
    private boolean w;
    private Exception z;

    /* renamed from: i, reason: collision with root package name */
    private final z0<String, String> f9975i = new z0<>();

    /* renamed from: j, reason: collision with root package name */
    private final z0<String, String> f9976j = new z0<>();

    /* renamed from: k, reason: collision with root package name */
    final Object f9977k = new Object();
    private int n = 10000;
    private int o = 15000;
    private boolean r = true;
    long x = -1;
    private long y = -1;
    public int A = -1;
    private int C = 25000;
    public boolean D = false;
    private j1 E = new j1(this);

    /* loaded from: classes2.dex */
    final class a extends Thread {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                HttpURLConnection httpURLConnection = k1.this.t;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.kPost.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.kPut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.kDelete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.kHead.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.kGet.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        kUnknown,
        kGet,
        kPost,
        kPut,
        kDelete,
        kHead;

        @Override // java.lang.Enum
        public final String toString() {
            int i2 = b.a[ordinal()];
            if (i2 == 1) {
                return "POST";
            }
            if (i2 == 2) {
                return "PUT";
            }
            if (i2 == 3) {
                return "DELETE";
            }
            if (i2 == 4) {
                return "HEAD";
            }
            if (i2 != 5) {
                return null;
            }
            return "GET";
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void b(InputStream inputStream) throws Exception;

        void c(OutputStream outputStream) throws Exception;
    }

    private void e() throws Exception {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        OutputStream outputStream;
        InputStream inputStream;
        InputStream errorStream;
        BufferedInputStream bufferedInputStream;
        if (this.v) {
            return;
        }
        String str = this.l;
        if (!TextUtils.isEmpty(str) && Uri.parse(str).getScheme() == null) {
            str = "http://".concat(String.valueOf(str));
        }
        this.l = str;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.l).openConnection();
            this.t = httpURLConnection;
            httpURLConnection.setConnectTimeout(this.n);
            this.t.setReadTimeout(this.o);
            this.t.setRequestMethod(this.m.toString());
            this.t.setInstanceFollowRedirects(this.r);
            this.t.setDoOutput(c.kPost.equals(this.m));
            this.t.setDoInput(true);
            TrafficStats.setThreadStatsTag(1234);
            for (Map.Entry<String, String> entry : this.f9975i.a()) {
                this.t.addRequestProperty(entry.getKey(), entry.getValue());
            }
            if (!c.kGet.equals(this.m) && !c.kPost.equals(this.m)) {
                this.t.setRequestProperty("Accept-Encoding", HttpUrl.FRAGMENT_ENCODE_SET);
            }
            if (this.v) {
                return;
            }
            if (this.D) {
                HttpURLConnection httpURLConnection2 = this.t;
                if (httpURLConnection2 instanceof HttpsURLConnection) {
                    httpURLConnection2.connect();
                    l1.b((HttpsURLConnection) this.t);
                }
            }
            BufferedInputStream bufferedInputStream2 = null;
            if (c.kPost.equals(this.m)) {
                try {
                    outputStream = this.t.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(outputStream);
                        try {
                            if (this.s != null && !d()) {
                                this.s.c(bufferedOutputStream);
                            }
                            c2.f(bufferedOutputStream);
                            c2.f(outputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            c2.f(bufferedOutputStream);
                            c2.f(outputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        bufferedOutputStream = null;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    bufferedOutputStream = null;
                    th = th4;
                    outputStream = null;
                }
            }
            if (this.w) {
                this.x = System.currentTimeMillis();
            }
            if (this.B) {
                this.E.b(this.C);
            }
            this.A = this.t.getResponseCode();
            if (this.w && this.x != -1) {
                this.y = System.currentTimeMillis() - this.x;
            }
            this.E.a();
            for (Map.Entry<String, List<String>> entry2 : this.t.getHeaderFields().entrySet()) {
                Iterator<String> it = entry2.getValue().iterator();
                while (it.hasNext()) {
                    this.f9976j.c(entry2.getKey(), it.next());
                }
            }
            if (c.kGet.equals(this.m) || c.kPost.equals(this.m)) {
                if (this.v) {
                    return;
                }
                try {
                    if (this.A == 200) {
                        errorStream = this.t.getInputStream();
                    } else {
                        errorStream = this.t.getErrorStream();
                    }
                    try {
                        bufferedInputStream = new BufferedInputStream(errorStream);
                    } catch (Throwable th5) {
                        inputStream = errorStream;
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                }
                try {
                    if (this.s != null && !d()) {
                        this.s.b(bufferedInputStream);
                    }
                    c2.f(bufferedInputStream);
                    c2.f(errorStream);
                } catch (Throwable th7) {
                    inputStream = errorStream;
                    th = th7;
                    bufferedInputStream2 = bufferedInputStream;
                    c2.f(bufferedInputStream2);
                    c2.f(inputStream);
                    throw th;
                }
            }
        } catch (Exception e2) {
            d1.c(6, "HttpStreamRequest", "Exception is:" + e2.getLocalizedMessage());
        } finally {
            f();
        }
    }

    private void f() {
        if (this.u) {
            return;
        }
        this.u = true;
        HttpURLConnection httpURLConnection = this.t;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.flurry.sdk.f2
    public void a() {
        try {
            try {
                if (this.l != null) {
                    if (!x0.a()) {
                        d1.c(3, "HttpStreamRequest", "Network not available, aborting http request: " + this.l);
                    } else {
                        c cVar = this.m;
                        if (cVar == null || c.kUnknown.equals(cVar)) {
                            this.m = c.kGet;
                        }
                        e();
                        d1.c(4, "HttpStreamRequest", "HTTP status: " + this.A + " for url: " + this.l);
                    }
                }
            } catch (Exception e2) {
                d1.c(4, "HttpStreamRequest", "HTTP status: " + this.A + " for url: " + this.l);
                StringBuilder sb = new StringBuilder("Exception during http request: ");
                sb.append(this.l);
                d1.d(3, "HttpStreamRequest", sb.toString(), e2);
                HttpURLConnection httpURLConnection = this.t;
                if (httpURLConnection != null) {
                    this.q = httpURLConnection.getReadTimeout();
                    this.p = this.t.getConnectTimeout();
                }
                this.z = e2;
            }
        } finally {
            this.E.a();
            c();
        }
    }

    public final void b(String str, String str2) {
        this.f9975i.c(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.s == null || d()) {
            return;
        }
        this.s.a();
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f9977k) {
            z = this.v;
        }
        return z;
    }
}
