package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface a extends Parcelable {

    /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0537a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0537a f26153a = new C0537a();
        public static final Parcelable.Creator<C0537a> CREATOR = new C0538a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0538a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0537a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return C0537a.f26153a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0537a[] newArray(int i8) {
                return new C0537a[i8];
            }
        }

        private C0537a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0537a);
        }

        public int hashCode() {
            return 1430639253;
        }

        public String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements a {
        public static final Parcelable.Creator<b> CREATOR = new C0539a();

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f26154a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26155b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26156c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26157d;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0539a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b((StripeIntent) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(StripeIntent intent, String paymentMethodId, String str, String str2) {
            AbstractC3255y.i(intent, "intent");
            AbstractC3255y.i(paymentMethodId, "paymentMethodId");
            this.f26154a = intent;
            this.f26155b = paymentMethodId;
            this.f26156c = str;
            this.f26157d = str2;
        }

        public final String a() {
            return this.f26157d;
        }

        public final StripeIntent b() {
            return this.f26154a;
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
            return AbstractC3255y.d(this.f26154a, bVar.f26154a) && AbstractC3255y.d(this.f26155b, bVar.f26155b) && AbstractC3255y.d(this.f26156c, bVar.f26156c) && AbstractC3255y.d(this.f26157d, bVar.f26157d);
        }

        public final String g() {
            return this.f26156c;
        }

        public final String h() {
            return this.f26155b;
        }

        public int hashCode() {
            int hashCode = ((this.f26154a.hashCode() * 31) + this.f26155b.hashCode()) * 31;
            String str = this.f26156c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26157d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Completed(intent=" + this.f26154a + ", paymentMethodId=" + this.f26155b + ", last4=" + this.f26156c + ", bankName=" + this.f26157d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f26154a, i8);
            out.writeString(this.f26155b);
            out.writeString(this.f26156c);
            out.writeString(this.f26157d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {
        public static final Parcelable.Creator<c> CREATOR = new C0540a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f26158a;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0540a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(Throwable error) {
            AbstractC3255y.i(error, "error");
            this.f26158a = error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f26158a, ((c) obj).f26158a);
        }

        public int hashCode() {
            return this.f26158a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f26158a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeSerializable(this.f26158a);
        }
    }
}
