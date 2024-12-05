package com.stripe.android.payments.paymentlauncher;

import L5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import b3.InterfaceC1874i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class PaymentLauncherContract extends ActivityResultContract<a, com.stripe.android.payments.paymentlauncher.a> {

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0552a f25271g = new C0552a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f25272h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f25273a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25274b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25275c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f25276d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25277e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f25278f;

        /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0552a {
            private C0552a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0552a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0553a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25279i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25280j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f25281k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f25282l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25283m;

            /* renamed from: n, reason: collision with root package name */
            private final InterfaceC1874i f25284n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f25285o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0553a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new b(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, (InterfaceC1874i) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, InterfaceC1874i confirmStripeIntentParams, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(productUsage, "productUsage");
                AbstractC3159y.i(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.f25279i = publishableKey;
                this.f25280j = str;
                this.f25281k = z8;
                this.f25282l = productUsage;
                this.f25283m = z9;
                this.f25284n = confirmStripeIntentParams;
                this.f25285o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f25281k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean c() {
                return this.f25283m;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set e() {
                return this.f25282l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3159y.d(this.f25279i, bVar.f25279i) && AbstractC3159y.d(this.f25280j, bVar.f25280j) && this.f25281k == bVar.f25281k && AbstractC3159y.d(this.f25282l, bVar.f25282l) && this.f25283m == bVar.f25283m && AbstractC3159y.d(this.f25284n, bVar.f25284n) && AbstractC3159y.d(this.f25285o, bVar.f25285o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String f() {
                return this.f25279i;
            }

            public int hashCode() {
                int hashCode = this.f25279i.hashCode() * 31;
                String str = this.f25280j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25281k)) * 31) + this.f25282l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25283m)) * 31) + this.f25284n.hashCode()) * 31;
                Integer num = this.f25285o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f25285o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String j() {
                return this.f25280j;
            }

            public final InterfaceC1874i n() {
                return this.f25284n;
            }

            public String toString() {
                return "IntentConfirmationArgs(publishableKey=" + this.f25279i + ", stripeAccountId=" + this.f25280j + ", enableLogging=" + this.f25281k + ", productUsage=" + this.f25282l + ", includePaymentSheetNextHandlers=" + this.f25283m + ", confirmStripeIntentParams=" + this.f25284n + ", statusBarColor=" + this.f25285o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25279i);
                out.writeString(this.f25280j);
                out.writeInt(this.f25281k ? 1 : 0);
                Set set = this.f25282l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25283m ? 1 : 0);
                out.writeParcelable(this.f25284n, i8);
                Integer num = this.f25285o;
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
            public static final Parcelable.Creator<c> CREATOR = new C0554a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25286i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25287j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f25288k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f25289l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25290m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25291n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f25292o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0554a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(productUsage, "productUsage");
                AbstractC3159y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.f25286i = publishableKey;
                this.f25287j = str;
                this.f25288k = z8;
                this.f25289l = productUsage;
                this.f25290m = z9;
                this.f25291n = paymentIntentClientSecret;
                this.f25292o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f25288k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean c() {
                return this.f25290m;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set e() {
                return this.f25289l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3159y.d(this.f25286i, cVar.f25286i) && AbstractC3159y.d(this.f25287j, cVar.f25287j) && this.f25288k == cVar.f25288k && AbstractC3159y.d(this.f25289l, cVar.f25289l) && this.f25290m == cVar.f25290m && AbstractC3159y.d(this.f25291n, cVar.f25291n) && AbstractC3159y.d(this.f25292o, cVar.f25292o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String f() {
                return this.f25286i;
            }

            public int hashCode() {
                int hashCode = this.f25286i.hashCode() * 31;
                String str = this.f25287j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25288k)) * 31) + this.f25289l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25290m)) * 31) + this.f25291n.hashCode()) * 31;
                Integer num = this.f25292o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f25292o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String j() {
                return this.f25287j;
            }

            public final String n() {
                return this.f25291n;
            }

            public String toString() {
                return "PaymentIntentNextActionArgs(publishableKey=" + this.f25286i + ", stripeAccountId=" + this.f25287j + ", enableLogging=" + this.f25288k + ", productUsage=" + this.f25289l + ", includePaymentSheetNextHandlers=" + this.f25290m + ", paymentIntentClientSecret=" + this.f25291n + ", statusBarColor=" + this.f25292o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25286i);
                out.writeString(this.f25287j);
                out.writeInt(this.f25288k ? 1 : 0);
                Set set = this.f25289l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25290m ? 1 : 0);
                out.writeString(this.f25291n);
                Integer num = this.f25292o;
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
            public static final Parcelable.Creator<d> CREATOR = new C0555a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25293i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25294j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f25295k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f25296l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25297m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25298n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f25299o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0555a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(productUsage, "productUsage");
                AbstractC3159y.i(setupIntentClientSecret, "setupIntentClientSecret");
                this.f25293i = publishableKey;
                this.f25294j = str;
                this.f25295k = z8;
                this.f25296l = productUsage;
                this.f25297m = z9;
                this.f25298n = setupIntentClientSecret;
                this.f25299o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f25295k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean c() {
                return this.f25297m;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set e() {
                return this.f25296l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC3159y.d(this.f25293i, dVar.f25293i) && AbstractC3159y.d(this.f25294j, dVar.f25294j) && this.f25295k == dVar.f25295k && AbstractC3159y.d(this.f25296l, dVar.f25296l) && this.f25297m == dVar.f25297m && AbstractC3159y.d(this.f25298n, dVar.f25298n) && AbstractC3159y.d(this.f25299o, dVar.f25299o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String f() {
                return this.f25293i;
            }

            public int hashCode() {
                int hashCode = this.f25293i.hashCode() * 31;
                String str = this.f25294j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25295k)) * 31) + this.f25296l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25297m)) * 31) + this.f25298n.hashCode()) * 31;
                Integer num = this.f25299o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f25299o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String j() {
                return this.f25294j;
            }

            public final String n() {
                return this.f25298n;
            }

            public String toString() {
                return "SetupIntentNextActionArgs(publishableKey=" + this.f25293i + ", stripeAccountId=" + this.f25294j + ", enableLogging=" + this.f25295k + ", productUsage=" + this.f25296l + ", includePaymentSheetNextHandlers=" + this.f25297m + ", setupIntentClientSecret=" + this.f25298n + ", statusBarColor=" + this.f25299o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25293i);
                out.writeString(this.f25294j);
                out.writeInt(this.f25295k ? 1 : 0);
                Set set = this.f25296l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25297m ? 1 : 0);
                out.writeString(this.f25298n);
                Integer num = this.f25299o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        public /* synthetic */ a(String str, String str2, boolean z8, Set set, boolean z9, Integer num, AbstractC3151p abstractC3151p) {
            this(str, str2, z8, set, z9, num);
        }

        public abstract boolean b();

        public abstract boolean c();

        public abstract Set e();

        public abstract String f();

        public abstract Integer i();

        public abstract String j();

        public final Bundle k() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        private a(String str, String str2, boolean z8, Set set, boolean z9, Integer num) {
            this.f25273a = str;
            this.f25274b = str2;
            this.f25275c = z8;
            this.f25276d = set;
            this.f25277e = z9;
            this.f25278f = num;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(input.k());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.paymentlauncher.a parseResult(int i8, Intent intent) {
        return com.stripe.android.payments.paymentlauncher.a.f25300a.a(intent);
    }
}
