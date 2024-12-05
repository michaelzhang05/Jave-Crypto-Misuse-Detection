package j0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3024a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f32701a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32702b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3024a(IBinder iBinder, String str) {
        this.f32701a = iBinder;
        this.f32702b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32701a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32702b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel j(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f32701a.transact(1, parcel, obtain, 0);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(int i8, Parcel parcel) {
        try {
            this.f32701a.transact(i8, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
