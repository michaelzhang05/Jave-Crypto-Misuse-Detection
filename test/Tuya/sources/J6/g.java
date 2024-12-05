package J6;

import F6.o;
import F6.s;
import F6.x;
import F6.z;
import java.util.List;

/* loaded from: classes5.dex */
public final class g implements s.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f5512a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.g f5513b;

    /* renamed from: c, reason: collision with root package name */
    private final c f5514c;

    /* renamed from: d, reason: collision with root package name */
    private final I6.c f5515d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5516e;

    /* renamed from: f, reason: collision with root package name */
    private final x f5517f;

    /* renamed from: g, reason: collision with root package name */
    private final F6.e f5518g;

    /* renamed from: h, reason: collision with root package name */
    private final o f5519h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5520i;

    /* renamed from: j, reason: collision with root package name */
    private final int f5521j;

    /* renamed from: k, reason: collision with root package name */
    private final int f5522k;

    /* renamed from: l, reason: collision with root package name */
    private int f5523l;

    public g(List list, I6.g gVar, c cVar, I6.c cVar2, int i8, x xVar, F6.e eVar, o oVar, int i9, int i10, int i11) {
        this.f5512a = list;
        this.f5515d = cVar2;
        this.f5513b = gVar;
        this.f5514c = cVar;
        this.f5516e = i8;
        this.f5517f = xVar;
        this.f5518g = eVar;
        this.f5519h = oVar;
        this.f5520i = i9;
        this.f5521j = i10;
        this.f5522k = i11;
    }

    @Override // F6.s.a
    public z a(x xVar) {
        return f(xVar, this.f5513b, this.f5514c, this.f5515d);
    }

    public F6.e b() {
        return this.f5518g;
    }

    public F6.h c() {
        return this.f5515d;
    }

    @Override // F6.s.a
    public int connectTimeoutMillis() {
        return this.f5520i;
    }

    public o d() {
        return this.f5519h;
    }

    public c e() {
        return this.f5514c;
    }

    public z f(x xVar, I6.g gVar, c cVar, I6.c cVar2) {
        if (this.f5516e < this.f5512a.size()) {
            this.f5523l++;
            if (this.f5514c != null && !this.f5515d.r(xVar.i())) {
                throw new IllegalStateException("network interceptor " + this.f5512a.get(this.f5516e - 1) + " must retain the same host and port");
            }
            if (this.f5514c != null && this.f5523l > 1) {
                throw new IllegalStateException("network interceptor " + this.f5512a.get(this.f5516e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f5512a, gVar, cVar, cVar2, this.f5516e + 1, xVar, this.f5518g, this.f5519h, this.f5520i, this.f5521j, this.f5522k);
            s sVar = (s) this.f5512a.get(this.f5516e);
            z a8 = sVar.a(gVar2);
            if (cVar != null && this.f5516e + 1 < this.f5512a.size() && gVar2.f5523l != 1) {
                throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
            }
            if (a8 != null) {
                if (a8.a() != null) {
                    return a8;
                }
                throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        throw new AssertionError();
    }

    public I6.g g() {
        return this.f5513b;
    }

    @Override // F6.s.a
    public int readTimeoutMillis() {
        return this.f5521j;
    }

    @Override // F6.s.a
    public x request() {
        return this.f5517f;
    }

    @Override // F6.s.a
    public int writeTimeoutMillis() {
        return this.f5522k;
    }
}
