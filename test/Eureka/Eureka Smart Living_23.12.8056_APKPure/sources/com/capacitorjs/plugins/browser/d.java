package com.capacitorjs.plugins.browser;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private int f4162a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4163b = false;

    /* renamed from: c, reason: collision with root package name */
    private a f4164c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public d(a aVar) {
        this.f4164c = aVar;
    }

    private void a() {
        a aVar;
        if (this.f4162a <= 0) {
            if (!this.f4163b && (aVar = this.f4164c) != null) {
                aVar.a();
            }
            this.f4163b = true;
        }
    }

    public void b() {
        this.f4162a++;
    }

    public void c() {
        this.f4162a--;
        a();
    }

    public void d() {
        this.f4162a = 0;
        this.f4163b = false;
    }
}
