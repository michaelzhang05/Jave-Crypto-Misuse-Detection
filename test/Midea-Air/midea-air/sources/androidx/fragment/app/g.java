package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class g<E> extends d {

    /* renamed from: f, reason: collision with root package name */
    private final Activity f1120f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f1121g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f1122h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1123i;

    /* renamed from: j, reason: collision with root package name */
    final i f1124j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.d
    public View b(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.d
    public boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity d() {
        return this.f1120f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context e() {
        return this.f1121g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler f() {
        return this.f1122h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f1121g);
    }

    public int k() {
        return this.f1123i;
    }

    public boolean l() {
        return true;
    }

    public void m(Fragment fragment, String[] strArr, int i2) {
    }

    public boolean n(Fragment fragment) {
        return true;
    }

    public boolean o(String str) {
        return false;
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            this.f1121g.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void q(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 == -1) {
            androidx.core.app.a.u(this.f1120f, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void r() {
    }

    g(Activity activity, Context context, Handler handler, int i2) {
        this.f1124j = new i();
        this.f1120f = activity;
        this.f1121g = (Context) c.h.j.j.d(context, "context == null");
        this.f1122h = (Handler) c.h.j.j.d(handler, "handler == null");
        this.f1123i = i2;
    }
}
