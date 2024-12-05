package x4;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4190b {

    /* renamed from: x4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4190b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f40679d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f40680a;

        /* renamed from: b, reason: collision with root package name */
        private final int f40681b;

        /* renamed from: c, reason: collision with root package name */
        private final ColorFilter f40682c;

        public /* synthetic */ a(int i8, int i9, ColorFilter colorFilter, int i10, AbstractC3247p abstractC3247p) {
            this(i8, i9, (i10 & 4) != 0 ? null : colorFilter);
        }

        public final ColorFilter a() {
            return this.f40682c;
        }

        public final int b() {
            return this.f40681b;
        }

        public final int c() {
            return this.f40680a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f40680a == aVar.f40680a && this.f40681b == aVar.f40681b && AbstractC3255y.d(this.f40682c, aVar.f40682c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = ((this.f40680a * 31) + this.f40681b) * 31;
            ColorFilter colorFilter = this.f40682c;
            if (colorFilter == null) {
                hashCode = 0;
            } else {
                hashCode = colorFilter.hashCode();
            }
            return i8 + hashCode;
        }

        public String toString() {
            return "Drawable(id=" + this.f40680a + ", contentDescription=" + this.f40681b + ", colorFilter=" + this.f40682c + ")";
        }

        public a(int i8, int i9, ColorFilter colorFilter) {
            super(null);
            this.f40680a = i8;
            this.f40681b = i9;
            this.f40682c = colorFilter;
        }
    }

    public /* synthetic */ AbstractC4190b(AbstractC3247p abstractC3247p) {
        this();
    }

    private AbstractC4190b() {
    }
}
