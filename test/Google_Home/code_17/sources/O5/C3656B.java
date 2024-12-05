package o5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Debug;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3656B {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36481a;

    /* renamed from: b, reason: collision with root package name */
    private final C3678r f36482b;

    public C3656B(Context context) {
        AbstractC3255y.i(context, "context");
        this.f36481a = context;
        this.f36482b = new C3678r(context);
    }

    private final boolean a() {
        if ((this.f36481a.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    private final boolean c() {
        C3667g c3667g = new C3667g();
        PackageManager packageManager = this.f36481a.getPackageManager();
        AbstractC3255y.h(packageManager, "context.packageManager");
        String packageName = this.f36481a.getPackageName();
        AbstractC3255y.h(packageName, "context.packageName");
        String l8 = c3667g.l(packageManager, packageName);
        if (j6.n.s(l8, "822b9ca12b534ebcf426632221d951bfc60eb08f9f0cf2839c321b0685c2e8a4", true) || j6.n.s(l8, "1ef7d68f1f8d3ab55dabf0a9a38110a5a0fd24038263bfc804814e9bdd807f4b", true)) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (!c()) {
            this.f36482b.a("security_signature_invalid");
            return true;
        }
        if (a() || Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            return true;
        }
        return false;
    }
}
