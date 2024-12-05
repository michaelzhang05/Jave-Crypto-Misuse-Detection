package com.stripe.android.view;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class w0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final com.stripe.android.model.o f27992a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27993b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f27990c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f27991d = 8;
    public static final Parcelable.Creator<w0> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new w0(parcel.readInt() == 0 ? null : com.stripe.android.model.o.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w0[] newArray(int i8) {
            return new w0[i8];
        }
    }

    public w0(com.stripe.android.model.o oVar, boolean z8) {
        this.f27992a = oVar;
        this.f27993b = z8;
    }

    public Bundle b() {
        return BundleKt.bundleOf(L5.x.a("extra_activity_result", this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return AbstractC3159y.d(this.f27992a, w0Var.f27992a) && this.f27993b == w0Var.f27993b;
    }

    public int hashCode() {
        com.stripe.android.model.o oVar = this.f27992a;
        return ((oVar == null ? 0 : oVar.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27993b);
    }

    public String toString() {
        return "Result(paymentMethod=" + this.f27992a + ", useGooglePay=" + this.f27993b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        com.stripe.android.model.o oVar = this.f27992a;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f27993b ? 1 : 0);
    }

    public /* synthetic */ w0(com.stripe.android.model.o oVar, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : oVar, (i8 & 2) != 0 ? false : z8);
    }
}
