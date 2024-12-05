package m4;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class x0 {

    /* loaded from: classes4.dex */
    public static final class a extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f35776a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f35777b;

        /* renamed from: c, reason: collision with root package name */
        private final C0823a f35778c;

        /* renamed from: d, reason: collision with root package name */
        private final List f35779d;

        /* renamed from: m4.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0823a implements t0 {

            /* renamed from: a, reason: collision with root package name */
            private final String f35780a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC3983b f35781b;

            /* renamed from: c, reason: collision with root package name */
            private final int f35782c;

            public C0823a(String id, InterfaceC3983b label, int i8) {
                AbstractC3159y.i(id, "id");
                AbstractC3159y.i(label, "label");
                this.f35780a = id;
                this.f35781b = label;
                this.f35782c = i8;
            }

            public final String a() {
                return this.f35780a;
            }

            @Override // m4.t0
            public InterfaceC3983b b() {
                return this.f35781b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0823a)) {
                    return false;
                }
                C0823a c0823a = (C0823a) obj;
                if (AbstractC3159y.d(this.f35780a, c0823a.f35780a) && AbstractC3159y.d(this.f35781b, c0823a.f35781b) && this.f35782c == c0823a.f35782c) {
                    return true;
                }
                return false;
            }

            @Override // m4.t0
            public Integer getIcon() {
                return Integer.valueOf(this.f35782c);
            }

            public int hashCode() {
                return (((this.f35780a.hashCode() * 31) + this.f35781b.hashCode()) * 31) + this.f35782c;
            }

            public String toString() {
                return "Item(id=" + this.f35780a + ", label=" + this.f35781b + ", icon=" + this.f35782c + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3983b title, boolean z8, C0823a currentItem, List items) {
            super(null);
            AbstractC3159y.i(title, "title");
            AbstractC3159y.i(currentItem, "currentItem");
            AbstractC3159y.i(items, "items");
            this.f35776a = title;
            this.f35777b = z8;
            this.f35778c = currentItem;
            this.f35779d = items;
        }

        public final C0823a a() {
            return this.f35778c;
        }

        public final boolean b() {
            return this.f35777b;
        }

        public final List c() {
            return this.f35779d;
        }

        public final InterfaceC3983b d() {
            return this.f35776a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f35776a, aVar.f35776a) && this.f35777b == aVar.f35777b && AbstractC3159y.d(this.f35778c, aVar.f35778c) && AbstractC3159y.d(this.f35779d, aVar.f35779d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f35776a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f35777b)) * 31) + this.f35778c.hashCode()) * 31) + this.f35779d.hashCode();
        }

        public String toString() {
            return "Dropdown(title=" + this.f35776a + ", hide=" + this.f35777b + ", currentItem=" + this.f35778c + ", items=" + this.f35779d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final List f35783a;

        /* renamed from: b, reason: collision with root package name */
        private final List f35784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List staticIcons, List animatedIcons) {
            super(null);
            AbstractC3159y.i(staticIcons, "staticIcons");
            AbstractC3159y.i(animatedIcons, "animatedIcons");
            this.f35783a = staticIcons;
            this.f35784b = animatedIcons;
        }

        public final List a() {
            return this.f35784b;
        }

        public final List b() {
            return this.f35783a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f35783a, bVar.f35783a) && AbstractC3159y.d(this.f35784b, bVar.f35784b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f35783a.hashCode() * 31) + this.f35784b.hashCode();
        }

        public String toString() {
            return "MultiTrailing(staticIcons=" + this.f35783a + ", animatedIcons=" + this.f35784b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends x0 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f35785e = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f35786a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f35787b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35788c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f35789d;

        public /* synthetic */ c(int i8, Integer num, boolean z8, Function0 function0, int i9, AbstractC3151p abstractC3151p) {
            this(i8, (i9 & 2) != 0 ? null : num, z8, (i9 & 8) != 0 ? null : function0);
        }

        public final Integer a() {
            return this.f35787b;
        }

        public final int b() {
            return this.f35786a;
        }

        public final Function0 c() {
            return this.f35789d;
        }

        public final boolean d() {
            return this.f35788c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f35786a == cVar.f35786a && AbstractC3159y.d(this.f35787b, cVar.f35787b) && this.f35788c == cVar.f35788c && AbstractC3159y.d(this.f35789d, cVar.f35789d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = this.f35786a * 31;
            Integer num = this.f35787b;
            int i9 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int a8 = (((i8 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f35788c)) * 31;
            Function0 function0 = this.f35789d;
            if (function0 != null) {
                i9 = function0.hashCode();
            }
            return a8 + i9;
        }

        public String toString() {
            return "Trailing(idRes=" + this.f35786a + ", contentDescription=" + this.f35787b + ", isTintable=" + this.f35788c + ", onClick=" + this.f35789d + ")";
        }

        public c(int i8, Integer num, boolean z8, Function0 function0) {
            super(null);
            this.f35786a = i8;
            this.f35787b = num;
            this.f35788c = z8;
            this.f35789d = function0;
        }
    }

    public /* synthetic */ x0(AbstractC3151p abstractC3151p) {
        this();
    }

    private x0() {
    }
}
