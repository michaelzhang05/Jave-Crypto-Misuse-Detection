package n3;

import A2.m;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import n3.InterfaceC3474d;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3472b {

    /* renamed from: n3.b$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC3474d.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f35378a;

        /* renamed from: b, reason: collision with root package name */
        private Set f35379b;

        private a() {
        }

        @Override // n3.InterfaceC3474d.a
        public InterfaceC3474d build() {
            x5.h.a(this.f35378a, Context.class);
            x5.h.a(this.f35379b, Set.class);
            return new C0804b(this.f35378a, this.f35379b);
        }

        @Override // n3.InterfaceC3474d.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f35378a = (Context) x5.h.b(context);
            return this;
        }

        @Override // n3.InterfaceC3474d.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f35379b = (Set) x5.h.b(set);
            return this;
        }
    }

    /* renamed from: n3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0804b implements InterfaceC3474d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35380a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f35381b;

        /* renamed from: c, reason: collision with root package name */
        private final C0804b f35382c;

        private m b() {
            return new m(g.a(), f.a());
        }

        private Function0 c() {
            return h.a(this.f35380a);
        }

        private PaymentAnalyticsRequestFactory d() {
            return new PaymentAnalyticsRequestFactory(this.f35380a, c(), this.f35381b);
        }

        private j e() {
            return new j(b(), d());
        }

        @Override // n3.InterfaceC3474d
        public i a() {
            return e();
        }

        private C0804b(Context context, Set set) {
            this.f35382c = this;
            this.f35380a = context;
            this.f35381b = set;
        }
    }

    public static InterfaceC3474d.a a() {
        return new a();
    }
}
