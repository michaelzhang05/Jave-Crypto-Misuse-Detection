package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class m implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f26883a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends m {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final h f26884b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(challengeResult, "challengeResult");
            this.f26884b = challengeResult;
        }

        public final h b() {
            return this.f26884b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f26884b, ((b) obj).f26884b);
        }

        public int hashCode() {
            return this.f26884b.hashCode();
        }

        public String toString() {
            return "End(challengeResult=" + this.f26884b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26884b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends m {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.views.d f26885b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(challengeViewArgs, "challengeViewArgs");
            this.f26885b = challengeViewArgs;
        }

        public final com.stripe.android.stripe3ds2.views.d b() {
            return this.f26885b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f26885b, ((c) obj).f26885b);
        }

        public int hashCode() {
            return this.f26885b.hashCode();
        }

        public String toString() {
            return "Start(challengeViewArgs=" + this.f26885b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26885b.writeToParcel(out, i8);
        }
    }

    private m() {
    }

    public /* synthetic */ m(AbstractC3151p abstractC3151p) {
        this();
    }
}
