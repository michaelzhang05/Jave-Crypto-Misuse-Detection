package com.stripe.android.payments.core.authentication.threeds2;

import A2.j;
import a4.q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.x;
import i3.C2980c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.p;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class Stripe3ds2TransactionContract extends ActivityResultContract<a, C2980c> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final q f26247a;

        /* renamed from: b, reason: collision with root package name */
        private final p.c f26248b;

        /* renamed from: c, reason: collision with root package name */
        private final StripeIntent f26249c;

        /* renamed from: d, reason: collision with root package name */
        private final StripeIntent.a.j.b f26250d;

        /* renamed from: e, reason: collision with root package name */
        private final j.c f26251e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f26252f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f26253g;

        /* renamed from: h, reason: collision with root package name */
        private final String f26254h;

        /* renamed from: i, reason: collision with root package name */
        private final Set f26255i;

        /* renamed from: j, reason: collision with root package name */
        public static final C0545a f26245j = new C0545a(null);

        /* renamed from: k, reason: collision with root package name */
        public static final int f26246k = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0545a {
            private C0545a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0545a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                q qVar = (q) parcel.readParcelable(a.class.getClassLoader());
                p.c createFromParcel = p.c.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(a.class.getClassLoader());
                StripeIntent.a.j.b createFromParcel2 = StripeIntent.a.j.b.CREATOR.createFromParcel(parcel);
                j.c cVar = (j.c) parcel.readParcelable(a.class.getClassLoader());
                boolean z8 = parcel.readInt() != 0;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(qVar, createFromParcel, stripeIntent, createFromParcel2, cVar, z8, valueOf, readString, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(q sdkTransactionId, p.c config, StripeIntent stripeIntent, StripeIntent.a.j.b nextActionData, j.c requestOptions, boolean z8, Integer num, String publishableKey, Set productUsage) {
            AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
            AbstractC3255y.i(config, "config");
            AbstractC3255y.i(stripeIntent, "stripeIntent");
            AbstractC3255y.i(nextActionData, "nextActionData");
            AbstractC3255y.i(requestOptions, "requestOptions");
            AbstractC3255y.i(publishableKey, "publishableKey");
            AbstractC3255y.i(productUsage, "productUsage");
            this.f26247a = sdkTransactionId;
            this.f26248b = config;
            this.f26249c = stripeIntent;
            this.f26250d = nextActionData;
            this.f26251e = requestOptions;
            this.f26252f = z8;
            this.f26253g = num;
            this.f26254h = publishableKey;
            this.f26255i = productUsage;
        }

        public final p.c a() {
            return this.f26248b;
        }

        public final boolean b() {
            return this.f26252f;
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
            return AbstractC3255y.d(this.f26247a, aVar.f26247a) && AbstractC3255y.d(this.f26248b, aVar.f26248b) && AbstractC3255y.d(this.f26249c, aVar.f26249c) && AbstractC3255y.d(this.f26250d, aVar.f26250d) && AbstractC3255y.d(this.f26251e, aVar.f26251e) && this.f26252f == aVar.f26252f && AbstractC3255y.d(this.f26253g, aVar.f26253g) && AbstractC3255y.d(this.f26254h, aVar.f26254h) && AbstractC3255y.d(this.f26255i, aVar.f26255i);
        }

        public final x g() {
            return new x(this.f26250d);
        }

        public final StripeIntent.a.j.b h() {
            return this.f26250d;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f26247a.hashCode() * 31) + this.f26248b.hashCode()) * 31) + this.f26249c.hashCode()) * 31) + this.f26250d.hashCode()) * 31) + this.f26251e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26252f)) * 31;
            Integer num = this.f26253g;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f26254h.hashCode()) * 31) + this.f26255i.hashCode();
        }

        public final Set i() {
            return this.f26255i;
        }

        public final String l() {
            return this.f26254h;
        }

        public final j.c p() {
            return this.f26251e;
        }

        public final q s() {
            return this.f26247a;
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.f26247a + ", config=" + this.f26248b + ", stripeIntent=" + this.f26249c + ", nextActionData=" + this.f26250d + ", requestOptions=" + this.f26251e + ", enableLogging=" + this.f26252f + ", statusBarColor=" + this.f26253g + ", publishableKey=" + this.f26254h + ", productUsage=" + this.f26255i + ")";
        }

        public final Integer u() {
            return this.f26253g;
        }

        public final StripeIntent v() {
            return this.f26249c;
        }

        public final Bundle w() {
            return BundleKt.bundleOf(O5.x.a("extra_args", this));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f26247a, i8);
            this.f26248b.writeToParcel(out, i8);
            out.writeParcelable(this.f26249c, i8);
            this.f26250d.writeToParcel(out, i8);
            out.writeParcelable(this.f26251e, i8);
            out.writeInt(this.f26252f ? 1 : 0);
            Integer num = this.f26253g;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.f26254h);
            Set set = this.f26255i;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(input.w());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2980c parseResult(int i8, Intent intent) {
        return C2980c.f32875h.b(intent);
    }
}
