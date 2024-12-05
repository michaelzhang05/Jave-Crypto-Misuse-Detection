package R;

import android.os.IBinder;
import android.os.Parcel;
import g0.AbstractC2698a;
import g0.AbstractC2700c;

/* loaded from: classes3.dex */
public final class V extends AbstractC2698a implements X {
    /* JADX INFO: Access modifiers changed from: package-private */
    public V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // R.X
    public final boolean O(O.I i8, Z.a aVar) {
        Parcel j8 = j();
        AbstractC2700c.c(j8, i8);
        AbstractC2700c.d(j8, aVar);
        Parcel i9 = i(5, j8);
        boolean e8 = AbstractC2700c.e(i9);
        i9.recycle();
        return e8;
    }

    @Override // R.X
    public final boolean g() {
        Parcel i8 = i(7, j());
        boolean e8 = AbstractC2700c.e(i8);
        i8.recycle();
        return e8;
    }

    @Override // R.X
    public final O.G j0(O.E e8) {
        Parcel j8 = j();
        AbstractC2700c.c(j8, e8);
        Parcel i8 = i(8, j8);
        O.G g8 = (O.G) AbstractC2700c.a(i8, O.G.CREATOR);
        i8.recycle();
        return g8;
    }

    @Override // R.X
    public final O.G r(O.E e8) {
        Parcel j8 = j();
        AbstractC2700c.c(j8, e8);
        Parcel i8 = i(6, j8);
        O.G g8 = (O.G) AbstractC2700c.a(i8, O.G.CREATOR);
        i8.recycle();
        return g8;
    }
}
