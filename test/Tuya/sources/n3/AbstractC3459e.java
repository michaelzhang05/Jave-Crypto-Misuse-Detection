package n3;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f3.C2660a;
import f3.C2667h;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import l3.InterfaceC3178h;
import n3.x;
import n3.y;
import r2.InterfaceC3684d;
import u2.C3801a;

/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3459e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f36040a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f36041b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f36042c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f36043d;

        /* renamed from: e, reason: collision with root package name */
        private Set f36044e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f36045f;

        private a() {
        }

        @Override // n3.x.a
        public x build() {
            u5.h.a(this.f36040a, Context.class);
            u5.h.a(this.f36041b, Boolean.class);
            u5.h.a(this.f36042c, Function0.class);
            u5.h.a(this.f36043d, Function0.class);
            u5.h.a(this.f36044e, Set.class);
            u5.h.a(this.f36045f, Boolean.class);
            return new b(new s(), new u2.d(), new C3801a(), this.f36040a, this.f36041b, this.f36042c, this.f36043d, this.f36044e, this.f36045f);
        }

        @Override // n3.x.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f36040a = (Context) u5.h.b(context);
            return this;
        }

        @Override // n3.x.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f36041b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.x.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(boolean z8) {
            this.f36045f = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.x.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f36044e = (Set) u5.h.b(set);
            return this;
        }

        @Override // n3.x.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f36042c = (Function0) u5.h.b(function0);
            return this;
        }

        @Override // n3.x.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f36043d = (Function0) u5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.e$b */
    /* loaded from: classes4.dex */
    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36046a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f36047b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f36048c;

        /* renamed from: d, reason: collision with root package name */
        private final s f36049d;

        /* renamed from: e, reason: collision with root package name */
        private final b f36050e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f36051f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f36052g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f36053h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f36054i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f36055j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f36056k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f36057l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f36058m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f36059n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f36060o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f36061p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f36062q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f36063r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f36064s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f36065t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f36066u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f36067v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f36068w;

        /* JADX INFO: Access modifiers changed from: private */
        public x2.m n() {
            return new x2.m((InterfaceC3684d) this.f36053h.get(), (P5.g) this.f36051f.get());
        }

        private void o(s sVar, u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f36051f = u5.d.c(u2.f.a(dVar));
            u5.e a8 = u5.f.a(bool);
            this.f36052g = a8;
            this.f36053h = u5.d.c(u2.c.a(c3801a, a8));
            this.f36054i = u5.f.a(context);
            this.f36055j = u5.d.c(u2.e.a(dVar));
            this.f36056k = u5.d.c(w.a(sVar));
            this.f36057l = u5.f.a(function0);
            u5.e a9 = u5.f.a(set);
            this.f36058m = a9;
            this.f36059n = e3.j.a(this.f36054i, this.f36057l, a9);
            this.f36060o = u.a(sVar, this.f36054i);
            u5.e a10 = u5.f.a(bool2);
            this.f36061p = a10;
            this.f36062q = u5.d.c(v.a(sVar, this.f36054i, this.f36052g, this.f36051f, this.f36055j, this.f36056k, this.f36059n, this.f36057l, this.f36058m, this.f36060o, a10));
            this.f36063r = u5.d.c(t.a(sVar, this.f36054i));
            this.f36064s = u5.f.a(function02);
            x2.n a11 = x2.n.a(this.f36053h, this.f36051f);
            this.f36065t = a11;
            e3.k a12 = e3.k.a(this.f36054i, this.f36057l, this.f36051f, this.f36058m, this.f36059n, a11, this.f36053h);
            this.f36066u = a12;
            this.f36067v = u5.d.c(C2667h.a(this.f36054i, this.f36057l, a12, this.f36053h, this.f36051f));
            this.f36068w = u5.d.c(f3.k.a(this.f36054i, this.f36057l, this.f36066u, this.f36053h, this.f36051f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return this.f36049d.b(this.f36046a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory q() {
            return new PaymentAnalyticsRequestFactory(this.f36046a, this.f36047b, this.f36048c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a r() {
            return new com.stripe.android.networking.a(this.f36046a, this.f36047b, (P5.g) this.f36051f.get(), this.f36048c, q(), n(), (InterfaceC3684d) this.f36053h.get());
        }

        @Override // n3.x
        public y.a a() {
            return new c(this.f36050e);
        }

        private b(s sVar, u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f36050e = this;
            this.f36046a = context;
            this.f36047b = function0;
            this.f36048c = set;
            this.f36049d = sVar;
            o(sVar, dVar, c3801a, context, bool, function0, function02, set, bool2);
        }
    }

    /* renamed from: n3.e$c */
    /* loaded from: classes4.dex */
    private static final class c implements y.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f36069a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f36070b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f36071c;

        @Override // n3.y.a
        public y build() {
            u5.h.a(this.f36070b, Boolean.class);
            u5.h.a(this.f36071c, SavedStateHandle.class);
            return new d(this.f36069a, this.f36070b, this.f36071c);
        }

        @Override // n3.y.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(boolean z8) {
            this.f36070b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.y.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f36071c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f36069a = bVar;
        }
    }

    /* renamed from: n3.e$d */
    /* loaded from: classes4.dex */
    private static final class d implements y {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f36072a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f36073b;

        /* renamed from: c, reason: collision with root package name */
        private final b f36074c;

        /* renamed from: d, reason: collision with root package name */
        private final d f36075d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f36076e;

        private void b(Boolean bool, SavedStateHandle savedStateHandle) {
            this.f36076e = x2.k.a(this.f36074c.f36057l, this.f36074c.f36064s);
        }

        @Override // n3.y
        public com.stripe.android.payments.paymentlauncher.b a() {
            return new com.stripe.android.payments.paymentlauncher.b(this.f36072a.booleanValue(), this.f36074c.r(), (InterfaceC3178h) this.f36074c.f36062q.get(), (C2660a) this.f36074c.f36063r.get(), this.f36076e, (Map) this.f36074c.f36056k.get(), u5.d.b(this.f36074c.f36067v), u5.d.b(this.f36074c.f36068w), this.f36074c.n(), this.f36074c.q(), (P5.g) this.f36074c.f36055j.get(), this.f36073b, this.f36074c.p());
        }

        private d(b bVar, Boolean bool, SavedStateHandle savedStateHandle) {
            this.f36075d = this;
            this.f36074c = bVar;
            this.f36072a = bool;
            this.f36073b = savedStateHandle;
            b(bool, savedStateHandle);
        }
    }

    public static x.a a() {
        return new a();
    }
}
