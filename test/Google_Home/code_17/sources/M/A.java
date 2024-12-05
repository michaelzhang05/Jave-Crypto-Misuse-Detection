package M;

import android.os.Bundle;
import android.util.Log;
import q0.C3826j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final int f6328a;

    /* renamed from: b, reason: collision with root package name */
    final C3826j f6329b = new C3826j();

    /* renamed from: c, reason: collision with root package name */
    final int f6330c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f6331d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(int i8, int i9, Bundle bundle) {
        this.f6328a = i8;
        this.f6330c = i9;
        this.f6331d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(B b8) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + b8.toString());
        }
        this.f6329b.b(b8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f6329b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f6330c + " id=" + this.f6328a + " oneWay=" + b() + "}";
    }
}
