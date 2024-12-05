package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* compiled from: RequestDetails.java */
/* loaded from: classes2.dex */
public final class p3 {
    private final URL a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f19072b;

    public p3(String str, Map<String, String> map) {
        io.sentry.util.q.c(str, "url is required");
        io.sentry.util.q.c(map, "headers is required");
        try {
            this.a = URI.create(str).toURL();
            this.f19072b = map;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e2);
        }
    }

    public Map<String, String> a() {
        return this.f19072b;
    }

    public URL b() {
        return this.a;
    }
}
