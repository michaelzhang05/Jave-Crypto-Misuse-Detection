package e.e.b.b.w;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes2.dex */
public final class a extends f {
    private final Typeface a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0221a f17535b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17536c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: e.e.b.b.w.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0221a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0221a interfaceC0221a, Typeface typeface) {
        this.a = typeface;
        this.f17535b = interfaceC0221a;
    }

    private void d(Typeface typeface) {
        if (this.f17536c) {
            return;
        }
        this.f17535b.a(typeface);
    }

    @Override // e.e.b.b.w.f
    public void a(int i2) {
        d(this.a);
    }

    @Override // e.e.b.b.w.f
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.f17536c = true;
    }
}
