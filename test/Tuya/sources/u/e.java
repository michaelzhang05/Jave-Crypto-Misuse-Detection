package u;

import C.C1073g;
import C.C1074h;
import C.C1075i;
import C.C1076j;
import C.InterfaceC1070d;
import C.N;
import C.V;
import android.content.Context;
import u.v;
import w.AbstractC3838d;
import w.C3835a;
import w.C3837c;
import w.InterfaceC3836b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e extends v {

    /* renamed from: a, reason: collision with root package name */
    private I5.a f38447a;

    /* renamed from: b, reason: collision with root package name */
    private I5.a f38448b;

    /* renamed from: c, reason: collision with root package name */
    private I5.a f38449c;

    /* renamed from: d, reason: collision with root package name */
    private I5.a f38450d;

    /* renamed from: e, reason: collision with root package name */
    private I5.a f38451e;

    /* renamed from: f, reason: collision with root package name */
    private I5.a f38452f;

    /* renamed from: g, reason: collision with root package name */
    private I5.a f38453g;

    /* renamed from: h, reason: collision with root package name */
    private I5.a f38454h;

    /* renamed from: i, reason: collision with root package name */
    private I5.a f38455i;

    /* renamed from: j, reason: collision with root package name */
    private I5.a f38456j;

    /* renamed from: k, reason: collision with root package name */
    private I5.a f38457k;

    /* renamed from: l, reason: collision with root package name */
    private I5.a f38458l;

    /* renamed from: m, reason: collision with root package name */
    private I5.a f38459m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38460a;

        private b() {
        }

        @Override // u.v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f38460a = (Context) AbstractC3838d.b(context);
            return this;
        }

        @Override // u.v.a
        public v build() {
            AbstractC3838d.a(this.f38460a, Context.class);
            return new e(this.f38460a);
        }
    }

    public static v.a e() {
        return new b();
    }

    private void f(Context context) {
        this.f38447a = C3835a.a(k.a());
        InterfaceC3836b a8 = C3837c.a(context);
        this.f38448b = a8;
        v.j a9 = v.j.a(a8, E.c.a(), E.d.a());
        this.f38449c = a9;
        this.f38450d = C3835a.a(v.l.a(this.f38448b, a9));
        this.f38451e = V.a(this.f38448b, C1073g.a(), C1075i.a());
        this.f38452f = C3835a.a(C1074h.a(this.f38448b));
        this.f38453g = C3835a.a(N.a(E.c.a(), E.d.a(), C1076j.a(), this.f38451e, this.f38452f));
        A.g b8 = A.g.b(E.c.a());
        this.f38454h = b8;
        A.i a10 = A.i.a(this.f38448b, this.f38453g, b8, E.d.a());
        this.f38455i = a10;
        I5.a aVar = this.f38447a;
        I5.a aVar2 = this.f38450d;
        I5.a aVar3 = this.f38453g;
        this.f38456j = A.d.a(aVar, aVar2, a10, aVar3, aVar3);
        I5.a aVar4 = this.f38448b;
        I5.a aVar5 = this.f38450d;
        I5.a aVar6 = this.f38453g;
        this.f38457k = B.s.a(aVar4, aVar5, aVar6, this.f38455i, this.f38447a, aVar6, E.c.a(), E.d.a(), this.f38453g);
        I5.a aVar7 = this.f38447a;
        I5.a aVar8 = this.f38453g;
        this.f38458l = B.w.a(aVar7, aVar8, this.f38455i, aVar8);
        this.f38459m = C3835a.a(w.a(E.c.a(), E.d.a(), this.f38456j, this.f38457k, this.f38458l));
    }

    @Override // u.v
    InterfaceC1070d a() {
        return (InterfaceC1070d) this.f38453g.get();
    }

    @Override // u.v
    u b() {
        return (u) this.f38459m.get();
    }

    private e(Context context) {
        f(context);
    }
}
