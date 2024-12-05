package d0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2722a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f31123a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31124b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2722a(IBinder iBinder, String str) {
        this.f31123a = iBinder;
        this.f31124b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31123a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31124b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f31123a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i8, Parcel parcel) {
        try {
            this.f31123a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
