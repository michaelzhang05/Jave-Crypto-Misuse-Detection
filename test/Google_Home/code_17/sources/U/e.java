package u;

import C.C1013g;
import C.C1014h;
import C.C1015i;
import C.C1016j;
import C.InterfaceC1010d;
import C.N;
import C.X;
import android.content.Context;
import u.v;
import v.C4081j;
import v.C4083l;
import w.C4116a;
import w.InterfaceC4117b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39874a;

        private b() {
        }

        @Override // u.v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f39874a = (Context) w.d.b(context);
            return this;
        }

        @Override // u.v.a
        public v build() {
            w.d.a(this.f39874a, Context.class);
            return new c(this.f39874a);
        }
    }

    /* loaded from: classes3.dex */
    private static final class c extends v {

        /* renamed from: a, reason: collision with root package name */
        private final c f39875a;

        /* renamed from: b, reason: collision with root package name */
        private L5.a f39876b;

        /* renamed from: c, reason: collision with root package name */
        private L5.a f39877c;

        /* renamed from: d, reason: collision with root package name */
        private L5.a f39878d;

        /* renamed from: e, reason: collision with root package name */
        private L5.a f39879e;

        /* renamed from: f, reason: collision with root package name */
        private L5.a f39880f;

        /* renamed from: g, reason: collision with root package name */
        private L5.a f39881g;

        /* renamed from: h, reason: collision with root package name */
        private L5.a f39882h;

        /* renamed from: i, reason: collision with root package name */
        private L5.a f39883i;

        /* renamed from: j, reason: collision with root package name */
        private L5.a f39884j;

        /* renamed from: k, reason: collision with root package name */
        private L5.a f39885k;

        /* renamed from: l, reason: collision with root package name */
        private L5.a f39886l;

        /* renamed from: m, reason: collision with root package name */
        private L5.a f39887m;

        /* renamed from: n, reason: collision with root package name */
        private L5.a f39888n;

        private void f(Context context) {
            this.f39876b = C4116a.a(k.a());
            InterfaceC4117b a8 = w.c.a(context);
            this.f39877c = a8;
            C4081j a9 = C4081j.a(a8, E.c.a(), E.d.a());
            this.f39878d = a9;
            this.f39879e = C4116a.a(C4083l.a(this.f39877c, a9));
            this.f39880f = X.a(this.f39877c, C1013g.a(), C1015i.a());
            this.f39881g = C4116a.a(C1014h.a(this.f39877c));
            this.f39882h = C4116a.a(N.a(E.c.a(), E.d.a(), C1016j.a(), this.f39880f, this.f39881g));
            A.g b8 = A.g.b(E.c.a());
            this.f39883i = b8;
            A.i a10 = A.i.a(this.f39877c, this.f39882h, b8, E.d.a());
            this.f39884j = a10;
            L5.a aVar = this.f39876b;
            L5.a aVar2 = this.f39879e;
            L5.a aVar3 = this.f39882h;
            this.f39885k = A.d.a(aVar, aVar2, a10, aVar3, aVar3);
            L5.a aVar4 = this.f39877c;
            L5.a aVar5 = this.f39879e;
            L5.a aVar6 = this.f39882h;
            this.f39886l = B.s.a(aVar4, aVar5, aVar6, this.f39884j, this.f39876b, aVar6, E.c.a(), E.d.a(), this.f39882h);
            L5.a aVar7 = this.f39876b;
            L5.a aVar8 = this.f39882h;
            this.f39887m = B.w.a(aVar7, aVar8, this.f39884j, aVar8);
            this.f39888n = C4116a.a(w.a(E.c.a(), E.d.a(), this.f39885k, this.f39886l, this.f39887m));
        }

        @Override // u.v
        InterfaceC1010d a() {
            return (InterfaceC1010d) this.f39882h.get();
        }

        @Override // u.v
        u b() {
            return (u) this.f39888n.get();
        }

        private c(Context context) {
            this.f39875a = this;
            f(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
