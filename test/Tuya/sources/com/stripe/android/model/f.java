package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C1869d;
import b3.K;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f extends g {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C1869d f24258a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new f((C1869d) parcel.readParcelable(f.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i8) {
            return new f[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1869d card) {
        super(null);
        AbstractC3159y.i(card, "card");
        this.f24258a = card;
    }

    @Override // com.stripe.android.model.g
    public K b() {
        return this.f24258a.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && AbstractC3159y.d(this.f24258a, ((f) obj).f24258a);
    }

    public int hashCode() {
        return this.f24258a.hashCode();
    }

    public String toString() {
        return "CustomerCard(card=" + this.f24258a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f24258a, i8);
    }
}
