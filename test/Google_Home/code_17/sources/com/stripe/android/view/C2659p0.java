package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2659p0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final m2.u f28954a;

    /* renamed from: b, reason: collision with root package name */
    private final m2.v f28955b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28956c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f28957d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f28952e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f28953f = 8;
    public static final Parcelable.Creator<C2659p0> CREATOR = new b();

    /* renamed from: com.stripe.android.view.p0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C2659p0 a(Intent intent) {
            AbstractC3255y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (C2659p0) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.p0$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2659p0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2659p0(m2.u.CREATOR.createFromParcel(parcel), m2.v.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2659p0[] newArray(int i8) {
            return new C2659p0[i8];
        }
    }

    public C2659p0(m2.u paymentSessionConfig, m2.v paymentSessionData, boolean z8, Integer num) {
        AbstractC3255y.i(paymentSessionConfig, "paymentSessionConfig");
        AbstractC3255y.i(paymentSessionData, "paymentSessionData");
        this.f28954a = paymentSessionConfig;
        this.f28955b = paymentSessionData;
        this.f28956c = z8;
        this.f28957d = num;
    }

    public final m2.u a() {
        return this.f28954a;
    }

    public final m2.v b() {
        return this.f28955b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2659p0)) {
            return false;
        }
        C2659p0 c2659p0 = (C2659p0) obj;
        return AbstractC3255y.d(this.f28954a, c2659p0.f28954a) && AbstractC3255y.d(this.f28955b, c2659p0.f28955b) && this.f28956c == c2659p0.f28956c && AbstractC3255y.d(this.f28957d, c2659p0.f28957d);
    }

    public final Integer g() {
        return this.f28957d;
    }

    public int hashCode() {
        int hashCode = ((((this.f28954a.hashCode() * 31) + this.f28955b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f28956c)) * 31;
        Integer num = this.f28957d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Args(paymentSessionConfig=" + this.f28954a + ", paymentSessionData=" + this.f28955b + ", isPaymentSessionActive=" + this.f28956c + ", windowFlags=" + this.f28957d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        AbstractC3255y.i(out, "out");
        this.f28954a.writeToParcel(out, i8);
        this.f28955b.writeToParcel(out, i8);
        out.writeInt(this.f28956c ? 1 : 0);
        Integer num = this.f28957d;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }
}
