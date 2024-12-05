package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class a implements Parcelable {

    /* renamed from: com.stripe.android.stripe3ds2.transaction.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0665a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0665a f27853a = new C0665a();
        public static final Parcelable.Creator<C0665a> CREATOR = new C0666a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0666a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0665a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return C0665a.f27853a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0665a[] newArray(int i8) {
                return new C0665a[i8];
            }
        }

        private C0665a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C0667a();

        /* renamed from: a, reason: collision with root package name */
        private final String f27854a;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0667a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String userEntry) {
            super(null);
            AbstractC3255y.i(userEntry, "userEntry");
            this.f27854a = userEntry;
        }

        public final String a() {
            return this.f27854a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3255y.d(this.f27854a, ((b) obj).f27854a);
        }

        public int hashCode() {
            return this.f27854a.hashCode();
        }

        public String toString() {
            return "HtmlForm(userEntry=" + this.f27854a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27854a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0668a();

        /* renamed from: a, reason: collision with root package name */
        private final String f27855a;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0668a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String userEntry) {
            super(null);
            AbstractC3255y.i(userEntry, "userEntry");
            this.f27855a = userEntry;
        }

        public final String a() {
            return this.f27855a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f27855a, ((c) obj).f27855a);
        }

        public int hashCode() {
            return this.f27855a.hashCode();
        }

        public String toString() {
            return "NativeForm(userEntry=" + this.f27855a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27855a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27856a = new d();
        public static final Parcelable.Creator<d> CREATOR = new C0669a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0669a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return d.f27856a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27857a = new e();
        public static final Parcelable.Creator<e> CREATOR = new C0670a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0670a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return e.f27857a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        private e() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3247p abstractC3247p) {
        this();
    }
}
