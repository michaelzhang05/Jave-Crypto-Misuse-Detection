package u2;

import j6.n;
import kotlin.jvm.internal.AbstractC3247p;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4054a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0893a f39939a = new C0893a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final C4054a f39940b = new C4054a();

    /* renamed from: u2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0893a {
        private C0893a() {
        }

        public final C4054a a() {
            return C4054a.f39940b;
        }

        public /* synthetic */ C0893a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final String b(String str) {
        boolean z8;
        if (str != null && !n.u(str)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!z8) {
            if (!n.C(str, "sk_", false, 2, null)) {
                return str;
            }
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys".toString());
        }
        throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys".toString());
    }
}
