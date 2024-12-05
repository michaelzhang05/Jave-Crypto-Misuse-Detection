package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25892a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25893b = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0605a();

        /* renamed from: com.stripe.android.paymentsheet.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0605a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return a.f25893b;
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
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
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

    /* renamed from: com.stripe.android.paymentsheet.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0606c extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final C0606c f25894b = new C0606c();
        public static final Parcelable.Creator<C0606c> CREATOR = new a();

        /* renamed from: com.stripe.android.paymentsheet.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0606c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return C0606c.f25894b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0606c[] newArray(int i8) {
                return new C0606c[i8];
            }
        }

        private C0606c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0606c);
        }

        public int hashCode() {
            return 523547124;
        }

        public String toString() {
            return "Completed";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final String f25896b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25895c = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            this.f25896b = str;
        }

        public final String b() {
            return this.f25896b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC3159y.d(this.f25896b, ((d) obj).f25896b);
        }

        public int hashCode() {
            String str = this.f25896b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Failed(displayMessage=" + this.f25896b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f25896b);
        }
    }

    private c() {
    }

    public /* synthetic */ c(AbstractC3151p abstractC3151p) {
        this();
    }
}
