package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbdd extends Thread implements SurfaceTexture.OnFrameAvailableListener, e8 {

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f13182f = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private final Object A;
    private EGL10 B;
    private EGLDisplay C;
    private EGLContext D;
    private EGLSurface E;
    private volatile boolean F;
    private volatile boolean G;

    /* renamed from: g, reason: collision with root package name */
    private final c8 f13183g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f13184h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f13185i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f13186j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f13187k;
    private final float[] l;
    private final float[] m;
    private final float[] n;
    private float o;
    private float p;
    private float q;
    private int r;
    private int s;
    private SurfaceTexture t;
    private SurfaceTexture u;
    private int v;
    private int w;
    private int x;
    private FloatBuffer y;
    private final CountDownLatch z;

    public zzbdd(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f13182f;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.y = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f13184h = new float[9];
        this.f13185i = new float[9];
        this.f13186j = new float[9];
        this.f13187k = new float[9];
        this.l = new float[9];
        this.m = new float[9];
        this.n = new float[9];
        this.o = Float.NaN;
        c8 c8Var = new c8(context);
        this.f13183g = c8Var;
        c8Var.c(this);
        this.z = new CountDownLatch(1);
        this.A = new Object();
    }

    private static void c(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = f2;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    private static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void f(float[] fArr, float f2) {
        double d2 = f2;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int g(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        h("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        h("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        h("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        h("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i2);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        h("deleteShader");
        return 0;
    }

    private static void h(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    @VisibleForTesting
    private final boolean l() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.E;
        boolean z = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z = this.B.eglDestroySurface(this.C, this.E) | this.B.eglMakeCurrent(this.C, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.E = null;
        }
        EGLContext eGLContext = this.D;
        if (eGLContext != null) {
            z |= this.B.eglDestroyContext(this.C, eGLContext);
            this.D = null;
        }
        EGLDisplay eGLDisplay = this.C;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = z | this.B.eglTerminate(eGLDisplay);
        this.C = null;
        return eglTerminate;
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void a() {
        synchronized (this.A) {
            this.A.notifyAll();
        }
    }

    public final void b(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.s = i2;
        this.r = i3;
        this.u = surfaceTexture;
    }

    public final void e(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        int i2 = this.s;
        int i3 = this.r;
        if (i2 > i3) {
            f4 = (f2 * 1.7453293f) / i2;
            f5 = f3 * 1.7453293f;
            f6 = i2;
        } else {
            f4 = (f2 * 1.7453293f) / i3;
            f5 = f3 * 1.7453293f;
            f6 = i3;
        }
        this.p -= f4;
        float f7 = this.q - (f5 / f6);
        this.q = f7;
        if (f7 < -1.5707964f) {
            this.q = -1.5707964f;
        }
        if (this.q > 1.5707964f) {
            this.q = 1.5707964f;
        }
    }

    public final void i(int i2, int i3) {
        synchronized (this.A) {
            this.s = i2;
            this.r = i3;
            this.F = true;
            this.A.notifyAll();
        }
    }

    public final void j() {
        synchronized (this.A) {
            this.G = true;
            this.u = null;
            this.A.notifyAll();
        }
    }

    public final SurfaceTexture k() {
        if (this.u == null) {
            return null;
        }
        try {
            this.z.await();
        } catch (InterruptedException unused) {
        }
        return this.t;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.x++;
        synchronized (this.A) {
            this.A.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b6  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdd.run():void");
    }
}
