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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherContract extends ActivityResultContract<a, h.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23813a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final h.d f23816a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23817b;

        /* renamed from: c, reason: collision with root package name */
        private final int f23818c;

        /* renamed from: d, reason: collision with root package name */
        private final String f23819d;

        /* renamed from: e, reason: collision with root package name */
        private final c f23820e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0469a f23814f = new C0469a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f23815g = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0469a {
            private C0469a() {
            }

            public /* synthetic */ C0469a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            public static final Parcelable.Creator<c> CREATOR = new C0470a();

            /* renamed from: a, reason: collision with root package name */
            private final String f23821a;

            /* renamed from: b, reason: collision with root package name */
            private final Set f23822b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f23823c;

            /* renamed from: d, reason: collision with root package name */
            private final String f23824d;

            /* renamed from: e, reason: collision with root package name */
            private final String f23825e;

            /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0470a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(injectorKey, "injectorKey");
                AbstractC3159y.i(productUsage, "productUsage");
                AbstractC3159y.i(publishableKey, "publishableKey");
                this.f23821a = injectorKey;
                this.f23822b = productUsage;
                this.f23823c = z8;
                this.f23824d = publishableKey;
                this.f23825e = str;
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
                return AbstractC3159y.d(this.f23821a, cVar.f23821a) && AbstractC3159y.d(this.f23822b, cVar.f23822b) && this.f23823c == cVar.f23823c && AbstractC3159y.d(this.f23824d, cVar.f23824d) && AbstractC3159y.d(this.f23825e, cVar.f23825e);
            }

            public int hashCode() {
                int hashCode = ((((((this.f23821a.hashCode() * 31) + this.f23822b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23823c)) * 31) + this.f23824d.hashCode()) * 31;
                String str = this.f23825e;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InjectionParams(injectorKey=" + this.f23821a + ", productUsage=" + this.f23822b + ", enableLogging=" + this.f23823c + ", publishableKey=" + this.f23824d + ", stripeAccountId=" + this.f23825e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f23821a);
                Set set = this.f23822b;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f23823c ? 1 : 0);
                out.writeString(this.f23824d);
                out.writeString(this.f23825e);
            }
        }

        public a(h.d config, String currencyCode, int i8, String str, c cVar) {
            AbstractC3159y.i(config, "config");
            AbstractC3159y.i(currencyCode, "currencyCode");
            this.f23816a = config;
            this.f23817b = currencyCode;
            this.f23818c = i8;
            this.f23819d = str;
            this.f23820e = cVar;
        }

        public final int b() {
            return this.f23818c;
        }

        public final h.d c() {
            return this.f23816a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f23817b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f23816a, aVar.f23816a) && AbstractC3159y.d(this.f23817b, aVar.f23817b) && this.f23818c == aVar.f23818c && AbstractC3159y.d(this.f23819d, aVar.f23819d) && AbstractC3159y.d(this.f23820e, aVar.f23820e);
        }

        public final String f() {
            return this.f23819d;
        }

        public int hashCode() {
            int hashCode = ((((this.f23816a.hashCode() * 31) + this.f23817b.hashCode()) * 31) + this.f23818c) * 31;
            String str = this.f23819d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            c cVar = this.f23820e;
            return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Args(config=" + this.f23816a + ", currencyCode=" + this.f23817b + ", amount=" + this.f23818c + ", transactionId=" + this.f23819d + ", injectionParams=" + this.f23820e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f23816a.writeToParcel(out, i8);
            out.writeString(this.f23817b);
            out.writeInt(this.f23818c);
            out.writeString(this.f23819d);
            c cVar = this.f23820e;
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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        GooglePayPaymentMethodLauncherContractV2.a b8;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent intent = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class);
        b8 = i.b(input);
        Intent putExtras = intent.putExtras(b8.j());
        AbstractC3159y.h(putExtras, "putExtras(...)");
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
