package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25113a = 0;

    /* loaded from: classes4.dex */
    public static final class a extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25114b = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0546a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0546a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return a.f25114b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -338128877;
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
    public static final class b extends d {

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.payments.bankaccount.navigation.c f25116b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f25115c = FinancialConnectionsSession.$stable;
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(com.stripe.android.payments.bankaccount.navigation.c.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.stripe.android.payments.bankaccount.navigation.c response) {
            super(null);
            AbstractC3159y.i(response, "response");
            this.f25116b = response;
        }

        public final com.stripe.android.payments.bankaccount.navigation.c b() {
            return this.f25116b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f25116b, ((b) obj).f25116b);
        }

        public int hashCode() {
            return this.f25116b.hashCode();
        }

        public String toString() {
            return "Completed(response=" + this.f25116b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f25116b.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends d {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f25117b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable error) {
            super(null);
            AbstractC3159y.i(error, "error");
            this.f25117b = error;
        }

        public final Throwable b() {
            return this.f25117b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25117b, ((c) obj).f25117b);
        }

        public int hashCode() {
            return this.f25117b.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f25117b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f25117b);
        }
    }

    public /* synthetic */ d(AbstractC3151p abstractC3151p) {
        this();
    }

    private d() {
    }
}
