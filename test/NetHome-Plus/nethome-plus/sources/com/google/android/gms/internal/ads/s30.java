package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s30 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private final int[] f12139f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f12140g;

    /* renamed from: h, reason: collision with root package name */
    private SurfaceTexture f12141h;

    /* renamed from: i, reason: collision with root package name */
    private Error f12142i;

    /* renamed from: j, reason: collision with root package name */
    private RuntimeException f12143j;

    /* renamed from: k, reason: collision with root package name */
    private zztd f12144k;

    public s30() {
        super("dummySurface");
        this.f12139f = new int[1];
    }

    public final void a() {
        this.f12140g.sendEmptyMessage(3);
    }

    public final zztd b(boolean z) {
        boolean z2;
        start();
        this.f12140g = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f12140g.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f12144k == null && this.f12143j == null && this.f12142i == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f12143j;
        if (runtimeException == null) {
            Error error = this.f12142i;
            if (error == null) {
                return this.f12144k;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f12141h.updateTexImage();
                    return true;
                }
                if (i2 != 3) {
                    return true;
                }
                try {
                    try {
                        this.f12141h.release();
                    } finally {
                        this.f12144k = null;
                        this.f12141h = null;
                        GLES20.glDeleteTextures(1, this.f12139f, 0);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("DummySurface", "Failed to release dummy surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    zzsk.f(eglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr = new int[2];
                    zzsk.f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    zzsk.f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                    zzsk.f(eglCreateContext != null, "eglCreateContext failed");
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    zzsk.f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    zzsk.f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.f12139f, 0);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12139f[0]);
                    this.f12141h = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.f12144k = new zztd(this, this.f12141h, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f12142i = e2;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (RuntimeException e3) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                this.f12143j = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f12140g.sendEmptyMessage(2);
    }
}
