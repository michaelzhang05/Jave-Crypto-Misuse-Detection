package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import b4.C1975a;
import com.stripe.android.stripe3ds2.transaction.c;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class d implements Parcelable {

    /* loaded from: classes4.dex */
    public static abstract class a extends d {
        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final b4.d f27879a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(b4.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b4.d data) {
            super(null);
            AbstractC3255y.i(data, "data");
            this.f27879a = data;
        }

        public final b4.d a() {
            return this.f27879a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3255y.d(this.f27879a, ((b) obj).f27879a);
        }

        public int hashCode() {
            return this.f27879a.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.f27879a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f27879a.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f27880a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable throwable) {
            super(null);
            AbstractC3255y.i(throwable, "throwable");
            this.f27880a = throwable;
        }

        public final Throwable a() {
            return this.f27880a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f27880a, ((c) obj).f27880a);
        }

        public int hashCode() {
            return this.f27880a.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.f27880a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeSerializable(this.f27880a);
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.transaction.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0675d extends d {
        public static final Parcelable.Creator<C0675d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final C1975a f27881a;

        /* renamed from: b, reason: collision with root package name */
        private final b4.b f27882b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a f27883c;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.d$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0675d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new C0675d(C1975a.CREATOR.createFromParcel(parcel), b4.b.CREATOR.createFromParcel(parcel), c.a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0675d[] newArray(int i8) {
                return new C0675d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0675d(C1975a creqData, b4.b cresData, c.a creqExecutorConfig) {
            super(null);
            AbstractC3255y.i(creqData, "creqData");
            AbstractC3255y.i(cresData, "cresData");
            AbstractC3255y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f27881a = creqData;
            this.f27882b = cresData;
            this.f27883c = creqExecutorConfig;
        }

        public final C1975a a() {
            return this.f27881a;
        }

        public final b4.b b() {
            return this.f27882b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0675d)) {
                return false;
            }
            C0675d c0675d = (C0675d) obj;
            return AbstractC3255y.d(this.f27881a, c0675d.f27881a) && AbstractC3255y.d(this.f27882b, c0675d.f27882b) && AbstractC3255y.d(this.f27883c, c0675d.f27883c);
        }

        public int hashCode() {
            return (((this.f27881a.hashCode() * 31) + this.f27882b.hashCode()) * 31) + this.f27883c.hashCode();
        }

        public String toString() {
            return "Success(creqData=" + this.f27881a + ", cresData=" + this.f27882b + ", creqExecutorConfig=" + this.f27883c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f27881a.writeToParcel(out, i8);
            this.f27882b.writeToParcel(out, i8);
            this.f27883c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final b4.d f27884a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e(b4.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b4.d data) {
            super(null);
            AbstractC3255y.i(data, "data");
            this.f27884a = data;
        }

        public final b4.d a() {
            return this.f27884a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC3255y.d(this.f27884a, ((e) obj).f27884a);
        }

        public int hashCode() {
            return this.f27884a.hashCode();
        }

        public String toString() {
            return "Timeout(data=" + this.f27884a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f27884a.writeToParcel(out, i8);
        }
    }

    private d() {
    }

    public /* synthetic */ d(AbstractC3247p abstractC3247p) {
        this();
    }
}
