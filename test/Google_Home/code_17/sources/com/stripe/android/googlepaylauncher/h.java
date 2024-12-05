package com.stripe.android.googlepaylauncher;

import A2.InterfaceC0945c;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.model.o;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import j6.n;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final c f24973g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f24974h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final d f24975a;

    /* renamed from: b, reason: collision with root package name */
    private final e f24976b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f24977c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24978d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f24979e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24980f;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f24981a;

        /* renamed from: b, reason: collision with root package name */
        int f24982b;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object e8 = T5.b.e();
            int i8 = this.f24982b;
            if (i8 != 0) {
                if (i8 == 1) {
                    eVar = (e) this.f24981a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                L2.g gVar = (L2.g) h.this.f24979e.invoke(h.this.f24975a.g());
                e eVar2 = h.this.f24976b;
                InterfaceC3706f isReady = gVar.isReady();
                this.f24981a = eVar2;
                this.f24982b = 1;
                obj = AbstractC3708h.w(isReady, this);
                if (obj == e8) {
                    return e8;
                }
                eVar = eVar2;
            }
            Boolean bool = (Boolean) obj;
            h.this.f24980f = bool.booleanValue();
            eVar.a(bool.booleanValue());
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(boolean z8);
    }

    /* loaded from: classes4.dex */
    public static abstract class f implements Parcelable {

        /* loaded from: classes4.dex */
        public static final class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f24999a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C0473a();

            /* renamed from: com.stripe.android.googlepaylauncher.h$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0473a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    parcel.readInt();
                    return a.f24999a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -299418266;
            }

            public String toString() {
                return "Canceled";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends f {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final o f25000a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new b(o.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o paymentMethod) {
                super(null);
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f25000a = paymentMethod;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3255y.d(this.f25000a, ((b) obj).f25000a);
            }

            public int hashCode() {
                return this.f25000a.hashCode();
            }

            public final o r() {
                return this.f25000a;
            }

            public String toString() {
                return "Completed(paymentMethod=" + this.f25000a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                this.f25000a.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f25001a;

            /* renamed from: b, reason: collision with root package name */
            private final int f25002b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new c((Throwable) parcel.readSerializable(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable error, int i8) {
                super(null);
                AbstractC3255y.i(error, "error");
                this.f25001a = error;
                this.f25002b = i8;
            }

            public final Throwable a() {
                return this.f25001a;
            }

            public final int b() {
                return this.f25002b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3255y.d(this.f25001a, cVar.f25001a) && this.f25002b == cVar.f25002b;
            }

            public int hashCode() {
                return (this.f25001a.hashCode() * 31) + this.f25002b;
            }

            public String toString() {
                return "Failed(error=" + this.f25001a + ", errorCode=" + this.f25002b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeSerializable(this.f25001a);
                out.writeInt(this.f25002b);
            }
        }

        private f() {
        }

        public /* synthetic */ f(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public h(M lifecycleScope, d config, e readyCallback, ActivityResultLauncher activityResultLauncher, boolean z8, Context context, Function1 googlePayRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0945c analyticsRequestExecutor) {
        AbstractC3255y.i(lifecycleScope, "lifecycleScope");
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(readyCallback, "readyCallback");
        AbstractC3255y.i(activityResultLauncher, "activityResultLauncher");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.f24975a = config;
        this.f24976b = readyCallback;
        this.f24977c = activityResultLauncher;
        this.f24978d = z8;
        this.f24979e = googlePayRepositoryFactory;
        analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.v(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.f25926y0, null, null, null, null, null, 62, null));
        if (!z8) {
            AbstractC3364k.d(lifecycleScope, null, null, new a(null), 3, null);
        }
    }

    public final void e(String currencyCode, long j8, String str, String str2) {
        AbstractC3255y.i(currencyCode, "currencyCode");
        if (!this.f24978d && !this.f24980f) {
            throw new IllegalStateException("present() may only be called when Google Pay is available on this device.".toString());
        }
        this.f24977c.launch(new GooglePayPaymentMethodLauncherContractV2.a(this.f24975a, currencyCode, j8, str2, str));
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f24984a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC0472b f24985b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f24986c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readInt() != 0, EnumC0472b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.stripe.android.googlepaylauncher.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0472b {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0472b f24987b = new EnumC0472b("Min", 0, "MIN");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0472b f24988c = new EnumC0472b("Full", 1, "FULL");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0472b[] f24989d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f24990e;

            /* renamed from: a, reason: collision with root package name */
            private final String f24991a;

            static {
                EnumC0472b[] a8 = a();
                f24989d = a8;
                f24990e = U5.b.a(a8);
            }

            private EnumC0472b(String str, int i8, String str2) {
                this.f24991a = str2;
            }

            private static final /* synthetic */ EnumC0472b[] a() {
                return new EnumC0472b[]{f24987b, f24988c};
            }

            public static EnumC0472b valueOf(String str) {
                return (EnumC0472b) Enum.valueOf(EnumC0472b.class, str);
            }

            public static EnumC0472b[] values() {
                return (EnumC0472b[]) f24989d.clone();
            }
        }

        public b(boolean z8, EnumC0472b format, boolean z9) {
            AbstractC3255y.i(format, "format");
            this.f24984a = z8;
            this.f24985b = format;
            this.f24986c = z9;
        }

        public final EnumC0472b a() {
            return this.f24985b;
        }

        public final boolean b() {
            return this.f24986c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f24984a == bVar.f24984a && this.f24985b == bVar.f24985b && this.f24986c == bVar.f24986c;
        }

        public final boolean g() {
            return this.f24984a;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f24984a) * 31) + this.f24985b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24986c);
        }

        public String toString() {
            return "BillingAddressConfig(isRequired=" + this.f24984a + ", format=" + this.f24985b + ", isPhoneNumberRequired=" + this.f24986c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f24984a ? 1 : 0);
            out.writeString(this.f24985b.name());
            out.writeInt(this.f24986c ? 1 : 0);
        }

        public /* synthetic */ b(boolean z8, EnumC0472b enumC0472b, boolean z9, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? EnumC0472b.f24987b : enumC0472b, (i8 & 4) != 0 ? false : z9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final L2.d f24992a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24993b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24994c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f24995d;

        /* renamed from: e, reason: collision with root package name */
        private b f24996e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f24997f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f24998g;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(L2.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(L2.d environment, String merchantCountryCode, String merchantName, boolean z8, b billingAddressConfig, boolean z9, boolean z10) {
            AbstractC3255y.i(environment, "environment");
            AbstractC3255y.i(merchantCountryCode, "merchantCountryCode");
            AbstractC3255y.i(merchantName, "merchantName");
            AbstractC3255y.i(billingAddressConfig, "billingAddressConfig");
            this.f24992a = environment;
            this.f24993b = merchantCountryCode;
            this.f24994c = merchantName;
            this.f24995d = z8;
            this.f24996e = billingAddressConfig;
            this.f24997f = z9;
            this.f24998g = z10;
        }

        public final boolean a() {
            return this.f24998g;
        }

        public final b b() {
            return this.f24996e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24992a == dVar.f24992a && AbstractC3255y.d(this.f24993b, dVar.f24993b) && AbstractC3255y.d(this.f24994c, dVar.f24994c) && this.f24995d == dVar.f24995d && AbstractC3255y.d(this.f24996e, dVar.f24996e) && this.f24997f == dVar.f24997f && this.f24998g == dVar.f24998g;
        }

        public final L2.d g() {
            return this.f24992a;
        }

        public final boolean h() {
            return this.f24997f;
        }

        public int hashCode() {
            return (((((((((((this.f24992a.hashCode() * 31) + this.f24993b.hashCode()) * 31) + this.f24994c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24995d)) * 31) + this.f24996e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24997f)) * 31) + androidx.compose.foundation.a.a(this.f24998g);
        }

        public final String i() {
            return this.f24993b;
        }

        public final String l() {
            return this.f24994c;
        }

        public final boolean p() {
            return this.f24995d;
        }

        public final boolean s() {
            return n.s(this.f24993b, Locale.JAPAN.getCountry(), true);
        }

        public String toString() {
            return "Config(environment=" + this.f24992a + ", merchantCountryCode=" + this.f24993b + ", merchantName=" + this.f24994c + ", isEmailRequired=" + this.f24995d + ", billingAddressConfig=" + this.f24996e + ", existingPaymentMethodRequired=" + this.f24997f + ", allowCreditCards=" + this.f24998g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f24992a.name());
            out.writeString(this.f24993b);
            out.writeString(this.f24994c);
            out.writeInt(this.f24995d ? 1 : 0);
            this.f24996e.writeToParcel(out, i8);
            out.writeInt(this.f24997f ? 1 : 0);
            out.writeInt(this.f24998g ? 1 : 0);
        }

        public /* synthetic */ d(L2.d dVar, String str, String str2, boolean z8, b bVar, boolean z9, boolean z10, int i8, AbstractC3247p abstractC3247p) {
            this(dVar, str, str2, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? new b(false, null, false, 7, null) : bVar, (i8 & 32) != 0 ? true : z9, (i8 & 64) != 0 ? true : z10);
        }
    }
}
