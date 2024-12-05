package d1;

import android.content.Context;
import d1.u;
import k1.w;
import l1.n0;
import l1.u0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends u {

    /* renamed from: a, reason: collision with root package name */
    private y4.a f6435a;

    /* renamed from: b, reason: collision with root package name */
    private y4.a f6436b;

    /* renamed from: c, reason: collision with root package name */
    private y4.a f6437c;

    /* renamed from: d, reason: collision with root package name */
    private y4.a f6438d;

    /* renamed from: e, reason: collision with root package name */
    private y4.a f6439e;

    /* renamed from: f, reason: collision with root package name */
    private y4.a f6440f;

    /* renamed from: g, reason: collision with root package name */
    private y4.a f6441g;

    /* renamed from: h, reason: collision with root package name */
    private y4.a f6442h;

    /* renamed from: i, reason: collision with root package name */
    private y4.a f6443i;

    /* renamed from: j, reason: collision with root package name */
    private y4.a f6444j;

    /* renamed from: k, reason: collision with root package name */
    private y4.a f6445k;

    /* renamed from: l, reason: collision with root package name */
    private y4.a f6446l;

    /* renamed from: m, reason: collision with root package name */
    private y4.a f6447m;

    /* loaded from: classes.dex */
    private static final class b implements u.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f6448a;

        private b() {
        }

        @Override // d1.u.a
        public u a() {
            f1.d.a(this.f6448a, Context.class);
            return new e(this.f6448a);
        }

        @Override // d1.u.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f6448a = (Context) f1.d.b(context);
            return this;
        }
    }

    private e(Context context) {
        D(context);
    }

    private void D(Context context) {
        this.f6435a = f1.a.a(k.a());
        f1.b a6 = f1.c.a(context);
        this.f6436b = a6;
        e1.j a7 = e1.j.a(a6, n1.c.a(), n1.d.a());
        this.f6437c = a7;
        this.f6438d = f1.a.a(e1.l.a(this.f6436b, a7));
        this.f6439e = u0.a(this.f6436b, l1.g.a(), l1.i.a());
        this.f6440f = f1.a.a(l1.h.a(this.f6436b));
        this.f6441g = f1.a.a(n0.a(n1.c.a(), n1.d.a(), l1.j.a(), this.f6439e, this.f6440f));
        j1.g b6 = j1.g.b(n1.c.a());
        this.f6442h = b6;
        j1.i a8 = j1.i.a(this.f6436b, this.f6441g, b6, n1.d.a());
        this.f6443i = a8;
        y4.a aVar = this.f6435a;
        y4.a aVar2 = this.f6438d;
        y4.a aVar3 = this.f6441g;
        this.f6444j = j1.d.a(aVar, aVar2, a8, aVar3, aVar3);
        y4.a aVar4 = this.f6436b;
        y4.a aVar5 = this.f6438d;
        y4.a aVar6 = this.f6441g;
        this.f6445k = k1.s.a(aVar4, aVar5, aVar6, this.f6443i, this.f6435a, aVar6, n1.c.a(), n1.d.a(), this.f6441g);
        y4.a aVar7 = this.f6435a;
        y4.a aVar8 = this.f6441g;
        this.f6446l = w.a(aVar7, aVar8, this.f6443i, aVar8);
        this.f6447m = f1.a.a(v.a(n1.c.a(), n1.d.a(), this.f6444j, this.f6445k, this.f6446l));
    }

    public static u.a w() {
        return new b();
    }

    @Override // d1.u
    l1.d g() {
        return (l1.d) this.f6441g.get();
    }

    @Override // d1.u
    t q() {
        return (t) this.f6447m.get();
    }
}
