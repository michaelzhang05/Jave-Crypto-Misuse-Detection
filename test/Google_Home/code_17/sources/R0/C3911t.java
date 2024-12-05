package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3911t extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3911t> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f38542a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3911t(ArrayList arrayList) {
        this.f38542a = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.s(parcel, 1, this.f38542a, false);
        R.c.b(parcel, a8);
    }
}
