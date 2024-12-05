package com.stripe.android.payments.paymentlauncher;

import O5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import e3.InterfaceC2795i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class PaymentLauncherContract extends ActivityResultContract<a, com.stripe.android.payments.paymentlauncher.a> {

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0548a f26326g = new C0548a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f26327h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f26328a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26329b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26330c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f26331d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26332e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f26333f;

        /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0548a {
            private C0548a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0548a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0549a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26334i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26335j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f26336k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f26337l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26338m;

            /* renamed from: n, reason: collision with root package name */
            private final InterfaceC2795i f26339n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f26340o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0549a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new b(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, (InterfaceC2795i) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, InterfaceC2795i confirmStripeIntentParams, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3255y.i(publishableKey, "publishableKey");
                AbstractC3255y.i(productUsage, "productUsage");
                AbstractC3255y.i(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.f26334i = publishableKey;
                this.f26335j = str;
                this.f26336k = z8;
                this.f26337l = productUsage;
                this.f26338m = z9;
                this.f26339n = confirmStripeIntentParams;
                this.f26340o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean a() {
                return this.f26336k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f26338m;
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
                return AbstractC3255y.d(this.f26334i, bVar.f26334i) && AbstractC3255y.d(this.f26335j, bVar.f26335j) && this.f26336k == bVar.f26336k && AbstractC3255y.d(this.f26337l, bVar.f26337l) && this.f26338m == bVar.f26338m && AbstractC3255y.d(this.f26339n, bVar.f26339n) && AbstractC3255y.d(this.f26340o, bVar.f26340o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set g() {
                return this.f26337l;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String h() {
                return this.f26334i;
            }

            public int hashCode() {
                int hashCode = this.f26334i.hashCode() * 31;
                String str = this.f26335j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26336k)) * 31) + this.f26337l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26338m)) * 31) + this.f26339n.hashCode()) * 31;
                Integer num = this.f26340o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f26340o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String l() {
                return this.f26335j;
            }

            public final InterfaceC2795i s() {
                return this.f26339n;
            }

            public String toString() {
                return "IntentConfirmationArgs(publishableKey=" + this.f26334i + ", stripeAccountId=" + this.f26335j + ", enableLogging=" + this.f26336k + ", productUsage=" + this.f26337l + ", includePaymentSheetNextHandlers=" + this.f26338m + ", confirmStripeIntentParams=" + this.f26339n + ", statusBarColor=" + this.f26340o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3255y.i(out, "out");
                out.writeString(this.f26334i);
                out.writeString(this.f26335j);
                out.writeInt(this.f26336k ? 1 : 0);
                Set set = this.f26337l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f26338m ? 1 : 0);
                out.writeParcelable(this.f26339n, i8);
                Integer num = this.f26340o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0550a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26341i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26342j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f26343k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f26344l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26345m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26346n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f26347o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0550a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, String paymentIntentClientSecret, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3255y.i(publishableKey, "publishableKey");
                AbstractC3255y.i(productUsage, "productUsage");
                AbstractC3255y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.f26341i = publishableKey;
                this.f26342j = str;
                this.f26343k = z8;
                this.f26344l = productUsage;
                this.f26345m = z9;
                this.f26346n = paymentIntentClientSecret;
                this.f26347o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean a() {
                return this.f26343k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f26345m;
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
                return AbstractC3255y.d(this.f26341i, cVar.f26341i) && AbstractC3255y.d(this.f26342j, cVar.f26342j) && this.f26343k == cVar.f26343k && AbstractC3255y.d(this.f26344l, cVar.f26344l) && this.f26345m == cVar.f26345m && AbstractC3255y.d(this.f26346n, cVar.f26346n) && AbstractC3255y.d(this.f26347o, cVar.f26347o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set g() {
                return this.f26344l;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String h() {
                return this.f26341i;
            }

            public int hashCode() {
                int hashCode = this.f26341i.hashCode() * 31;
                String str = this.f26342j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26343k)) * 31) + this.f26344l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26345m)) * 31) + this.f26346n.hashCode()) * 31;
                Integer num = this.f26347o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f26347o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String l() {
                return this.f26342j;
            }

            public final String s() {
                return this.f26346n;
            }

            public String toString() {
                return "PaymentIntentNextActionArgs(publishableKey=" + this.f26341i + ", stripeAccountId=" + this.f26342j + ", enableLogging=" + this.f26343k + ", productUsage=" + this.f26344l + ", includePaymentSheetNextHandlers=" + this.f26345m + ", paymentIntentClientSecret=" + this.f26346n + ", statusBarColor=" + this.f26347o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3255y.i(out, "out");
                out.writeString(this.f26341i);
                out.writeString(this.f26342j);
                out.writeInt(this.f26343k ? 1 : 0);
                Set set = this.f26344l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f26345m ? 1 : 0);
                out.writeString(this.f26346n);
                Integer num = this.f26347o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final Parcelable.Creator<d> CREATOR = new C0551a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26348i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26349j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f26350k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f26351l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26352m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26353n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f26354o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0551a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new d(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, String setupIntentClientSecret, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3255y.i(publishableKey, "publishableKey");
                AbstractC3255y.i(productUsage, "productUsage");
                AbstractC3255y.i(setupIntentClientSecret, "setupIntentClientSecret");
                this.f26348i = publishableKey;
                this.f26349j = str;
                this.f26350k = z8;
                this.f26351l = productUsage;
                this.f26352m = z9;
                this.f26353n = setupIntentClientSecret;
                this.f26354o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean a() {
                return this.f26350k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f26352m;
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
                return AbstractC3255y.d(this.f26348i, dVar.f26348i) && AbstractC3255y.d(this.f26349j, dVar.f26349j) && this.f26350k == dVar.f26350k && AbstractC3255y.d(this.f26351l, dVar.f26351l) && this.f26352m == dVar.f26352m && AbstractC3255y.d(this.f26353n, dVar.f26353n) && AbstractC3255y.d(this.f26354o, dVar.f26354o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set g() {
                return this.f26351l;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String h() {
                return this.f26348i;
            }

            public int hashCode() {
                int hashCode = this.f26348i.hashCode() * 31;
                String str = this.f26349j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26350k)) * 31) + this.f26351l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26352m)) * 31) + this.f26353n.hashCode()) * 31;
                Integer num = this.f26354o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f26354o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String l() {
                return this.f26349j;
            }

            public final String s() {
                return this.f26353n;
            }

            public String toString() {
                return "SetupIntentNextActionArgs(publishableKey=" + this.f26348i + ", stripeAccountId=" + this.f26349j + ", enableLogging=" + this.f26350k + ", productUsage=" + this.f26351l + ", includePaymentSheetNextHandlers=" + this.f26352m + ", setupIntentClientSecret=" + this.f26353n + ", statusBarColor=" + this.f26354o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3255y.i(out, "out");
                out.writeString(this.f26348i);
                out.writeString(this.f26349j);
                out.writeInt(this.f26350k ? 1 : 0);
                Set set = this.f26351l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f26352m ? 1 : 0);
                out.writeString(this.f26353n);
                Integer num = this.f26354o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        public /* synthetic */ a(String str, String str2, boolean z8, Set set, boolean z9, Integer num, AbstractC3247p abstractC3247p) {
            this(str, str2, z8, set, z9, num);
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract Set g();

        public abstract String h();

        public abstract Integer i();

        public abstract String l();

        public final Bundle p() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        private a(String str, String str2, boolean z8, Set set, boolean z9, Integer num) {
            this.f26328a = str;
            this.f26329b = str2;
            this.f26330c = z8;
            this.f26331d = set;
            this.f26332e = z9;
            this.f26333f = num;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(input.p());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.paymentlauncher.a parseResult(int i8, Intent intent) {
        return com.stripe.android.payments.paymentlauncher.a.f26355a.a(intent);
    }
}
