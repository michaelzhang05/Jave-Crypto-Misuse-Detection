package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzaqd {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    private static boolean f12898b = false;

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    private static boolean f12899c = false;

    /* renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    private zzdah f12900d;

    @VisibleForTesting
    private final void h(Context context) {
        synchronized (a) {
            if (((Boolean) zzyt.e().c(zzacu.b4)).booleanValue() && !f12899c) {
                try {
                    f12899c = true;
                    this.f12900d = (zzdah) zzbae.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", n3.a);
                } catch (zzbag e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final String a(Context context) {
        if (!((Boolean) zzyt.e().c(zzacu.b4)).booleanValue()) {
            return null;
        }
        try {
            h(context);
            String valueOf = String.valueOf(this.f12900d.m0());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final IObjectWrapper b(String str, WebView webView, String str2, String str3, String str4) {
        return c(str, webView, str2, str3, str4, "Google");
    }

    public final IObjectWrapper c(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (a) {
            try {
                try {
                    if (((Boolean) zzyt.e().c(zzacu.b4)).booleanValue() && f12898b) {
                        try {
                            return this.f12900d.X2(str, ObjectWrapper.i0(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e2) {
                            zzbad.f("#007 Could not call remote method.", e2);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void d(IObjectWrapper iObjectWrapper, View view) {
        synchronized (a) {
            if (((Boolean) zzyt.e().c(zzacu.b4)).booleanValue() && f12898b) {
                try {
                    this.f12900d.a1(iObjectWrapper, ObjectWrapper.i0(view));
                } catch (RemoteException | NullPointerException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void e(IObjectWrapper iObjectWrapper) {
        synchronized (a) {
            if (((Boolean) zzyt.e().c(zzacu.b4)).booleanValue() && f12898b) {
                try {
                    this.f12900d.R6(iObjectWrapper);
                } catch (RemoteException | NullPointerException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void f(IObjectWrapper iObjectWrapper) {
        synchronized (a) {
            if (((Boolean) zzyt.e().c(zzacu.b4)).booleanValue() && f12898b) {
                try {
                    this.f12900d.A7(iObjectWrapper);
                } catch (RemoteException | NullPointerException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final boolean g(Context context) {
        synchronized (a) {
            if (!((Boolean) zzyt.e().c(zzacu.b4)).booleanValue()) {
                return false;
            }
            if (f12898b) {
                return true;
            }
            try {
                h(context);
                boolean v1 = this.f12900d.v1(ObjectWrapper.i0(context));
                f12898b = v1;
                return v1;
            } catch (RemoteException e2) {
                e = e2;
                zzbad.f("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e3) {
                e = e3;
                zzbad.f("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}
