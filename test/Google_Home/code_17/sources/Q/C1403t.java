package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Q.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1403t extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1403t> CREATOR = new C1407x();

    /* renamed from: a, reason: collision with root package name */
    private final int f9084a;

    /* renamed from: b, reason: collision with root package name */
    private List f9085b;

    public C1403t(int i8, List list) {
        this.f9084a = i8;
        this.f9085b = list;
    }

    public final int p() {
        return this.f9084a;
    }

    public final List u() {
        return this.f9085b;
    }

    public final void v(C1397m c1397m) {
        if (this.f9085b == null) {
            this.f9085b = new ArrayList();
        }
        this.f9085b.add(c1397m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f9084a);
        R.c.u(parcel, 2, this.f9085b, false);
        R.c.b(parcel, a8);
    }
}
