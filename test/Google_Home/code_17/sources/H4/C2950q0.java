package h4;

import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: h4.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2950q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32721b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32722c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final List f32723a;

    /* renamed from: h4.q0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2950q0(List items) {
        AbstractC3255y.i(items, "items");
        this.f32723a = items;
    }

    public final List a() {
        return this.f32723a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2950q0) && AbstractC3255y.d(this.f32723a, ((C2950q0) obj).f32723a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f32723a.hashCode();
    }

    public String toString() {
        return "LayoutSpec(items=" + this.f32723a + ")";
    }
}
