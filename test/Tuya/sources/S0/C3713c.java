package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3713c extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3713c> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f37727a;

    /* renamed from: b, reason: collision with root package name */
    boolean f37728b;

    /* renamed from: c, reason: collision with root package name */
    boolean f37729c;

    /* renamed from: d, reason: collision with root package name */
    int f37730d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3713c(ArrayList arrayList, boolean z8, boolean z9, int i8) {
        this.f37727a = arrayList;
        this.f37728b = z8;
        this.f37729c = z9;
        this.f37730d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.m(parcel, 1, this.f37727a, false);
        S.c.c(parcel, 2, this.f37728b);
        S.c.c(parcel, 3, this.f37729c);
        S.c.k(parcel, 4, this.f37730d);
        S.c.b(parcel, a8);
    }
}
