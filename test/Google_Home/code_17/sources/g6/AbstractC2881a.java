package g6;

import P5.AbstractC1377s;
import b6.InterfaceC1985a;
import kotlin.jvm.internal.AbstractC3247p;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2881a implements Iterable, InterfaceC1985a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0752a f32059d = new C0752a(null);

    /* renamed from: a, reason: collision with root package name */
    private final char f32060a;

    /* renamed from: b, reason: collision with root package name */
    private final char f32061b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32062c;

    /* renamed from: g6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0752a {
        private C0752a() {
        }

        public /* synthetic */ C0752a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public AbstractC2881a(char c8, char c9, int i8) {
        if (i8 != 0) {
            if (i8 != Integer.MIN_VALUE) {
                this.f32060a = c8;
                this.f32061b = (char) V5.c.c(c8, c9, i8);
                this.f32062c = i8;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char e() {
        return this.f32060a;
    }

    public final char f() {
        return this.f32061b;
    }

    @Override // java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC1377s iterator() {
        return new C2882b(this.f32060a, this.f32061b, this.f32062c);
    }
}
