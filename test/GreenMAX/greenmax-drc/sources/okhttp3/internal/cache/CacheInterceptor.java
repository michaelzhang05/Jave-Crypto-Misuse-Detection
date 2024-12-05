package okhttp3.internal.cache;

import j.b0;
import j.d0;
import j.e0;
import j.f;
import j.h;
import j.q;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.text.u;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;

/* compiled from: CacheInterceptor.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/internal/cache/CacheRequest;", "cacheRequest", "Lokhttp3/Response;", "response", "cacheWritingResponse", "(Lokhttp3/internal/cache/CacheRequest;Lokhttp3/Response;)Lokhttp3/Response;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/Cache;", "cache", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "<init>", "(Lokhttp3/Cache;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Cache cache;

    /* compiled from: CacheInterceptor.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Response;", "response", "stripBody", "(Lokhttp3/Response;)Lokhttp3/Response;", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "combine", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "fieldName", HttpUrl.FRAGMENT_ENCODE_SET, "isEndToEnd", "(Ljava/lang/String;)Z", "isContentSpecificHeader", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers cachedHeaders, Headers networkHeaders) {
            int i2;
            boolean m;
            boolean A;
            Headers.Builder builder = new Headers.Builder();
            int size = cachedHeaders.size();
            while (i2 < size) {
                String name = cachedHeaders.name(i2);
                String value = cachedHeaders.value(i2);
                m = u.m("Warning", name, true);
                if (m) {
                    A = u.A(value, "1", false, 2, null);
                    i2 = A ? i2 + 1 : 0;
                }
                if (isContentSpecificHeader(name) || !isEndToEnd(name) || networkHeaders.get(name) == null) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            int size2 = networkHeaders.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String name2 = networkHeaders.name(i3);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, networkHeaders.value(i3));
                }
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String fieldName) {
            boolean m;
            boolean m2;
            boolean m3;
            m = u.m("Content-Length", fieldName, true);
            if (m) {
                return true;
            }
            m2 = u.m("Content-Encoding", fieldName, true);
            if (m2) {
                return true;
            }
            m3 = u.m("Content-Type", fieldName, true);
            return m3;
        }

        private final boolean isEndToEnd(String fieldName) {
            boolean m;
            boolean m2;
            boolean m3;
            boolean m4;
            boolean m5;
            boolean m6;
            boolean m7;
            boolean m8;
            m = u.m("Connection", fieldName, true);
            if (!m) {
                m2 = u.m("Keep-Alive", fieldName, true);
                if (!m2) {
                    m3 = u.m("Proxy-Authenticate", fieldName, true);
                    if (!m3) {
                        m4 = u.m("Proxy-Authorization", fieldName, true);
                        if (!m4) {
                            m5 = u.m("TE", fieldName, true);
                            if (!m5) {
                                m6 = u.m("Trailers", fieldName, true);
                                if (!m6) {
                                    m7 = u.m("Transfer-Encoding", fieldName, true);
                                    if (!m7) {
                                        m8 = u.m("Upgrade", fieldName, true);
                                        if (!m8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            return (response != null ? response.body() : null) != null ? response.newBuilder().body(null).build() : response;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        b0 body = cacheRequest.getBody();
        ResponseBody body2 = response.body();
        l.c(body2);
        final h source = body2.getSource();
        final j.g c2 = q.c(body);
        d0 d0Var = new d0() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                h.this.close();
            }

            @Override // j.d0
            public long read(f sink, long byteCount) throws IOException {
                l.f(sink, "sink");
                try {
                    long read = h.this.read(sink, byteCount);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            c2.close();
                        }
                        return -1L;
                    }
                    sink.g0(c2.e(), sink.size() - read, read);
                    c2.B();
                    return read;
                } catch (IOException e2) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e2;
                }
            }

            @Override // j.d0
            /* renamed from: timeout */
            public e0 getTimeout() {
                return h.this.getTimeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().getContentLength(), q.d(d0Var))).build();
    }

    /* renamed from: getCache$okhttp, reason: from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        EventListener eventListener;
        ResponseBody body;
        ResponseBody body2;
        l.f(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        Response response = cache != null ? cache.get$okhttp(chain.request()) : null;
        CacheStrategy compute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = compute.getNetworkRequest();
        Response cacheResponse = compute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(compute);
        }
        RealCall realCall = (RealCall) (call instanceof RealCall ? call : null);
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (body2 = response.body()) != null) {
            Util.closeQuietly(body2);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response build = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, build);
            return build;
        }
        if (networkRequest == null) {
            l.c(cacheResponse);
            Response build2 = cacheResponse.newBuilder().cacheResponse(INSTANCE.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, build2);
            return build2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener.cacheMiss(call);
        }
        try {
            Response proceed = chain.proceed(networkRequest);
            if (proceed == null && response != null && body != null) {
            }
            if (cacheResponse != null) {
                if (proceed != null && proceed.code() == 304) {
                    Response.Builder newBuilder = cacheResponse.newBuilder();
                    Companion companion = INSTANCE;
                    Response build3 = newBuilder.headers(companion.combine(cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(proceed)).build();
                    ResponseBody body3 = proceed.body();
                    l.c(body3);
                    body3.close();
                    Cache cache3 = this.cache;
                    l.c(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, build3);
                    eventListener.cacheHit(call, build3);
                    return build3;
                }
                ResponseBody body4 = cacheResponse.body();
                if (body4 != null) {
                    Util.closeQuietly(body4);
                }
            }
            l.c(proceed);
            Response.Builder newBuilder2 = proceed.newBuilder();
            Companion companion2 = INSTANCE;
            Response build4 = newBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(proceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(build4) && CacheStrategy.INSTANCE.isCacheable(build4, networkRequest)) {
                    Response cacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(build4), build4);
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(call);
                    }
                    return cacheWritingResponse;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return build4;
        } finally {
            if (response != null && (body = response.body()) != null) {
                Util.closeQuietly(body);
            }
        }
    }
}
