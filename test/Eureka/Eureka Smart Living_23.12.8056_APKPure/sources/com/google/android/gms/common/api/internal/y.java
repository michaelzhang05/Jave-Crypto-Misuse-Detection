package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final w f4644a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f4645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, w wVar) {
        this.f4645b = zVar;
        this.f4644a = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4645b.f4646b) {
            s1.a b6 = this.f4644a.b();
            if (b6.d()) {
                z zVar = this.f4645b;
                zVar.f4556a.startActivityForResult(GoogleApiActivity.a(zVar.b(), (PendingIntent) v1.n.h(b6.c()), this.f4644a.a(), false), 1);
                return;
            }
            z zVar2 = this.f4645b;
            if (zVar2.f4649e.a(zVar2.b(), b6.a(), null) != null) {
                z zVar3 = this.f4645b;
                zVar3.f4649e.t(zVar3.b(), this.f4645b.f4556a, b6.a(), 2, this.f4645b);
            } else {
                if (b6.a() != 18) {
                    this.f4645b.l(b6, this.f4644a.a());
                    return;
                }
                z zVar4 = this.f4645b;
                Dialog o6 = zVar4.f4649e.o(zVar4.b(), this.f4645b);
                z zVar5 = this.f4645b;
                zVar5.f4649e.p(zVar5.b().getApplicationContext(), new x(this, o6));
            }
        }
    }
}
