package com.stripe.android.payments.bankaccount.navigation;

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
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import g3.InterfaceC2712a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CollectBankAccountContract extends ActivityResultContract<a, d> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25060a = new b(null);

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0536a f25061g = new C0536a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f25062h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f25063a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25064b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25065c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC2712a f25066d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25067e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25068f;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0536a {
            private C0536a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            }

            public /* synthetic */ C0536a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0537a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25069i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25070j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC2712a f25071k;

            /* renamed from: l, reason: collision with root package name */
            private final String f25072l;

            /* renamed from: m, reason: collision with root package name */
            private final String f25073m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25074n;

            /* renamed from: o, reason: collision with root package name */
            private final String f25075o;

            /* renamed from: p, reason: collision with root package name */
            private final Integer f25076p;

            /* renamed from: q, reason: collision with root package name */
            private final String f25077q;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0537a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, InterfaceC2712a configuration, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(configuration, "configuration");
                AbstractC3159y.i(elementsSessionId, "elementsSessionId");
                this.f25069i = publishableKey;
                this.f25070j = str;
                this.f25071k = configuration;
                this.f25072l = str2;
                this.f25073m = elementsSessionId;
                this.f25074n = str3;
                this.f25075o = str4;
                this.f25076p = num;
                this.f25077q = str5;
            }

            public final String K() {
                return this.f25077q;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25071k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25072l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3159y.d(this.f25069i, bVar.f25069i) && AbstractC3159y.d(this.f25070j, bVar.f25070j) && AbstractC3159y.d(this.f25071k, bVar.f25071k) && AbstractC3159y.d(this.f25072l, bVar.f25072l) && AbstractC3159y.d(this.f25073m, bVar.f25073m) && AbstractC3159y.d(this.f25074n, bVar.f25074n) && AbstractC3159y.d(this.f25075o, bVar.f25075o) && AbstractC3159y.d(this.f25076p, bVar.f25076p) && AbstractC3159y.d(this.f25077q, bVar.f25077q);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25069i;
            }

            public int hashCode() {
                int hashCode = this.f25069i.hashCode() * 31;
                String str = this.f25070j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25071k.hashCode()) * 31;
                String str2 = this.f25072l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25073m.hashCode()) * 31;
                String str3 = this.f25074n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f25075o;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.f25076p;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.f25077q;
                return hashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25070j;
            }

            public final Integer j() {
                return this.f25076p;
            }

            public final String k() {
                return this.f25074n;
            }

            public final String n() {
                return this.f25073m;
            }

            public final String o() {
                return this.f25075o;
            }

            public String toString() {
                return "ForDeferredPaymentIntent(publishableKey=" + this.f25069i + ", stripeAccountId=" + this.f25070j + ", configuration=" + this.f25071k + ", hostedSurface=" + this.f25072l + ", elementsSessionId=" + this.f25073m + ", customerId=" + this.f25074n + ", onBehalfOf=" + this.f25075o + ", amount=" + this.f25076p + ", currency=" + this.f25077q + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25069i);
                out.writeString(this.f25070j);
                out.writeParcelable(this.f25071k, i8);
                out.writeString(this.f25072l);
                out.writeString(this.f25073m);
                out.writeString(this.f25074n);
                out.writeString(this.f25075o);
                Integer num = this.f25076p;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
                out.writeString(this.f25077q);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0538a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25078i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25079j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC2712a f25080k;

            /* renamed from: l, reason: collision with root package name */
            private final String f25081l;

            /* renamed from: m, reason: collision with root package name */
            private final String f25082m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25083n;

            /* renamed from: o, reason: collision with root package name */
            private final String f25084o;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0538a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(c.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String publishableKey, String str, InterfaceC2712a configuration, String str2, String elementsSessionId, String str3, String str4) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(configuration, "configuration");
                AbstractC3159y.i(elementsSessionId, "elementsSessionId");
                this.f25078i = publishableKey;
                this.f25079j = str;
                this.f25080k = configuration;
                this.f25081l = str2;
                this.f25082m = elementsSessionId;
                this.f25083n = str3;
                this.f25084o = str4;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25080k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25081l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3159y.d(this.f25078i, cVar.f25078i) && AbstractC3159y.d(this.f25079j, cVar.f25079j) && AbstractC3159y.d(this.f25080k, cVar.f25080k) && AbstractC3159y.d(this.f25081l, cVar.f25081l) && AbstractC3159y.d(this.f25082m, cVar.f25082m) && AbstractC3159y.d(this.f25083n, cVar.f25083n) && AbstractC3159y.d(this.f25084o, cVar.f25084o);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25078i;
            }

            public int hashCode() {
                int hashCode = this.f25078i.hashCode() * 31;
                String str = this.f25079j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25080k.hashCode()) * 31;
                String str2 = this.f25081l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25082m.hashCode()) * 31;
                String str3 = this.f25083n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f25084o;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25079j;
            }

            public final String j() {
                return this.f25083n;
            }

            public final String k() {
                return this.f25082m;
            }

            public final String n() {
                return this.f25084o;
            }

            public String toString() {
                return "ForDeferredSetupIntent(publishableKey=" + this.f25078i + ", stripeAccountId=" + this.f25079j + ", configuration=" + this.f25080k + ", hostedSurface=" + this.f25081l + ", elementsSessionId=" + this.f25082m + ", customerId=" + this.f25083n + ", onBehalfOf=" + this.f25084o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25078i);
                out.writeString(this.f25079j);
                out.writeParcelable(this.f25080k, i8);
                out.writeString(this.f25081l);
                out.writeString(this.f25082m);
                out.writeString(this.f25083n);
                out.writeString(this.f25084o);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final Parcelable.Creator<d> CREATOR = new C0539a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25085i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25086j;

            /* renamed from: k, reason: collision with root package name */
            private final String f25087k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC2712a f25088l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25089m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25090n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0539a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(clientSecret, "clientSecret");
                AbstractC3159y.i(configuration, "configuration");
                this.f25085i = publishableKey;
                this.f25086j = str;
                this.f25087k = clientSecret;
                this.f25088l = configuration;
                this.f25089m = z8;
                this.f25090n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean b() {
                return this.f25089m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25088l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f25087k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25090n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC3159y.d(this.f25085i, dVar.f25085i) && AbstractC3159y.d(this.f25086j, dVar.f25086j) && AbstractC3159y.d(this.f25087k, dVar.f25087k) && AbstractC3159y.d(this.f25088l, dVar.f25088l) && this.f25089m == dVar.f25089m && AbstractC3159y.d(this.f25090n, dVar.f25090n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25085i;
            }

            public int hashCode() {
                int hashCode = this.f25085i.hashCode() * 31;
                String str = this.f25086j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25087k.hashCode()) * 31) + this.f25088l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25089m)) * 31;
                String str2 = this.f25090n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25086j;
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + this.f25085i + ", stripeAccountId=" + this.f25086j + ", clientSecret=" + this.f25087k + ", configuration=" + this.f25088l + ", attachToIntent=" + this.f25089m + ", hostedSurface=" + this.f25090n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25085i);
                out.writeString(this.f25086j);
                out.writeString(this.f25087k);
                out.writeParcelable(this.f25088l, i8);
                out.writeInt(this.f25089m ? 1 : 0);
                out.writeString(this.f25090n);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {
            public static final Parcelable.Creator<e> CREATOR = new C0540a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25091i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25092j;

            /* renamed from: k, reason: collision with root package name */
            private final String f25093k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC2712a f25094l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25095m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25096n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0540a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new e(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(e.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(clientSecret, "clientSecret");
                AbstractC3159y.i(configuration, "configuration");
                this.f25091i = publishableKey;
                this.f25092j = str;
                this.f25093k = clientSecret;
                this.f25094l = configuration;
                this.f25095m = z8;
                this.f25096n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean b() {
                return this.f25095m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25094l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f25093k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25096n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return AbstractC3159y.d(this.f25091i, eVar.f25091i) && AbstractC3159y.d(this.f25092j, eVar.f25092j) && AbstractC3159y.d(this.f25093k, eVar.f25093k) && AbstractC3159y.d(this.f25094l, eVar.f25094l) && this.f25095m == eVar.f25095m && AbstractC3159y.d(this.f25096n, eVar.f25096n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25091i;
            }

            public int hashCode() {
                int hashCode = this.f25091i.hashCode() * 31;
                String str = this.f25092j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25093k.hashCode()) * 31) + this.f25094l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25095m)) * 31;
                String str2 = this.f25096n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25092j;
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + this.f25091i + ", stripeAccountId=" + this.f25092j + ", clientSecret=" + this.f25093k + ", configuration=" + this.f25094l + ", attachToIntent=" + this.f25095m + ", hostedSurface=" + this.f25096n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25091i);
                out.writeString(this.f25092j);
                out.writeString(this.f25093k);
                out.writeParcelable(this.f25094l, i8);
                out.writeInt(this.f25095m ? 1 : 0);
                out.writeString(this.f25096n);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, InterfaceC2712a interfaceC2712a, boolean z8, String str4, AbstractC3151p abstractC3151p) {
            this(str, str2, str3, interfaceC2712a, z8, str4);
        }

        public boolean b() {
            return this.f25067e;
        }

        public abstract InterfaceC2712a c();

        public String d() {
            return this.f25065c;
        }

        public abstract String e();

        public abstract String f();

        public abstract String i();

        private a(String str, String str2, String str3, InterfaceC2712a interfaceC2712a, boolean z8, String str4) {
            this.f25063a = str;
            this.f25064b = str2;
            this.f25065c = str3;
            this.f25066d = interfaceC2712a;
            this.f25067e = z8;
            this.f25068f = str4;
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

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d f25097a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((d) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(d collectBankAccountResult) {
            AbstractC3159y.i(collectBankAccountResult, "collectBankAccountResult");
            this.f25097a = collectBankAccountResult;
        }

        public final d b() {
            return this.f25097a;
        }

        public final Bundle c() {
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
            return (obj instanceof c) && AbstractC3159y.d(this.f25097a, ((c) obj).f25097a);
        }

        public int hashCode() {
            return this.f25097a.hashCode();
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.f25097a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25097a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d parseResult(int i8, Intent intent) {
        d dVar;
        c cVar;
        if (intent != null && (cVar = (c) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) != null) {
            dVar = cVar.b();
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return new d.c(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult."));
        }
        return dVar;
    }
}
