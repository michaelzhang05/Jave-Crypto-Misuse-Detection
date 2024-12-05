package d6;

import M5.AbstractC1245s;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2557a implements Iterable, Y5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0727a f30179d = new C0727a(null);

    /* renamed from: a, reason: collision with root package name */
    private final char f30180a;

    /* renamed from: b, reason: collision with root package name */
    private final char f30181b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30182c;

    /* renamed from: d6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0727a {
        private C0727a() {
        }

        public /* synthetic */ C0727a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public AbstractC2557a(char c8, char c9, int i8) {
        if (i8 != 0) {
            if (i8 != Integer.MIN_VALUE) {
                this.f30180a = c8;
                this.f30181b = (char) S5.c.c(c8, c9, i8);
                this.f30182c = i8;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char g() {
        return this.f30180a;
    }

    public final char h() {
        return this.f30181b;
    }

    @Override // java.lang.Iterable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC1245s iterator() {
        return new C2558b(this.f30180a, this.f30181b, this.f30182c);
    }
}
