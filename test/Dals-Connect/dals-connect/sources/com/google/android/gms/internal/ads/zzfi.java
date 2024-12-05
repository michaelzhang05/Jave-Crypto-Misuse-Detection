package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class zzfi {
    private final zzdy a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15037b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15038c;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?>[] f15041f;

    /* renamed from: d, reason: collision with root package name */
    private final int f15039d = 2;

    /* renamed from: e, reason: collision with root package name */
    private volatile Method f15040e = null;

    /* renamed from: g, reason: collision with root package name */
    private CountDownLatch f15042g = new CountDownLatch(1);

    public zzfi(zzdy zzdyVar, String str, String str2, Class<?>... clsArr) {
        this.a = zzdyVar;
        this.f15037b = str;
        this.f15038c = str2;
        this.f15041f = clsArr;
        zzdyVar.r().submit(new wy(this));
    }

    private final String b(byte[] bArr, String str) throws zzdk, UnsupportedEncodingException {
        return new String(this.a.t().b(bArr, str), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        try {
            Class loadClass = this.a.s().loadClass(b(this.a.u(), this.f15037b));
            if (loadClass == null) {
                return;
            }
            this.f15040e = loadClass.getMethod(b(this.a.u(), this.f15038c), this.f15041f);
            if (this.f15040e == null) {
            }
        } catch (zzdk unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.f15042g.countDown();
        }
    }

    public final Method d() {
        if (this.f15040e != null) {
            return this.f15040e;
        }
        try {
            if (this.f15042g.await(2L, TimeUnit.SECONDS)) {
                return this.f15040e;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
