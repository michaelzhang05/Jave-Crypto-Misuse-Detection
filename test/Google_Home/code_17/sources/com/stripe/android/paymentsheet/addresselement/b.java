package com.stripe.android.paymentsheet.addresselement;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f26628a;

    /* loaded from: classes4.dex */
    public static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final C0584a f26629c = new C0584a(null);

        /* renamed from: b, reason: collision with root package name */
        private final String f26630b;

        /* renamed from: com.stripe.android.paymentsheet.addresselement.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0584a {
            private C0584a() {
            }

            public /* synthetic */ C0584a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String country) {
            super("Autocomplete?country=" + country, null);
            AbstractC3255y.i(country, "country");
            this.f26630b = country;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.addresselement.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0585b extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final C0585b f26631b = new C0585b();

        private C0585b() {
            super("InputAddress", null);
        }
    }

    public /* synthetic */ b(String str, AbstractC3247p abstractC3247p) {
        this(str);
    }

    public String a() {
        return this.f26628a;
    }

    private b(String str) {
        this.f26628a = str;
    }
}
