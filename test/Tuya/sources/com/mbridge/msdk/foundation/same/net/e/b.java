package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.j;
import com.mbridge.msdk.foundation.same.net.k;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f19632a;

    /* renamed from: b, reason: collision with root package name */
    private j f19633b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<a> f19634c = new LinkedList<>();

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.e<Void> f19636b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.e.a f19637c;

        /* renamed from: d, reason: collision with root package name */
        private int f19638d;

        /* renamed from: e, reason: collision with root package name */
        private File f19639e;

        /* renamed from: f, reason: collision with root package name */
        private String f19640f;

        private a(File file, String str, com.mbridge.msdk.foundation.same.net.e<Void> eVar) {
            this.f19639e = file;
            this.f19636b = eVar;
            this.f19640f = str;
        }

        public final boolean a() {
            return this.f19638d == 1;
        }

        static /* synthetic */ boolean a(a aVar) {
            if (aVar.f19638d != 0) {
                return false;
            }
            com.mbridge.msdk.foundation.same.net.e.a aVar2 = new com.mbridge.msdk.foundation.same.net.e.a(aVar.f19639e, aVar.f19640f);
            aVar.f19637c = aVar2;
            aVar2.a(new com.mbridge.msdk.foundation.same.net.f<Void>() { // from class: com.mbridge.msdk.foundation.same.net.e.b.a.1

                /* renamed from: a, reason: collision with root package name */
                boolean f19641a;

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onCancel() {
                    a.this.f19636b.onCancel();
                    this.f19641a = true;
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar3) {
                    if (!this.f19641a) {
                        a.this.f19636b.onError(aVar3);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onFinish() {
                    if (!this.f19641a) {
                        a.this.f19638d = 3;
                        a.this.f19636b.onFinish();
                        a aVar3 = a.this;
                        b.a(b.this, aVar3);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onPreExecute() {
                    a.this.f19636b.onPreExecute();
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onProgressChange(long j8, long j9) {
                    a.this.f19636b.onProgressChange(j8, j9);
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onSuccess(k kVar) {
                    if (!this.f19641a) {
                        a.this.f19636b.onSuccess(kVar);
                    }
                }
            });
            aVar.f19638d = 1;
            b.this.f19633b.a(aVar.f19637c);
            return true;
        }
    }

    public b(j jVar, int i8) {
        this.f19633b = jVar;
        this.f19632a = i8;
    }

    public final a a(File file, String str, com.mbridge.msdk.foundation.same.net.e<Void> eVar) {
        a aVar = new a(file, str, eVar);
        synchronized (this) {
            this.f19634c.add(aVar);
        }
        a();
        return aVar;
    }

    private void a() {
        synchronized (this) {
            try {
                Iterator<a> it = this.f19634c.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    if (it.next().a()) {
                        i8++;
                    }
                }
                if (i8 >= this.f19632a) {
                    return;
                }
                Iterator<a> it2 = this.f19634c.iterator();
                while (it2.hasNext()) {
                    if (a.a(it2.next()) && (i8 = i8 + 1) == this.f19632a) {
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void a(b bVar, a aVar) {
        synchronized (bVar) {
            bVar.f19634c.remove(aVar);
        }
        bVar.a();
    }
}
