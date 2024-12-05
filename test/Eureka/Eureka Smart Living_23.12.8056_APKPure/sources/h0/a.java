package h0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: h0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0103a extends Binder implements a {

        /* renamed from: h0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0104a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f6814a;

            C0104a(IBinder iBinder) {
                this.f6814a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6814a;
            }

            @Override // h0.a
            public void r(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f6814a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0104a(iBinder) : (a) queryLocalInterface;
        }
    }

    void r(String[] strArr);
}
