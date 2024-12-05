package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsd implements zzcva<zzcsc> {
    private final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14422b;

    public zzcsd(zzbbl zzbblVar, Context context) {
        this.a = zzbblVar;
        this.f14422b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcsc a() throws Exception {
        AudioManager audioManager = (AudioManager) this.f14422b.getSystemService("audio");
        return new zzcsc(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzk.zzll().d(), zzk.zzll().e());
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcsc> b() {
        return this.a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.yn

            /* renamed from: f, reason: collision with root package name */
            private final zzcsd f12476f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12476f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12476f.a();
            }
        });
    }
}
