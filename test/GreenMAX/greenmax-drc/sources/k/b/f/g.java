package k.b.f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* compiled from: SubstituteLogger.java */
/* loaded from: classes2.dex */
public class g implements k.b.b {

    /* renamed from: f, reason: collision with root package name */
    private final String f19442f;

    /* renamed from: g, reason: collision with root package name */
    private volatile k.b.b f19443g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f19444h;

    /* renamed from: i, reason: collision with root package name */
    private Method f19445i;

    /* renamed from: j, reason: collision with root package name */
    private k.b.e.a f19446j;

    /* renamed from: k, reason: collision with root package name */
    private Queue<k.b.e.d> f19447k;
    private final boolean l;

    public g(String str, Queue<k.b.e.d> queue, boolean z) {
        this.f19442f = str;
        this.f19447k = queue;
        this.l = z;
    }

    private k.b.b k() {
        if (this.f19446j == null) {
            this.f19446j = new k.b.e.a(this, this.f19447k);
        }
        return this.f19446j;
    }

    @Override // k.b.b
    public void a(String str, Object obj, Object obj2) {
        j().a(str, obj, obj2);
    }

    @Override // k.b.b
    public boolean b() {
        return j().b();
    }

    @Override // k.b.b
    public void c(String str) {
        j().c(str);
    }

    @Override // k.b.b
    public boolean d() {
        return j().d();
    }

    @Override // k.b.b
    public void e(String str, Throwable th) {
        j().e(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f19442f.equals(((g) obj).f19442f);
    }

    @Override // k.b.b
    public void f(String str, Throwable th) {
        j().f(str, th);
    }

    @Override // k.b.b
    public void g(String str, Throwable th) {
        j().g(str, th);
    }

    @Override // k.b.b
    public void h(String str) {
        j().h(str);
    }

    public int hashCode() {
        return this.f19442f.hashCode();
    }

    @Override // k.b.b
    public void i(String str) {
        j().i(str);
    }

    k.b.b j() {
        if (this.f19443g != null) {
            return this.f19443g;
        }
        if (this.l) {
            return d.f19440g;
        }
        return k();
    }

    public String l() {
        return this.f19442f;
    }

    public boolean m() {
        Boolean bool = this.f19444h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f19445i = this.f19443g.getClass().getMethod("log", k.b.e.c.class);
            this.f19444h = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f19444h = Boolean.FALSE;
        }
        return this.f19444h.booleanValue();
    }

    public boolean n() {
        return this.f19443g instanceof d;
    }

    public boolean o() {
        return this.f19443g == null;
    }

    public void p(k.b.e.c cVar) {
        if (m()) {
            try {
                this.f19445i.invoke(this.f19443g, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void q(k.b.b bVar) {
        this.f19443g = bVar;
    }
}
