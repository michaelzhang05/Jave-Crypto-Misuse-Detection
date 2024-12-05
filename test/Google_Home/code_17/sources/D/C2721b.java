package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d.InterfaceC2720a;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2721b implements Parcelable {
    public static final Parcelable.Creator<C2721b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f31116a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f31117b = null;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC2720a f31118c;

    /* renamed from: d.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2721b createFromParcel(Parcel parcel) {
            return new C2721b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2721b[] newArray(int i8) {
            return new C2721b[i8];
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0711b extends InterfaceC2720a.AbstractBinderC0709a {
        BinderC0711b() {
        }

        @Override // d.InterfaceC2720a
        public void q0(int i8, Bundle bundle) {
            C2721b c2721b = C2721b.this;
            Handler handler = c2721b.f31117b;
            if (handler != null) {
                handler.post(new c(i8, bundle));
            } else {
                c2721b.a(i8, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f31120a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f31121b;

        c(int i8, Bundle bundle) {
            this.f31120a = i8;
            this.f31121b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2721b.this.a(this.f31120a, this.f31121b);
        }
    }

    C2721b(Parcel parcel) {
        this.f31118c = InterfaceC2720a.AbstractBinderC0709a.h(parcel.readStrongBinder());
    }

    public void b(int i8, Bundle bundle) {
        if (this.f31116a) {
            Handler handler = this.f31117b;
            if (handler != null) {
                handler.post(new c(i8, bundle));
                return;
            } else {
                a(i8, bundle);
                return;
            }
        }
        InterfaceC2720a interfaceC2720a = this.f31118c;
        if (interfaceC2720a != null) {
            try {
                interfaceC2720a.q0(i8, bundle);
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
                if (this.f31118c == null) {
                    this.f31118c = new BinderC0711b();
                }
                parcel.writeStrongBinder(this.f31118c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(int i8, Bundle bundle) {
    }
}
