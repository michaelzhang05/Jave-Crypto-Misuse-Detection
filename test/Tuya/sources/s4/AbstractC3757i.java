package s4;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: s4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC3757i {

    /* renamed from: s4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3757i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37984a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: s4.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3757i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37985a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: s4.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3757i {

        /* renamed from: a, reason: collision with root package name */
        private final Painter f37986a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Painter painter) {
            super(null);
            AbstractC3159y.i(painter, "painter");
            this.f37986a = painter;
        }

        public final Painter a() {
            return this.f37986a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f37986a, ((c) obj).f37986a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f37986a.hashCode();
        }

        public String toString() {
            return "Success(painter=" + this.f37986a + ")";
        }
    }

    private AbstractC3757i() {
    }

    public /* synthetic */ AbstractC3757i(AbstractC3151p abstractC3151p) {
        this();
    }
}
