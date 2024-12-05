package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryRuntime.java */
/* loaded from: classes2.dex */
public final class s implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19177f;

    /* renamed from: g, reason: collision with root package name */
    private String f19178g;

    /* renamed from: h, reason: collision with root package name */
    private String f19179h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f19180i;

    /* compiled from: SentryRuntime.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<s> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            s sVar = new s();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -339173787:
                        if (k0.equals("raw_description")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (k0.equals("name")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 351608024:
                        if (k0.equals("version")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        sVar.f19179h = n2Var.T0();
                        break;
                    case 1:
                        sVar.f19177f = n2Var.T0();
                        break;
                    case 2:
                        sVar.f19178g = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            sVar.g(concurrentHashMap);
            n2Var.D();
            return sVar;
        }
    }

    public s() {
    }

    public String d() {
        return this.f19177f;
    }

    public String e() {
        return this.f19178g;
    }

    public void f(String str) {
        this.f19177f = str;
    }

    public void g(Map<String, Object> map) {
        this.f19180i = map;
    }

    public void h(String str) {
        this.f19178g = str;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19177f != null) {
            h3Var.k("name").b(this.f19177f);
        }
        if (this.f19178g != null) {
            h3Var.k("version").b(this.f19178g);
        }
        if (this.f19179h != null) {
            h3Var.k("raw_description").b(this.f19179h);
        }
        Map<String, Object> map = this.f19180i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19180i.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(s sVar) {
        this.f19177f = sVar.f19177f;
        this.f19178g = sVar.f19178g;
        this.f19179h = sVar.f19179h;
        this.f19180i = io.sentry.util.i.b(sVar.f19180i);
    }
}
