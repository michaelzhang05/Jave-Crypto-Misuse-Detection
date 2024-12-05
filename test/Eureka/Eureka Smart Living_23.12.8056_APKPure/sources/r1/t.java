package r1;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    final int f9097a;

    /* renamed from: b, reason: collision with root package name */
    final l2.j f9098b = new l2.j();

    /* renamed from: c, reason: collision with root package name */
    final int f9099c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f9100d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(int i6, int i7, Bundle bundle) {
        this.f9097a = i6;
        this.f9099c = i7;
        this.f9100d = bundle;
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
        this.f9098b.b(uVar);
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
        this.f9098b.c(obj);
    }

    public final String toString() {
        int i6 = this.f9099c;
        int i7 = this.f9097a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i6);
        sb.append(" id=");
        sb.append(i7);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
