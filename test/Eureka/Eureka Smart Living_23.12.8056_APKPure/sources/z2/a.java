package z2;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f9946a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0153a f9947b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9948c;

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0153a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0153a interfaceC0153a, Typeface typeface) {
        this.f9946a = typeface;
        this.f9947b = interfaceC0153a;
    }

    private void d(Typeface typeface) {
        if (this.f9948c) {
            return;
        }
        this.f9947b.a(typeface);
    }

    @Override // z2.f
    public void a(int i6) {
        d(this.f9946a);
    }

    @Override // z2.f
    public void b(Typeface typeface, boolean z5) {
        d(typeface);
    }

    public void c() {
        this.f9948c = true;
    }
}
