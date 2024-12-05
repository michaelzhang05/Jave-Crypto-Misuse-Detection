package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbzt {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcdn f13766b;

    /* renamed from: c, reason: collision with root package name */
    private final zzccj f13767c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbmy f13768d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbzb f13769e;

    public zzbzt(Context context, zzcdn zzcdnVar, zzccj zzccjVar, zzbmy zzbmyVar, zzbzb zzbzbVar) {
        this.a = context;
        this.f13766b = zzcdnVar;
        this.f13767c = zzccjVar;
        this.f13768d = zzbmyVar;
        this.f13769e = zzbzbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(zzbgz zzbgzVar, Map map) {
        zzbgzVar.getView().setVisibility(8);
        this.f13768d.r(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, (String) map.get(DeepLinkIntentReceiver.DeepLinksKeys.ID));
        this.f13767c.e("sendMessageToNativeJs", hashMap);
    }

    public final View c() throws zzbhj {
        zzbgz b2 = this.f13766b.b(zzyd.J(this.a));
        b2.getView().setVisibility(8);
        b2.f("/sendMessageToSdk", new zzaho(this) { // from class: com.google.android.gms.internal.ads.dg
            private final zzbzt a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            public final void a(Object obj, Map map) {
                this.a.f((zzbgz) obj, map);
            }
        });
        b2.f("/adMuted", new zzaho(this) { // from class: com.google.android.gms.internal.ads.eg
            private final zzbzt a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            public final void a(Object obj, Map map) {
                this.a.e((zzbgz) obj, map);
            }
        });
        this.f13767c.f(new WeakReference(b2), "/loadHtml", new zzaho(this) { // from class: com.google.android.gms.internal.ads.fg
            private final zzbzt a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            public final void a(Object obj, final Map map) {
                final zzbzt zzbztVar = this.a;
                zzbgz zzbgzVar = (zzbgz) obj;
                zzbgzVar.p().i(new zzbij(zzbztVar, map) { // from class: com.google.android.gms.internal.ads.ig
                    private final zzbzt a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Map f11602b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = zzbztVar;
                        this.f11602b = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbij
                    public final void zzae(boolean z) {
                        this.a.b(this.f11602b, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzbgzVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzbgzVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f13767c.f(new WeakReference(b2), "/showOverlay", new zzaho(this) { // from class: com.google.android.gms.internal.ads.gg
            private final zzbzt a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            public final void a(Object obj, Map map) {
                this.a.d((zzbgz) obj, map);
            }
        });
        this.f13767c.f(new WeakReference(b2), "/hideOverlay", new zzaho(this) { // from class: com.google.android.gms.internal.ads.hg
            private final zzbzt a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            public final void a(Object obj, Map map) {
                this.a.a((zzbgz) obj, map);
            }
        });
        return b2.getView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbgz zzbgzVar, Map map) {
        zzbgzVar.getView().setVisibility(0);
        this.f13768d.r(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzbgz zzbgzVar, Map map) {
        this.f13769e.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(zzbgz zzbgzVar, Map map) {
        this.f13767c.e("sendMessageToNativeJs", map);
    }
}
