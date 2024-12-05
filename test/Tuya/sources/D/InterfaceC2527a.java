package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2527a extends IInterface {

    /* renamed from: j, reason: collision with root package name */
    public static final String f30082j = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i8) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i8);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    void k0(int i8, Bundle bundle);

    /* renamed from: d.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0714a extends Binder implements InterfaceC2527a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0715a implements InterfaceC2527a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f30083a;

            C0715a(IBinder iBinder) {
                this.f30083a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30083a;
            }

            @Override // d.InterfaceC2527a
            public void k0(int i8, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC2527a.f30082j);
                    obtain.writeInt(i8);
                    b.d(obtain, bundle, 0);
                    this.f30083a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0714a() {
            attachInterface(this, InterfaceC2527a.f30082j);
        }

        public static InterfaceC2527a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC2527a.f30082j);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2527a)) {
                return (InterfaceC2527a) queryLocalInterface;
            }
            return new C0715a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            String str = InterfaceC2527a.f30082j;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            k0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
