package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: s0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3729t extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3729t> CREATOR = new C3710G();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f37807a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3729t(ArrayList arrayList) {
        this.f37807a = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.s(parcel, 1, this.f37807a, false);
        S.c.b(parcel, a8);
    }
}
