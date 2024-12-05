package com.getcapacitor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0076b f4269a;

    /* renamed from: b, reason: collision with root package name */
    private a f4270b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4271c = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(c1 c1Var);
    }

    /* renamed from: com.getcapacitor.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0076b {
        void a(Boolean bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(c1 c1Var) {
        a aVar = this.f4270b;
        if (aVar != null) {
            aVar.a(c1Var);
        }
    }

    public void b(boolean z5) {
        this.f4271c = z5;
        InterfaceC0076b interfaceC0076b = this.f4269a;
        if (interfaceC0076b != null) {
            interfaceC0076b.a(Boolean.valueOf(z5));
        }
    }

    public boolean c() {
        return this.f4271c;
    }

    public void d(a aVar) {
        this.f4270b = aVar;
    }

    public void e(InterfaceC0076b interfaceC0076b) {
        this.f4269a = interfaceC0076b;
    }
}
