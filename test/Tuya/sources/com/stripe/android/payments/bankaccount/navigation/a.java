package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface a extends Parcelable {

    /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0541a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0541a f25098a = new C0541a();
        public static final Parcelable.Creator<C0541a> CREATOR = new C0542a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0542a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0541a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return C0541a.f25098a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0541a[] newArray(int i8) {
                return new C0541a[i8];
            }
        }

        private C0541a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0541a);
        }

        public int hashCode() {
            return 1430639253;
        }

        public String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements a {
        public static final Parcelable.Creator<b> CREATOR = new C0543a();

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f25099a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25100b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25101c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25102d;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0543a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b((StripeIntent) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(StripeIntent intent, String paymentMethodId, String str, String str2) {
            AbstractC3159y.i(intent, "intent");
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            this.f25099a = intent;
            this.f25100b = paymentMethodId;
            this.f25101c = str;
            this.f25102d = str2;
        }

        public final String b() {
            return this.f25102d;
        }

        public final StripeIntent c() {
            return this.f25099a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f25101c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f25099a, bVar.f25099a) && AbstractC3159y.d(this.f25100b, bVar.f25100b) && AbstractC3159y.d(this.f25101c, bVar.f25101c) && AbstractC3159y.d(this.f25102d, bVar.f25102d);
        }

        public final String f() {
            return this.f25100b;
        }

        public int hashCode() {
            int hashCode = ((this.f25099a.hashCode() * 31) + this.f25100b.hashCode()) * 31;
            String str = this.f25101c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25102d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Completed(intent=" + this.f25099a + ", paymentMethodId=" + this.f25100b + ", last4=" + this.f25101c + ", bankName=" + this.f25102d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25099a, i8);
            out.writeString(this.f25100b);
            out.writeString(this.f25101c);
            out.writeString(this.f25102d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {
        public static final Parcelable.Creator<c> CREATOR = new C0544a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f25103a;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0544a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(Throwable error) {
            AbstractC3159y.i(error, "error");
            this.f25103a = error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25103a, ((c) obj).f25103a);
        }

        public int hashCode() {
            return this.f25103a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f25103a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f25103a);
        }
    }
}
