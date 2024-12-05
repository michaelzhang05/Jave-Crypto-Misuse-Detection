package d.a.a;

import e.h.a.e0.b;
import e.h.a.k0.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: OkHttp3Connection.java */
/* loaded from: classes.dex */
public class a implements b {
    final OkHttpClient a;

    /* renamed from: b, reason: collision with root package name */
    private final Request.Builder f17365b;

    /* renamed from: c, reason: collision with root package name */
    private Request f17366c;

    /* renamed from: d, reason: collision with root package name */
    private Response f17367d;

    /* compiled from: OkHttp3Connection.java */
    /* renamed from: d.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0214a implements c.b {
        private OkHttpClient a;

        /* renamed from: b, reason: collision with root package name */
        private OkHttpClient.Builder f17368b;

        public C0214a() {
        }

        @Override // e.h.a.k0.c.b
        public b a(String str) throws IOException {
            if (this.a == null) {
                synchronized (C0214a.class) {
                    if (this.a == null) {
                        OkHttpClient.Builder builder = this.f17368b;
                        this.a = builder != null ? builder.build() : new OkHttpClient();
                        this.f17368b = null;
                    }
                }
            }
            return new a(str, this.a);
        }

        public C0214a(OkHttpClient.Builder builder) {
            this.f17368b = builder;
        }
    }

    a(Request.Builder builder, OkHttpClient okHttpClient) {
        this.f17365b = builder;
        this.a = okHttpClient;
    }

    @Override // e.h.a.e0.b
    public InputStream a() throws IOException {
        Response response = this.f17367d;
        if (response != null) {
            ResponseBody body = response.body();
            if (body != null) {
                return body.byteStream();
            }
            throw new IOException("No body found on response!");
        }
        throw new IOException("Please invoke #execute first!");
    }

    @Override // e.h.a.e0.b
    public Map<String, List<String>> b() {
        Response response = this.f17367d;
        if (response == null) {
            return null;
        }
        return response.headers().toMultimap();
    }

    @Override // e.h.a.e0.b
    public boolean c(String str, long j2) {
        return false;
    }

    @Override // e.h.a.e0.b
    public int d() throws IOException {
        Response response = this.f17367d;
        if (response != null) {
            return response.code();
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    @Override // e.h.a.e0.b
    public String e(String str) {
        Response response = this.f17367d;
        if (response == null) {
            return null;
        }
        return response.header(str);
    }

    @Override // e.h.a.e0.b
    public void execute() throws IOException {
        if (this.f17366c == null) {
            this.f17366c = this.f17365b.build();
        }
        this.f17367d = this.a.newCall(this.f17366c).execute();
    }

    @Override // e.h.a.e0.b
    public void f(String str, String str2) {
        this.f17365b.addHeader(str, str2);
    }

    @Override // e.h.a.e0.b
    public void g() {
        this.f17366c = null;
        this.f17367d = null;
    }

    @Override // e.h.a.e0.b
    public boolean h(String str) throws ProtocolException {
        this.f17365b.method(str, null);
        return true;
    }

    @Override // e.h.a.e0.b
    public Map<String, List<String>> i() {
        if (this.f17366c == null) {
            this.f17366c = this.f17365b.build();
        }
        return this.f17366c.headers().toMultimap();
    }

    public a(String str, OkHttpClient okHttpClient) {
        this(new Request.Builder().url(str), okHttpClient);
    }
}
