package I6;

import I6.q;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.List;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    final r f4568a;

    /* renamed from: b, reason: collision with root package name */
    final String f4569b;

    /* renamed from: c, reason: collision with root package name */
    final q f4570c;

    /* renamed from: d, reason: collision with root package name */
    final y f4571d;

    /* renamed from: e, reason: collision with root package name */
    final Object f4572e;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f4573f;

    x(a aVar) {
        this.f4568a = aVar.f4574a;
        this.f4569b = aVar.f4575b;
        this.f4570c = aVar.f4576c.d();
        this.f4571d = aVar.f4577d;
        Object obj = aVar.f4578e;
        this.f4572e = obj == null ? this : obj;
    }

    public y a() {
        return this.f4571d;
    }

    public d b() {
        d dVar = this.f4573f;
        if (dVar == null) {
            d l8 = d.l(this.f4570c);
            this.f4573f = l8;
            return l8;
        }
        return dVar;
    }

    public String c(String str) {
        return this.f4570c.a(str);
    }

    public q d() {
        return this.f4570c;
    }

    public List e(String str) {
        return this.f4570c.g(str);
    }

    public boolean f() {
        return this.f4568a.l();
    }

    public String g() {
        return this.f4569b;
    }

    public a h() {
        return new a(this);
    }

    public r i() {
        return this.f4568a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f4569b);
        sb.append(", url=");
        sb.append(this.f4568a);
        sb.append(", tag=");
        Object obj = this.f4572e;
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
        r f4574a;

        /* renamed from: b, reason: collision with root package name */
        String f4575b;

        /* renamed from: c, reason: collision with root package name */
        q.a f4576c;

        /* renamed from: d, reason: collision with root package name */
        y f4577d;

        /* renamed from: e, reason: collision with root package name */
        Object f4578e;

        public a() {
            this.f4575b = ShareTarget.METHOD_GET;
            this.f4576c = new q.a();
        }

        public x a() {
            if (this.f4574a != null) {
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
            this.f4576c.h(str, str2);
            return this;
        }

        public a d(q qVar) {
            this.f4576c = qVar.d();
            return this;
        }

        public a e(String str, y yVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (yVar != null && !M6.f.b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (yVar == null && M6.f.e(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f4575b = str;
                    this.f4577d = yVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a f(String str) {
            this.f4576c.g(str);
            return this;
        }

        public a g(r rVar) {
            if (rVar != null) {
                this.f4574a = rVar;
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
            this.f4574a = xVar.f4568a;
            this.f4575b = xVar.f4569b;
            this.f4577d = xVar.f4571d;
            this.f4578e = xVar.f4572e;
            this.f4576c = xVar.f4570c.d();
        }
    }
}
