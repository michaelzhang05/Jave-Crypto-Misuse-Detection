package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static double f21615a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private Context f21616b;

    /* renamed from: c, reason: collision with root package name */
    private AudioManager f21617c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21618d = false;

    /* renamed from: e, reason: collision with root package name */
    private b f21619e;

    /* renamed from: f, reason: collision with root package name */
    private a f21620f;

    /* loaded from: classes4.dex */
    private static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<d> f21621a;

        public a(d dVar) {
            this.f21621a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar;
            b b8;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = this.f21621a.get()) != null && (b8 = dVar.b()) != null) {
                double a8 = dVar.a();
                if (a8 >= 0.0d) {
                    b8.a(a8);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(double d8);
    }

    public d(Context context) {
        this.f21616b = context;
        this.f21617c = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public final double a() {
        AudioManager audioManager = this.f21617c;
        double streamVolume = ((this.f21617c != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f21615a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f21619e;
    }

    public final void c() {
        if (this.f21616b != null) {
            this.f21620f = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f21616b.registerReceiver(this.f21620f, intentFilter);
            this.f21618d = true;
        }
    }

    public final void d() {
        Context context;
        if (this.f21618d && (context = this.f21616b) != null) {
            try {
                context.unregisterReceiver(this.f21620f);
                this.f21619e = null;
                this.f21618d = false;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(b bVar) {
        this.f21619e = bVar;
    }
}
