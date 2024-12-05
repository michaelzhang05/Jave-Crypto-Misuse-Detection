package com.capacitorjs.plugins.browser;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.g;
import androidx.browser.customtabs.h;
import androidx.browser.customtabs.i;
import com.capacitorjs.plugins.browser.d;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private c f4152a;

    /* renamed from: b, reason: collision with root package name */
    private Context f4153b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.c f4154c;

    /* renamed from: d, reason: collision with root package name */
    private i f4155d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4156e = false;

    /* renamed from: g, reason: collision with root package name */
    private h f4158g = new a();

    /* renamed from: f, reason: collision with root package name */
    private d f4157f = new d(new d.a() { // from class: com.capacitorjs.plugins.browser.a
        @Override // com.capacitorjs.plugins.browser.d.a
        public final void a() {
            b.this.f();
        }
    });

    /* loaded from: classes.dex */
    class a extends h {
        a() {
        }

        @Override // androidx.browser.customtabs.h
        public void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
            b.this.f4154c = cVar;
            cVar.g(0L);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.capacitorjs.plugins.browser.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0072b extends androidx.browser.customtabs.b {
        C0072b() {
        }

        @Override // androidx.browser.customtabs.b
        public void e(int i6, Bundle bundle) {
            b.this.g(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a(int i6);
    }

    public b(Context context) {
        this.f4153b = context;
    }

    private i e() {
        androidx.browser.customtabs.c cVar = this.f4154c;
        if (cVar == null) {
            return null;
        }
        if (this.f4155d == null) {
            this.f4155d = cVar.e(new C0072b());
        }
        return this.f4155d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        c cVar = this.f4152a;
        if (cVar != null) {
            cVar.a(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i6) {
        if (i6 != 2) {
            if (i6 == 5) {
                this.f4157f.b();
                return;
            } else {
                if (i6 != 6) {
                    return;
                }
                this.f4157f.c();
                return;
            }
        }
        if (this.f4156e) {
            c cVar = this.f4152a;
            if (cVar != null) {
                cVar.a(1);
            }
            this.f4156e = false;
        }
    }

    public boolean d() {
        String c6 = androidx.browser.customtabs.c.c(this.f4153b, null);
        if (c6 == null) {
            c6 = "com.android.chrome";
        }
        boolean a6 = androidx.browser.customtabs.c.a(this.f4153b, c6, this.f4158g);
        this.f4157f.c();
        return a6;
    }

    public void h(Uri uri, Integer num) {
        g.b bVar = new g.b(e());
        bVar.f(1);
        if (num != null) {
            bVar.c(new a.C0016a().b(num.intValue()).a());
        }
        g a6 = bVar.a();
        a6.f1453a.putExtra("android.intent.extra.REFERRER", Uri.parse("2//" + this.f4153b.getPackageName()));
        this.f4156e = true;
        this.f4157f.d();
        a6.a(this.f4153b, uri);
    }

    public void i(c cVar) {
        this.f4152a = cVar;
    }

    public void j() {
        this.f4153b.unbindService(this.f4158g);
        this.f4157f.b();
    }
}
