package com.bumptech.glide.load.m;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.m.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: f, reason: collision with root package name */
    static final b f8680f = new a();

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.n.g f8681g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8682h;

    /* renamed from: i, reason: collision with root package name */
    private final b f8683i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f8684j;

    /* renamed from: k, reason: collision with root package name */
    private InputStream f8685k;
    private volatile boolean l;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.m.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(com.bumptech.glide.load.n.g gVar, int i2) {
        this(gVar, i2, f8680f);
    }

    private InputStream c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f8685k = com.bumptech.glide.r.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f8685k = httpURLConnection.getInputStream();
        }
        return this.f8685k;
    }

    private static boolean f(int i2) {
        return i2 / 100 == 2;
    }

    private static boolean g(int i2) {
        return i2 / 100 == 3;
    }

    private InputStream h(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f8684j = this.f8683i.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f8684j.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f8684j.setConnectTimeout(this.f8682h);
            this.f8684j.setReadTimeout(this.f8682h);
            this.f8684j.setUseCaches(false);
            this.f8684j.setDoInput(true);
            this.f8684j.setInstanceFollowRedirects(false);
            this.f8684j.connect();
            this.f8685k = this.f8684j.getInputStream();
            if (this.l) {
                return null;
            }
            int responseCode = this.f8684j.getResponseCode();
            if (f(responseCode)) {
                return c(this.f8684j);
            }
            if (!g(responseCode)) {
                if (responseCode == -1) {
                    throw new HttpException(responseCode);
                }
                throw new HttpException(this.f8684j.getResponseMessage(), responseCode);
            }
            String headerField = this.f8684j.getHeaderField("Location");
            if (!TextUtils.isEmpty(headerField)) {
                URL url3 = new URL(url, headerField);
                b();
                return h(url3, i2 + 1, url, map);
            }
            throw new HttpException("Received empty or null redirect url");
        }
        throw new HttpException("Too many (> 5) redirects!");
    }

    @Override // com.bumptech.glide.load.m.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.m.d
    public void b() {
        InputStream inputStream = this.f8685k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f8684j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f8684j = null;
    }

    @Override // com.bumptech.glide.load.m.d
    public void cancel() {
        this.l = true;
    }

    @Override // com.bumptech.glide.load.m.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.m.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long b2 = com.bumptech.glide.r.f.b();
        try {
            try {
                aVar.g(h(this.f8681g.f(), 0, null, this.f8681g.c()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                aVar.c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(com.bumptech.glide.r.f.a(b2));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + com.bumptech.glide.r.f.a(b2));
            }
            throw th;
        }
    }

    j(com.bumptech.glide.load.n.g gVar, int i2, b bVar) {
        this.f8681g = gVar;
        this.f8682h = i2;
        this.f8683i = bVar;
    }
}
