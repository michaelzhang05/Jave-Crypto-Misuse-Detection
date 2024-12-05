package p4;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class x0 {

    /* loaded from: classes4.dex */
    public static final class a extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final B2.b f37802a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f37803b;

        /* renamed from: c, reason: collision with root package name */
        private final C0853a f37804c;

        /* renamed from: d, reason: collision with root package name */
        private final List f37805d;

        /* renamed from: p4.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0853a implements t0 {

            /* renamed from: a, reason: collision with root package name */
            private final String f37806a;

            /* renamed from: b, reason: collision with root package name */
            private final B2.b f37807b;

            /* renamed from: c, reason: collision with root package name */
            private final int f37808c;

            public C0853a(String id, B2.b label, int i8) {
                AbstractC3255y.i(id, "id");
                AbstractC3255y.i(label, "label");
                this.f37806a = id;
                this.f37807b = label;
                this.f37808c = i8;
            }

            public final String a() {
                return this.f37806a;
            }

            @Override // p4.t0
            public B2.b b() {
                return this.f37807b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0853a)) {
                    return false;
                }
                C0853a c0853a = (C0853a) obj;
                if (AbstractC3255y.d(this.f37806a, c0853a.f37806a) && AbstractC3255y.d(this.f37807b, c0853a.f37807b) && this.f37808c == c0853a.f37808c) {
                    return true;
                }
                return false;
            }

            @Override // p4.t0
            public Integer getIcon() {
                return Integer.valueOf(this.f37808c);
            }

            public int hashCode() {
                return (((this.f37806a.hashCode() * 31) + this.f37807b.hashCode()) * 31) + this.f37808c;
            }

            public String toString() {
                return "Item(id=" + this.f37806a + ", label=" + this.f37807b + ", icon=" + this.f37808c + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B2.b title, boolean z8, C0853a currentItem, List items) {
            super(null);
            AbstractC3255y.i(title, "title");
            AbstractC3255y.i(currentItem, "currentItem");
            AbstractC3255y.i(items, "items");
            this.f37802a = title;
            this.f37803b = z8;
            this.f37804c = currentItem;
            this.f37805d = items;
        }

        public final C0853a a() {
            return this.f37804c;
        }

        public final boolean b() {
            return this.f37803b;
        }

        public final List c() {
            return this.f37805d;
        }

        public final B2.b d() {
            return this.f37802a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f37802a, aVar.f37802a) && this.f37803b == aVar.f37803b && AbstractC3255y.d(this.f37804c, aVar.f37804c) && AbstractC3255y.d(this.f37805d, aVar.f37805d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f37802a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f37803b)) * 31) + this.f37804c.hashCode()) * 31) + this.f37805d.hashCode();
        }

        public String toString() {
            return "Dropdown(title=" + this.f37802a + ", hide=" + this.f37803b + ", currentItem=" + this.f37804c + ", items=" + this.f37805d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final List f37809a;

        /* renamed from: b, reason: collision with root package name */
        private final List f37810b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List staticIcons, List animatedIcons) {
            super(null);
            AbstractC3255y.i(staticIcons, "staticIcons");
            AbstractC3255y.i(animatedIcons, "animatedIcons");
            this.f37809a = staticIcons;
            this.f37810b = animatedIcons;
        }

        public final List a() {
            return this.f37810b;
        }

        public final List b() {
            return this.f37809a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3255y.d(this.f37809a, bVar.f37809a) && AbstractC3255y.d(this.f37810b, bVar.f37810b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f37809a.hashCode() * 31) + this.f37810b.hashCode();
        }

        public String toString() {
            return "MultiTrailing(staticIcons=" + this.f37809a + ", animatedIcons=" + this.f37810b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends x0 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f37811e = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f37812a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f37813b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f37814c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f37815d;

        public /* synthetic */ c(int i8, Integer num, boolean z8, Function0 function0, int i9, AbstractC3247p abstractC3247p) {
            this(i8, (i9 & 2) != 0 ? null : num, z8, (i9 & 8) != 0 ? null : function0);
        }

        public final Integer a() {
            return this.f37813b;
        }

        public final int b() {
            return this.f37812a;
        }

        public final Function0 c() {
            return this.f37815d;
        }

        public final boolean d() {
            return this.f37814c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f37812a == cVar.f37812a && AbstractC3255y.d(this.f37813b, cVar.f37813b) && this.f37814c == cVar.f37814c && AbstractC3255y.d(this.f37815d, cVar.f37815d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = this.f37812a * 31;
            Integer num = this.f37813b;
            int i9 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int a8 = (((i8 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f37814c)) * 31;
            Function0 function0 = this.f37815d;
            if (function0 != null) {
                i9 = function0.hashCode();
            }
            return a8 + i9;
        }

        public String toString() {
            return "Trailing(idRes=" + this.f37812a + ", contentDescription=" + this.f37813b + ", isTintable=" + this.f37814c + ", onClick=" + this.f37815d + ")";
        }

        public c(int i8, Integer num, boolean z8, Function0 function0) {
            super(null);
            this.f37812a = i8;
            this.f37813b = num;
            this.f37814c = z8;
            this.f37815d = function0;
        }
    }

    public /* synthetic */ x0(AbstractC3247p abstractC3247p) {
        this();
    }

    private x0() {
    }
}
