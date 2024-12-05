package com.stripe.android.stripe3ds2.views;

import O5.x;
import W3.m;
import a4.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import b4.C1975a;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.n;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final b4.b f28145a;

    /* renamed from: b, reason: collision with root package name */
    private final C1975a f28146b;

    /* renamed from: c, reason: collision with root package name */
    private final m f28147c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f28148d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b f28149e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28150f;

    /* renamed from: g, reason: collision with root package name */
    private final n f28151g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f28144h = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(Bundle extras) {
            AbstractC3255y.i(extras, "extras");
            Object parcelable = BundleCompat.getParcelable(extras, "extra_args", d.class);
            if (parcelable != null) {
                return (d) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new d(b4.b.CREATOR.createFromParcel(parcel), C1975a.CREATOR.createFromParcel(parcel), (m) parcel.readParcelable(d.class.getClassLoader()), c.a.CREATOR.createFromParcel(parcel), (c.b) parcel.readSerializable(), parcel.readInt(), n.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    public d(b4.b cresData, C1975a creqData, m uiCustomization, c.a creqExecutorConfig, c.b creqExecutorFactory, int i8, n intentData) {
        AbstractC3255y.i(cresData, "cresData");
        AbstractC3255y.i(creqData, "creqData");
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        AbstractC3255y.i(creqExecutorConfig, "creqExecutorConfig");
        AbstractC3255y.i(creqExecutorFactory, "creqExecutorFactory");
        AbstractC3255y.i(intentData, "intentData");
        this.f28145a = cresData;
        this.f28146b = creqData;
        this.f28147c = uiCustomization;
        this.f28148d = creqExecutorConfig;
        this.f28149e = creqExecutorFactory;
        this.f28150f = i8;
        this.f28151g = intentData;
    }

    public final C1975a a() {
        return this.f28146b;
    }

    public final c.a b() {
        return this.f28148d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3255y.d(this.f28145a, dVar.f28145a) && AbstractC3255y.d(this.f28146b, dVar.f28146b) && AbstractC3255y.d(this.f28147c, dVar.f28147c) && AbstractC3255y.d(this.f28148d, dVar.f28148d) && AbstractC3255y.d(this.f28149e, dVar.f28149e) && this.f28150f == dVar.f28150f && AbstractC3255y.d(this.f28151g, dVar.f28151g);
    }

    public final c.b g() {
        return this.f28149e;
    }

    public final b4.b h() {
        return this.f28145a;
    }

    public int hashCode() {
        return (((((((((((this.f28145a.hashCode() * 31) + this.f28146b.hashCode()) * 31) + this.f28147c.hashCode()) * 31) + this.f28148d.hashCode()) * 31) + this.f28149e.hashCode()) * 31) + this.f28150f) * 31) + this.f28151g.hashCode();
    }

    public final n i() {
        return this.f28151g;
    }

    public final q l() {
        return this.f28146b.u();
    }

    public final int p() {
        return this.f28150f;
    }

    public final m s() {
        return this.f28147c;
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.f28145a + ", creqData=" + this.f28146b + ", uiCustomization=" + this.f28147c + ", creqExecutorConfig=" + this.f28148d + ", creqExecutorFactory=" + this.f28149e + ", timeoutMins=" + this.f28150f + ", intentData=" + this.f28151g + ")";
    }

    public final Bundle u() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f28145a.writeToParcel(out, i8);
        this.f28146b.writeToParcel(out, i8);
        out.writeParcelable(this.f28147c, i8);
        this.f28148d.writeToParcel(out, i8);
        out.writeSerializable(this.f28149e);
        out.writeInt(this.f28150f);
        this.f28151g.writeToParcel(out, i8);
    }
}
