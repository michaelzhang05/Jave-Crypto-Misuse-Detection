package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d.InterfaceC2527a;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2528b implements Parcelable {
    public static final Parcelable.Creator<C2528b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f30084a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f30085b = null;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC2527a f30086c;

    /* renamed from: d.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2528b createFromParcel(Parcel parcel) {
            return new C2528b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2528b[] newArray(int i8) {
            return new C2528b[i8];
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0716b extends InterfaceC2527a.AbstractBinderC0714a {
        BinderC0716b() {
        }

        @Override // d.InterfaceC2527a
        public void k0(int i8, Bundle bundle) {
            C2528b c2528b = C2528b.this;
            Handler handler = c2528b.f30085b;
            if (handler != null) {
                handler.post(new c(i8, bundle));
            } else {
                c2528b.b(i8, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f30088a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f30089b;

        c(int i8, Bundle bundle) {
            this.f30088a = i8;
            this.f30089b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2528b.this.b(this.f30088a, this.f30089b);
        }
    }

    C2528b(Parcel parcel) {
        this.f30086c = InterfaceC2527a.AbstractBinderC0714a.i(parcel.readStrongBinder());
    }

    public void c(int i8, Bundle bundle) {
        if (this.f30084a) {
            Handler handler = this.f30085b;
            if (handler != null) {
                handler.post(new c(i8, bundle));
                return;
            } else {
                b(i8, bundle);
                return;
            }
        }
        InterfaceC2527a interfaceC2527a = this.f30086c;
        if (interfaceC2527a != null) {
            try {
                interfaceC2527a.k0(i8, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        synchronized (this) {
            try {
                if (this.f30086c == null) {
                    this.f30086c = new BinderC0716b();
                }
                parcel.writeStrongBinder(this.f30086c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void b(int i8, Bundle bundle) {
    }
}
