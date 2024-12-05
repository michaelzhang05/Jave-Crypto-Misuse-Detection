package i4;

import O5.s;
import O5.t;
import S5.d;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2988c implements InterfaceC2987b {

    /* renamed from: b, reason: collision with root package name */
    private final i f32977b;

    public C2988c(i errorReporter) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f32977b = errorReporter;
    }

    @Override // i4.InterfaceC2987b
    public Object a(String str, d dVar) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        i.b.a(this.f32977b, i.f.f35426j, null, null, 6, null);
        s.a aVar = s.f8302b;
        return s.b(t.a(illegalStateException));
    }

    @Override // i4.InterfaceC2987b
    public Object b(String str, String str2, int i8, d dVar) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        i.b.a(this.f32977b, i.f.f35425i, null, null, 6, null);
        s.a aVar = s.f8302b;
        return s.b(t.a(illegalStateException));
    }
}
