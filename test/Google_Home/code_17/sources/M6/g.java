package M6;

import I6.o;
import I6.s;
import I6.x;
import I6.z;
import java.util.List;

/* loaded from: classes5.dex */
public final class g implements s.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f7218a;

    /* renamed from: b, reason: collision with root package name */
    private final L6.g f7219b;

    /* renamed from: c, reason: collision with root package name */
    private final c f7220c;

    /* renamed from: d, reason: collision with root package name */
    private final L6.c f7221d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7222e;

    /* renamed from: f, reason: collision with root package name */
    private final x f7223f;

    /* renamed from: g, reason: collision with root package name */
    private final I6.e f7224g;

    /* renamed from: h, reason: collision with root package name */
    private final o f7225h;

    /* renamed from: i, reason: collision with root package name */
    private final int f7226i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7227j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7228k;

    /* renamed from: l, reason: collision with root package name */
    private int f7229l;

    public g(List list, L6.g gVar, c cVar, L6.c cVar2, int i8, x xVar, I6.e eVar, o oVar, int i9, int i10, int i11) {
        this.f7218a = list;
        this.f7221d = cVar2;
        this.f7219b = gVar;
        this.f7220c = cVar;
        this.f7222e = i8;
        this.f7223f = xVar;
        this.f7224g = eVar;
        this.f7225h = oVar;
        this.f7226i = i9;
        this.f7227j = i10;
        this.f7228k = i11;
    }

    @Override // I6.s.a
    public z a(x xVar) {
        return f(xVar, this.f7219b, this.f7220c, this.f7221d);
    }

    public I6.e b() {
        return this.f7224g;
    }

    public I6.h c() {
        return this.f7221d;
    }

    @Override // I6.s.a
    public int connectTimeoutMillis() {
        return this.f7226i;
    }

    public o d() {
        return this.f7225h;
    }

    public c e() {
        return this.f7220c;
    }

    public z f(x xVar, L6.g gVar, c cVar, L6.c cVar2) {
        if (this.f7222e < this.f7218a.size()) {
            this.f7229l++;
            if (this.f7220c != null && !this.f7221d.r(xVar.i())) {
                throw new IllegalStateException("network interceptor " + this.f7218a.get(this.f7222e - 1) + " must retain the same host and port");
            }
            if (this.f7220c != null && this.f7229l > 1) {
                throw new IllegalStateException("network interceptor " + this.f7218a.get(this.f7222e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f7218a, gVar, cVar, cVar2, this.f7222e + 1, xVar, this.f7224g, this.f7225h, this.f7226i, this.f7227j, this.f7228k);
            s sVar = (s) this.f7218a.get(this.f7222e);
            z a8 = sVar.a(gVar2);
            if (cVar != null && this.f7222e + 1 < this.f7218a.size() && gVar2.f7229l != 1) {
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

    public L6.g g() {
        return this.f7219b;
    }

    @Override // I6.s.a
    public int readTimeoutMillis() {
        return this.f7227j;
    }

    @Override // I6.s.a
    public x request() {
        return this.f7223f;
    }

    @Override // I6.s.a
    public int writeTimeoutMillis() {
        return this.f7228k;
    }
}
