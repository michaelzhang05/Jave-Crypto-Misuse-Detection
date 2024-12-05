package l5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Debug;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3308B {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34480a;

    /* renamed from: b, reason: collision with root package name */
    private final C3330r f34481b;

    public C3308B(Context context) {
        AbstractC3159y.i(context, "context");
        this.f34480a = context;
        this.f34481b = new C3330r(context);
    }

    private final boolean a() {
        if ((this.f34480a.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    private final boolean c() {
        C3319g c3319g = new C3319g();
        PackageManager packageManager = this.f34480a.getPackageManager();
        AbstractC3159y.h(packageManager, "context.packageManager");
        String packageName = this.f34480a.getPackageName();
        AbstractC3159y.h(packageName, "context.packageName");
        String l8 = c3319g.l(packageManager, packageName);
        if (g6.n.s(l8, "822b9ca12b534ebcf426632221d951bfc60eb08f9f0cf2839c321b0685c2e8a4", true) || g6.n.s(l8, "1ef7d68f1f8d3ab55dabf0a9a38110a5a0fd24038263bfc804814e9bdd807f4b", true)) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (!c()) {
            this.f34481b.a("security_signature_invalid");
            return true;
        }
        if (a() || Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            return true;
        }
        return false;
    }
}
