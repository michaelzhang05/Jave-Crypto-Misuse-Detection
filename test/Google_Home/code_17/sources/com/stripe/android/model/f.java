package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import e3.C2790d;
import e3.K;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f extends g {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C2790d f25313a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new f((C2790d) parcel.readParcelable(f.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i8) {
            return new f[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C2790d card) {
        super(null);
        AbstractC3255y.i(card, "card");
        this.f25313a = card;
    }

    @Override // com.stripe.android.model.g
    public K a() {
        return this.f25313a.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && AbstractC3255y.d(this.f25313a, ((f) obj).f25313a);
    }

    public int hashCode() {
        return this.f25313a.hashCode();
    }

    public String toString() {
        return "CustomerCard(card=" + this.f25313a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f25313a, i8);
    }
}
