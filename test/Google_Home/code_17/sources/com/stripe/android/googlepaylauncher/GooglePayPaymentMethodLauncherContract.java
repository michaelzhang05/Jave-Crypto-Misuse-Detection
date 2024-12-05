package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherContract extends ActivityResultContract<a, h.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24868a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final h.d f24871a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24872b;

        /* renamed from: c, reason: collision with root package name */
        private final int f24873c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24874d;

        /* renamed from: e, reason: collision with root package name */
        private final c f24875e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0465a f24869f = new C0465a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f24870g = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0465a {
            private C0465a() {
            }

            public /* synthetic */ C0465a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(h.d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable {
            public static final Parcelable.Creator<c> CREATOR = new C0466a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24876a;

            /* renamed from: b, reason: collision with root package name */
            private final Set f24877b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f24878c;

            /* renamed from: d, reason: collision with root package name */
            private final String f24879d;

            /* renamed from: e, reason: collision with root package name */
            private final String f24880e;

            /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0466a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(readString, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(String injectorKey, Set productUsage, boolean z8, String publishableKey, String str) {
                AbstractC3255y.i(injectorKey, "injectorKey");
                AbstractC3255y.i(productUsage, "productUsage");
                AbstractC3255y.i(publishableKey, "publishableKey");
                this.f24876a = injectorKey;
                this.f24877b = productUsage;
                this.f24878c = z8;
                this.f24879d = publishableKey;
                this.f24880e = str;
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
                return AbstractC3255y.d(this.f24876a, cVar.f24876a) && AbstractC3255y.d(this.f24877b, cVar.f24877b) && this.f24878c == cVar.f24878c && AbstractC3255y.d(this.f24879d, cVar.f24879d) && AbstractC3255y.d(this.f24880e, cVar.f24880e);
            }

            public int hashCode() {
                int hashCode = ((((((this.f24876a.hashCode() * 31) + this.f24877b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24878c)) * 31) + this.f24879d.hashCode()) * 31;
                String str = this.f24880e;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InjectionParams(injectorKey=" + this.f24876a + ", productUsage=" + this.f24877b + ", enableLogging=" + this.f24878c + ", publishableKey=" + this.f24879d + ", stripeAccountId=" + this.f24880e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f24876a);
                Set set = this.f24877b;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f24878c ? 1 : 0);
                out.writeString(this.f24879d);
                out.writeString(this.f24880e);
            }
        }

        public a(h.d config, String currencyCode, int i8, String str, c cVar) {
            AbstractC3255y.i(config, "config");
            AbstractC3255y.i(currencyCode, "currencyCode");
            this.f24871a = config;
            this.f24872b = currencyCode;
            this.f24873c = i8;
            this.f24874d = str;
            this.f24875e = cVar;
        }

        public final int a() {
            return this.f24873c;
        }

        public final h.d b() {
            return this.f24871a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f24871a, aVar.f24871a) && AbstractC3255y.d(this.f24872b, aVar.f24872b) && this.f24873c == aVar.f24873c && AbstractC3255y.d(this.f24874d, aVar.f24874d) && AbstractC3255y.d(this.f24875e, aVar.f24875e);
        }

        public final String g() {
            return this.f24872b;
        }

        public final String h() {
            return this.f24874d;
        }

        public int hashCode() {
            int hashCode = ((((this.f24871a.hashCode() * 31) + this.f24872b.hashCode()) * 31) + this.f24873c) * 31;
            String str = this.f24874d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            c cVar = this.f24875e;
            return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Args(config=" + this.f24871a + ", currencyCode=" + this.f24872b + ", amount=" + this.f24873c + ", transactionId=" + this.f24874d + ", injectionParams=" + this.f24875e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f24871a.writeToParcel(out, i8);
            out.writeString(this.f24872b);
            out.writeInt(this.f24873c);
            out.writeString(this.f24874d);
            c cVar = this.f24875e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        GooglePayPaymentMethodLauncherContractV2.a b8;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent intent = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class);
        b8 = i.b(input);
        Intent putExtras = intent.putExtras(b8.l());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h.f parseResult(int i8, Intent intent) {
        h.f fVar;
        if (intent != null) {
            fVar = (h.f) intent.getParcelableExtra("extra_result");
        } else {
            fVar = null;
        }
        if (fVar == null) {
            return new h.f.c(new IllegalArgumentException("Could not parse a valid result."), 1);
        }
        return fVar;
    }
}
