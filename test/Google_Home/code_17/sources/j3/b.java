package J3;

import J3.f;
import J3.m;
import Q3.c;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.b;
import kotlin.jvm.functions.Function0;
import l6.I;
import u2.InterfaceC4057d;
import x2.C4186a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f4901a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f4902b;

        /* renamed from: c, reason: collision with root package name */
        private I f4903c;

        private a() {
        }

        @Override // J3.f.a
        public f build() {
            x5.h.a(this.f4901a, Application.class);
            x5.h.a(this.f4902b, c.a.class);
            x5.h.a(this.f4903c, I.class);
            return new C0073b(new x2.d(), new C4186a(), this.f4901a, this.f4902b, this.f4903c);
        }

        @Override // J3.f.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f4901a = (Application) x5.h.b(application);
            return this;
        }

        @Override // J3.f.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(c.a aVar) {
            this.f4902b = (c.a) x5.h.b(aVar);
            return this;
        }

        @Override // J3.f.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(I i8) {
            this.f4903c = (I) x5.h.b(i8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0073b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Application f4904a;

        /* renamed from: b, reason: collision with root package name */
        private final c.a f4905b;

        /* renamed from: c, reason: collision with root package name */
        private final I f4906c;

        /* renamed from: d, reason: collision with root package name */
        private final C0073b f4907d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f4908e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f4909f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f4910g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f4911h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f4912i;

        private Context d() {
            return j.c(this.f4904a);
        }

        private A2.m e() {
            return new A2.m((InterfaceC4057d) this.f4909f.get(), (S5.g) this.f4908e.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Q3.a f() {
            return new Q3.a(j(), this.f4912i, this.f4905b, this.f4906c);
        }

        private void g(x2.d dVar, C4186a c4186a, Application application, c.a aVar, I i8) {
            this.f4908e = x5.d.c(x2.f.a(dVar));
            this.f4909f = x5.d.c(x2.c.a(c4186a, k.a()));
            x5.e a8 = x5.f.a(application);
            this.f4910g = a8;
            j a9 = j.a(a8);
            this.f4911h = a9;
            this.f4912i = h.a(a9);
        }

        private Function0 h() {
            return i.a(d());
        }

        private PaymentAnalyticsRequestFactory i() {
            return new PaymentAnalyticsRequestFactory(d(), h(), l.a());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(d(), h(), (S5.g) this.f4908e.get(), l.a(), i(), e(), (InterfaceC4057d) this.f4909f.get());
        }

        @Override // J3.f
        public m.a a() {
            return new c(this.f4907d);
        }

        private C0073b(x2.d dVar, C4186a c4186a, Application application, c.a aVar, I i8) {
            this.f4907d = this;
            this.f4904a = application;
            this.f4905b = aVar;
            this.f4906c = i8;
            g(dVar, c4186a, application, aVar, i8);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0073b f4913a;

        /* renamed from: b, reason: collision with root package name */
        private SavedStateHandle f4914b;

        /* renamed from: c, reason: collision with root package name */
        private b.e f4915c;

        @Override // J3.m.a
        public m build() {
            x5.h.a(this.f4914b, SavedStateHandle.class);
            x5.h.a(this.f4915c, b.e.class);
            return new d(this.f4913a, this.f4914b, this.f4915c);
        }

        @Override // J3.m.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(b.e eVar) {
            this.f4915c = (b.e) x5.h.b(eVar);
            return this;
        }

        @Override // J3.m.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f4914b = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        private c(C0073b c0073b) {
            this.f4913a = c0073b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b.e f4916a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f4917b;

        /* renamed from: c, reason: collision with root package name */
        private final C0073b f4918c;

        /* renamed from: d, reason: collision with root package name */
        private final d f4919d;

        @Override // J3.m
        public com.stripe.android.paymentsheet.paymentdatacollection.polling.b a() {
            return new com.stripe.android.paymentsheet.paymentdatacollection.polling.b(this.f4916a, this.f4918c.f(), new I3.b(), this.f4918c.f4906c, this.f4917b);
        }

        private d(C0073b c0073b, SavedStateHandle savedStateHandle, b.e eVar) {
            this.f4919d = this;
            this.f4918c = c0073b;
            this.f4916a = eVar;
            this.f4917b = savedStateHandle;
        }
    }

    public static f.a a() {
        return new a();
    }
}
