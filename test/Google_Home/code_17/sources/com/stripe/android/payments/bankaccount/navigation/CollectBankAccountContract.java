package com.stripe.android.payments.bankaccount.navigation;

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
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import j3.InterfaceC3189a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CollectBankAccountContract extends ActivityResultContract<a, d> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26115a = new b(null);

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0532a f26116g = new C0532a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f26117h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f26118a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26119b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26120c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3189a f26121d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26122e;

        /* renamed from: f, reason: collision with root package name */
        private final String f26123f;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0532a {
            private C0532a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            }

            public /* synthetic */ C0532a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0533a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26124i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26125j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC3189a f26126k;

            /* renamed from: l, reason: collision with root package name */
            private final String f26127l;

            /* renamed from: m, reason: collision with root package name */
            private final String f26128m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26129n;

            /* renamed from: o, reason: collision with root package name */
            private final String f26130o;

            /* renamed from: p, reason: collision with root package name */
            private final Integer f26131p;

            /* renamed from: q, reason: collision with root package name */
            private final String f26132q;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0533a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new b(parcel.readString(), parcel.readString(), (InterfaceC3189a) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, InterfaceC3189a configuration, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3255y.i(publishableKey, "publishableKey");
                AbstractC3255y.i(configuration, "configuration");
                AbstractC3255y.i(elementsSessionId, "elementsSessionId");
                this.f26124i = publishableKey;
                this.f26125j = str;
                this.f26126k = configuration;
                this.f26127l = str2;
                this.f26128m = elementsSessionId;
                this.f26129n = str3;
                this.f26130o = str4;
                this.f26131p = num;
                this.f26132q = str5;
            }

            public final String M() {
                return this.f26132q;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3189a b() {
                return this.f26126k;
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
                return AbstractC3255y.d(this.f26124i, bVar.f26124i) && AbstractC3255y.d(this.f26125j, bVar.f26125j) && AbstractC3255y.d(this.f26126k, bVar.f26126k) && AbstractC3255y.d(this.f26127l, bVar.f26127l) && AbstractC3255y.d(this.f26128m, bVar.f26128m) && AbstractC3255y.d(this.f26129n, bVar.f26129n) && AbstractC3255y.d(this.f26130o, bVar.f26130o) && AbstractC3255y.d(this.f26131p, bVar.f26131p) && AbstractC3255y.d(this.f26132q, bVar.f26132q);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String g() {
                return this.f26127l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26124i;
            }

            public int hashCode() {
                int hashCode = this.f26124i.hashCode() * 31;
                String str = this.f26125j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26126k.hashCode()) * 31;
                String str2 = this.f26127l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f26128m.hashCode()) * 31;
                String str3 = this.f26129n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f26130o;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.f26131p;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.f26132q;
                return hashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26125j;
            }

            public final Integer l() {
                return this.f26131p;
            }

            public final String p() {
                return this.f26129n;
            }

            public final String s() {
                return this.f26128m;
            }

            public String toString() {
                return "ForDeferredPaymentIntent(publishableKey=" + this.f26124i + ", stripeAccountId=" + this.f26125j + ", configuration=" + this.f26126k + ", hostedSurface=" + this.f26127l + ", elementsSessionId=" + this.f26128m + ", customerId=" + this.f26129n + ", onBehalfOf=" + this.f26130o + ", amount=" + this.f26131p + ", currency=" + this.f26132q + ")";
            }

            public final String u() {
                return this.f26130o;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3255y.i(out, "out");
                out.writeString(this.f26124i);
                out.writeString(this.f26125j);
                out.writeParcelable(this.f26126k, i8);
                out.writeString(this.f26127l);
                out.writeString(this.f26128m);
                out.writeString(this.f26129n);
                out.writeString(this.f26130o);
                Integer num = this.f26131p;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
                out.writeString(this.f26132q);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0534a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26133i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26134j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC3189a f26135k;

            /* renamed from: l, reason: collision with root package name */
            private final String f26136l;

            /* renamed from: m, reason: collision with root package name */
            private final String f26137m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26138n;

            /* renamed from: o, reason: collision with root package name */
            private final String f26139o;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0534a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readString(), (InterfaceC3189a) parcel.readParcelable(c.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String publishableKey, String str, InterfaceC3189a configuration, String str2, String elementsSessionId, String str3, String str4) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3255y.i(publishableKey, "publishableKey");
                AbstractC3255y.i(configuration, "configuration");
                AbstractC3255y.i(elementsSessionId, "elementsSessionId");
                this.f26133i = publishableKey;
                this.f26134j = str;
                this.f26135k = configuration;
                this.f26136l = str2;
                this.f26137m = elementsSessionId;
                this.f26138n = str3;
                this.f26139o = str4;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3189a b() {
                return this.f26135k;
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
                return AbstractC3255y.d(this.f26133i, cVar.f26133i) && AbstractC3255y.d(this.f26134j, cVar.f26134j) && AbstractC3255y.d(this.f26135k, cVar.f26135k) && AbstractC3255y.d(this.f26136l, cVar.f26136l) && AbstractC3255y.d(this.f26137m, cVar.f26137m) && AbstractC3255y.d(this.f26138n, cVar.f26138n) && AbstractC3255y.d(this.f26139o, cVar.f26139o);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String g() {
                return this.f26136l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26133i;
            }

            public int hashCode() {
                int hashCode = this.f26133i.hashCode() * 31;
                String str = this.f26134j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26135k.hashCode()) * 31;
                String str2 = this.f26136l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f26137m.hashCode()) * 31;
                String str3 = this.f26138n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f26139o;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26134j;
            }

            public final String l() {
                return this.f26138n;
            }

            public final String p() {
                return this.f26137m;
            }

            public final String s() {
                return this.f26139o;
            }

            public String toString() {
                return "ForDeferredSetupIntent(publishableKey=" + this.f26133i + ", stripeAccountId=" + this.f26134j + ", configuration=" + this.f26135k + ", hostedSurface=" + this.f26136l + ", elementsSessionId=" + this.f26137m + ", customerId=" + this.f26138n + ", onBehalfOf=" + this.f26139o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f26133i);
                out.writeString(this.f26134j);
                out.writeParcelable(this.f26135k, i8);
                out.writeString(this.f26136l);
                out.writeString(this.f26137m);
                out.writeString(this.f26138n);
                out.writeString(this.f26139o);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final Parcelable.Creator<d> CREATOR = new C0535a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26140i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26141j;

            /* renamed from: k, reason: collision with root package name */
            private final String f26142k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC3189a f26143l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26144m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26145n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0535a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC3189a) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String publishableKey, String str, String clientSecret, InterfaceC3189a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3255y.i(publishableKey, "publishableKey");
                AbstractC3255y.i(clientSecret, "clientSecret");
                AbstractC3255y.i(configuration, "configuration");
                this.f26140i = publishableKey;
                this.f26141j = str;
                this.f26142k = clientSecret;
                this.f26143l = configuration;
                this.f26144m = z8;
                this.f26145n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean a() {
                return this.f26144m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3189a b() {
                return this.f26143l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f26142k;
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
                return AbstractC3255y.d(this.f26140i, dVar.f26140i) && AbstractC3255y.d(this.f26141j, dVar.f26141j) && AbstractC3255y.d(this.f26142k, dVar.f26142k) && AbstractC3255y.d(this.f26143l, dVar.f26143l) && this.f26144m == dVar.f26144m && AbstractC3255y.d(this.f26145n, dVar.f26145n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String g() {
                return this.f26145n;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26140i;
            }

            public int hashCode() {
                int hashCode = this.f26140i.hashCode() * 31;
                String str = this.f26141j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26142k.hashCode()) * 31) + this.f26143l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26144m)) * 31;
                String str2 = this.f26145n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26141j;
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + this.f26140i + ", stripeAccountId=" + this.f26141j + ", clientSecret=" + this.f26142k + ", configuration=" + this.f26143l + ", attachToIntent=" + this.f26144m + ", hostedSurface=" + this.f26145n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f26140i);
                out.writeString(this.f26141j);
                out.writeString(this.f26142k);
                out.writeParcelable(this.f26143l, i8);
                out.writeInt(this.f26144m ? 1 : 0);
                out.writeString(this.f26145n);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {
            public static final Parcelable.Creator<e> CREATOR = new C0536a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26146i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26147j;

            /* renamed from: k, reason: collision with root package name */
            private final String f26148k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC3189a f26149l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26150m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26151n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0536a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new e(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC3189a) parcel.readParcelable(e.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String publishableKey, String str, String clientSecret, InterfaceC3189a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3255y.i(publishableKey, "publishableKey");
                AbstractC3255y.i(clientSecret, "clientSecret");
                AbstractC3255y.i(configuration, "configuration");
                this.f26146i = publishableKey;
                this.f26147j = str;
                this.f26148k = clientSecret;
                this.f26149l = configuration;
                this.f26150m = z8;
                this.f26151n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean a() {
                return this.f26150m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3189a b() {
                return this.f26149l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f26148k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return AbstractC3255y.d(this.f26146i, eVar.f26146i) && AbstractC3255y.d(this.f26147j, eVar.f26147j) && AbstractC3255y.d(this.f26148k, eVar.f26148k) && AbstractC3255y.d(this.f26149l, eVar.f26149l) && this.f26150m == eVar.f26150m && AbstractC3255y.d(this.f26151n, eVar.f26151n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String g() {
                return this.f26151n;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26146i;
            }

            public int hashCode() {
                int hashCode = this.f26146i.hashCode() * 31;
                String str = this.f26147j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26148k.hashCode()) * 31) + this.f26149l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26150m)) * 31;
                String str2 = this.f26151n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26147j;
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + this.f26146i + ", stripeAccountId=" + this.f26147j + ", clientSecret=" + this.f26148k + ", configuration=" + this.f26149l + ", attachToIntent=" + this.f26150m + ", hostedSurface=" + this.f26151n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f26146i);
                out.writeString(this.f26147j);
                out.writeString(this.f26148k);
                out.writeParcelable(this.f26149l, i8);
                out.writeInt(this.f26150m ? 1 : 0);
                out.writeString(this.f26151n);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, InterfaceC3189a interfaceC3189a, boolean z8, String str4, AbstractC3247p abstractC3247p) {
            this(str, str2, str3, interfaceC3189a, z8, str4);
        }

        public boolean a() {
            return this.f26122e;
        }

        public abstract InterfaceC3189a b();

        public String d() {
            return this.f26120c;
        }

        public abstract String g();

        public abstract String h();

        public abstract String i();

        private a(String str, String str2, String str3, InterfaceC3189a interfaceC3189a, boolean z8, String str4) {
            this.f26118a = str;
            this.f26119b = str2;
            this.f26120c = str3;
            this.f26121d = interfaceC3189a;
            this.f26122e = z8;
            this.f26123f = str4;
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

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d f26152a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c((d) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(d collectBankAccountResult) {
            AbstractC3255y.i(collectBankAccountResult, "collectBankAccountResult");
            this.f26152a = collectBankAccountResult;
        }

        public final d a() {
            return this.f26152a;
        }

        public final Bundle b() {
            return BundleKt.bundleOf(x.a("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f26152a, ((c) obj).f26152a);
        }

        public int hashCode() {
            return this.f26152a.hashCode();
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.f26152a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f26152a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d parseResult(int i8, Intent intent) {
        d dVar;
        c cVar;
        if (intent != null && (cVar = (c) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) != null) {
            dVar = cVar.a();
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return new d.c(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult."));
        }
        return dVar;
    }
}
