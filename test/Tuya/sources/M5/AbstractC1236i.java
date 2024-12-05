package M5;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: M5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1236i extends AbstractC1228a implements Set, Y5.a {
    public static final a Companion = new a(null);

    /* renamed from: M5.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(Set c8, Set other) {
            AbstractC3159y.i(c8, "c");
            AbstractC3159y.i(other, "other");
            if (c8.size() != other.size()) {
                return false;
            }
            return c8.containsAll(other);
        }

        public final int b(Collection c8) {
            int i8;
            AbstractC3159y.i(c8, "c");
            int i9 = 0;
            for (Object obj : c8) {
                if (obj != null) {
                    i8 = obj.hashCode();
                } else {
                    i8 = 0;
                }
                i9 += i8;
            }
            return i9;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return Companion.a(this, (Set) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.b(this);
    }
}
