package v4;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: v4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC4110i {

    /* renamed from: v4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4110i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40257a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: v4.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4110i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40258a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: v4.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4110i {

        /* renamed from: a, reason: collision with root package name */
        private final Painter f40259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Painter painter) {
            super(null);
            AbstractC3255y.i(painter, "painter");
            this.f40259a = painter;
        }

        public final Painter a() {
            return this.f40259a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f40259a, ((c) obj).f40259a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f40259a.hashCode();
        }

        public String toString() {
            return "Success(painter=" + this.f40259a + ")";
        }
    }

    private AbstractC4110i() {
    }

    public /* synthetic */ AbstractC4110i(AbstractC3247p abstractC3247p) {
        this();
    }
}
