package N;

import android.os.Bundle;
import android.util.Log;
import r0.C3679j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    final int f7129a;

    /* renamed from: b, reason: collision with root package name */
    final C3679j f7130b = new C3679j();

    /* renamed from: c, reason: collision with root package name */
    final int f7131c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f7132d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(int i8, int i9, Bundle bundle) {
        this.f7129a = i8;
        this.f7131c = i9;
        this.f7132d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(u uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7130b.b(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7130b.c(obj);
    }

    public final String toString() {
        int i8 = this.f7131c;
        int i9 = this.f7129a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i8);
        sb.append(" id=");
        sb.append(i9);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
