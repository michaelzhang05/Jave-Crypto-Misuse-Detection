package G3;

import G3.f;
import G3.m;
import N3.c;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.b;
import i6.I;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;
import u2.C3801a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f3182a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f3183b;

        /* renamed from: c, reason: collision with root package name */
        private I f3184c;

        private a() {
        }

        @Override // G3.f.a
        public f build() {
            u5.h.a(this.f3182a, Application.class);
            u5.h.a(this.f3183b, c.a.class);
            u5.h.a(this.f3184c, I.class);
            return new C0047b(new u2.d(), new C3801a(), this.f3182a, this.f3183b, this.f3184c);
        }

        @Override // G3.f.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f3182a = (Application) u5.h.b(application);
            return this;
        }

        @Override // G3.f.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(c.a aVar) {
            this.f3183b = (c.a) u5.h.b(aVar);
            return this;
        }

        @Override // G3.f.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(I i8) {
            this.f3184c = (I) u5.h.b(i8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0047b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Application f3185a;

        /* renamed from: b, reason: collision with root package name */
        private final c.a f3186b;

        /* renamed from: c, reason: collision with root package name */
        private final I f3187c;

        /* renamed from: d, reason: collision with root package name */
        private final C0047b f3188d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f3189e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f3190f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f3191g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f3192h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f3193i;

        private Context d() {
            return j.c(this.f3185a);
        }

        private x2.m e() {
            return new x2.m((InterfaceC3684d) this.f3190f.get(), (P5.g) this.f3189e.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public N3.a f() {
            return new N3.a(j(), this.f3193i, this.f3186b, this.f3187c);
        }

        private void g(u2.d dVar, C3801a c3801a, Application application, c.a aVar, I i8) {
            this.f3189e = u5.d.c(u2.f.a(dVar));
            this.f3190f = u5.d.c(u2.c.a(c3801a, k.a()));
            u5.e a8 = u5.f.a(application);
            this.f3191g = a8;
            j a9 = j.a(a8);
            this.f3192h = a9;
            this.f3193i = h.a(a9);
        }

        private Function0 h() {
            return i.a(d());
        }

        private PaymentAnalyticsRequestFactory i() {
            return new PaymentAnalyticsRequestFactory(d(), h(), l.a());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(d(), h(), (P5.g) this.f3189e.get(), l.a(), i(), e(), (InterfaceC3684d) this.f3190f.get());
        }

        @Override // G3.f
        public m.a a() {
            return new c(this.f3188d);
        }

        private C0047b(u2.d dVar, C3801a c3801a, Application application, c.a aVar, I i8) {
            this.f3188d = this;
            this.f3185a = application;
            this.f3186b = aVar;
            this.f3187c = i8;
            g(dVar, c3801a, application, aVar, i8);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0047b f3194a;

        /* renamed from: b, reason: collision with root package name */
        private SavedStateHandle f3195b;

        /* renamed from: c, reason: collision with root package name */
        private b.e f3196c;

        @Override // G3.m.a
        public m build() {
            u5.h.a(this.f3195b, SavedStateHandle.class);
            u5.h.a(this.f3196c, b.e.class);
            return new d(this.f3194a, this.f3195b, this.f3196c);
        }

        @Override // G3.m.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(b.e eVar) {
            this.f3196c = (b.e) u5.h.b(eVar);
            return this;
        }

        @Override // G3.m.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f3195b = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(C0047b c0047b) {
            this.f3194a = c0047b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b.e f3197a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f3198b;

        /* renamed from: c, reason: collision with root package name */
        private final C0047b f3199c;

        /* renamed from: d, reason: collision with root package name */
        private final d f3200d;

        @Override // G3.m
        public com.stripe.android.paymentsheet.paymentdatacollection.polling.b a() {
            return new com.stripe.android.paymentsheet.paymentdatacollection.polling.b(this.f3197a, this.f3199c.f(), new F3.b(), this.f3199c.f3187c, this.f3198b);
        }

        private d(C0047b c0047b, SavedStateHandle savedStateHandle, b.e eVar) {
            this.f3200d = this;
            this.f3199c = c0047b;
            this.f3197a = eVar;
            this.f3198b = savedStateHandle;
        }
    }

    public static f.a a() {
        return new a();
    }
}
