package com.stripe.android.payments.paymentlauncher;

import L5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25300a = new b(null);

    /* renamed from: com.stripe.android.payments.paymentlauncher.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0556a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0556a f25301b = new C0556a();
        public static final Parcelable.Creator<C0556a> CREATOR = new C0557a();

        /* renamed from: com.stripe.android.payments.paymentlauncher.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0557a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0556a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return C0556a.f25301b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0556a[] newArray(int i8) {
                return new C0556a[i8];
            }
        }

        private C0556a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
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

        public final /* synthetic */ a a(Intent intent) {
            a aVar;
            if (intent != null) {
                aVar = (a) intent.getParcelableExtra("extra_args");
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return new d(new IllegalStateException("Failed to get PaymentSheetResult from Intent"));
            }
            return aVar;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0558a();

        /* renamed from: b, reason: collision with root package name */
        private final StripeIntent f25302b;

        /* renamed from: com.stripe.android.payments.paymentlauncher.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0558a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((StripeIntent) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StripeIntent intent) {
            super(null);
            AbstractC3159y.i(intent, "intent");
            this.f25302b = intent;
        }

        public final StripeIntent c() {
            return this.f25302b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25302b, ((c) obj).f25302b);
        }

        public int hashCode() {
            return this.f25302b.hashCode();
        }

        public String toString() {
            return "Completed(intent=" + this.f25302b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25302b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new C0559a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f25303b;

        /* renamed from: com.stripe.android.payments.paymentlauncher.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0559a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable throwable) {
            super(null);
            AbstractC3159y.i(throwable, "throwable");
            this.f25303b = throwable;
        }

        public final Throwable c() {
            return this.f25303b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f25303b);
        }
    }

    public /* synthetic */ a(AbstractC3151p abstractC3151p) {
        this();
    }

    public final /* synthetic */ Bundle b() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    private a() {
    }
}
