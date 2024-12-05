package P2;

import N2.b;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final e f8709a;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8710a;

        static {
            int[] iArr = new int[b.a.EnumC0136b.values().length];
            try {
                iArr[b.a.EnumC0136b.f7662a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.EnumC0136b.f7663b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8710a = iArr;
        }
    }

    public c(e linkEventsReporter) {
        AbstractC3255y.i(linkEventsReporter, "linkEventsReporter");
        this.f8709a = linkEventsReporter;
    }

    public final void a() {
        this.f8709a.f();
    }

    public final void b() {
        this.f8709a.d();
    }

    public final void c(N2.b linkActivityResult) {
        AbstractC3255y.i(linkActivityResult, "linkActivityResult");
        if (linkActivityResult instanceof b.a) {
            int i8 = a.f8710a[((b.a) linkActivityResult).a().ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    this.f8709a.l();
                    return;
                }
                return;
            }
            this.f8709a.c();
            return;
        }
        if (linkActivityResult instanceof b.C0137b) {
            this.f8709a.k();
        } else if (linkActivityResult instanceof b.c) {
            this.f8709a.e(((b.c) linkActivityResult).a());
        }
    }
}
