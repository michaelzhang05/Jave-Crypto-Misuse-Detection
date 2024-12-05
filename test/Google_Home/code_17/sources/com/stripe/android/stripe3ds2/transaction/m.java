package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class m implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27938a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends m {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final h f27939b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b((h) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h challengeResult) {
            super(null);
            AbstractC3255y.i(challengeResult, "challengeResult");
            this.f27939b = challengeResult;
        }

        public final h a() {
            return this.f27939b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3255y.d(this.f27939b, ((b) obj).f27939b);
        }

        public int hashCode() {
            return this.f27939b.hashCode();
        }

        public String toString() {
            return "End(challengeResult=" + this.f27939b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f27939b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends m {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.views.d f27940b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(com.stripe.android.stripe3ds2.views.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.stripe.android.stripe3ds2.views.d challengeViewArgs) {
            super(null);
            AbstractC3255y.i(challengeViewArgs, "challengeViewArgs");
            this.f27940b = challengeViewArgs;
        }

        public final com.stripe.android.stripe3ds2.views.d a() {
            return this.f27940b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f27940b, ((c) obj).f27940b);
        }

        public int hashCode() {
            return this.f27940b.hashCode();
        }

        public String toString() {
            return "Start(challengeViewArgs=" + this.f27940b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f27940b.writeToParcel(out, i8);
        }
    }

    private m() {
    }

    public /* synthetic */ m(AbstractC3247p abstractC3247p) {
        this();
    }
}
