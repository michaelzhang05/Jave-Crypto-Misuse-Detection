package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2442e implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27671a = new b(null);

    /* renamed from: com.stripe.android.view.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC2442e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f27672b = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0692a();

        /* renamed from: com.stripe.android.view.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0692a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return a.f27672b;
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
            return -1880119200;
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

    /* renamed from: com.stripe.android.view.e$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final AbstractC2442e a(Intent intent) {
            AbstractC2442e abstractC2442e;
            if (intent != null) {
                abstractC2442e = (AbstractC2442e) intent.getParcelableExtra("extra_activity_result");
            } else {
                abstractC2442e = null;
            }
            if (abstractC2442e == null) {
                return a.f27672b;
            }
            return abstractC2442e;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2442e {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f27673b;

        /* renamed from: com.stripe.android.view.e$c$a */
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
            this.f27673b = exception;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f27673b, ((c) obj).f27673b);
        }

        public int hashCode() {
            return this.f27673b.hashCode();
        }

        public String toString() {
            return "Failure(exception=" + this.f27673b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f27673b);
        }
    }

    /* renamed from: com.stripe.android.view.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2442e {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.o f27674b;

        /* renamed from: com.stripe.android.view.e$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(com.stripe.android.model.o.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.stripe.android.model.o paymentMethod) {
            super(null);
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            this.f27674b = paymentMethod;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC3159y.d(this.f27674b, ((d) obj).f27674b);
        }

        public int hashCode() {
            return this.f27674b.hashCode();
        }

        public String toString() {
            return "Success(paymentMethod=" + this.f27674b + ")";
        }

        public final com.stripe.android.model.o v() {
            return this.f27674b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f27674b.writeToParcel(out, i8);
        }
    }

    private AbstractC2442e() {
    }

    public Bundle b() {
        return BundleKt.bundleOf(L5.x.a("extra_activity_result", this));
    }

    public /* synthetic */ AbstractC2442e(AbstractC3151p abstractC3151p) {
        this();
    }
}
