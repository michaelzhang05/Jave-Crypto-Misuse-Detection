package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: OperatingSystem.java */
/* loaded from: classes2.dex */
public final class k implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19138f;

    /* renamed from: g, reason: collision with root package name */
    private String f19139g;

    /* renamed from: h, reason: collision with root package name */
    private String f19140h;

    /* renamed from: i, reason: collision with root package name */
    private String f19141i;

    /* renamed from: j, reason: collision with root package name */
    private String f19142j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f19143k;
    private Map<String, Object> l;

    /* compiled from: OperatingSystem.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<k> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -925311743:
                        if (k0.equals("rooted")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -339173787:
                        if (k0.equals("raw_description")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3373707:
                        if (k0.equals("name")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 94094958:
                        if (k0.equals("build")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 351608024:
                        if (k0.equals("version")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 2015527638:
                        if (k0.equals("kernel_version")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        kVar.f19143k = n2Var.I0();
                        break;
                    case 1:
                        kVar.f19140h = n2Var.T0();
                        break;
                    case 2:
                        kVar.f19138f = n2Var.T0();
                        break;
                    case 3:
                        kVar.f19141i = n2Var.T0();
                        break;
                    case 4:
                        kVar.f19139g = n2Var.T0();
                        break;
                    case 5:
                        kVar.f19142j = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            kVar.l(concurrentHashMap);
            n2Var.D();
            return kVar;
        }
    }

    public k() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return io.sentry.util.q.a(this.f19138f, kVar.f19138f) && io.sentry.util.q.a(this.f19139g, kVar.f19139g) && io.sentry.util.q.a(this.f19140h, kVar.f19140h) && io.sentry.util.q.a(this.f19141i, kVar.f19141i) && io.sentry.util.q.a(this.f19142j, kVar.f19142j) && io.sentry.util.q.a(this.f19143k, kVar.f19143k);
    }

    public String g() {
        return this.f19138f;
    }

    public void h(String str) {
        this.f19141i = str;
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19138f, this.f19139g, this.f19140h, this.f19141i, this.f19142j, this.f19143k);
    }

    public void i(String str) {
        this.f19142j = str;
    }

    public void j(String str) {
        this.f19138f = str;
    }

    public void k(Boolean bool) {
        this.f19143k = bool;
    }

    public void l(Map<String, Object> map) {
        this.l = map;
    }

    public void m(String str) {
        this.f19139g = str;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19138f != null) {
            h3Var.k("name").b(this.f19138f);
        }
        if (this.f19139g != null) {
            h3Var.k("version").b(this.f19139g);
        }
        if (this.f19140h != null) {
            h3Var.k("raw_description").b(this.f19140h);
        }
        if (this.f19141i != null) {
            h3Var.k("build").b(this.f19141i);
        }
        if (this.f19142j != null) {
            h3Var.k("kernel_version").b(this.f19142j);
        }
        if (this.f19143k != null) {
            h3Var.k("rooted").h(this.f19143k);
        }
        Map<String, Object> map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.l.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(k kVar) {
        this.f19138f = kVar.f19138f;
        this.f19139g = kVar.f19139g;
        this.f19140h = kVar.f19140h;
        this.f19141i = kVar.f19141i;
        this.f19142j = kVar.f19142j;
        this.f19143k = kVar.f19143k;
        this.l = io.sentry.util.i.b(kVar.l);
    }
}
