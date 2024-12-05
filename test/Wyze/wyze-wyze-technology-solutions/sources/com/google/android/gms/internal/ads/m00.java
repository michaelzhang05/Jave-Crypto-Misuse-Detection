package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class m00 extends Handler implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final zzkc f11782f;

    /* renamed from: g, reason: collision with root package name */
    private final zzka f11783g;

    /* renamed from: h, reason: collision with root package name */
    private final int f11784h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Thread f11785i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ zzjz f11786j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(zzjz zzjzVar, Looper looper, zzkc zzkcVar, zzka zzkaVar, int i2) {
        super(looper);
        this.f11786j = zzjzVar;
        this.f11782f = zzkcVar;
        this.f11783g = zzkaVar;
        this.f11784h = 0;
    }

    public final void a() {
        this.f11782f.b();
        if (this.f11785i != null) {
            this.f11785i.interrupt();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 2) {
            zzjz.e(this.f11786j, false);
            zzjz.c(this.f11786j, null);
            if (this.f11782f.a()) {
                this.f11783g.h(this.f11782f);
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                this.f11783g.b(this.f11782f);
                return;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f11783g.f(this.f11782f, (IOException) message.obj);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f11785i = Thread.currentThread();
            int i2 = this.f11784h;
            if (i2 > 0) {
                Thread.sleep(i2);
            }
            if (!this.f11782f.a()) {
                this.f11782f.c();
            }
            sendEmptyMessage(0);
        } catch (IOException e2) {
            obtainMessage(1, e2).sendToTarget();
        } catch (Error e3) {
            Log.e("LoadTask", "Unexpected error loading stream", e3);
            obtainMessage(2, e3).sendToTarget();
            throw e3;
        } catch (InterruptedException unused) {
            zzkh.d(this.f11782f.a());
            sendEmptyMessage(0);
        } catch (Exception e4) {
            Log.e("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(1, new zzkd(e4)).sendToTarget();
        }
    }
}
