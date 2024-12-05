package O;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class N {

    /* renamed from: e, reason: collision with root package name */
    private static final N f7644e = new N(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f7645a;

    /* renamed from: b, reason: collision with root package name */
    final String f7646b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f7647c;

    /* renamed from: d, reason: collision with root package name */
    final int f7648d;

    private N(boolean z8, int i8, int i9, String str, Throwable th) {
        this.f7645a = z8;
        this.f7648d = i8;
        this.f7646b = str;
        this.f7647c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N b() {
        return f7644e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N c(String str) {
        return new N(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N d(String str, Throwable th) {
        return new N(false, 1, 5, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N f(int i8) {
        return new N(true, i8, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N g(int i8, int i9, String str, Throwable th) {
        return new N(false, i8, i9, str, th);
    }

    String a() {
        return this.f7646b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (!this.f7645a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f7647c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f7647c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}
