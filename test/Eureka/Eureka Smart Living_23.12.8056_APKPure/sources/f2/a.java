package f2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f6586a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6587b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f6586a = iBinder;
        this.f6587b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel a(int i6, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f6586a.transact(i6, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e6) {
                obtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6586a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6587b);
        return obtain;
    }
}
