package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;

/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    private final c f1396a = new a();

    /* renamed from: b, reason: collision with root package name */
    private CancellationSignal f1397b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.core.os.f f1398c;

    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // androidx.biometric.x.c
        public CancellationSignal a() {
            return b.b();
        }

        @Override // androidx.biometric.x.c
        public androidx.core.os.f b() {
            return new androidx.core.os.f();
        }
    }

    /* loaded from: classes.dex */
    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    interface c {
        CancellationSignal a();

        androidx.core.os.f b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        CancellationSignal cancellationSignal = this.f1397b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e6) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e6);
            }
            this.f1397b = null;
        }
        androidx.core.os.f fVar = this.f1398c;
        if (fVar != null) {
            try {
                fVar.a();
            } catch (NullPointerException e7) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e7);
            }
            this.f1398c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CancellationSignal b() {
        if (this.f1397b == null) {
            this.f1397b = this.f1396a.a();
        }
        return this.f1397b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.os.f c() {
        if (this.f1398c == null) {
            this.f1398c = this.f1396a.b();
        }
        return this.f1398c;
    }
}
