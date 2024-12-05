package R;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: R.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1322t extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1322t> CREATOR = new C1326x();

    /* renamed from: a, reason: collision with root package name */
    private final int f8622a;

    /* renamed from: b, reason: collision with root package name */
    private List f8623b;

    public C1322t(int i8, List list) {
        this.f8622a = i8;
        this.f8623b = list;
    }

    public final int s() {
        return this.f8622a;
    }

    public final List u() {
        return this.f8623b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f8622a);
        S.c.u(parcel, 2, this.f8623b, false);
        S.c.b(parcel, a8);
    }

    public final void z(C1316m c1316m) {
        if (this.f8623b == null) {
            this.f8623b = new ArrayList();
        }
        this.f8623b.add(c1316m);
    }
}
