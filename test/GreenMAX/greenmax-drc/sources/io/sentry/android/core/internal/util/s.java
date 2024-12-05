package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import io.sentry.android.core.s0;
import io.sentry.w1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ScreenshotUtils.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public class s {
    @SuppressLint({"NewApi"})
    private static boolean a(Activity activity, s0 s0Var) {
        if (s0Var.d() >= 17) {
            return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
        }
        return !activity.isFinishing();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i2) {
        atomicBoolean.set(i2 == 0);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(View view, Canvas canvas, w1 w1Var, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r14.get() != false) goto L33;
     */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] d(android.app.Activity r11, io.sentry.util.thread.b r12, final io.sentry.w1 r13, io.sentry.android.core.s0 r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.s.d(android.app.Activity, io.sentry.util.thread.b, io.sentry.w1, io.sentry.android.core.s0):byte[]");
    }
}
