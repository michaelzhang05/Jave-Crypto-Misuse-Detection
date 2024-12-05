package com.uptodown.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3673m;

/* loaded from: classes5.dex */
public final class AuthenticatorService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC3255y.i(intent, "intent");
        IBinder iBinder = new C3673m(this).getIBinder();
        AbstractC3255y.h(iBinder, "authenticator.iBinder");
        return iBinder;
    }
}
