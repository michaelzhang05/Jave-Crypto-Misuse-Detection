package com.stripe.android.customersheet;

import L5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class i implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23759a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends i {
        public static final Parcelable.Creator<a> CREATOR = new C0466a();

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3991f f23760b;

        /* renamed from: com.stripe.android.customersheet.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0466a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((AbstractC3991f) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(AbstractC3991f abstractC3991f) {
            super(null);
            this.f23760b = abstractC3991f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f23760b, ((a) obj).f23760b);
        }

        public int hashCode() {
            AbstractC3991f abstractC3991f = this.f23760b;
            if (abstractC3991f == null) {
                return 0;
            }
            return abstractC3991f.hashCode();
        }

        public String toString() {
            return "Canceled(paymentSelection=" + this.f23760b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f23760b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ i a(Intent intent) {
            if (intent != null) {
                return (i) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends i {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f23761b;

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
        public c(Throwable exception) {
            super(null);
            AbstractC3159y.i(exception, "exception");
            this.f23761b = exception;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f23761b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends i {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3991f f23762b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d((AbstractC3991f) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(AbstractC3991f abstractC3991f) {
            super(null);
            this.f23762b = abstractC3991f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC3159y.d(this.f23762b, ((d) obj).f23762b);
        }

        public int hashCode() {
            AbstractC3991f abstractC3991f = this.f23762b;
            if (abstractC3991f == null) {
                return 0;
            }
            return abstractC3991f.hashCode();
        }

        public String toString() {
            return "Selected(paymentSelection=" + this.f23762b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f23762b, i8);
        }
    }

    public /* synthetic */ i(AbstractC3151p abstractC3151p) {
        this();
    }

    public final Bundle b() {
        return BundleKt.bundleOf(x.a("extra_activity_result", this));
    }

    private i() {
    }
}
