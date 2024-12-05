package b0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1842a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f14238a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14239b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1842a(IBinder iBinder, String str) {
        this.f14238a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14238a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14239b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel j(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f14238a.transact(i8, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }
}
