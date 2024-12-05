package k3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import k3.InterfaceC3119d;
import kotlin.jvm.functions.Function0;
import x2.m;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3117b {

    /* renamed from: k3.b$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC3119d.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f33386a;

        /* renamed from: b, reason: collision with root package name */
        private Set f33387b;

        private a() {
        }

        @Override // k3.InterfaceC3119d.a
        public InterfaceC3119d build() {
            u5.h.a(this.f33386a, Context.class);
            u5.h.a(this.f33387b, Set.class);
            return new C0774b(this.f33386a, this.f33387b);
        }

        @Override // k3.InterfaceC3119d.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f33386a = (Context) u5.h.b(context);
            return this;
        }

        @Override // k3.InterfaceC3119d.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f33387b = (Set) u5.h.b(set);
            return this;
        }
    }

    /* renamed from: k3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0774b implements InterfaceC3119d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f33388a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f33389b;

        /* renamed from: c, reason: collision with root package name */
        private final C0774b f33390c;

        private m b() {
            return new m(g.a(), f.a());
        }

        private Function0 c() {
            return h.a(this.f33388a);
        }

        private PaymentAnalyticsRequestFactory d() {
            return new PaymentAnalyticsRequestFactory(this.f33388a, c(), this.f33389b);
        }

        private j e() {
            return new j(b(), d());
        }

        @Override // k3.InterfaceC3119d
        public i a() {
            return e();
        }

        private C0774b(Context context, Set set) {
            this.f33390c = this;
            this.f33388a = context;
            this.f33389b = set;
        }
    }

    public static InterfaceC3119d.a a() {
        return new a();
    }
}
