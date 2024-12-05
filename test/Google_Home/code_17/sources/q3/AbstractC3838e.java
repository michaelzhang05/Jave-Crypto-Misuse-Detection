package q3;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import i3.C2978a;
import i3.C2985h;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import o3.InterfaceC3526h;
import q3.x;
import q3.y;
import u2.InterfaceC4057d;
import x2.C4186a;

/* renamed from: q3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3838e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38168a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f38169b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f38170c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f38171d;

        /* renamed from: e, reason: collision with root package name */
        private Set f38172e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f38173f;

        private a() {
        }

        @Override // q3.x.a
        public x build() {
            x5.h.a(this.f38168a, Context.class);
            x5.h.a(this.f38169b, Boolean.class);
            x5.h.a(this.f38170c, Function0.class);
            x5.h.a(this.f38171d, Function0.class);
            x5.h.a(this.f38172e, Set.class);
            x5.h.a(this.f38173f, Boolean.class);
            return new b(new s(), new x2.d(), new C4186a(), this.f38168a, this.f38169b, this.f38170c, this.f38171d, this.f38172e, this.f38173f);
        }

        @Override // q3.x.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f38168a = (Context) x5.h.b(context);
            return this;
        }

        @Override // q3.x.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f38169b = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.x.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(boolean z8) {
            this.f38173f = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.x.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f38172e = (Set) x5.h.b(set);
            return this;
        }

        @Override // q3.x.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f38170c = (Function0) x5.h.b(function0);
            return this;
        }

        @Override // q3.x.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f38171d = (Function0) x5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.e$b */
    /* loaded from: classes4.dex */
    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38174a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f38175b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f38176c;

        /* renamed from: d, reason: collision with root package name */
        private final s f38177d;

        /* renamed from: e, reason: collision with root package name */
        private final b f38178e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f38179f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f38180g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f38181h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f38182i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f38183j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f38184k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f38185l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f38186m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f38187n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f38188o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f38189p;

        /* renamed from: q, reason: collision with root package name */
        private x5.i f38190q;

        /* renamed from: r, reason: collision with root package name */
        private x5.i f38191r;

        /* renamed from: s, reason: collision with root package name */
        private x5.i f38192s;

        /* renamed from: t, reason: collision with root package name */
        private x5.i f38193t;

        /* renamed from: u, reason: collision with root package name */
        private x5.i f38194u;

        /* renamed from: v, reason: collision with root package name */
        private x5.i f38195v;

        /* renamed from: w, reason: collision with root package name */
        private x5.i f38196w;

        /* JADX INFO: Access modifiers changed from: private */
        public A2.m n() {
            return new A2.m((InterfaceC4057d) this.f38181h.get(), (S5.g) this.f38179f.get());
        }

        private void o(s sVar, x2.d dVar, C4186a c4186a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f38179f = x5.d.c(x2.f.a(dVar));
            x5.e a8 = x5.f.a(bool);
            this.f38180g = a8;
            this.f38181h = x5.d.c(x2.c.a(c4186a, a8));
            this.f38182i = x5.f.a(context);
            this.f38183j = x5.d.c(x2.e.a(dVar));
            this.f38184k = x5.d.c(w.a(sVar));
            this.f38185l = x5.f.a(function0);
            x5.e a9 = x5.f.a(set);
            this.f38186m = a9;
            this.f38187n = h3.j.a(this.f38182i, this.f38185l, a9);
            this.f38188o = u.a(sVar, this.f38182i);
            x5.e a10 = x5.f.a(bool2);
            this.f38189p = a10;
            this.f38190q = x5.d.c(v.a(sVar, this.f38182i, this.f38180g, this.f38179f, this.f38183j, this.f38184k, this.f38187n, this.f38185l, this.f38186m, this.f38188o, a10));
            this.f38191r = x5.d.c(t.a(sVar, this.f38182i));
            this.f38192s = x5.f.a(function02);
            A2.n a11 = A2.n.a(this.f38181h, this.f38179f);
            this.f38193t = a11;
            h3.k a12 = h3.k.a(this.f38182i, this.f38185l, this.f38179f, this.f38186m, this.f38187n, a11, this.f38181h);
            this.f38194u = a12;
            this.f38195v = x5.d.c(C2985h.a(this.f38182i, this.f38185l, a12, this.f38181h, this.f38179f));
            this.f38196w = x5.d.c(i3.k.a(this.f38182i, this.f38185l, this.f38194u, this.f38181h, this.f38179f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return this.f38177d.b(this.f38174a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory q() {
            return new PaymentAnalyticsRequestFactory(this.f38174a, this.f38175b, this.f38176c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a r() {
            return new com.stripe.android.networking.a(this.f38174a, this.f38175b, (S5.g) this.f38179f.get(), this.f38176c, q(), n(), (InterfaceC4057d) this.f38181h.get());
        }

        @Override // q3.x
        public y.a a() {
            return new c(this.f38178e);
        }

        private b(s sVar, x2.d dVar, C4186a c4186a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f38178e = this;
            this.f38174a = context;
            this.f38175b = function0;
            this.f38176c = set;
            this.f38177d = sVar;
            o(sVar, dVar, c4186a, context, bool, function0, function02, set, bool2);
        }
    }

    /* renamed from: q3.e$c */
    /* loaded from: classes4.dex */
    private static final class c implements y.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f38197a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f38198b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f38199c;

        @Override // q3.y.a
        public y build() {
            x5.h.a(this.f38198b, Boolean.class);
            x5.h.a(this.f38199c, SavedStateHandle.class);
            return new d(this.f38197a, this.f38198b, this.f38199c);
        }

        @Override // q3.y.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(boolean z8) {
            this.f38198b = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.y.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f38199c = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f38197a = bVar;
        }
    }

    /* renamed from: q3.e$d */
    /* loaded from: classes4.dex */
    private static final class d implements y {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f38200a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f38201b;

        /* renamed from: c, reason: collision with root package name */
        private final b f38202c;

        /* renamed from: d, reason: collision with root package name */
        private final d f38203d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f38204e;

        private void b(Boolean bool, SavedStateHandle savedStateHandle) {
            this.f38204e = A2.k.a(this.f38202c.f38185l, this.f38202c.f38192s);
        }

        @Override // q3.y
        public com.stripe.android.payments.paymentlauncher.b a() {
            return new com.stripe.android.payments.paymentlauncher.b(this.f38200a.booleanValue(), this.f38202c.r(), (InterfaceC3526h) this.f38202c.f38190q.get(), (C2978a) this.f38202c.f38191r.get(), this.f38204e, (Map) this.f38202c.f38184k.get(), x5.d.b(this.f38202c.f38195v), x5.d.b(this.f38202c.f38196w), this.f38202c.n(), this.f38202c.q(), (S5.g) this.f38202c.f38183j.get(), this.f38201b, this.f38202c.p());
        }

        private d(b bVar, Boolean bool, SavedStateHandle savedStateHandle) {
            this.f38203d = this;
            this.f38202c = bVar;
            this.f38200a = bool;
            this.f38201b = savedStateHandle;
            b(bool, savedStateHandle);
        }
    }

    public static x.a a() {
        return new a();
    }
}
