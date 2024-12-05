package F6;

import F6.q;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.List;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    final r f3028a;

    /* renamed from: b, reason: collision with root package name */
    final String f3029b;

    /* renamed from: c, reason: collision with root package name */
    final q f3030c;

    /* renamed from: d, reason: collision with root package name */
    final y f3031d;

    /* renamed from: e, reason: collision with root package name */
    final Object f3032e;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f3033f;

    x(a aVar) {
        this.f3028a = aVar.f3034a;
        this.f3029b = aVar.f3035b;
        this.f3030c = aVar.f3036c.d();
        this.f3031d = aVar.f3037d;
        Object obj = aVar.f3038e;
        this.f3032e = obj == null ? this : obj;
    }

    public y a() {
        return this.f3031d;
    }

    public d b() {
        d dVar = this.f3033f;
        if (dVar == null) {
            d l8 = d.l(this.f3030c);
            this.f3033f = l8;
            return l8;
        }
        return dVar;
    }

    public String c(String str) {
        return this.f3030c.a(str);
    }

    public q d() {
        return this.f3030c;
    }

    public List e(String str) {
        return this.f3030c.g(str);
    }

    public boolean f() {
        return this.f3028a.l();
    }

    public String g() {
        return this.f3029b;
    }

    public a h() {
        return new a(this);
    }

    public r i() {
        return this.f3028a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f3029b);
        sb.append(", url=");
        sb.append(this.f3028a);
        sb.append(", tag=");
        Object obj = this.f3032e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        r f3034a;

        /* renamed from: b, reason: collision with root package name */
        String f3035b;

        /* renamed from: c, reason: collision with root package name */
        q.a f3036c;

        /* renamed from: d, reason: collision with root package name */
        y f3037d;

        /* renamed from: e, reason: collision with root package name */
        Object f3038e;

        public a() {
            this.f3035b = ShareTarget.METHOD_GET;
            this.f3036c = new q.a();
        }

        public x a() {
            if (this.f3034a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                return f("Cache-Control");
            }
            return c("Cache-Control", dVar2);
        }

        public a c(String str, String str2) {
            this.f3036c.h(str, str2);
            return this;
        }

        public a d(q qVar) {
            this.f3036c = qVar.d();
            return this;
        }

        public a e(String str, y yVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (yVar != null && !J6.f.b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (yVar == null && J6.f.e(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f3035b = str;
                    this.f3037d = yVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a f(String str) {
            this.f3036c.g(str);
            return this;
        }

        public a g(r rVar) {
            if (rVar != null) {
                this.f3034a = rVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a h(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                r p8 = r.p(str);
                if (p8 != null) {
                    return g(p8);
                }
                throw new IllegalArgumentException("unexpected url: " + str);
            }
            throw new NullPointerException("url == null");
        }

        a(x xVar) {
            this.f3034a = xVar.f3028a;
            this.f3035b = xVar.f3029b;
            this.f3037d = xVar.f3031d;
            this.f3038e = xVar.f3032e;
            this.f3036c = xVar.f3030c.d();
        }
    }
}
