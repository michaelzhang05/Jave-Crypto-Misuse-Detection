package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzard
/* loaded from: classes2.dex */
public class zzaju<ReferenceT> implements zzajt {

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, CopyOnWriteArrayList<zzaho<? super ReferenceT>>> f12749f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private ReferenceT f12750g;

    private final synchronized void g0(String str, final Map<String, String> map) {
        if (zzbad.a(2)) {
            String valueOf = String.valueOf(str);
            zzawz.m(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzawz.m(sb.toString());
            }
        }
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f12749f.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator<zzaho<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final zzaho<? super ReferenceT> next = it.next();
                zzbbm.a.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.a1

                    /* renamed from: f, reason: collision with root package name */
                    private final zzaju f11043f;

                    /* renamed from: g, reason: collision with root package name */
                    private final zzaho f11044g;

                    /* renamed from: h, reason: collision with root package name */
                    private final Map f11045h;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f11043f = this;
                        this.f11044g = next;
                        this.f11045h = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11043f.L(this.f11044g, this.f11045h);
                    }
                });
            }
        }
    }

    public final synchronized void B() {
        this.f12749f.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void L(zzaho zzahoVar, Map map) {
        zzahoVar.a(this.f12750g, map);
    }

    public final synchronized void f(String str, zzaho<? super ReferenceT> zzahoVar) {
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f12749f.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f12749f.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzahoVar);
    }

    public final synchronized void i(String str, zzaho<? super ReferenceT> zzahoVar) {
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f12749f.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(zzahoVar);
    }

    public final void r0(ReferenceT referencet) {
        this.f12750g = referencet;
    }

    public final synchronized void t(String str, Predicate<zzaho<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f12749f.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzaho<? super ReferenceT> zzahoVar = (zzaho) it.next();
            if (predicate.a(zzahoVar)) {
                arrayList.add(zzahoVar);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final boolean u(String str) {
        return str != null && w0(Uri.parse(str));
    }

    public final boolean w0(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        y0(uri);
        return true;
    }

    public final void y0(Uri uri) {
        String path = uri.getPath();
        zzk.zzlg();
        g0(path, zzaxi.X(uri));
    }
}
