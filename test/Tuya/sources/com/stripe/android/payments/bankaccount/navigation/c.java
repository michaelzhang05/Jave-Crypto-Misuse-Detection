package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3159y;
import v2.f;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f25105a;

    /* renamed from: b, reason: collision with root package name */
    private final C0545c f25106b;

    /* renamed from: c, reason: collision with root package name */
    private final b f25107c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f25104d = FinancialConnectionsSession.$stable;
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new c((StripeIntent) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() == 0 ? null : C0545c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25108a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25109b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25110c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String paymentMethodId, String str, String str2) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            this.f25108a = paymentMethodId;
            this.f25109b = str;
            this.f25110c = str2;
        }

        public final String b() {
            return this.f25110c;
        }

        public final String c() {
            return this.f25109b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f25108a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f25108a, bVar.f25108a) && AbstractC3159y.d(this.f25109b, bVar.f25109b) && AbstractC3159y.d(this.f25110c, bVar.f25110c);
        }

        public int hashCode() {
            int hashCode = this.f25108a.hashCode() * 31;
            String str = this.f25109b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25110c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebitsData(paymentMethodId=" + this.f25108a + ", last4=" + this.f25109b + ", bankName=" + this.f25110c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f25108a);
            out.writeString(this.f25109b);
            out.writeString(this.f25110c);
        }
    }

    /* renamed from: com.stripe.android.payments.bankaccount.navigation.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0545c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final FinancialConnectionsSession f25112a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f25111b = FinancialConnectionsSession.$stable;
        public static final Parcelable.Creator<C0545c> CREATOR = new a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0545c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0545c(parcel.readParcelable(C0545c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0545c[] newArray(int i8) {
                return new C0545c[i8];
            }
        }

        public C0545c(FinancialConnectionsSession financialConnectionsSession) {
            AbstractC3159y.i(financialConnectionsSession, "financialConnectionsSession");
            this.f25112a = financialConnectionsSession;
        }

        public final FinancialConnectionsSession b() {
            return this.f25112a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0545c) && AbstractC3159y.d(this.f25112a, ((C0545c) obj).f25112a);
        }

        public int hashCode() {
            return this.f25112a.hashCode();
        }

        public String toString() {
            return "USBankAccountData(financialConnectionsSession=" + this.f25112a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable((Parcelable) this.f25112a, i8);
        }
    }

    public c(StripeIntent stripeIntent, C0545c c0545c, b bVar) {
        this.f25105a = stripeIntent;
        this.f25106b = c0545c;
        this.f25107c = bVar;
    }

    public final b b() {
        return this.f25107c;
    }

    public final StripeIntent c() {
        return this.f25105a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final C0545c e() {
        return this.f25106b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC3159y.d(this.f25105a, cVar.f25105a) && AbstractC3159y.d(this.f25106b, cVar.f25106b) && AbstractC3159y.d(this.f25107c, cVar.f25107c);
    }

    public int hashCode() {
        StripeIntent stripeIntent = this.f25105a;
        int hashCode = (stripeIntent == null ? 0 : stripeIntent.hashCode()) * 31;
        C0545c c0545c = this.f25106b;
        int hashCode2 = (hashCode + (c0545c == null ? 0 : c0545c.hashCode())) * 31;
        b bVar = this.f25107c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "CollectBankAccountResponseInternal(intent=" + this.f25105a + ", usBankAccountData=" + this.f25106b + ", instantDebitsData=" + this.f25107c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f25105a, i8);
        C0545c c0545c = this.f25106b;
        if (c0545c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0545c.writeToParcel(out, i8);
        }
        b bVar = this.f25107c;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
    }
}
