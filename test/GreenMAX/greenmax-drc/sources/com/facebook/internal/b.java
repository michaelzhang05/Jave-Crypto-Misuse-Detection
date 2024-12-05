package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import okhttp3.HttpUrl;

/* compiled from: BoltsMeasurementEventListener.java */
/* loaded from: classes.dex */
public class b extends BroadcastReceiver {
    private static b a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9129b;

    private b(Context context) {
        this.f9129b = context.getApplicationContext();
    }

    private void a() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            c.m.a.a.b(this.f9129b).e(this);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    public static b b(Context context) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            b bVar = a;
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(context);
            a = bVar2;
            bVar2.c();
            return a;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    private void c() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            c.m.a.a.b(this.f9129b).c(this, new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    protected void finalize() throws Throwable {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            try {
                a();
            } finally {
                super.finalize();
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            com.facebook.t.m mVar = new com.facebook.t.m(context);
            String str = "bf_" + intent.getStringExtra("event_name");
            Bundle bundleExtra = intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            for (String str2 : bundleExtra.keySet()) {
                bundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", HttpUrl.FRAGMENT_ENCODE_SET).replaceAll("[ -]*$", HttpUrl.FRAGMENT_ENCODE_SET), (String) bundleExtra.get(str2));
            }
            mVar.f(str, bundle);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }
}
