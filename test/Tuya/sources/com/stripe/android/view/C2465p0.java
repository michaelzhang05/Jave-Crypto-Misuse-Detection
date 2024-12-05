package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2465p0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final j2.u f27899a;

    /* renamed from: b, reason: collision with root package name */
    private final j2.v f27900b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27901c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f27902d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f27897e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f27898f = 8;
    public static final Parcelable.Creator<C2465p0> CREATOR = new b();

    /* renamed from: com.stripe.android.view.p0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C2465p0 a(Intent intent) {
            AbstractC3159y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (C2465p0) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.p0$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2465p0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C2465p0(j2.u.CREATOR.createFromParcel(parcel), j2.v.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2465p0[] newArray(int i8) {
            return new C2465p0[i8];
        }
    }

    public C2465p0(j2.u paymentSessionConfig, j2.v paymentSessionData, boolean z8, Integer num) {
        AbstractC3159y.i(paymentSessionConfig, "paymentSessionConfig");
        AbstractC3159y.i(paymentSessionData, "paymentSessionData");
        this.f27899a = paymentSessionConfig;
        this.f27900b = paymentSessionData;
        this.f27901c = z8;
        this.f27902d = num;
    }

    public final j2.u b() {
        return this.f27899a;
    }

    public final j2.v c() {
        return this.f27900b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.f27902d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2465p0)) {
            return false;
        }
        C2465p0 c2465p0 = (C2465p0) obj;
        return AbstractC3159y.d(this.f27899a, c2465p0.f27899a) && AbstractC3159y.d(this.f27900b, c2465p0.f27900b) && this.f27901c == c2465p0.f27901c && AbstractC3159y.d(this.f27902d, c2465p0.f27902d);
    }

    public int hashCode() {
        int hashCode = ((((this.f27899a.hashCode() * 31) + this.f27900b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27901c)) * 31;
        Integer num = this.f27902d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Args(paymentSessionConfig=" + this.f27899a + ", paymentSessionData=" + this.f27900b + ", isPaymentSessionActive=" + this.f27901c + ", windowFlags=" + this.f27902d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        AbstractC3159y.i(out, "out");
        this.f27899a.writeToParcel(out, i8);
        this.f27900b.writeToParcel(out, i8);
        out.writeInt(this.f27901c ? 1 : 0);
        Integer num = this.f27902d;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }
}
