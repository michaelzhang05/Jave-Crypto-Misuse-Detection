package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.transaction.c;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class d implements Parcelable {

    /* loaded from: classes4.dex */
    public static abstract class a extends d {
        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
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
        private final Y3.d f26824a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(Y3.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y3.d data) {
            super(null);
            AbstractC3159y.i(data, "data");
            this.f26824a = data;
        }

        public final Y3.d b() {
            return this.f26824a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f26824a, ((b) obj).f26824a);
        }

        public int hashCode() {
            return this.f26824a.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.f26824a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26824a.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f26825a;

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
        public c(Throwable throwable) {
            super(null);
            AbstractC3159y.i(throwable, "throwable");
            this.f26825a = throwable;
        }

        public final Throwable b() {
            return this.f26825a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f26825a, ((c) obj).f26825a);
        }

        public int hashCode() {
            return this.f26825a.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.f26825a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f26825a);
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.transaction.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0679d extends d {
        public static final Parcelable.Creator<C0679d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Y3.a f26826a;

        /* renamed from: b, reason: collision with root package name */
        private final Y3.b f26827b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a f26828c;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.d$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0679d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0679d(Y3.a.CREATOR.createFromParcel(parcel), Y3.b.CREATOR.createFromParcel(parcel), c.a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0679d[] newArray(int i8) {
                return new C0679d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0679d(Y3.a creqData, Y3.b cresData, c.a creqExecutorConfig) {
            super(null);
            AbstractC3159y.i(creqData, "creqData");
            AbstractC3159y.i(cresData, "cresData");
            AbstractC3159y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f26826a = creqData;
            this.f26827b = cresData;
            this.f26828c = creqExecutorConfig;
        }

        public final Y3.a b() {
            return this.f26826a;
        }

        public final Y3.b c() {
            return this.f26827b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0679d)) {
                return false;
            }
            C0679d c0679d = (C0679d) obj;
            return AbstractC3159y.d(this.f26826a, c0679d.f26826a) && AbstractC3159y.d(this.f26827b, c0679d.f26827b) && AbstractC3159y.d(this.f26828c, c0679d.f26828c);
        }

        public int hashCode() {
            return (((this.f26826a.hashCode() * 31) + this.f26827b.hashCode()) * 31) + this.f26828c.hashCode();
        }

        public String toString() {
            return "Success(creqData=" + this.f26826a + ", cresData=" + this.f26827b + ", creqExecutorConfig=" + this.f26828c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26826a.writeToParcel(out, i8);
            this.f26827b.writeToParcel(out, i8);
            this.f26828c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Y3.d f26829a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(Y3.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y3.d data) {
            super(null);
            AbstractC3159y.i(data, "data");
            this.f26829a = data;
        }

        public final Y3.d b() {
            return this.f26829a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC3159y.d(this.f26829a, ((e) obj).f26829a);
        }

        public int hashCode() {
            return this.f26829a.hashCode();
        }

        public String toString() {
            return "Timeout(data=" + this.f26829a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26829a.writeToParcel(out, i8);
        }
    }

    private d() {
    }

    public /* synthetic */ d(AbstractC3151p abstractC3151p) {
        this();
    }
}
