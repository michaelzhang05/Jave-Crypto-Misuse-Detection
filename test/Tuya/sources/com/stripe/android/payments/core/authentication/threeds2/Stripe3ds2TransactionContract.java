package com.stripe.android.payments.core.authentication.threeds2;

import X3.q;
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
import f3.C2662c;
import j2.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.j;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class Stripe3ds2TransactionContract extends ActivityResultContract<a, C2662c> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final q f25192a;

        /* renamed from: b, reason: collision with root package name */
        private final p.c f25193b;

        /* renamed from: c, reason: collision with root package name */
        private final StripeIntent f25194c;

        /* renamed from: d, reason: collision with root package name */
        private final StripeIntent.a.j.b f25195d;

        /* renamed from: e, reason: collision with root package name */
        private final j.c f25196e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f25197f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f25198g;

        /* renamed from: h, reason: collision with root package name */
        private final String f25199h;

        /* renamed from: i, reason: collision with root package name */
        private final Set f25200i;

        /* renamed from: j, reason: collision with root package name */
        public static final C0549a f25190j = new C0549a(null);

        /* renamed from: k, reason: collision with root package name */
        public static final int f25191k = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0549a {
            private C0549a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0549a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
            AbstractC3159y.i(config, "config");
            AbstractC3159y.i(stripeIntent, "stripeIntent");
            AbstractC3159y.i(nextActionData, "nextActionData");
            AbstractC3159y.i(requestOptions, "requestOptions");
            AbstractC3159y.i(publishableKey, "publishableKey");
            AbstractC3159y.i(productUsage, "productUsage");
            this.f25192a = sdkTransactionId;
            this.f25193b = config;
            this.f25194c = stripeIntent;
            this.f25195d = nextActionData;
            this.f25196e = requestOptions;
            this.f25197f = z8;
            this.f25198g = num;
            this.f25199h = publishableKey;
            this.f25200i = productUsage;
        }

        public final p.c b() {
            return this.f25193b;
        }

        public final boolean c() {
            return this.f25197f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final x e() {
            return new x(this.f25195d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f25192a, aVar.f25192a) && AbstractC3159y.d(this.f25193b, aVar.f25193b) && AbstractC3159y.d(this.f25194c, aVar.f25194c) && AbstractC3159y.d(this.f25195d, aVar.f25195d) && AbstractC3159y.d(this.f25196e, aVar.f25196e) && this.f25197f == aVar.f25197f && AbstractC3159y.d(this.f25198g, aVar.f25198g) && AbstractC3159y.d(this.f25199h, aVar.f25199h) && AbstractC3159y.d(this.f25200i, aVar.f25200i);
        }

        public final StripeIntent.a.j.b f() {
            return this.f25195d;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f25192a.hashCode() * 31) + this.f25193b.hashCode()) * 31) + this.f25194c.hashCode()) * 31) + this.f25195d.hashCode()) * 31) + this.f25196e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25197f)) * 31;
            Integer num = this.f25198g;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f25199h.hashCode()) * 31) + this.f25200i.hashCode();
        }

        public final Set i() {
            return this.f25200i;
        }

        public final String j() {
            return this.f25199h;
        }

        public final j.c k() {
            return this.f25196e;
        }

        public final q n() {
            return this.f25192a;
        }

        public final Integer o() {
            return this.f25198g;
        }

        public final StripeIntent s() {
            return this.f25194c;
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.f25192a + ", config=" + this.f25193b + ", stripeIntent=" + this.f25194c + ", nextActionData=" + this.f25195d + ", requestOptions=" + this.f25196e + ", enableLogging=" + this.f25197f + ", statusBarColor=" + this.f25198g + ", publishableKey=" + this.f25199h + ", productUsage=" + this.f25200i + ")";
        }

        public final Bundle u() {
            return BundleKt.bundleOf(L5.x.a("extra_args", this));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25192a, i8);
            this.f25193b.writeToParcel(out, i8);
            out.writeParcelable(this.f25194c, i8);
            this.f25195d.writeToParcel(out, i8);
            out.writeParcelable(this.f25196e, i8);
            out.writeInt(this.f25197f ? 1 : 0);
            Integer num = this.f25198g;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.f25199h);
            Set set = this.f25200i;
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
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(input.u());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2662c parseResult(int i8, Intent intent) {
        return C2662c.f31012h.b(intent);
    }
}
