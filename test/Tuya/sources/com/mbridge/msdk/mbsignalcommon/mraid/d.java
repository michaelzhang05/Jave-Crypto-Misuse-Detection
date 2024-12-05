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
    public static double f20560a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private Context f20561b;

    /* renamed from: c, reason: collision with root package name */
    private AudioManager f20562c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20563d = false;

    /* renamed from: e, reason: collision with root package name */
    private b f20564e;

    /* renamed from: f, reason: collision with root package name */
    private a f20565f;

    /* loaded from: classes4.dex */
    private static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<d> f20566a;

        public a(d dVar) {
            this.f20566a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar;
            b b8;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = this.f20566a.get()) != null && (b8 = dVar.b()) != null) {
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
        this.f20561b = context;
        this.f20562c = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public final double a() {
        AudioManager audioManager = this.f20562c;
        double streamVolume = ((this.f20562c != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f20560a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f20564e;
    }

    public final void c() {
        if (this.f20561b != null) {
            this.f20565f = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f20561b.registerReceiver(this.f20565f, intentFilter);
            this.f20563d = true;
        }
    }

    public final void d() {
        Context context;
        if (this.f20563d && (context = this.f20561b) != null) {
            try {
                context.unregisterReceiver(this.f20565f);
                this.f20564e = null;
                this.f20563d = false;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(b bVar) {
        this.f20564e = bVar;
    }
}
