package u4;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3805b {

    /* renamed from: u4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3805b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f38495d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f38496a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38497b;

        /* renamed from: c, reason: collision with root package name */
        private final ColorFilter f38498c;

        public /* synthetic */ a(int i8, int i9, ColorFilter colorFilter, int i10, AbstractC3151p abstractC3151p) {
            this(i8, i9, (i10 & 4) != 0 ? null : colorFilter);
        }

        public final ColorFilter a() {
            return this.f38498c;
        }

        public final int b() {
            return this.f38497b;
        }

        public final int c() {
            return this.f38496a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f38496a == aVar.f38496a && this.f38497b == aVar.f38497b && AbstractC3159y.d(this.f38498c, aVar.f38498c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = ((this.f38496a * 31) + this.f38497b) * 31;
            ColorFilter colorFilter = this.f38498c;
            if (colorFilter == null) {
                hashCode = 0;
            } else {
                hashCode = colorFilter.hashCode();
            }
            return i8 + hashCode;
        }

        public String toString() {
            return "Drawable(id=" + this.f38496a + ", contentDescription=" + this.f38497b + ", colorFilter=" + this.f38498c + ")";
        }

        public a(int i8, int i9, ColorFilter colorFilter) {
            super(null);
            this.f38496a = i8;
            this.f38497b = i9;
            this.f38498c = colorFilter;
        }
    }

    public /* synthetic */ AbstractC3805b(AbstractC3151p abstractC3151p) {
        this();
    }

    private AbstractC3805b() {
    }
}
