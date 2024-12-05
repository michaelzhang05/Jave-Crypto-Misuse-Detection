package r2;

import g6.n;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3681a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0858a f37559a = new C0858a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final C3681a f37560b = new C3681a();

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0858a {
        private C0858a() {
        }

        public final C3681a a() {
            return C3681a.f37560b;
        }

        public /* synthetic */ C0858a(AbstractC3151p abstractC3151p) {
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
