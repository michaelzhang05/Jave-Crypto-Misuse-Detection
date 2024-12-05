package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzchc implements zzdti<zzbbh<String>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14060b;

    private zzchc(zzdtu<zzczt> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14060b = zzdtuVar2;
    }

    public static zzchc a(zzdtu<zzczt> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        return new zzchc(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzczt zzcztVar = this.a.get();
        final Context context = this.f14060b.get();
        return (zzbbh) zzdto.b(zzcztVar.g(zzczs.WEBVIEW_COOKIE).d(new Callable(context) { // from class: com.google.android.gms.internal.ads.wi

            /* renamed from: f, reason: collision with root package name */
            private final Context f12334f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12334f = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager n = zzk.zzli().n(this.f12334f);
                return n != null ? n.getCookie("googleads.g.doubleclick.net") : HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }).a(1L, TimeUnit.SECONDS).e(Exception.class, xi.a).f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
