package C6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: C6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1037h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1050v f1679a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1680b;

    public C1037h(InterfaceC1050v writer) {
        AbstractC3255y.i(writer, "writer");
        this.f1679a = writer;
        this.f1680b = true;
    }

    public final boolean a() {
        return this.f1680b;
    }

    public void b() {
        this.f1680b = true;
    }

    public void c() {
        this.f1680b = false;
    }

    public void d(byte b8) {
        this.f1679a.writeLong(b8);
    }

    public final void e(char c8) {
        this.f1679a.a(c8);
    }

    public void f(double d8) {
        this.f1679a.c(String.valueOf(d8));
    }

    public void g(float f8) {
        this.f1679a.c(String.valueOf(f8));
    }

    public void h(int i8) {
        this.f1679a.writeLong(i8);
    }

    public void i(long j8) {
        this.f1679a.writeLong(j8);
    }

    public final void j(String v8) {
        AbstractC3255y.i(v8, "v");
        this.f1679a.c(v8);
    }

    public void k(short s8) {
        this.f1679a.writeLong(s8);
    }

    public void l(boolean z8) {
        this.f1679a.c(String.valueOf(z8));
    }

    public void m(String value) {
        AbstractC3255y.i(value, "value");
        this.f1679a.b(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(boolean z8) {
        this.f1680b = z8;
    }

    public void o() {
    }

    public void p() {
    }
}
