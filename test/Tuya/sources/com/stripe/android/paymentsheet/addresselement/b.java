package com.stripe.android.paymentsheet.addresselement;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f25573a;

    /* loaded from: classes4.dex */
    public static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final C0588a f25574c = new C0588a(null);

        /* renamed from: b, reason: collision with root package name */
        private final String f25575b;

        /* renamed from: com.stripe.android.paymentsheet.addresselement.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0588a {
            private C0588a() {
            }

            public /* synthetic */ C0588a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String country) {
            super("Autocomplete?country=" + country, null);
            AbstractC3159y.i(country, "country");
            this.f25575b = country;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.addresselement.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0589b extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final C0589b f25576b = new C0589b();

        private C0589b() {
            super("InputAddress", null);
        }
    }

    public /* synthetic */ b(String str, AbstractC3151p abstractC3151p) {
        this(str);
    }

    public String a() {
        return this.f25573a;
    }

    private b(String str) {
        this.f25573a = str;
    }
}
