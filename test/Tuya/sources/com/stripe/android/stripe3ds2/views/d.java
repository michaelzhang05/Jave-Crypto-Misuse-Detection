package com.stripe.android.stripe3ds2.views;

import L5.x;
import T3.m;
import X3.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Y3.b f27090a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.a f27091b;

    /* renamed from: c, reason: collision with root package name */
    private final m f27092c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f27093d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b f27094e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27095f;

    /* renamed from: g, reason: collision with root package name */
    private final n f27096g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f27089h = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(Bundle extras) {
            AbstractC3159y.i(extras, "extras");
            Object parcelable = BundleCompat.getParcelable(extras, "extra_args", d.class);
            if (parcelable != null) {
                return (d) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new d(Y3.b.CREATOR.createFromParcel(parcel), Y3.a.CREATOR.createFromParcel(parcel), (m) parcel.readParcelable(d.class.getClassLoader()), c.a.CREATOR.createFromParcel(parcel), (c.b) parcel.readSerializable(), parcel.readInt(), n.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    public d(Y3.b cresData, Y3.a creqData, m uiCustomization, c.a creqExecutorConfig, c.b creqExecutorFactory, int i8, n intentData) {
        AbstractC3159y.i(cresData, "cresData");
        AbstractC3159y.i(creqData, "creqData");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        AbstractC3159y.i(creqExecutorConfig, "creqExecutorConfig");
        AbstractC3159y.i(creqExecutorFactory, "creqExecutorFactory");
        AbstractC3159y.i(intentData, "intentData");
        this.f27090a = cresData;
        this.f27091b = creqData;
        this.f27092c = uiCustomization;
        this.f27093d = creqExecutorConfig;
        this.f27094e = creqExecutorFactory;
        this.f27095f = i8;
        this.f27096g = intentData;
    }

    public final Y3.a b() {
        return this.f27091b;
    }

    public final c.a c() {
        return this.f27093d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final c.b e() {
        return this.f27094e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3159y.d(this.f27090a, dVar.f27090a) && AbstractC3159y.d(this.f27091b, dVar.f27091b) && AbstractC3159y.d(this.f27092c, dVar.f27092c) && AbstractC3159y.d(this.f27093d, dVar.f27093d) && AbstractC3159y.d(this.f27094e, dVar.f27094e) && this.f27095f == dVar.f27095f && AbstractC3159y.d(this.f27096g, dVar.f27096g);
    }

    public final Y3.b f() {
        return this.f27090a;
    }

    public int hashCode() {
        return (((((((((((this.f27090a.hashCode() * 31) + this.f27091b.hashCode()) * 31) + this.f27092c.hashCode()) * 31) + this.f27093d.hashCode()) * 31) + this.f27094e.hashCode()) * 31) + this.f27095f) * 31) + this.f27096g.hashCode();
    }

    public final n i() {
        return this.f27096g;
    }

    public final q j() {
        return this.f27091b.n();
    }

    public final int k() {
        return this.f27095f;
    }

    public final m n() {
        return this.f27092c;
    }

    public final Bundle o() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.f27090a + ", creqData=" + this.f27091b + ", uiCustomization=" + this.f27092c + ", creqExecutorConfig=" + this.f27093d + ", creqExecutorFactory=" + this.f27094e + ", timeoutMins=" + this.f27095f + ", intentData=" + this.f27096g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f27090a.writeToParcel(out, i8);
        this.f27091b.writeToParcel(out, i8);
        out.writeParcelable(this.f27092c, i8);
        this.f27093d.writeToParcel(out, i8);
        out.writeSerializable(this.f27094e);
        out.writeInt(this.f27095f);
        this.f27096g.writeToParcel(out, i8);
    }
}
