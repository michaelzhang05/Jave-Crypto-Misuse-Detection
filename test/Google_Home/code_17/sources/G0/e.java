package G0;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2899a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static a f2900b = a.NONE;

    /* loaded from: classes3.dex */
    public enum a implements Comparable {
        NONE(0),
        WARN(1),
        THROW(2),
        ASSERT(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f2906a;

        a(int i8) {
            this.f2906a = i8;
        }
    }

    private e() {
    }

    public static final void a(a aVar) {
        AbstractC3255y.i(aVar, "<set-?>");
        f2900b = aVar;
    }
}
