package com.google.android.gms.common.api;

import Q.AbstractC1400p;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class Scope extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f15886a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15887b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i8, String str) {
        AbstractC1400p.g(str, "scopeUri must not be null or empty");
        this.f15886a = i8;
        this.f15887b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f15887b.equals(((Scope) obj).f15887b);
    }

    public int hashCode() {
        return this.f15887b.hashCode();
    }

    public String p() {
        return this.f15887b;
    }

    public String toString() {
        return this.f15887b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f15886a;
        int a8 = c.a(parcel);
        c.k(parcel, 1, i9);
        c.q(parcel, 2, p(), false);
        c.b(parcel, a8);
    }

    public Scope(String str) {
        this(1, str);
    }
}
