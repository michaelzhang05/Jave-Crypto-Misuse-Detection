package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3255y;
import y2.f;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f26160a;

    /* renamed from: b, reason: collision with root package name */
    private final C0541c f26161b;

    /* renamed from: c, reason: collision with root package name */
    private final b f26162c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f26159d = FinancialConnectionsSession.$stable;
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new c((StripeIntent) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() == 0 ? null : C0541c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
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
        private final String f26163a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26164b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26165c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String paymentMethodId, String str, String str2) {
            AbstractC3255y.i(paymentMethodId, "paymentMethodId");
            this.f26163a = paymentMethodId;
            this.f26164b = str;
            this.f26165c = str2;
        }

        public final String a() {
            return this.f26165c;
        }

        public final String b() {
            return this.f26164b;
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
            return AbstractC3255y.d(this.f26163a, bVar.f26163a) && AbstractC3255y.d(this.f26164b, bVar.f26164b) && AbstractC3255y.d(this.f26165c, bVar.f26165c);
        }

        public final String g() {
            return this.f26163a;
        }

        public int hashCode() {
            int hashCode = this.f26163a.hashCode() * 31;
            String str = this.f26164b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26165c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebitsData(paymentMethodId=" + this.f26163a + ", last4=" + this.f26164b + ", bankName=" + this.f26165c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f26163a);
            out.writeString(this.f26164b);
            out.writeString(this.f26165c);
        }
    }

    /* renamed from: com.stripe.android.payments.bankaccount.navigation.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0541c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final FinancialConnectionsSession f26167a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f26166b = FinancialConnectionsSession.$stable;
        public static final Parcelable.Creator<C0541c> CREATOR = new a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0541c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new C0541c(parcel.readParcelable(C0541c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0541c[] newArray(int i8) {
                return new C0541c[i8];
            }
        }

        public C0541c(FinancialConnectionsSession financialConnectionsSession) {
            AbstractC3255y.i(financialConnectionsSession, "financialConnectionsSession");
            this.f26167a = financialConnectionsSession;
        }

        public final FinancialConnectionsSession a() {
            return this.f26167a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0541c) && AbstractC3255y.d(this.f26167a, ((C0541c) obj).f26167a);
        }

        public int hashCode() {
            return this.f26167a.hashCode();
        }

        public String toString() {
            return "USBankAccountData(financialConnectionsSession=" + this.f26167a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable((Parcelable) this.f26167a, i8);
        }
    }

    public c(StripeIntent stripeIntent, C0541c c0541c, b bVar) {
        this.f26160a = stripeIntent;
        this.f26161b = c0541c;
        this.f26162c = bVar;
    }

    public final b a() {
        return this.f26162c;
    }

    public final StripeIntent b() {
        return this.f26160a;
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
        return AbstractC3255y.d(this.f26160a, cVar.f26160a) && AbstractC3255y.d(this.f26161b, cVar.f26161b) && AbstractC3255y.d(this.f26162c, cVar.f26162c);
    }

    public final C0541c g() {
        return this.f26161b;
    }

    public int hashCode() {
        StripeIntent stripeIntent = this.f26160a;
        int hashCode = (stripeIntent == null ? 0 : stripeIntent.hashCode()) * 31;
        C0541c c0541c = this.f26161b;
        int hashCode2 = (hashCode + (c0541c == null ? 0 : c0541c.hashCode())) * 31;
        b bVar = this.f26162c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "CollectBankAccountResponseInternal(intent=" + this.f26160a + ", usBankAccountData=" + this.f26161b + ", instantDebitsData=" + this.f26162c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f26160a, i8);
        C0541c c0541c = this.f26161b;
        if (c0541c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0541c.writeToParcel(out, i8);
        }
        b bVar = this.f26162c;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
    }
}
