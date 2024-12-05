package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26947a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26948b = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0601a();

        /* renamed from: com.stripe.android.paymentsheet.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0601a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return a.f26948b;
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
            return -1307955248;
        }

        public String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
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

    /* renamed from: com.stripe.android.paymentsheet.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0602c extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final C0602c f26949b = new C0602c();
        public static final Parcelable.Creator<C0602c> CREATOR = new a();

        /* renamed from: com.stripe.android.paymentsheet.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0602c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return C0602c.f26949b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0602c[] newArray(int i8) {
                return new C0602c[i8];
            }
        }

        private C0602c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0602c);
        }

        public int hashCode() {
            return 523547124;
        }

        public String toString() {
            return "Completed";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final String f26951b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26950c = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str) {
            super(null);
            this.f26951b = str;
        }

        public final String a() {
            return this.f26951b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC3255y.d(this.f26951b, ((d) obj).f26951b);
        }

        public int hashCode() {
            String str = this.f26951b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Failed(displayMessage=" + this.f26951b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f26951b);
        }
    }

    private c() {
    }

    public /* synthetic */ c(AbstractC3247p abstractC3247p) {
        this();
    }
}
