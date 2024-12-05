package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class o extends l {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2943a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2944b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f2945c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2946d;

    /* renamed from: e, reason: collision with root package name */
    final w f2947e;

    o(Activity activity, Context context, Handler handler, int i6) {
        this.f2947e = new x();
        this.f2943a = activity;
        this.f2944b = (Context) androidx.core.util.h.g(context, "context == null");
        this.f2945c = (Handler) androidx.core.util.h.g(handler, "handler == null");
        this.f2946d = i6;
    }

    public abstract void A();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity m() {
        return this.f2943a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context o() {
        return this.f2944b;
    }

    public Handler t() {
        return this.f2945c;
    }

    public abstract void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object x();

    public abstract LayoutInflater y();

    public void z(Fragment fragment, Intent intent, int i6, Bundle bundle) {
        if (i6 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.k(this.f2944b, intent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j jVar) {
        this(jVar, jVar, new Handler(), 0);
    }
}
