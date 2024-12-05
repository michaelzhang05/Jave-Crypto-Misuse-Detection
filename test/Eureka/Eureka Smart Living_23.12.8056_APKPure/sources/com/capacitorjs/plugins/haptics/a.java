package com.capacitorjs.plugins.haptics;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import r0.c;
import s0.d;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f4207a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4208b = false;

    /* renamed from: c, reason: collision with root package name */
    private final Vibrator f4209c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f4207a = context;
        this.f4209c = Build.VERSION.SDK_INT >= 31 ? c.a(context.getSystemService("vibrator_manager")).getDefaultVibrator() : a(context);
    }

    private Vibrator a(Context context) {
        return (Vibrator) context.getSystemService("vibrator");
    }

    private void g(int i6) {
        this.f4209c.vibrate(i6);
    }

    private void h(long[] jArr, int i6) {
        this.f4209c.vibrate(jArr, i6);
    }

    public void b(d dVar) {
        VibrationEffect createWaveform;
        if (Build.VERSION.SDK_INT < 26) {
            h(dVar.c(), -1);
            return;
        }
        Vibrator vibrator = this.f4209c;
        createWaveform = VibrationEffect.createWaveform(dVar.b(), dVar.a(), -1);
        vibrator.vibrate(createWaveform);
    }

    public void c() {
        if (this.f4208b) {
            b(new s0.c());
        }
    }

    public void d() {
        this.f4208b = false;
    }

    public void e() {
        this.f4208b = true;
    }

    public void f(int i6) {
        VibrationEffect createOneShot;
        if (Build.VERSION.SDK_INT < 26) {
            g(i6);
            return;
        }
        Vibrator vibrator = this.f4209c;
        createOneShot = VibrationEffect.createOneShot(i6, -1);
        vibrator.vibrate(createOneShot);
    }
}
